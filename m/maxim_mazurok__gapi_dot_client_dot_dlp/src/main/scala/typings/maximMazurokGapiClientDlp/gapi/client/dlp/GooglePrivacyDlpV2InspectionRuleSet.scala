package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectionRuleSet extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2InspectionRuleSetOps[Self <: GooglePrivacyDlpV2InspectionRuleSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoType*): Self = this.set("infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoType]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: GooglePrivacyDlpV2InspectionRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[GooglePrivacyDlpV2InspectionRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
