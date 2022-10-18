package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availability extends StObject {
  
  var `@type`: String
  
  var availability: js.UndefOr[String] = js.undefined
  
  var itemCondition: js.UndefOr[String] = js.undefined
  
  var price: String
  
  var priceCurrency: String
  
  var priceValidUntil: js.UndefOr[String] = js.undefined
  
  var seller: Type
  
  var url: js.UndefOr[String] = js.undefined
  
  var validFrom: js.UndefOr[String] = js.undefined
}
object Availability {
  
  inline def apply(`@type`: String, price: String, priceCurrency: String, seller: Type): Availability = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Availability]
  }
  
  extension [Self <: Availability](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setItemCondition(value: String): Self = StObject.set(x, "itemCondition", value.asInstanceOf[js.Any])
    
    inline def setItemConditionUndefined: Self = StObject.set(x, "itemCondition", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
    
    inline def setPriceValidUntil(value: String): Self = StObject.set(x, "priceValidUntil", value.asInstanceOf[js.Any])
    
    inline def setPriceValidUntilUndefined: Self = StObject.set(x, "priceValidUntil", js.undefined)
    
    inline def setSeller(value: Type): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValidFrom(value: String): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
  }
}
