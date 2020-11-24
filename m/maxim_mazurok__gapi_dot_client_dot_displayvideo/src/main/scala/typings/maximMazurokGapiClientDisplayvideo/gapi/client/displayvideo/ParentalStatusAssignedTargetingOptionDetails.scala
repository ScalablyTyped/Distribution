package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentalStatusAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The parental status of the audience. */
  var parentalStatus: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_PARENTAL_STATUS`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object ParentalStatusAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ParentalStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalStatusAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ParentalStatusAssignedTargetingOptionDetailsOps[Self <: ParentalStatusAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setParentalStatus(value: String): Self = this.set("parentalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentalStatus: Self = this.set("parentalStatus", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
