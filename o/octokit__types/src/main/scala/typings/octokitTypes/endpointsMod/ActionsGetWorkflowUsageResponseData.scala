package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.UBUNTU
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowUsageResponseData extends js.Object {
  var billable: UBUNTU
}

object ActionsGetWorkflowUsageResponseData {
  @scala.inline
  def apply(billable: UBUNTU): ActionsGetWorkflowUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowUsageResponseData]
  }
}

