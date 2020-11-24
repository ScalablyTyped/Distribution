package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTransferJobRequest extends js.Object {
  
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
  implicit class UpdateTransferJobRequestOps[Self <: UpdateTransferJobRequest] (val x: Self) extends AnyVal {
    
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setTransferJob(value: TransferJob): Self = this.set("transferJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferJob: Self = this.set("transferJob", js.undefined)
    
    @scala.inline
    def setUpdateTransferJobFieldMask(value: String): Self = this.set("updateTransferJobFieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTransferJobFieldMask: Self = this.set("updateTransferJobFieldMask", js.undefined)
  }
}
