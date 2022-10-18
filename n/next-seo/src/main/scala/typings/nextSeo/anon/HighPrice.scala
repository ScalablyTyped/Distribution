package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighPrice extends StObject {
  
  var `@type`: String
  
  var highPrice: js.UndefOr[String] = js.undefined
  
  var lowPrice: String
  
  var offerCount: js.UndefOr[String] = js.undefined
  
  var offers: js.UndefOr[Availability | js.Array[Availability]] = js.undefined
  
  var priceCurrency: String
}
object HighPrice {
  
  inline def apply(`@type`: String, lowPrice: String, priceCurrency: String): HighPrice = {
    val __obj = js.Dynamic.literal(lowPrice = lowPrice.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighPrice]
  }
  
  extension [Self <: HighPrice](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setHighPrice(value: String): Self = StObject.set(x, "highPrice", value.asInstanceOf[js.Any])
    
    inline def setHighPriceUndefined: Self = StObject.set(x, "highPrice", js.undefined)
    
    inline def setLowPrice(value: String): Self = StObject.set(x, "lowPrice", value.asInstanceOf[js.Any])
    
    inline def setOfferCount(value: String): Self = StObject.set(x, "offerCount", value.asInstanceOf[js.Any])
    
    inline def setOfferCountUndefined: Self = StObject.set(x, "offerCount", js.undefined)
    
    inline def setOffers(value: Availability | js.Array[Availability]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    inline def setOffersVarargs(value: Availability*): Self = StObject.set(x, "offers", js.Array(value*))
    
    inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
  }
}
