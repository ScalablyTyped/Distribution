package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScreenPositionAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The on screen position. */
  var onScreenPosition: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_ON_SCREEN_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object OnScreenPositionAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): OnScreenPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnScreenPositionAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class OnScreenPositionAssignedTargetingOptionDetailsOps[Self <: OnScreenPositionAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnScreenPosition(value: String): Self = this.set("onScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScreenPosition: Self = this.set("onScreenPosition", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
