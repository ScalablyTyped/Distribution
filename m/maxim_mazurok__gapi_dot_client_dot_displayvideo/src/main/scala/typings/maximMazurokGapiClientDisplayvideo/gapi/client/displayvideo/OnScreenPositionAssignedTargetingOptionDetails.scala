package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnScreenPositionAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The ad type to target. Only applicable to insertion order targeting and new line items supporting the specified ad type will inherit this targeting option by default.
    * Possible values are: * `AD_TYPE_DISPLAY`, the setting will be inherited by new line item when line_item_type is `LINE_ITEM_TYPE_DISPLAY_DEFAULT`. * `AD_TYPE_VIDEO`, the setting will
    * be inherited by new line item when line_item_type is `LINE_ITEM_TYPE_VIDEO_DEFAULT`.
    */
  var adType: js.UndefOr[String] = js.undefined
  
  /** Output only. The on screen position. */
  var onScreenPosition: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_ON_SCREEN_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object OnScreenPositionAssignedTargetingOptionDetails {
  
  inline def apply(): OnScreenPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnScreenPositionAssignedTargetingOptionDetails]
  }
  
  extension [Self <: OnScreenPositionAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAdType(value: String): Self = StObject.set(x, "adType", value.asInstanceOf[js.Any])
    
    inline def setAdTypeUndefined: Self = StObject.set(x, "adType", js.undefined)
    
    inline def setOnScreenPosition(value: String): Self = StObject.set(x, "onScreenPosition", value.asInstanceOf[js.Any])
    
    inline def setOnScreenPositionUndefined: Self = StObject.set(x, "onScreenPosition", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
