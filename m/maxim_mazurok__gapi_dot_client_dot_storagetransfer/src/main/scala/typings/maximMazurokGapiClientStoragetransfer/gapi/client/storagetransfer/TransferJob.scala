package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferJob extends StObject {
  
  /** Output only. The time that the transfer job was created. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time that the transfer job was deleted. */
  var deletionTime: js.UndefOr[String] = js.undefined
  
  /** A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. The time that the transfer job was last modified. */
  var lastModificationTime: js.UndefOr[String] = js.undefined
  
  /** The name of the most recently started TransferOperation of this JobConfig. Present if and only if at least one TransferOperation has been created for this JobConfig. */
  var latestOperationName: js.UndefOr[String] = js.undefined
  
  /**
    * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service will assign a unique
    * name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This
    * name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. Example: `"transferJobs/[A-Za-z0-9-._~]*[A-Za-z0-9]$"`
    * Invalid job names will fail with an INVALID_ARGUMENT error.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Notification configuration. */
  var notificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  
  /** The ID of the Google Cloud Platform Project that owns the job. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Schedule specification. */
  var schedule: js.UndefOr[Schedule] = js.undefined
  
  /**
    * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if
    * you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /** Transfer specification. */
  var transferSpec: js.UndefOr[TransferSpec] = js.undefined
}
object TransferJob {
  
  inline def apply(): TransferJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferJob]
  }
  
  extension [Self <: TransferJob](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: String): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setLatestOperationName(value: String): Self = StObject.set(x, "latestOperationName", value.asInstanceOf[js.Any])
    
    inline def setLatestOperationNameUndefined: Self = StObject.set(x, "latestOperationName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSchedule(value: Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransferSpec(value: TransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    inline def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
