package typings.parameter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * Add custom rules
    */
  var addRule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parameter.addRule */ js.Any
  
  /**
    * Translate function
    */
  def t(message: String, args: js.Any*): String
  /**
    * Translate function
    */
  @JSName("t")
  var t_Original: ParameterTranslateFunction
  
  /**
    * Validate the value conforms to rule. return an array of errors if break rule.
    * @param rule
    * @param value
    */
  def validate(rule: ParameterRules, value: js.Any): js.Array[ValidateError] | Unit
}
object Parameter {
  
  inline def apply(
    addRule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parameter.addRule */ js.Any,
    t: ParameterTranslateFunction,
    validate: (ParameterRules, js.Any) => js.Array[ValidateError] | Unit
  ): Parameter = {
    val __obj = js.Dynamic.literal(addRule = addRule.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setAddRule(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parameter.addRule */ js.Any
    ): Self = StObject.set(x, "addRule", value.asInstanceOf[js.Any])
    
    inline def setT(value: ParameterTranslateFunction): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: (ParameterRules, js.Any) => js.Array[ValidateError] | Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
