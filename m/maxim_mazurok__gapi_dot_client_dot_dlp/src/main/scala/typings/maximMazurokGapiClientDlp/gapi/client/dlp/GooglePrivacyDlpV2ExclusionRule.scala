package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ExclusionRule extends StObject {
  
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
  implicit class GooglePrivacyDlpV2ExclusionRuleMutableBuilder[Self <: GooglePrivacyDlpV2ExclusionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDictionary(value: GooglePrivacyDlpV2Dictionary): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setExcludeInfoTypes(value: GooglePrivacyDlpV2ExcludeInfoTypes): Self = StObject.set(x, "excludeInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeInfoTypesUndefined: Self = StObject.set(x, "excludeInfoTypes", js.undefined)
    
    @scala.inline
    def setMatchingType(value: String): Self = StObject.set(x, "matchingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingTypeUndefined: Self = StObject.set(x, "matchingType", js.undefined)
    
    @scala.inline
    def setRegex(value: GooglePrivacyDlpV2Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
