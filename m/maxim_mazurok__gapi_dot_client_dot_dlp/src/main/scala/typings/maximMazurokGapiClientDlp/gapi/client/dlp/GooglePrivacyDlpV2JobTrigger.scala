package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2JobTrigger extends js.Object {
  
  /** Output only. The creation timestamp of a triggeredJob. */
  var createTime: js.UndefOr[String] = js.native
  
  /** User provided description (max 256 chars) */
  var description: js.UndefOr[String] = js.native
  
  /** Display name (max 100 chars) */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only. A stream of errors encountered when the trigger was activated. Repeated errors may result in the JobTrigger automatically being paused. Will return the last 100 errors.
    * Whenever the JobTrigger is modified this list will be cleared.
    */
  var errors: js.UndefOr[js.Array[GooglePrivacyDlpV2Error]] = js.native
  
  /** For inspect jobs, a snapshot of the configuration. */
  var inspectJob: js.UndefOr[GooglePrivacyDlpV2InspectJobConfig] = js.native
  
  /** Output only. The timestamp of the last time this trigger executed. */
  var lastRunTime: js.UndefOr[String] = js.native
  
  /** Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. A status for this trigger. */
  var status: js.UndefOr[String] = js.native
  
  /**
    * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at
    * least one object.
    */
  var triggers: js.UndefOr[js.Array[GooglePrivacyDlpV2Trigger]] = js.native
  
  /** Output only. The last update timestamp of a triggeredJob. */
  var updateTime: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2JobTrigger {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2JobTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2JobTrigger]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2JobTriggerOps[Self <: GooglePrivacyDlpV2JobTrigger] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: GooglePrivacyDlpV2Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[GooglePrivacyDlpV2Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInspectJob(value: GooglePrivacyDlpV2InspectJobConfig): Self = this.set("inspectJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectJob: Self = this.set("inspectJob", js.undefined)
    
    @scala.inline
    def setLastRunTime(value: String): Self = this.set("lastRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRunTime: Self = this.set("lastRunTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: GooglePrivacyDlpV2Trigger*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: js.Array[GooglePrivacyDlpV2Trigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
