package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.MACOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowRunUsageResponseData extends js.Object {
  var billable: MACOS
  var run_duration_ms: Double
}

object ActionsGetWorkflowRunUsageResponseData {
  @scala.inline
  def apply(billable: MACOS, run_duration_ms: Double): ActionsGetWorkflowRunUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any], run_duration_ms = run_duration_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunUsageResponseData]
  }
}

