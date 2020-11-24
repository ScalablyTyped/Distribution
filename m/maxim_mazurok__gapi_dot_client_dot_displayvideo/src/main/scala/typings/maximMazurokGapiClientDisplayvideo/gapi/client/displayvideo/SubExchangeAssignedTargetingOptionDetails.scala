package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubExchangeAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_SUB_EXCHANGE`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object SubExchangeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): SubExchangeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubExchangeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SubExchangeAssignedTargetingOptionDetailsOps[Self <: SubExchangeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
  }
}
