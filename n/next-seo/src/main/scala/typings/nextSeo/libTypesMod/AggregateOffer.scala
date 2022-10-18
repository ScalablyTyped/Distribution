package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateOffer extends StObject {
  
  var highPrice: js.UndefOr[String] = js.undefined
  
  var lowPrice: String
  
  var offerCount: js.UndefOr[String] = js.undefined
  
  var offers: js.UndefOr[Offers | js.Array[Offers]] = js.undefined
  
  var priceCurrency: String
}
object AggregateOffer {
  
  inline def apply(lowPrice: String, priceCurrency: String): AggregateOffer = {
    val __obj = js.Dynamic.literal(lowPrice = lowPrice.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateOffer]
  }
  
  extension [Self <: AggregateOffer](x: Self) {
    
    inline def setHighPrice(value: String): Self = StObject.set(x, "highPrice", value.asInstanceOf[js.Any])
    
    inline def setHighPriceUndefined: Self = StObject.set(x, "highPrice", js.undefined)
    
    inline def setLowPrice(value: String): Self = StObject.set(x, "lowPrice", value.asInstanceOf[js.Any])
    
    inline def setOfferCount(value: String): Self = StObject.set(x, "offerCount", value.asInstanceOf[js.Any])
    
    inline def setOfferCountUndefined: Self = StObject.set(x, "offerCount", js.undefined)
    
    inline def setOffers(value: Offers | js.Array[Offers]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    inline def setOffersVarargs(value: Offers*): Self = StObject.set(x, "offers", js.Array(value*))
    
    inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
  }
}
