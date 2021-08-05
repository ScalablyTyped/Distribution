package typings.parameter.mod

import typings.parameter.parameterStrings.`object`
import typings.parameter.parameterStrings.objectQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleObject
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var rule: js.UndefOr[ParameterRules] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleObject: `object` | objectQuestionmark
}
object ParameterRuleObject {
  
  inline def apply(`type`: `object` | objectQuestionmark): ParameterRuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleObject]
  }
  
  extension [Self <: ParameterRuleObject](x: Self) {
    
    inline def setRule(value: ParameterRules): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setType(value: `object` | objectQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
