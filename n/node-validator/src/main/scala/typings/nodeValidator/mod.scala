package typings.nodeValidator

import typings.nodeValidator.Validator.IsObjectValidator
import typings.nodeValidator.Validator.Validatable
import typings.nodeValidator.ValidatorOptions.IsDateOptions
import typings.nodeValidator.ValidatorOptions.IsNumberOptions
import typings.nodeValidator.ValidatorOptions.IsStringOptions
import typings.nodeValidator.ValidatorOptions.Options
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bodyValidator(validator: Validatable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def express(validator: Validatable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("express")(validator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def expressParams(validator: Validatable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressParams")(validator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def expressQuery(validator: Validatable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressQuery")(validator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isAnyObject(): IsObjectValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyObject")().asInstanceOf[IsObjectValidator]
  
  @scala.inline
  def isArray(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")().asInstanceOf[Validatable]
  @scala.inline
  def isArray(validator: Unit, options: Options): Validatable = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(validator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Validatable]
  @scala.inline
  def isArray(validator: Validatable): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(validator.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  @scala.inline
  def isArray(validator: Validatable, options: Options): Validatable = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(validator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Validatable]
  
  @scala.inline
  def isBoolean(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")().asInstanceOf[Validatable]
  
  @scala.inline
  def isDate(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")().asInstanceOf[Validatable]
  @scala.inline
  def isDate(options: IsDateOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def isInteger(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")().asInstanceOf[Validatable]
  @scala.inline
  def isInteger(options: IsNumberOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def isIsoDate(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDate")().asInstanceOf[Validatable]
  @scala.inline
  def isIsoDate(options: IsDateOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDate")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def isIsoDateTime(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDateTime")().asInstanceOf[Validatable]
  @scala.inline
  def isIsoDateTime(options: IsDateOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDateTime")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def isNumber(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")().asInstanceOf[Validatable]
  @scala.inline
  def isNumber(options: IsNumberOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def isObject(): IsObjectValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")().asInstanceOf[IsObjectValidator]
  
  @scala.inline
  def isString(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")().asInstanceOf[Validatable]
  @scala.inline
  def isString(options: IsStringOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def isStringOrNull(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrNull")().asInstanceOf[Validatable]
  @scala.inline
  def isStringOrNull(options: IsStringOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrNull")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
  
  @scala.inline
  def paramsValidator(validator: Validatable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("paramsValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def queryValidator(validator: Validatable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("queryValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def run(
    validator: Validatable,
    value: js.Any,
    callback: js.Function2[/* errorCount */ Number, /* errors */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(validator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
