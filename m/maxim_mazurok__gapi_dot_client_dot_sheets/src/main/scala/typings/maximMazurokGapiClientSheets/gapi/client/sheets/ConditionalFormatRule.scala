package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormatRule extends StObject {
  
  /** The formatting is either "on" or "off" according to the rule. */
  var booleanRule: js.UndefOr[BooleanRule] = js.undefined
  
  /** The formatting will vary based on the gradients in the rule. */
  var gradientRule: js.UndefOr[GradientRule] = js.undefined
  
  /** The ranges that are formatted if the condition is true. All the ranges must be on the same grid. */
  var ranges: js.UndefOr[js.Array[GridRange]] = js.undefined
}
object ConditionalFormatRule {
  
  inline def apply(): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  
  extension [Self <: ConditionalFormatRule](x: Self) {
    
    inline def setBooleanRule(value: BooleanRule): Self = StObject.set(x, "booleanRule", value.asInstanceOf[js.Any])
    
    inline def setBooleanRuleUndefined: Self = StObject.set(x, "booleanRule", js.undefined)
    
    inline def setGradientRule(value: GradientRule): Self = StObject.set(x, "gradientRule", value.asInstanceOf[js.Any])
    
    inline def setGradientRuleUndefined: Self = StObject.set(x, "gradientRule", js.undefined)
    
    inline def setRanges(value: js.Array[GridRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: GridRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
