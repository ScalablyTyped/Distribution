package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceCurrency extends StObject {
  
  var `@type`: String
  
  var price: String
  
  var priceCurrency: String
}
object PriceCurrency {
  
  inline def apply(`@type`: String, price: String, priceCurrency: String): PriceCurrency = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceCurrency]
  }
  
  extension [Self <: PriceCurrency](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
  }
}
