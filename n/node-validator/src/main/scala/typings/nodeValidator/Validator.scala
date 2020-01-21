package typings.nodeValidator

import typings.nodeValidator.ValidatorOptions.IsDateOptions
import typings.nodeValidator.ValidatorOptions.IsNumberOptions
import typings.nodeValidator.ValidatorOptions.IsStringOptions
import typings.nodeValidator.ValidatorOptions.Options
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Validator")
@js.native
object Validator extends js.Object {
  @js.native
  trait IsObjectValidator extends Validatable {
    def withCustom(customValidator: ValidateFn): IsObjectValidator = js.native
    def withOptional(name: String, validator: Validatable): IsObjectValidator = js.native
    def withRequired(name: String, validator: Validatable): IsObjectValidator = js.native
  }
  
  @js.native
  trait Validatable extends js.Object {
    @JSName("validate")
    var validate_Original: ValidateFn = js.native
    def validate(
      value: js.Any,
      onError: js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]
    ): Unit = js.native
  }
  
  def bodyValidator(validator: Validatable): js.Any = js.native
  def express(validator: Validatable): js.Any = js.native
  def expressParams(validator: Validatable): js.Any = js.native
  def expressQuery(validator: Validatable): js.Any = js.native
  def isAnyObject(): IsObjectValidator = js.native
  def isArray(): Validatable = js.native
  def isArray(validator: Validatable): Validatable = js.native
  def isArray(validator: Validatable, options: Options): Validatable = js.native
  def isBoolean(): Validatable = js.native
  def isDate(): Validatable = js.native
  def isDate(options: IsDateOptions): Validatable = js.native
  def isInteger(): Validatable = js.native
  def isInteger(options: IsNumberOptions): Validatable = js.native
  def isIsoDate(): Validatable = js.native
  def isIsoDate(options: IsDateOptions): Validatable = js.native
  def isIsoDateTime(): Validatable = js.native
  def isIsoDateTime(options: IsDateOptions): Validatable = js.native
  def isNumber(): Validatable = js.native
  def isNumber(options: IsNumberOptions): Validatable = js.native
  def isObject(): IsObjectValidator = js.native
  def isString(): Validatable = js.native
  def isString(options: IsStringOptions): Validatable = js.native
  def isStringOrNull(): Validatable = js.native
  def isStringOrNull(options: IsStringOptions): Validatable = js.native
  def paramsValidator(validator: Validatable): js.Any = js.native
  def queryValidator(validator: Validatable): js.Any = js.native
  def run(
    validator: Validatable,
    value: js.Any,
    callback: js.Function2[/* errorCount */ Number, /* errors */ js.Array[_], Unit]
  ): Unit = js.native
  type ValidateFn = js.Function2[
    /* value */ js.Any, 
    /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit], 
    Unit
  ]
}

