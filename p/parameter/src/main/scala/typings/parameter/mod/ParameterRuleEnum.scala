package typings.parameter.mod

import typings.parameter.parameterStrings.enum
import typings.parameter.parameterStrings.enumQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleEnum
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  @JSName("type")
  var type_ParameterRuleEnum: enum | enumQuestionmark = js.native
  
  var values: js.Array[_] = js.native
}
object ParameterRuleEnum {
  
  @scala.inline
  def apply(`type`: enum | enumQuestionmark, values: js.Array[_]): ParameterRuleEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleEnum]
  }
  
  @scala.inline
  implicit class ParameterRuleEnumMutableBuilder[Self <: ParameterRuleEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: enum | enumQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
