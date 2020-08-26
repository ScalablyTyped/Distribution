package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.UBUNTU
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetWorkflowUsageResponseData extends js.Object {
  var billable: UBUNTU = js.native
}

object ActionsGetWorkflowUsageResponseData {
  @scala.inline
  def apply(billable: UBUNTU): ActionsGetWorkflowUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowUsageResponseData]
  }
  @scala.inline
  implicit class ActionsGetWorkflowUsageResponseDataOps[Self <: ActionsGetWorkflowUsageResponseData] (val x: Self) extends AnyVal {
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
    def setBillable(value: UBUNTU): Self = this.set("billable", value.asInstanceOf[js.Any])
  }
  
}

