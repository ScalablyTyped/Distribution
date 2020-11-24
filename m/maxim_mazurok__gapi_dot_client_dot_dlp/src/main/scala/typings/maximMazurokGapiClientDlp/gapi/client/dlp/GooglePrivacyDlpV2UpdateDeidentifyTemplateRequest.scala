package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2UpdateDeidentifyTemplateRequestOps[Self <: GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
