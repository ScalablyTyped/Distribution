package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Badgeurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRepoWorkflowsResponseData extends js.Object {
  var total_count: Double
  var workflows: js.Array[Badgeurl]
}

object ActionsListRepoWorkflowsResponseData {
  @scala.inline
  def apply(total_count: Double, workflows: js.Array[Badgeurl]): ActionsListRepoWorkflowsResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowsResponseData]
  }
}

