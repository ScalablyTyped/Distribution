package typings.openui5.sapMLibraryMod

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicDateRangeValue extends StObject {
  
  /**
    * The key of a DynamicDateOption.
    */
  var operator: String
  
  /**
    * An array of parameters for the same option.
    */
  var values: js.Array[js.Date | int | String | Any]
}
object DynamicDateRangeValue {
  
  inline def apply(operator: String, values: js.Array[js.Date | int | String | Any]): DynamicDateRangeValue = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDateRangeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicDateRangeValue] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[js.Date | int | String | Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: (js.Date | int | String | Any)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
