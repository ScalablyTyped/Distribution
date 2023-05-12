package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var operator: String
  
  var values: js.Array[js.Date | Double | String]
}
object Values {
  
  inline def apply(operator: String, values: js.Array[js.Date | Double | String]): Values = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
