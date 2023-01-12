package typings.mparticleWebSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  var Attributes: js.UndefOr[Record[String, Any]] = js.undefined
  
  var Brand: js.UndefOr[String] = js.undefined
  
  var Category: js.UndefOr[String] = js.undefined
  
  var Coupon: js.UndefOr[String] = js.undefined
  
  var Name: String
  
  var Position: js.UndefOr[Double] = js.undefined
  
  var Price: Double
  
  var Quantity: js.UndefOr[Double] = js.undefined
  
  var Sku: String
  
  var Variant: js.UndefOr[String] = js.undefined
}
object Product {
  
  inline def apply(Name: String, Price: Double, Sku: String): Product = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Sku = Sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, Any]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "Brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "Brand", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCoupon(value: String): Self = StObject.set(x, "Coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "Coupon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "Sku", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: String): Self = StObject.set(x, "Variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "Variant", js.undefined)
  }
}
