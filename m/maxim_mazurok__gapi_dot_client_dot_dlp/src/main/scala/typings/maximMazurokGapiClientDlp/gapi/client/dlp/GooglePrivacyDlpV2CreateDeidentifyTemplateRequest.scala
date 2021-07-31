package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CreateDeidentifyTemplateRequest extends StObject {
  
  /** Required. The DeidentifyTemplate to create. */
  var deidentifyTemplate: js.UndefOr[GooglePrivacyDlpV2DeidentifyTemplate] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
    * characters. Can be empty to allow the system to generate one.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2CreateDeidentifyTemplateRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CreateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CreateDeidentifyTemplateRequestMutableBuilder[Self <: GooglePrivacyDlpV2CreateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyTemplate(value: GooglePrivacyDlpV2DeidentifyTemplate): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
