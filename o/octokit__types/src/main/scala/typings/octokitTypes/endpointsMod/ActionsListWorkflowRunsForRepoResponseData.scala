package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Artifactsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListWorkflowRunsForRepoResponseData extends js.Object {
  var total_count: Double
  var workflow_runs: js.Array[Artifactsurl]
}

object ActionsListWorkflowRunsForRepoResponseData {
  @scala.inline
  def apply(total_count: Double, workflow_runs: js.Array[Artifactsurl]): ActionsListWorkflowRunsForRepoResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsForRepoResponseData]
  }
}

