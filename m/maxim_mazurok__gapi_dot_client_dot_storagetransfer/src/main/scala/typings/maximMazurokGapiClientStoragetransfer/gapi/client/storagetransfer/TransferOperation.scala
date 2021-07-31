package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferOperation extends StObject {
  
  /** Information about the progress of the transfer operation. */
  var counters: js.UndefOr[TransferCounters] = js.undefined
  
  /** End time of this transfer execution. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Summarizes errors encountered with sample error log entries. */
  var errorBreakdowns: js.UndefOr[js.Array[ErrorSummary]] = js.undefined
  
  /** A globally unique ID assigned by the system. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Notification configuration. */
  var notificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  
  /** The ID of the Google Cloud Platform Project that owns the operation. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Start time of this transfer execution. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Status of the transfer operation. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The name of the transfer job that triggers this transfer operation. */
  var transferJobName: js.UndefOr[String] = js.undefined
  
  /** Transfer specification. */
  var transferSpec: js.UndefOr[TransferSpec] = js.undefined
}
object TransferOperation {
  
  @scala.inline
  def apply(): TransferOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOperation]
  }
  
  @scala.inline
  implicit class TransferOperationMutableBuilder[Self <: TransferOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounters(value: TransferCounters): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setErrorBreakdowns(value: js.Array[ErrorSummary]): Self = StObject.set(x, "errorBreakdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorBreakdownsUndefined: Self = StObject.set(x, "errorBreakdowns", js.undefined)
    
    @scala.inline
    def setErrorBreakdownsVarargs(value: ErrorSummary*): Self = StObject.set(x, "errorBreakdowns", js.Array(value :_*))
    
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
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTransferJobName(value: String): Self = StObject.set(x, "transferJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferJobNameUndefined: Self = StObject.set(x, "transferJobName", js.undefined)
    
    @scala.inline
    def setTransferSpec(value: TransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
