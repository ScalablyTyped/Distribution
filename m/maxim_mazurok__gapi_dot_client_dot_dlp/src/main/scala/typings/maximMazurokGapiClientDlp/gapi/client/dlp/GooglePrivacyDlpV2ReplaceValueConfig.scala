package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ReplaceValueConfig extends StObject {
  
  /** Value to replace it with. */
  var newValue: js.UndefOr[GooglePrivacyDlpV2Value] = js.undefined
}
object GooglePrivacyDlpV2ReplaceValueConfig {
  
  inline def apply(): GooglePrivacyDlpV2ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReplaceValueConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2ReplaceValueConfig] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
  }
}
