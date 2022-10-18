package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceSpecification extends StObject {
  
  var price: String
  
  var priceCurrency: String
  
  var `type`: String
}
object PriceSpecification {
  
  inline def apply(price: String, priceCurrency: String, `type`: String): PriceSpecification = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceSpecification]
  }
  
  extension [Self <: PriceSpecification](x: Self) {
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
