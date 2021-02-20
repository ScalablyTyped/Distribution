package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends StObject {
  
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
  implicit class GooglePrivacyDlpV2ListDeidentifyTemplatesResponseMutableBuilder[Self <: GooglePrivacyDlpV2ListDeidentifyTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyTemplates(value: js.Array[GooglePrivacyDlpV2DeidentifyTemplate]): Self = StObject.set(x, "deidentifyTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplatesUndefined: Self = StObject.set(x, "deidentifyTemplates", js.undefined)
    
    @scala.inline
    def setDeidentifyTemplatesVarargs(value: GooglePrivacyDlpV2DeidentifyTemplate*): Self = StObject.set(x, "deidentifyTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
