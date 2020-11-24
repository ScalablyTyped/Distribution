package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJob extends js.Object {
  
  /** Time this patch job was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Description of the patch job. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Display name for this patch job. This is not a unique identifier. */
  var displayName: js.UndefOr[String] = js.native
  
  /** If this patch job is a dry run, the agent reports that it has finished without running any updates on the VM instance. */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /** Duration of the patch job. After the duration ends, the patch job times out. */
  var duration: js.UndefOr[String] = js.native
  
  /** If this patch job failed, this message provides information about the failure. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** Summary of instance details. */
  var instanceDetailsSummary: js.UndefOr[PatchJobInstanceDetailsSummary] = js.native
  
  /** Instances to patch. */
  var instanceFilter: js.UndefOr[PatchInstanceFilter] = js.native
  
  /** Unique identifier for this patch job in the form `projects/∗/patchJobs/ *` */
  var name: js.UndefOr[String] = js.native
  
  /** Patch configuration being applied. */
  var patchConfig: js.UndefOr[PatchConfig] = js.native
  
  /** Output only. Name of the patch deployment that created this patch job. */
  var patchDeployment: js.UndefOr[String] = js.native
  
  /** Reflects the overall progress of the patch job in the range of 0.0 being no progress to 100.0 being complete. */
  var percentComplete: js.UndefOr[Double] = js.native
  
  /** Rollout strategy being applied. */
  var rollout: js.UndefOr[PatchRollout] = js.native
  
  /** The current state of the PatchJob. */
  var state: js.UndefOr[String] = js.native
  
  /** Last time this patch job was updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object PatchJob {
  
  @scala.inline
  def apply(): PatchJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchJob]
  }
  
  @scala.inline
  implicit class PatchJobOps[Self <: PatchJob] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setInstanceDetailsSummary(value: PatchJobInstanceDetailsSummary): Self = this.set("instanceDetailsSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceDetailsSummary: Self = this.set("instanceDetailsSummary", js.undefined)
    
    @scala.inline
    def setInstanceFilter(value: PatchInstanceFilter): Self = this.set("instanceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFilter: Self = this.set("instanceFilter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPatchConfig(value: PatchConfig): Self = this.set("patchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchConfig: Self = this.set("patchConfig", js.undefined)
    
    @scala.inline
    def setPatchDeployment(value: String): Self = this.set("patchDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchDeployment: Self = this.set("patchDeployment", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setRollout(value: PatchRollout): Self = this.set("rollout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollout: Self = this.set("rollout", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
