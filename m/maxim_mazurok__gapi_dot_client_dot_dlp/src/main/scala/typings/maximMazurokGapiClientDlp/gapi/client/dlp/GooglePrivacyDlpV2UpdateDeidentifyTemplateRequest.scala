package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends StObject {
  
  /** New DeidentifyTemplate value. */
  var deidentifyTemplate: js.UndefOr[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2UpdateDeidentifyTemplateRequestMutableBuilder[Self <: GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyTemplate(value: GooglePrivacyDlpV2DeidentifyTemplate): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
