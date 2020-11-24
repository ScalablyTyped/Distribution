package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListInspectTemplatesResponse extends js.Object {
  
  /** List of inspectTemplates, up to page_size in ListInspectTemplatesRequest. */
  var inspectTemplates: js.UndefOr[js.Array[GooglePrivacyDlpV2InspectTemplate]] = js.native
  
  /** If the next page is available then the next page token to be used in following ListInspectTemplates request. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2ListInspectTemplatesResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListInspectTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListInspectTemplatesResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListInspectTemplatesResponseOps[Self <: GooglePrivacyDlpV2ListInspectTemplatesResponse] (val x: Self) extends AnyVal {
    
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
    def setInspectTemplatesVarargs(value: GooglePrivacyDlpV2InspectTemplate*): Self = this.set("inspectTemplates", js.Array(value :_*))
    
    @scala.inline
    def setInspectTemplates(value: js.Array[GooglePrivacyDlpV2InspectTemplate]): Self = this.set("inspectTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectTemplates: Self = this.set("inspectTemplates", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
