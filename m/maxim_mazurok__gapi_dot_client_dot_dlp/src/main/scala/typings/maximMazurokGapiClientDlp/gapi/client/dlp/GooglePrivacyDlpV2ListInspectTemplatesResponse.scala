package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListInspectTemplatesResponse extends StObject {
  
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
  implicit class GooglePrivacyDlpV2ListInspectTemplatesResponseMutableBuilder[Self <: GooglePrivacyDlpV2ListInspectTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspectTemplates(value: js.Array[GooglePrivacyDlpV2InspectTemplate]): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplatesUndefined: Self = StObject.set(x, "inspectTemplates", js.undefined)
    
    @scala.inline
    def setInspectTemplatesVarargs(value: GooglePrivacyDlpV2InspectTemplate*): Self = StObject.set(x, "inspectTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
