package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DetectionRule extends StObject {
  
  /** Hotword-based detection rule. */
  var hotwordRule: js.UndefOr[GooglePrivacyDlpV2HotwordRule] = js.undefined
}
object GooglePrivacyDlpV2DetectionRule {
  
  inline def apply(): GooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DetectionRule]
  }
  
  extension [Self <: GooglePrivacyDlpV2DetectionRule](x: Self) {
    
    inline def setHotwordRule(value: GooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    inline def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
