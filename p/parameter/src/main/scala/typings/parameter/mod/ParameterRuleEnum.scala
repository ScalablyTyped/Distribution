package typings.parameter.mod

import typings.parameter.parameterStrings.`enum`
import typings.parameter.parameterStrings.enumQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleEnum
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  @JSName("type")
  var type_ParameterRuleEnum: `enum` | enumQuestionmark
  
  var values: js.Array[Any]
}
object ParameterRuleEnum {
  
  inline def apply(`type`: `enum` | enumQuestionmark, values: js.Array[Any]): ParameterRuleEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterRuleEnum] (val x: Self) extends AnyVal {
    
    inline def setType(value: `enum` | enumQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
