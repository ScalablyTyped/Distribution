package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4BatchDeleteJobsResponse extends StObject {
  
  /** List of job mutation results from a batch delete operation. It can change until operation status is FINISHED, FAILED or CANCELLED. */
  var jobResults: js.UndefOr[js.Array[GoogleCloudTalentV4JobResult]] = js.undefined
}
object GoogleCloudTalentV4BatchDeleteJobsResponse {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4BatchDeleteJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4BatchDeleteJobsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4BatchDeleteJobsResponseMutableBuilder[Self <: GoogleCloudTalentV4BatchDeleteJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobResults(value: js.Array[GoogleCloudTalentV4JobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    @scala.inline
    def setJobResultsVarargs(value: GoogleCloudTalentV4JobResult*): Self = StObject.set(x, "jobResults", js.Array(value :_*))
  }
}
