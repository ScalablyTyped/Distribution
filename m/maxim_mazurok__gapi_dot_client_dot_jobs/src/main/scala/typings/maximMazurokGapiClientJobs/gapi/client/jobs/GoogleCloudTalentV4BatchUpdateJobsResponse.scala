package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4BatchUpdateJobsResponse extends StObject {
  
  /** List of job mutation results from a batch update operation. It can change until operation status is FINISHED, FAILED or CANCELLED. */
  var jobResults: js.UndefOr[js.Array[GoogleCloudTalentV4JobResult]] = js.undefined
}
object GoogleCloudTalentV4BatchUpdateJobsResponse {
  
  inline def apply(): GoogleCloudTalentV4BatchUpdateJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4BatchUpdateJobsResponse]
  }
  
  extension [Self <: GoogleCloudTalentV4BatchUpdateJobsResponse](x: Self) {
    
    inline def setJobResults(value: js.Array[GoogleCloudTalentV4JobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    inline def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    inline def setJobResultsVarargs(value: GoogleCloudTalentV4JobResult*): Self = StObject.set(x, "jobResults", js.Array(value :_*))
  }
}
