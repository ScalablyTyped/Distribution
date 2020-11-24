package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CreateDeidentifyTemplateRequest extends js.Object {
  
  /** Required. The DeidentifyTemplate to create. */
  var deidentifyTemplate: js.UndefOr[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
    * characters. Can be empty to allow the system to generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CreateDeidentifyTemplateRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CreateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CreateDeidentifyTemplateRequestOps[Self <: GooglePrivacyDlpV2CreateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setDeidentifyTemplate(value: GooglePrivacyDlpV2DeidentifyTemplate): Self = this.set("deidentifyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeidentifyTemplate: Self = this.set("deidentifyTemplate", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
