package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2UpdateJobTriggerRequest extends StObject {
  
  /** New JobTrigger value. */
  var jobTrigger: js.UndefOr[GooglePrivacyDlpV2JobTrigger] = js.undefined
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2UpdateJobTriggerRequest {
  
  inline def apply(): GooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
  
  extension [Self <: GooglePrivacyDlpV2UpdateJobTriggerRequest](x: Self) {
    
    inline def setJobTrigger(value: GooglePrivacyDlpV2JobTrigger): Self = StObject.set(x, "jobTrigger", value.asInstanceOf[js.Any])
    
    inline def setJobTriggerUndefined: Self = StObject.set(x, "jobTrigger", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
