package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalcRange extends StObject {
  
  /**
    * function to calculate the date range of the operation. the function returns an array of UniversalDates.
    */
  var calcRange: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Array of values for the defaults of `RangeOperators` parameter. This can be a function, which returns
    * the array of values. If not used the default for the values is 1.
    */
  var defaultValues: js.UndefOr[js.Array[int] | js.Function] = js.undefined
  
  /**
    * function to format the date range.
    */
  var formatRange: js.UndefOr[js.Function] = js.undefined
  
  /**
    * additional array of labels for the values of the operator. Will be shown as placeholder text or label
    * on the value fields.
    */
  var label: js.UndefOr[String] = js.undefined
}
object CalcRange {
  
  inline def apply(): CalcRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalcRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalcRange] (val x: Self) extends AnyVal {
    
    inline def setCalcRange(value: js.Function): Self = StObject.set(x, "calcRange", value.asInstanceOf[js.Any])
    
    inline def setCalcRangeUndefined: Self = StObject.set(x, "calcRange", js.undefined)
    
    inline def setDefaultValues(value: js.Array[int] | js.Function): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUndefined: Self = StObject.set(x, "defaultValues", js.undefined)
    
    inline def setDefaultValuesVarargs(value: int*): Self = StObject.set(x, "defaultValues", js.Array(value*))
    
    inline def setFormatRange(value: js.Function): Self = StObject.set(x, "formatRange", value.asInstanceOf[js.Any])
    
    inline def setFormatRangeUndefined: Self = StObject.set(x, "formatRange", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
