package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.ProductType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /** The product category. */
  var category: typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.Category
  
  /** The product description. */
  var description: String
  
  /** The image URL for the product. */
  var home_url: String
  
  /** The image URL for the product. */
  var image_url: String
  
  /** The product name. */
  var name: String
  
  /** The product type. Indicates whether the product is physical or digital goods, or a service. */
  var `type`: ProductType
}
object Category {
  
  inline def apply(
    category: typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.Category,
    description: String,
    home_url: String,
    image_url: String,
    name: String,
    `type`: ProductType
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], home_url = home_url.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategory(value: typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHome_url(value: String): Self = StObject.set(x, "home_url", value.asInstanceOf[js.Any])
    
    inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ProductType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
