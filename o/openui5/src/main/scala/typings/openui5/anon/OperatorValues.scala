package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorValues extends StObject {
  
  var operator: String
  
  var values: js.Array[Double | String | Null]
}
object OperatorValues {
  
  inline def apply(operator: String, values: js.Array[Double | String | Null]): OperatorValues = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperatorValues] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Double | String | Null]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: (Double | String | Null)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
