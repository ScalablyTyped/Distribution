package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2HybridInspectDlpJobRequest extends StObject {
  
  /** The item to inspect. */
  var hybridItem: js.UndefOr[GooglePrivacyDlpV2HybridContentItem] = js.undefined
}
object GooglePrivacyDlpV2HybridInspectDlpJobRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridInspectDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridInspectDlpJobRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridInspectDlpJobRequestMutableBuilder[Self <: GooglePrivacyDlpV2HybridInspectDlpJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHybridItem(value: GooglePrivacyDlpV2HybridContentItem): Self = StObject.set(x, "hybridItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHybridItemUndefined: Self = StObject.set(x, "hybridItem", js.undefined)
  }
}
