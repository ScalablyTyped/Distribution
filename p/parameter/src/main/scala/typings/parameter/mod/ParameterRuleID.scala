package typings.parameter.mod

import typings.parameter.parameterStrings.id
import typings.parameter.parameterStrings.idQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleID
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleID: id | idQuestionmark
}
object ParameterRuleID {
  
  inline def apply(`type`: id | idQuestionmark): ParameterRuleID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleID]
  }
  
  extension [Self <: ParameterRuleID](x: Self) {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setType(value: id | idQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
