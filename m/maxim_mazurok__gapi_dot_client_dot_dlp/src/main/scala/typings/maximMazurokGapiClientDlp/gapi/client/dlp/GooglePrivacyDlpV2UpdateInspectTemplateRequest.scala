package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2UpdateInspectTemplateRequest extends StObject {
  
  /** New InspectTemplate value. */
  var inspectTemplate: js.UndefOr[GooglePrivacyDlpV2InspectTemplate] = js.undefined
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2UpdateInspectTemplateRequest {
  
  inline def apply(): GooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2UpdateInspectTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setInspectTemplate(value: GooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "inspectTemplate", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateUndefined: Self = StObject.set(x, "inspectTemplate", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
