package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJobInstanceDetailsSummary extends StObject {
  
  /** Number of instances that have acked and will start shortly. */
  var ackedInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that are applying patches. */
  var applyingPatchesInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that are downloading patches. */
  var downloadingPatchesInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that failed. */
  var failedInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that are inactive. */
  var inactiveInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that do not appear to be running the agent. Check to ensure that the agent is installed, running, and able to communicate with the service. */
  var noAgentDetectedInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances notified about patch job. */
  var notifiedInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances pending patch job. */
  var pendingInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that are running the post-patch step. */
  var postPatchStepInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that are running the pre-patch step. */
  var prePatchStepInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances rebooting. */
  var rebootingInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that have started. */
  var startedInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that have completed successfully. */
  var succeededInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that require reboot. */
  var succeededRebootRequiredInstanceCount: js.UndefOr[String] = js.native
  
  /** Number of instances that exceeded the time out while applying the patch. */
  var timedOutInstanceCount: js.UndefOr[String] = js.native
}
object PatchJobInstanceDetailsSummary {
  
  @scala.inline
  def apply(): PatchJobInstanceDetailsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchJobInstanceDetailsSummary]
  }
  
  @scala.inline
  implicit class PatchJobInstanceDetailsSummaryMutableBuilder[Self <: PatchJobInstanceDetailsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckedInstanceCount(value: String): Self = StObject.set(x, "ackedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckedInstanceCountUndefined: Self = StObject.set(x, "ackedInstanceCount", js.undefined)
    
    @scala.inline
    def setApplyingPatchesInstanceCount(value: String): Self = StObject.set(x, "applyingPatchesInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyingPatchesInstanceCountUndefined: Self = StObject.set(x, "applyingPatchesInstanceCount", js.undefined)
    
    @scala.inline
    def setDownloadingPatchesInstanceCount(value: String): Self = StObject.set(x, "downloadingPatchesInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadingPatchesInstanceCountUndefined: Self = StObject.set(x, "downloadingPatchesInstanceCount", js.undefined)
    
    @scala.inline
    def setFailedInstanceCount(value: String): Self = StObject.set(x, "failedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedInstanceCountUndefined: Self = StObject.set(x, "failedInstanceCount", js.undefined)
    
    @scala.inline
    def setInactiveInstanceCount(value: String): Self = StObject.set(x, "inactiveInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveInstanceCountUndefined: Self = StObject.set(x, "inactiveInstanceCount", js.undefined)
    
    @scala.inline
    def setNoAgentDetectedInstanceCount(value: String): Self = StObject.set(x, "noAgentDetectedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAgentDetectedInstanceCountUndefined: Self = StObject.set(x, "noAgentDetectedInstanceCount", js.undefined)
    
    @scala.inline
    def setNotifiedInstanceCount(value: String): Self = StObject.set(x, "notifiedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifiedInstanceCountUndefined: Self = StObject.set(x, "notifiedInstanceCount", js.undefined)
    
    @scala.inline
    def setPendingInstanceCount(value: String): Self = StObject.set(x, "pendingInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingInstanceCountUndefined: Self = StObject.set(x, "pendingInstanceCount", js.undefined)
    
    @scala.inline
    def setPostPatchStepInstanceCount(value: String): Self = StObject.set(x, "postPatchStepInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostPatchStepInstanceCountUndefined: Self = StObject.set(x, "postPatchStepInstanceCount", js.undefined)
    
    @scala.inline
    def setPrePatchStepInstanceCount(value: String): Self = StObject.set(x, "prePatchStepInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrePatchStepInstanceCountUndefined: Self = StObject.set(x, "prePatchStepInstanceCount", js.undefined)
    
    @scala.inline
    def setRebootingInstanceCount(value: String): Self = StObject.set(x, "rebootingInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootingInstanceCountUndefined: Self = StObject.set(x, "rebootingInstanceCount", js.undefined)
    
    @scala.inline
    def setStartedInstanceCount(value: String): Self = StObject.set(x, "startedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedInstanceCountUndefined: Self = StObject.set(x, "startedInstanceCount", js.undefined)
    
    @scala.inline
    def setSucceededInstanceCount(value: String): Self = StObject.set(x, "succeededInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededInstanceCountUndefined: Self = StObject.set(x, "succeededInstanceCount", js.undefined)
    
    @scala.inline
    def setSucceededRebootRequiredInstanceCount(value: String): Self = StObject.set(x, "succeededRebootRequiredInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededRebootRequiredInstanceCountUndefined: Self = StObject.set(x, "succeededRebootRequiredInstanceCount", js.undefined)
    
    @scala.inline
    def setTimedOutInstanceCount(value: String): Self = StObject.set(x, "timedOutInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOutInstanceCountUndefined: Self = StObject.set(x, "timedOutInstanceCount", js.undefined)
  }
}
