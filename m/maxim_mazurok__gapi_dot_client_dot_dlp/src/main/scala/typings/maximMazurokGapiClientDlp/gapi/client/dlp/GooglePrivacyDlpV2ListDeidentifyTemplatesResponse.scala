package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends js.Object {
  
  /** List of deidentify templates, up to page_size in ListDeidentifyTemplatesRequest. */
  var deidentifyTemplates: js.UndefOr[js.Array[GooglePrivacyDlpV2DeidentifyTemplate]] = js.native
  
  /** If the next page is available then the next page token to be used in following ListDeidentifyTemplates request. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2ListDeidentifyTemplatesResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListDeidentifyTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListDeidentifyTemplatesResponseOps[Self <: GooglePrivacyDlpV2ListDeidentifyTemplatesResponse] (val x: Self) extends AnyVal {
    
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
    def setDeidentifyTemplatesVarargs(value: GooglePrivacyDlpV2DeidentifyTemplate*): Self = this.set("deidentifyTemplates", js.Array(value :_*))
    
    @scala.inline
    def setDeidentifyTemplates(value: js.Array[GooglePrivacyDlpV2DeidentifyTemplate]): Self = this.set("deidentifyTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeidentifyTemplates: Self = this.set("deidentifyTemplates", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
