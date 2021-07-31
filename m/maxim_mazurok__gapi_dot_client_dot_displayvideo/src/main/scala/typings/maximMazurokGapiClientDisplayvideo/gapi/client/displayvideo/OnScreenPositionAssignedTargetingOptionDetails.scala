package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnScreenPositionAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The on screen position. */
  var onScreenPosition: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_ON_SCREEN_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object OnScreenPositionAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): OnScreenPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnScreenPositionAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class OnScreenPositionAssignedTargetingOptionDetailsMutableBuilder[Self <: OnScreenPositionAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnScreenPosition(value: String): Self = StObject.set(x, "onScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScreenPositionUndefined: Self = StObject.set(x, "onScreenPosition", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
