package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Checkrunurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListJobsForWorkflowRunResponseData extends js.Object {
  var jobs: js.Array[Checkrunurl]
  var total_count: Double
}

object ActionsListJobsForWorkflowRunResponseData {
  @scala.inline
  def apply(jobs: js.Array[Checkrunurl], total_count: Double): ActionsListJobsForWorkflowRunResponseData = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponseData]
  }
}

