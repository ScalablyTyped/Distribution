package typings.parameter.mod

import typings.parameter.parameterStrings.url
import typings.parameter.parameterStrings.urlQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleUrl
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleUrl: url | urlQuestionmark
}
object ParameterRuleUrl {
  
  inline def apply(`type`: url | urlQuestionmark): ParameterRuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleUrl]
  }
  
  extension [Self <: ParameterRuleUrl](x: Self) {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: url | urlQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
