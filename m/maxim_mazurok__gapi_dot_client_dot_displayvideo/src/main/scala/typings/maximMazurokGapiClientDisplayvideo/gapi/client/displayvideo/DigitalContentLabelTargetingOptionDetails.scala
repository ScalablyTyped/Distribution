package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigitalContentLabelTargetingOptionDetails extends StObject {
  
  /** Output only. An enum for the content label brand safety tiers. */
  var contentRatingTier: js.UndefOr[String] = js.undefined
}
object DigitalContentLabelTargetingOptionDetails {
  
  inline def apply(): DigitalContentLabelTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigitalContentLabelTargetingOptionDetails]
  }
  
  extension [Self <: DigitalContentLabelTargetingOptionDetails](x: Self) {
    
    inline def setContentRatingTier(value: String): Self = StObject.set(x, "contentRatingTier", value.asInstanceOf[js.Any])
    
    inline def setContentRatingTierUndefined: Self = StObject.set(x, "contentRatingTier", js.undefined)
  }
}
