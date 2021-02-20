package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DetectionRule extends StObject {
  
  /** Hotword-based detection rule. */
  var hotwordRule: js.UndefOr[GooglePrivacyDlpV2HotwordRule] = js.native
}
object GooglePrivacyDlpV2DetectionRule {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DetectionRule]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DetectionRuleMutableBuilder[Self <: GooglePrivacyDlpV2DetectionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHotwordRule(value: GooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
