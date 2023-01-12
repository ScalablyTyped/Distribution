package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateJobsRequest extends StObject {
  
  /** Required. The jobs to be created. A maximum of 200 jobs can be created in a batch. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
}
object BatchCreateJobsRequest {
  
  inline def apply(): BatchCreateJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
