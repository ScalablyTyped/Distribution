package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ExclusionRule extends js.Object {
  
  /** Dictionary which defines the rule. */
  var dictionary: js.UndefOr[GooglePrivacyDlpV2Dictionary] = js.native
  
  /** Set of infoTypes for which findings would affect this rule. */
  var excludeInfoTypes: js.UndefOr[GooglePrivacyDlpV2ExcludeInfoTypes] = js.native
  
  /** How the rule is applied, see MatchingType documentation for details. */
  var matchingType: js.UndefOr[String] = js.native
  
  /** Regular expression which defines the rule. */
  var regex: js.UndefOr[GooglePrivacyDlpV2Regex] = js.native
}
object GooglePrivacyDlpV2ExclusionRule {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ExclusionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ExclusionRule]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ExclusionRuleOps[Self <: GooglePrivacyDlpV2ExclusionRule] (val x: Self) extends AnyVal {
    
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
    def setDictionary(value: GooglePrivacyDlpV2Dictionary): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    
    @scala.inline
    def setExcludeInfoTypes(value: GooglePrivacyDlpV2ExcludeInfoTypes): Self = this.set("excludeInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeInfoTypes: Self = this.set("excludeInfoTypes", js.undefined)
    
    @scala.inline
    def setMatchingType(value: String): Self = this.set("matchingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingType: Self = this.set("matchingType", js.undefined)
    
    @scala.inline
    def setRegex(value: GooglePrivacyDlpV2Regex): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
