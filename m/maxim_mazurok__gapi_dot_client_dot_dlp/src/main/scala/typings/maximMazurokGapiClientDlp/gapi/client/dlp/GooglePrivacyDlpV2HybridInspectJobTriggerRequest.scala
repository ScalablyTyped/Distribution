package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2HybridInspectJobTriggerRequest extends StObject {
  
  /** The item to inspect. */
  var hybridItem: js.UndefOr[GooglePrivacyDlpV2HybridContentItem] = js.undefined
}
object GooglePrivacyDlpV2HybridInspectJobTriggerRequest {
  
  inline def apply(): GooglePrivacyDlpV2HybridInspectJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridInspectJobTriggerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2HybridInspectJobTriggerRequest] (val x: Self) extends AnyVal {
    
    inline def setHybridItem(value: GooglePrivacyDlpV2HybridContentItem): Self = StObject.set(x, "hybridItem", value.asInstanceOf[js.Any])
    
    inline def setHybridItemUndefined: Self = StObject.set(x, "hybridItem", js.undefined)
  }
}
