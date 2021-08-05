package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigitalContentLabelAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the digital content label rating tier. */
  var contentRatingTier: js.UndefOr[String] = js.undefined
  
  /** Required. ID of the digital content label to be EXCLUDED. */
  var excludedTargetingOptionId: js.UndefOr[String] = js.undefined
}
object DigitalContentLabelAssignedTargetingOptionDetails {
  
  inline def apply(): DigitalContentLabelAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigitalContentLabelAssignedTargetingOptionDetails]
  }
  
  extension [Self <: DigitalContentLabelAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentRatingTier(value: String): Self = StObject.set(x, "contentRatingTier", value.asInstanceOf[js.Any])
    
    inline def setContentRatingTierUndefined: Self = StObject.set(x, "contentRatingTier", js.undefined)
    
    inline def setExcludedTargetingOptionId(value: String): Self = StObject.set(x, "excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setExcludedTargetingOptionIdUndefined: Self = StObject.set(x, "excludedTargetingOptionId", js.undefined)
  }
}
