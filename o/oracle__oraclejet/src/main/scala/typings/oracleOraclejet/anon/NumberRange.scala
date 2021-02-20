package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberRange extends StObject {
  
  var numberRange: js.UndefOr[HintMessageDetail] = js.native
  
  var required: js.UndefOr[Hint] = js.native
  
  var tooltipDecrement: js.UndefOr[String] = js.native
  
  var tooltipIncrement: js.UndefOr[String] = js.native
}
object NumberRange {
  
  @scala.inline
  def apply(): NumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberRange]
  }
  
  @scala.inline
  implicit class NumberRangeMutableBuilder[Self <: NumberRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberRange(value: HintMessageDetail): Self = StObject.set(x, "numberRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberRangeUndefined: Self = StObject.set(x, "numberRange", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTooltipDecrement(value: String): Self = StObject.set(x, "tooltipDecrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDecrementUndefined: Self = StObject.set(x, "tooltipDecrement", js.undefined)
    
    @scala.inline
    def setTooltipIncrement(value: String): Self = StObject.set(x, "tooltipIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipIncrementUndefined: Self = StObject.set(x, "tooltipIncrement", js.undefined)
  }
}
