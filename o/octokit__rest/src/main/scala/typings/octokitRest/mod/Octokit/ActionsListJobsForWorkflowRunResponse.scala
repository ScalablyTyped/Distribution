package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListJobsForWorkflowRunResponse extends js.Object {
  var jobs: js.Array[ActionsListJobsForWorkflowRunResponseJobsItem]
  var total_count: Double
}

object ActionsListJobsForWorkflowRunResponse {
  @scala.inline
  def apply(jobs: js.Array[ActionsListJobsForWorkflowRunResponseJobsItem], total_count: Double): ActionsListJobsForWorkflowRunResponse = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponse]
  }
}

