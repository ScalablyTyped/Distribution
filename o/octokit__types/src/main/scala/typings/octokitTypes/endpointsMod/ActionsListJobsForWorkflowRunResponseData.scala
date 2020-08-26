package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Checkrunurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListJobsForWorkflowRunResponseData extends js.Object {
  var jobs: js.Array[Checkrunurl] = js.native
  var total_count: Double = js.native
}

object ActionsListJobsForWorkflowRunResponseData {
  @scala.inline
  def apply(jobs: js.Array[Checkrunurl], total_count: Double): ActionsListJobsForWorkflowRunResponseData = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponseData]
  }
  @scala.inline
  implicit class ActionsListJobsForWorkflowRunResponseDataOps[Self <: ActionsListJobsForWorkflowRunResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobsVarargs(value: Checkrunurl*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: js.Array[Checkrunurl]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

