package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Artifactsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListWorkflowRunsResponseData extends js.Object {
  var total_count: Double
  var workflow_runs: js.Array[Artifactsurl]
}

object ActionsListWorkflowRunsResponseData {
  @scala.inline
  def apply(total_count: Double, workflow_runs: js.Array[Artifactsurl]): ActionsListWorkflowRunsResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsResponseData]
  }
}

