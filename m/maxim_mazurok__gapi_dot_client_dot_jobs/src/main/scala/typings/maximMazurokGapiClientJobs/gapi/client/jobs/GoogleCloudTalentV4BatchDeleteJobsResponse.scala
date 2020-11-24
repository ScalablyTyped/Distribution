package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4BatchDeleteJobsResponse extends js.Object {
  
  /** List of job mutation results from a batch delete operation. It can change until operation status is FINISHED, FAILED or CANCELLED. */
  var jobResults: js.UndefOr[js.Array[GoogleCloudTalentV4JobResult]] = js.native
}
object GoogleCloudTalentV4BatchDeleteJobsResponse {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4BatchDeleteJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4BatchDeleteJobsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4BatchDeleteJobsResponseOps[Self <: GoogleCloudTalentV4BatchDeleteJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobResultsVarargs(value: GoogleCloudTalentV4JobResult*): Self = this.set("jobResults", js.Array(value :_*))
    
    @scala.inline
    def setJobResults(value: js.Array[GoogleCloudTalentV4JobResult]): Self = this.set("jobResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobResults: Self = this.set("jobResults", js.undefined)
  }
}
