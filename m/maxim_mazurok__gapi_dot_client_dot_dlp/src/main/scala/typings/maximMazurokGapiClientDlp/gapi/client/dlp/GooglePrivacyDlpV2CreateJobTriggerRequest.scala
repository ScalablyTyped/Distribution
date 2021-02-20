package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CreateJobTriggerRequest extends StObject {
  
  /** Required. The JobTrigger to create. */
  var jobTrigger: js.UndefOr[GooglePrivacyDlpV2JobTrigger] = js.native
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
    * characters. Can be empty to allow the system to generate one.
    */
  var triggerId: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CreateJobTriggerRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CreateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateJobTriggerRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CreateJobTriggerRequestMutableBuilder[Self <: GooglePrivacyDlpV2CreateJobTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTrigger(value: GooglePrivacyDlpV2JobTrigger): Self = StObject.set(x, "jobTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggerUndefined: Self = StObject.set(x, "jobTrigger", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
