package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConditionalFormatRuleResponse extends StObject {
  
  /** The rule that was deleted. */
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
}
object DeleteConditionalFormatRuleResponse {
  
  @scala.inline
  def apply(): DeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConditionalFormatRuleResponse]
  }
  
  @scala.inline
  implicit class DeleteConditionalFormatRuleResponseMutableBuilder[Self <: DeleteConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: ConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
