package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchDeployment extends js.Object {
  
  /** Output only. Time the patch deployment was created. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Description of the patch deployment. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. Duration of the patch. After the duration ends, the patch times out. */
  var duration: js.UndefOr[String] = js.native
  
  /** Required. VM instances to patch. */
  var instanceFilter: js.UndefOr[PatchInstanceFilter] = js.native
  
  /** Output only. The last time a patch job was started by this deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var lastExecuteTime: js.UndefOr[String] = js.native
  
  /**
    * Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is
    * ignored when you create a new patch deployment.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Schedule a one-time execution. */
  var oneTimeSchedule: js.UndefOr[OneTimeSchedule] = js.native
  
  /** Optional. Patch configuration that is applied. */
  var patchConfig: js.UndefOr[PatchConfig] = js.native
  
  /** Required. Schedule recurring executions. */
  var recurringSchedule: js.UndefOr[RecurringSchedule] = js.native
  
  /** Optional. Rollout strategy of the patch job. */
  var rollout: js.UndefOr[PatchRollout] = js.native
  
  /** Output only. Time the patch deployment was last updated. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var updateTime: js.UndefOr[String] = js.native
}
object PatchDeployment {
  
  @scala.inline
  def apply(): PatchDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchDeployment]
  }
  
  @scala.inline
  implicit class PatchDeploymentOps[Self <: PatchDeployment] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setInstanceFilter(value: PatchInstanceFilter): Self = this.set("instanceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFilter: Self = this.set("instanceFilter", js.undefined)
    
    @scala.inline
    def setLastExecuteTime(value: String): Self = this.set("lastExecuteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastExecuteTime: Self = this.set("lastExecuteTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOneTimeSchedule(value: OneTimeSchedule): Self = this.set("oneTimeSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneTimeSchedule: Self = this.set("oneTimeSchedule", js.undefined)
    
    @scala.inline
    def setPatchConfig(value: PatchConfig): Self = this.set("patchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchConfig: Self = this.set("patchConfig", js.undefined)
    
    @scala.inline
    def setRecurringSchedule(value: RecurringSchedule): Self = this.set("recurringSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringSchedule: Self = this.set("recurringSchedule", js.undefined)
    
    @scala.inline
    def setRollout(value: PatchRollout): Self = this.set("rollout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollout: Self = this.set("rollout", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
