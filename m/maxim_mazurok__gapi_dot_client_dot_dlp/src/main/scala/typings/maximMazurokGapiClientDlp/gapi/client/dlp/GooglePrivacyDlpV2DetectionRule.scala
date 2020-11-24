package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DetectionRule extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2DetectionRuleOps[Self <: GooglePrivacyDlpV2DetectionRule] (val x: Self) extends AnyVal {
    
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
    def setHotwordRule(value: GooglePrivacyDlpV2HotwordRule): Self = this.set("hotwordRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotwordRule: Self = this.set("hotwordRule", js.undefined)
  }
}
