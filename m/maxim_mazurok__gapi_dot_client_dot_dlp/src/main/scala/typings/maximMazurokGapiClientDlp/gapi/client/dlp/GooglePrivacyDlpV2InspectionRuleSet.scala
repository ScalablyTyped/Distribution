package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectionRuleSet extends StObject {
  
  /** List of infoTypes this rule set is applied to. */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoType]] = js.undefined
  
  /** Set of rules to be applied to infoTypes. The rules are applied in order. */
  var rules: js.UndefOr[js.Array[GooglePrivacyDlpV2InspectionRule]] = js.undefined
}
object GooglePrivacyDlpV2InspectionRuleSet {
  
  inline def apply(): GooglePrivacyDlpV2InspectionRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectionRuleSet]
  }
  
  extension [Self <: GooglePrivacyDlpV2InspectionRuleSet](x: Self) {
    
    inline def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    inline def setRules(value: js.Array[GooglePrivacyDlpV2InspectionRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: GooglePrivacyDlpV2InspectionRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
