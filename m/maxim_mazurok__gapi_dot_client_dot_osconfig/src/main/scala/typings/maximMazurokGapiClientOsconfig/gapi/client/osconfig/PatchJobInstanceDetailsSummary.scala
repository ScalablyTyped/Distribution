package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJobInstanceDetailsSummary extends js.Object {
  
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
  implicit class PatchJobInstanceDetailsSummaryOps[Self <: PatchJobInstanceDetailsSummary] (val x: Self) extends AnyVal {
    
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
    def setAckedInstanceCount(value: String): Self = this.set("ackedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckedInstanceCount: Self = this.set("ackedInstanceCount", js.undefined)
    
    @scala.inline
    def setApplyingPatchesInstanceCount(value: String): Self = this.set("applyingPatchesInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyingPatchesInstanceCount: Self = this.set("applyingPatchesInstanceCount", js.undefined)
    
    @scala.inline
    def setDownloadingPatchesInstanceCount(value: String): Self = this.set("downloadingPatchesInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadingPatchesInstanceCount: Self = this.set("downloadingPatchesInstanceCount", js.undefined)
    
    @scala.inline
    def setFailedInstanceCount(value: String): Self = this.set("failedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedInstanceCount: Self = this.set("failedInstanceCount", js.undefined)
    
    @scala.inline
    def setInactiveInstanceCount(value: String): Self = this.set("inactiveInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveInstanceCount: Self = this.set("inactiveInstanceCount", js.undefined)
    
    @scala.inline
    def setNoAgentDetectedInstanceCount(value: String): Self = this.set("noAgentDetectedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAgentDetectedInstanceCount: Self = this.set("noAgentDetectedInstanceCount", js.undefined)
    
    @scala.inline
    def setNotifiedInstanceCount(value: String): Self = this.set("notifiedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifiedInstanceCount: Self = this.set("notifiedInstanceCount", js.undefined)
    
    @scala.inline
    def setPendingInstanceCount(value: String): Self = this.set("pendingInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingInstanceCount: Self = this.set("pendingInstanceCount", js.undefined)
    
    @scala.inline
    def setPostPatchStepInstanceCount(value: String): Self = this.set("postPatchStepInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostPatchStepInstanceCount: Self = this.set("postPatchStepInstanceCount", js.undefined)
    
    @scala.inline
    def setPrePatchStepInstanceCount(value: String): Self = this.set("prePatchStepInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrePatchStepInstanceCount: Self = this.set("prePatchStepInstanceCount", js.undefined)
    
    @scala.inline
    def setRebootingInstanceCount(value: String): Self = this.set("rebootingInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebootingInstanceCount: Self = this.set("rebootingInstanceCount", js.undefined)
    
    @scala.inline
    def setStartedInstanceCount(value: String): Self = this.set("startedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedInstanceCount: Self = this.set("startedInstanceCount", js.undefined)
    
    @scala.inline
    def setSucceededInstanceCount(value: String): Self = this.set("succeededInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceededInstanceCount: Self = this.set("succeededInstanceCount", js.undefined)
    
    @scala.inline
    def setSucceededRebootRequiredInstanceCount(value: String): Self = this.set("succeededRebootRequiredInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceededRebootRequiredInstanceCount: Self = this.set("succeededRebootRequiredInstanceCount", js.undefined)
    
    @scala.inline
    def setTimedOutInstanceCount(value: String): Self = this.set("timedOutInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedOutInstanceCount: Self = this.set("timedOutInstanceCount", js.undefined)
  }
}
