package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.MACOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetWorkflowRunUsageResponseData extends js.Object {
  var billable: MACOS = js.native
  var run_duration_ms: Double = js.native
}

object ActionsGetWorkflowRunUsageResponseData {
  @scala.inline
  def apply(billable: MACOS, run_duration_ms: Double): ActionsGetWorkflowRunUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any], run_duration_ms = run_duration_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunUsageResponseData]
  }
  @scala.inline
  implicit class ActionsGetWorkflowRunUsageResponseDataOps[Self <: ActionsGetWorkflowRunUsageResponseData] (val x: Self) extends AnyVal {
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
    def setBillable(value: MACOS): Self = this.set("billable", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun_duration_ms(value: Double): Self = this.set("run_duration_ms", value.asInstanceOf[js.Any])
  }
  
}

