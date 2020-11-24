package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewabilityAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_VIEWABILITY` (e.g., "509010" for targeting the `VIEWABILITY_10_PERCENT_OR_MORE` option). */
  var targetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. The predicted viewability percentage. */
  var viewability: js.UndefOr[String] = js.native
}
object ViewabilityAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ViewabilityAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ViewabilityAssignedTargetingOptionDetailsOps[Self <: ViewabilityAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
    
    @scala.inline
    def setViewability(value: String): Self = this.set("viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewability: Self = this.set("viewability", js.undefined)
  }
}
