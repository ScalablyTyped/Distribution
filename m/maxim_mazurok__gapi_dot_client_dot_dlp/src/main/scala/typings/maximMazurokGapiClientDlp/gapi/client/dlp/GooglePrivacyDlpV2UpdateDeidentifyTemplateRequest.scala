package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends StObject {
  
  /** New DeidentifyTemplate value. */
  var deidentifyTemplate: js.UndefOr[GooglePrivacyDlpV2DeidentifyTemplate] = js.undefined
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest {
  
  inline def apply(): GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  }
  
  extension [Self <: GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest](x: Self) {
    
    inline def setDeidentifyTemplate(value: GooglePrivacyDlpV2DeidentifyTemplate): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
