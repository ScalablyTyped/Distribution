package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateJobsResponse extends StObject {
  
  /** List of job mutation results from a batch create operation. It can change until operation status is FINISHED, FAILED or CANCELLED. */
  var jobResults: js.UndefOr[js.Array[JobResult]] = js.undefined
}
object BatchCreateJobsResponse {
  
  inline def apply(): BatchCreateJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateJobsResponse]
  }
  
  extension [Self <: BatchCreateJobsResponse](x: Self) {
    
    inline def setJobResults(value: js.Array[JobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    inline def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    inline def setJobResultsVarargs(value: JobResult*): Self = StObject.set(x, "jobResults", js.Array(value*))
  }
}
