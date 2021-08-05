package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConditionalFormatRuleResponse extends StObject {
  
  /** The index of the new rule. */
  var newIndex: js.UndefOr[Double] = js.undefined
  
  /** The new rule that replaced the old rule (if replacing), or the rule that was moved (if moved) */
  var newRule: js.UndefOr[ConditionalFormatRule] = js.undefined
  
  /** The old index of the rule. Not set if a rule was replaced (because it is the same as new_index). */
  var oldIndex: js.UndefOr[Double] = js.undefined
  
  /** The old (deleted) rule. Not set if a rule was moved (because it is the same as new_rule). */
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.undefined
}
object UpdateConditionalFormatRuleResponse {
  
  inline def apply(): UpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConditionalFormatRuleResponse]
  }
  
  extension [Self <: UpdateConditionalFormatRuleResponse](x: Self) {
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setNewRule(value: ConditionalFormatRule): Self = StObject.set(x, "newRule", value.asInstanceOf[js.Any])
    
    inline def setNewRuleUndefined: Self = StObject.set(x, "newRule", js.undefined)
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
    
    inline def setOldRule(value: ConditionalFormatRule): Self = StObject.set(x, "oldRule", value.asInstanceOf[js.Any])
    
    inline def setOldRuleUndefined: Self = StObject.set(x, "oldRule", js.undefined)
  }
}
