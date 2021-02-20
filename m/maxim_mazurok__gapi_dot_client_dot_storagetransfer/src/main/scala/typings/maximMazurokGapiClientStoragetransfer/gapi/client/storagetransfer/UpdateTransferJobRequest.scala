package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTransferJobRequest extends StObject {
  
  /** Required. The ID of the Google Cloud Platform Console project that owns the job. */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Required. The job to update. `transferJob` is expected to specify only four fields: description, transfer_spec, notification_config, and status. An `UpdateTransferJobRequest` that
    * specifies other fields will be rejected with the error INVALID_ARGUMENT. Updating a job satus to DELETED requires `storagetransfer.jobs.delete` permissions.
    */
  var transferJob: js.UndefOr[TransferJob] = js.native
  
  /**
    * The field mask of the fields in `transferJob` that are to be updated in this request. Fields in `transferJob` that can be updated are: description, transfer_spec,
    * notification_config, and status. To update the `transfer_spec` of the job, a complete transfer specification must be provided. An incomplete specification missing any required
    * fields will be rejected with the error INVALID_ARGUMENT.
    */
  var updateTransferJobFieldMask: js.UndefOr[String] = js.native
}
object UpdateTransferJobRequest {
  
  @scala.inline
  def apply(): UpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTransferJobRequest]
  }
  
  @scala.inline
  implicit class UpdateTransferJobRequestMutableBuilder[Self <: UpdateTransferJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTransferJob(value: TransferJob): Self = StObject.set(x, "transferJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferJobUndefined: Self = StObject.set(x, "transferJob", js.undefined)
    
    @scala.inline
    def setUpdateTransferJobFieldMask(value: String): Self = StObject.set(x, "updateTransferJobFieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTransferJobFieldMaskUndefined: Self = StObject.set(x, "updateTransferJobFieldMask", js.undefined)
  }
}
