package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4BatchCreateJobsResponse extends StObject {
  
  /** List of job mutation results from a batch create operation. It can change until operation status is FINISHED, FAILED or CANCELLED. */
  var jobResults: js.UndefOr[js.Array[GoogleCloudTalentV4JobResult]] = js.undefined
}
object GoogleCloudTalentV4BatchCreateJobsResponse {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4BatchCreateJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4BatchCreateJobsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4BatchCreateJobsResponseMutableBuilder[Self <: GoogleCloudTalentV4BatchCreateJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobResults(value: js.Array[GoogleCloudTalentV4JobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    @scala.inline
    def setJobResultsVarargs(value: GoogleCloudTalentV4JobResult*): Self = StObject.set(x, "jobResults", js.Array(value :_*))
  }
}
