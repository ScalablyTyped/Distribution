package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatSuperStickerDetails extends StObject {
  
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[String] = js.undefined
  
  /** The amount purchased by the user, in micros (1,750,000 micros = 1.75). */
  var amountMicros: js.UndefOr[String] = js.undefined
  
  /** The currency in which the purchase was made. */
  var currency: js.UndefOr[String] = js.undefined
  
  /** Information about the Super Sticker. */
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.undefined
  
  /** The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is 1. */
  var tier: js.UndefOr[Double] = js.undefined
}
object LiveChatSuperStickerDetails {
  
  inline def apply(): LiveChatSuperStickerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatSuperStickerDetails]
  }
  
  extension [Self <: LiveChatSuperStickerDetails](x: Self) {
    
    inline def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
    
    inline def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
    
    inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setSuperStickerMetadata(value: SuperStickerMetadata): Self = StObject.set(x, "superStickerMetadata", value.asInstanceOf[js.Any])
    
    inline def setSuperStickerMetadataUndefined: Self = StObject.set(x, "superStickerMetadata", js.undefined)
    
    inline def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
