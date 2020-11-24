package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Expressions extends js.Object {
  
  /** Conditions to apply to the expression. */
  var conditions: js.UndefOr[GooglePrivacyDlpV2Conditions] = js.native
  
  /** The operator to apply to the result of conditions. Default and currently only supported value is `AND`. */
  var logicalOperator: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Expressions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Expressions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ExpressionsOps[Self <: GooglePrivacyDlpV2Expressions] (val x: Self) extends AnyVal {
    
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
    def setConditions(value: GooglePrivacyDlpV2Conditions): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setLogicalOperator(value: String): Self = this.set("logicalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalOperator: Self = this.set("logicalOperator", js.undefined)
  }
}
