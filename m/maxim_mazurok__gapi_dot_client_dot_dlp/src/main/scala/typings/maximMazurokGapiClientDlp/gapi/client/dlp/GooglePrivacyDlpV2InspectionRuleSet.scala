package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectionRuleSet extends StObject {
  
  /** List of infoTypes this rule set is applied to. */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoType]] = js.native
  
  /** Set of rules to be applied to infoTypes. The rules are applied in order. */
  var rules: js.UndefOr[js.Array[GooglePrivacyDlpV2InspectionRule]] = js.native
}
object GooglePrivacyDlpV2InspectionRuleSet {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectionRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectionRuleSet]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectionRuleSetMutableBuilder[Self <: GooglePrivacyDlpV2InspectionRuleSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[GooglePrivacyDlpV2InspectionRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: GooglePrivacyDlpV2InspectionRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
