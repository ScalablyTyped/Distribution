package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddConditionalFormatRuleRequest extends StObject {
  
  /** The zero-based index where the rule should be inserted. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** The rule to add. */
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
}
object AddConditionalFormatRuleRequest {
  
  inline def apply(): AddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddConditionalFormatRuleRequest]
  }
  
  extension [Self <: AddConditionalFormatRuleRequest](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setRule(value: ConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
