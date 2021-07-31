package typings.parameter.mod

import typings.parameter.parameterStrings.email
import typings.parameter.parameterStrings.emailQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleEmail
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleEmail: email | emailQuestionmark
}
object ParameterRuleEmail {
  
  @scala.inline
  def apply(`type`: email | emailQuestionmark): ParameterRuleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleEmail]
  }
  
  @scala.inline
  implicit class ParameterRuleEmailMutableBuilder[Self <: ParameterRuleEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setType(value: email | emailQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
