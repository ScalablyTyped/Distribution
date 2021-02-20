package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2JobTrigger extends StObject {
  
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
  implicit class GooglePrivacyDlpV2JobTriggerMutableBuilder[Self <: GooglePrivacyDlpV2JobTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[GooglePrivacyDlpV2Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GooglePrivacyDlpV2Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setInspectJob(value: GooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "inspectJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectJobUndefined: Self = StObject.set(x, "inspectJob", js.undefined)
    
    @scala.inline
    def setLastRunTime(value: String): Self = StObject.set(x, "lastRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunTimeUndefined: Self = StObject.set(x, "lastRunTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTriggers(value: js.Array[GooglePrivacyDlpV2Trigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: GooglePrivacyDlpV2Trigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
