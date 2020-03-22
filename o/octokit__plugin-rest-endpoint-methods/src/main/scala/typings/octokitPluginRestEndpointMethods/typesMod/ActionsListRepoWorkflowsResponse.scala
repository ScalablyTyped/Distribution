package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRepoWorkflowsResponse extends js.Object {
  var total_count: Double
  var workflows: js.Array[ActionsListRepoWorkflowsResponseWorkflowsItem]
}

object ActionsListRepoWorkflowsResponse {
  @scala.inline
  def apply(total_count: Double, workflows: js.Array[ActionsListRepoWorkflowsResponseWorkflowsItem]): ActionsListRepoWorkflowsResponse = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListRepoWorkflowsResponse]
  }
}

