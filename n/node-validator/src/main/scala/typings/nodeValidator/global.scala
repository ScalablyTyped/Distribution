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

object global {
  
  object Validator {
    
    @JSGlobal("Validator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bodyValidator(validator: Validatable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def express(validator: Validatable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("express")(validator.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def expressParams(validator: Validatable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressParams")(validator.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def expressQuery(validator: Validatable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressQuery")(validator.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isAnyObject(): IsObjectValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyObject")().asInstanceOf[IsObjectValidator]
    
    inline def isArray(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")().asInstanceOf[Validatable]
    inline def isArray(validator: Unit, options: Options): Validatable = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(validator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Validatable]
    inline def isArray(validator: Validatable): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(validator.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    inline def isArray(validator: Validatable, options: Options): Validatable = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(validator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Validatable]
    
    inline def isBoolean(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")().asInstanceOf[Validatable]
    
    inline def isDate(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")().asInstanceOf[Validatable]
    inline def isDate(options: IsDateOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def isInteger(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")().asInstanceOf[Validatable]
    inline def isInteger(options: IsNumberOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def isIsoDate(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDate")().asInstanceOf[Validatable]
    inline def isIsoDate(options: IsDateOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDate")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def isIsoDateTime(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDateTime")().asInstanceOf[Validatable]
    inline def isIsoDateTime(options: IsDateOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isIsoDateTime")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def isNumber(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")().asInstanceOf[Validatable]
    inline def isNumber(options: IsNumberOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def isObject(): IsObjectValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")().asInstanceOf[IsObjectValidator]
    
    inline def isString(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")().asInstanceOf[Validatable]
    inline def isString(options: IsStringOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def isStringOrNull(): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrNull")().asInstanceOf[Validatable]
    inline def isStringOrNull(options: IsStringOptions): Validatable = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrNull")(options.asInstanceOf[js.Any]).asInstanceOf[Validatable]
    
    inline def paramsValidator(validator: Validatable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("paramsValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def queryValidator(validator: Validatable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("queryValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def run(
      validator: Validatable,
      value: Any,
      callback: js.Function2[/* errorCount */ Number, /* errors */ js.Array[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(validator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
