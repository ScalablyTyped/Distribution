package typings.parameter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends js.Object {
  
  /**
    * Add custom rules
    */
  var addRule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parameter.addRule */ js.Any = js.native
  
  /**
    * Translate function
    */
  def t(message: String, args: js.Any*): String = js.native
  /**
    * Translate function
    */
  @JSName("t")
  var t_Original: ParameterTranslateFunction = js.native
  
  /**
    * Validate the value conforms to rule. return an array of errors if break rule.
    * @param rule
    * @param value
    */
  def validate(rule: ParameterRules, value: js.Any): js.Array[ValidateError] | Unit = js.native
}
