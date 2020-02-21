package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListWorkflowRunArtifactsResponse extends js.Object {
  var artifacts: js.Array[ActionsListWorkflowRunArtifactsResponseArtifactsItem]
  var total_count: Double
}

object ActionsListWorkflowRunArtifactsResponse {
  @scala.inline
  def apply(artifacts: js.Array[ActionsListWorkflowRunArtifactsResponseArtifactsItem], total_count: Double): ActionsListWorkflowRunArtifactsResponse = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsResponse]
  }
}

