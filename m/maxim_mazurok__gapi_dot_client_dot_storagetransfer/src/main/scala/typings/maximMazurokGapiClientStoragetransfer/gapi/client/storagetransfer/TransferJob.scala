package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferJob extends StObject {
  
  /** Output only. The time that the transfer job was created. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** Output only. The time that the transfer job was deleted. */
  var deletionTime: js.UndefOr[String] = js.native
  
  /** A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded. */
  var description: js.UndefOr[String] = js.native
  
  /** Output only. The time that the transfer job was last modified. */
  var lastModificationTime: js.UndefOr[String] = js.native
  
  /** The name of the most recently started TransferOperation of this JobConfig. Present if and only if at least one TransferOperation has been created for this JobConfig. */
  var latestOperationName: js.UndefOr[String] = js.native
  
  /**
    * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service will assign a unique
    * name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This
    * name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. Example: `"transferJobs/[A-Za-z0-9-._~]*[A-Za-z0-9]$"`
    * Invalid job names will fail with an INVALID_ARGUMENT error.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Notification configuration. */
  var notificationConfig: js.UndefOr[NotificationConfig] = js.native
  
  /** The ID of the Google Cloud Platform Project that owns the job. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Schedule specification. */
  var schedule: js.UndefOr[Schedule] = js.native
  
  /**
    * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if
    * you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
    */
  var status: js.UndefOr[String] = js.native
  
  /** Transfer specification. */
  var transferSpec: js.UndefOr[TransferSpec] = js.native
}
object TransferJob {
  
  @scala.inline
  def apply(): TransferJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferJob]
  }
  
  @scala.inline
  implicit class TransferJobMutableBuilder[Self <: TransferJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: String): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    @scala.inline
    def setLatestOperationName(value: String): Self = StObject.set(x, "latestOperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestOperationNameUndefined: Self = StObject.set(x, "latestOperationName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTransferSpec(value: TransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
