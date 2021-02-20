package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectContentResponse extends StObject {
  
  /** The findings. */
  var result: js.UndefOr[GooglePrivacyDlpV2InspectResult] = js.native
}
object GooglePrivacyDlpV2InspectContentResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectContentResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectContentResponseMutableBuilder[Self <: GooglePrivacyDlpV2InspectContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: GooglePrivacyDlpV2InspectResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
