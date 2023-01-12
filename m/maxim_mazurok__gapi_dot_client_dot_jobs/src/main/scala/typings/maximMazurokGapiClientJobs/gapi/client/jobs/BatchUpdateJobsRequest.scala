package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateJobsRequest extends StObject {
  
  /** Required. The jobs to be updated. A maximum of 200 jobs can be updated in a batch. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  
  /**
    * Strongly recommended for the best service experience. Be aware that it will also increase latency when checking the status of a batch operation. If update_mask is provided, only the
    * specified fields in Job are updated. Otherwise all the fields are updated. A field mask to restrict the fields that are updated. Only top level fields of Job are supported. If
    * update_mask is provided, The Job inside JobResult will only contains fields that is updated, plus the Id of the Job. Otherwise, Job will include all fields, which can yield a very
    * large response.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object BatchUpdateJobsRequest {
  
  inline def apply(): BatchUpdateJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
