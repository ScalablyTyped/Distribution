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
  
  var values: js.Array[js.Any]
}
object ParameterRuleEnum {
  
  inline def apply(`type`: `enum` | enumQuestionmark, values: js.Array[js.Any]): ParameterRuleEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleEnum]
  }
  
  extension [Self <: ParameterRuleEnum](x: Self) {
    
    inline def setType(value: `enum` | enumQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
