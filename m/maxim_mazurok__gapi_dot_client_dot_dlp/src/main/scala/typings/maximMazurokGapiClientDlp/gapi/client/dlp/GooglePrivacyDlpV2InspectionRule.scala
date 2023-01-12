package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectionRule extends StObject {
  
  /** Exclusion rule. */
  var exclusionRule: js.UndefOr[GooglePrivacyDlpV2ExclusionRule] = js.undefined
  
  /** Hotword-based detection rule. */
  var hotwordRule: js.UndefOr[GooglePrivacyDlpV2HotwordRule] = js.undefined
}
object GooglePrivacyDlpV2InspectionRule {
  
  inline def apply(): GooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectionRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2InspectionRule] (val x: Self) extends AnyVal {
    
    inline def setExclusionRule(value: GooglePrivacyDlpV2ExclusionRule): Self = StObject.set(x, "exclusionRule", value.asInstanceOf[js.Any])
    
    inline def setExclusionRuleUndefined: Self = StObject.set(x, "exclusionRule", js.undefined)
    
    inline def setHotwordRule(value: GooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    inline def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
