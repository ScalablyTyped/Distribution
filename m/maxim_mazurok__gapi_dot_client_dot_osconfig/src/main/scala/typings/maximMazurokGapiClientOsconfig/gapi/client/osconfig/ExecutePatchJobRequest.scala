package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutePatchJobRequest extends js.Object {
  
  /** Description of the patch job. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Display name for this patch job. This does not have to be unique. */
  var displayName: js.UndefOr[String] = js.native
  
  /** If this patch is a dry-run only, instances are contacted but will do nothing. */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /** Duration of the patch job. After the duration ends, the patch job times out. */
  var duration: js.UndefOr[String] = js.native
  
  /** Required. Instances to patch, either explicitly or filtered by some criteria such as zone or labels. */
  var instanceFilter: js.UndefOr[PatchInstanceFilter] = js.native
  
  /** Patch configuration being applied. If omitted, instances are patched using the default configurations. */
  var patchConfig: js.UndefOr[PatchConfig] = js.native
  
  /** Rollout strategy of the patch job. */
  var rollout: js.UndefOr[PatchRollout] = js.native
}
object ExecutePatchJobRequest {
  
  @scala.inline
  def apply(): ExecutePatchJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutePatchJobRequest]
  }
  
  @scala.inline
  implicit class ExecutePatchJobRequestOps[Self <: ExecutePatchJobRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceFilter(value: PatchInstanceFilter): Self = this.set("instanceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFilter: Self = this.set("instanceFilter", js.undefined)
    
    @scala.inline
    def setPatchConfig(value: PatchConfig): Self = this.set("patchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchConfig: Self = this.set("patchConfig", js.undefined)
    
    @scala.inline
    def setRollout(value: PatchRollout): Self = this.set("rollout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollout: Self = this.set("rollout", js.undefined)
  }
}
