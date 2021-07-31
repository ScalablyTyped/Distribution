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
  
  @scala.inline
  def apply(): DigitalContentLabelAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigitalContentLabelAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DigitalContentLabelAssignedTargetingOptionDetailsMutableBuilder[Self <: DigitalContentLabelAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentRatingTier(value: String): Self = StObject.set(x, "contentRatingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRatingTierUndefined: Self = StObject.set(x, "contentRatingTier", js.undefined)
    
    @scala.inline
    def setExcludedTargetingOptionId(value: String): Self = StObject.set(x, "excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedTargetingOptionIdUndefined: Self = StObject.set(x, "excludedTargetingOptionId", js.undefined)
  }
}
