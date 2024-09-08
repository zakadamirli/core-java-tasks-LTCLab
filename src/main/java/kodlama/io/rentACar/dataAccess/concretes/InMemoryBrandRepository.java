package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //bu sinif bir bir data access objectidir
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    @Autowired
    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Renault"));
        brands.add(new Brand(5, "Fiat"));

    }

    @Override
    public List<Brand> getAll() {
        return null;
    }
}
