package typings.ow.predicateMod

import typings.ow.basePredicateMod.BasePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/predicate", "Predicate")
@js.native
class Predicate[T] protected () extends BasePredicate[T] {
  def this(`type`: String) = this()
  def this(`type`: String, options: PredicateOptions) = this()
  
  /**
    Register a new validator.
    @param validator - Validator to register.
    */
  /* protected */ def addValidator(validator: Validator[T]): this.type = js.native
  
  val context: js.Any = js.native
  
  /**
    @hidden
    */
  var get: js.Any = js.native
  
  /**
    Test if the value matches a custom validation function. The validation function should return `true` if the value passes the function. If the function either returns `false` or a string, the function fails and the string will be used as error message.
    @param validator - Validation function.
    */
  def is(validator: js.Function1[/* value */ T, Boolean | String]): this.type = js.native
  
  /**
    Invert the following validators.
    */
  def not: this.type = js.native
  
  val options: js.Any = js.native
  
  val `type`: js.Any = js.native
  
  /**
    Test if the value matches a custom validation function. The validation function should return an object containing a `validator` and `message`. If the `validator` is `false`, the validation fails and the `message` will be used as error message. If the `message` is a function, the function is invoked with the `label` as argument to let you further customize the error message.
    @param customValidator - Custom validation function.
    */
  def validate(customValidator: CustomValidator[T]): this.type = js.native
}
