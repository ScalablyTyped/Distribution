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
  
  @scala.inline
  def apply(): LiveChatSuperStickerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatSuperStickerDetails]
  }
  
  @scala.inline
  implicit class LiveChatSuperStickerDetailsMutableBuilder[Self <: LiveChatSuperStickerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
    
    @scala.inline
    def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setSuperStickerMetadata(value: SuperStickerMetadata): Self = StObject.set(x, "superStickerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperStickerMetadataUndefined: Self = StObject.set(x, "superStickerMetadata", js.undefined)
    
    @scala.inline
    def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
