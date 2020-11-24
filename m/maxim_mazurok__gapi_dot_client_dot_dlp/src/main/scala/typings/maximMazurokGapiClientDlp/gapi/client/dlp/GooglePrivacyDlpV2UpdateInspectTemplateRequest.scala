package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2UpdateInspectTemplateRequest extends js.Object {
  
  /** New InspectTemplate value. */
  var inspectTemplate: js.UndefOr[GooglePrivacyDlpV2InspectTemplate] = js.native
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2UpdateInspectTemplateRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2UpdateInspectTemplateRequestOps[Self <: GooglePrivacyDlpV2UpdateInspectTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setInspectTemplate(value: GooglePrivacyDlpV2InspectTemplate): Self = this.set("inspectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectTemplate: Self = this.set("inspectTemplate", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
