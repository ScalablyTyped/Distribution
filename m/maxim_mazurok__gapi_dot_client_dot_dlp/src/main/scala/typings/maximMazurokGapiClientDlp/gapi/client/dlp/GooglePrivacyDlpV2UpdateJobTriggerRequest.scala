package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2UpdateJobTriggerRequest extends StObject {
  
  /** New JobTrigger value. */
  var jobTrigger: js.UndefOr[GooglePrivacyDlpV2JobTrigger] = js.native
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2UpdateJobTriggerRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2UpdateJobTriggerRequestMutableBuilder[Self <: GooglePrivacyDlpV2UpdateJobTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTrigger(value: GooglePrivacyDlpV2JobTrigger): Self = StObject.set(x, "jobTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggerUndefined: Self = StObject.set(x, "jobTrigger", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
