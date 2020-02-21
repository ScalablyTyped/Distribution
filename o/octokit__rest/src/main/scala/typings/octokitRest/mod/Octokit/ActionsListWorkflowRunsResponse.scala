package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListWorkflowRunsResponse extends js.Object {
  var total_count: Double
  var workflow_runs: js.Array[ActionsListWorkflowRunsResponseWorkflowRunsItem]
}

object ActionsListWorkflowRunsResponse {
  @scala.inline
  def apply(total_count: Double, workflow_runs: js.Array[ActionsListWorkflowRunsResponseWorkflowRunsItem]): ActionsListWorkflowRunsResponse = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListWorkflowRunsResponse]
  }
}

