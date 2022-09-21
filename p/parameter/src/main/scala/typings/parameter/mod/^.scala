package typings.parameter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parameter", JSImport.Namespace)
@js.native
open class ^ ()
  extends StObject
     with Parameter {
  def this(options: ParameterOptions) = this()
  
  /**
    * Add custom rules
    */
  /* CompleteClass */
  var addRule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parameter.addRule */ Any = js.native
  
  /**
    * Translate function
    */
  /* CompleteClass */
  override def t(message: String, args: Any*): String = js.native
  /**
    * Translate function
    */
  /* CompleteClass */
  @JSName("t")
  var t_Original: ParameterTranslateFunction = js.native
  
  /**
    * Validate the value conforms to rule. return an array of errors if break rule.
    * @param rule
    * @param value
    */
  /* CompleteClass */
  override def validate(rule: ParameterRules[Any], value: Any): js.Array[ValidateError] | Unit = js.native
}
@JSImport("parameter", JSImport.Namespace)
@js.native
object ^ extends StObject
