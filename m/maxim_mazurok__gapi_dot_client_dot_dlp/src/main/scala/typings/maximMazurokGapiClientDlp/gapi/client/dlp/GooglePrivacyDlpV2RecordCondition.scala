package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RecordCondition extends js.Object {
  
  /** An expression. */
  var expressions: js.UndefOr[GooglePrivacyDlpV2Expressions] = js.native
}
object GooglePrivacyDlpV2RecordCondition {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordCondition]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordConditionOps[Self <: GooglePrivacyDlpV2RecordCondition] (val x: Self) extends AnyVal {
    
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
    def setExpressions(value: GooglePrivacyDlpV2Expressions): Self = this.set("expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
  }
}
