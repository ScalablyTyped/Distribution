package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberRange extends StObject {
  
  var numberRange: js.UndefOr[HintMessageDetail] = js.undefined
  
  var required: js.UndefOr[Hint] = js.undefined
  
  var tooltipDecrement: js.UndefOr[String] = js.undefined
  
  var tooltipIncrement: js.UndefOr[String] = js.undefined
}
object NumberRange {
  
  inline def apply(): NumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberRange]
  }
  
  extension [Self <: NumberRange](x: Self) {
    
    inline def setNumberRange(value: HintMessageDetail): Self = StObject.set(x, "numberRange", value.asInstanceOf[js.Any])
    
    inline def setNumberRangeUndefined: Self = StObject.set(x, "numberRange", js.undefined)
    
    inline def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTooltipDecrement(value: String): Self = StObject.set(x, "tooltipDecrement", value.asInstanceOf[js.Any])
    
    inline def setTooltipDecrementUndefined: Self = StObject.set(x, "tooltipDecrement", js.undefined)
    
    inline def setTooltipIncrement(value: String): Self = StObject.set(x, "tooltipIncrement", value.asInstanceOf[js.Any])
    
    inline def setTooltipIncrementUndefined: Self = StObject.set(x, "tooltipIncrement", js.undefined)
  }
}
