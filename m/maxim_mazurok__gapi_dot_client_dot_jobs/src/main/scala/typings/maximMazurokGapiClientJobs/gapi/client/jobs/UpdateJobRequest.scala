package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobRequest extends StObject {
  
  /** Required. The Job to be updated. */
  var job: js.UndefOr[Job] = js.undefined
  
  /**
    * Optional but strongly recommended to be provided for the best service experience. If update_mask is provided, only the specified fields in job are updated. Otherwise all the fields
    * are updated. A field mask to restrict the fields that are updated. Only top level fields of Job are supported.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateJobRequest {
  
  @scala.inline
  def apply(): UpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobRequest]
  }
  
  @scala.inline
  implicit class UpdateJobRequestMutableBuilder[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
