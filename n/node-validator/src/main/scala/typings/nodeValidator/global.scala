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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Validator {
    
    @JSGlobal("Validator.bodyValidator")
    @js.native
    def bodyValidator(validator: Validatable): js.Any = js.native
    
    @JSGlobal("Validator.express")
    @js.native
    def express(validator: Validatable): js.Any = js.native
    
    @JSGlobal("Validator.expressParams")
    @js.native
    def expressParams(validator: Validatable): js.Any = js.native
    
    @JSGlobal("Validator.expressQuery")
    @js.native
    def expressQuery(validator: Validatable): js.Any = js.native
    
    @JSGlobal("Validator.isAnyObject")
    @js.native
    def isAnyObject(): IsObjectValidator = js.native
    
    @JSGlobal("Validator.isArray")
    @js.native
    def isArray(): Validatable = js.native
    @JSGlobal("Validator.isArray")
    @js.native
    def isArray(validator: js.UndefOr[scala.Nothing], options: Options): Validatable = js.native
    @JSGlobal("Validator.isArray")
    @js.native
    def isArray(validator: Validatable): Validatable = js.native
    @JSGlobal("Validator.isArray")
    @js.native
    def isArray(validator: Validatable, options: Options): Validatable = js.native
    
    @JSGlobal("Validator.isBoolean")
    @js.native
    def isBoolean(): Validatable = js.native
    
    @JSGlobal("Validator.isDate")
    @js.native
    def isDate(): Validatable = js.native
    @JSGlobal("Validator.isDate")
    @js.native
    def isDate(options: IsDateOptions): Validatable = js.native
    
    @JSGlobal("Validator.isInteger")
    @js.native
    def isInteger(): Validatable = js.native
    @JSGlobal("Validator.isInteger")
    @js.native
    def isInteger(options: IsNumberOptions): Validatable = js.native
    
    @JSGlobal("Validator.isIsoDate")
    @js.native
    def isIsoDate(): Validatable = js.native
    @JSGlobal("Validator.isIsoDate")
    @js.native
    def isIsoDate(options: IsDateOptions): Validatable = js.native
    
    @JSGlobal("Validator.isIsoDateTime")
    @js.native
    def isIsoDateTime(): Validatable = js.native
    @JSGlobal("Validator.isIsoDateTime")
    @js.native
    def isIsoDateTime(options: IsDateOptions): Validatable = js.native
    
    @JSGlobal("Validator.isNumber")
    @js.native
    def isNumber(): Validatable = js.native
    @JSGlobal("Validator.isNumber")
    @js.native
    def isNumber(options: IsNumberOptions): Validatable = js.native
    
    @JSGlobal("Validator.isObject")
    @js.native
    def isObject(): IsObjectValidator = js.native
    
    @JSGlobal("Validator.isString")
    @js.native
    def isString(): Validatable = js.native
    @JSGlobal("Validator.isString")
    @js.native
    def isString(options: IsStringOptions): Validatable = js.native
    
    @JSGlobal("Validator.isStringOrNull")
    @js.native
    def isStringOrNull(): Validatable = js.native
    @JSGlobal("Validator.isStringOrNull")
    @js.native
    def isStringOrNull(options: IsStringOptions): Validatable = js.native
    
    @JSGlobal("Validator.paramsValidator")
    @js.native
    def paramsValidator(validator: Validatable): js.Any = js.native
    
    @JSGlobal("Validator.queryValidator")
    @js.native
    def queryValidator(validator: Validatable): js.Any = js.native
    
    @JSGlobal("Validator.run")
    @js.native
    def run(
      validator: Validatable,
      value: js.Any,
      callback: js.Function2[/* errorCount */ Number, /* errors */ js.Array[_], Unit]
    ): Unit = js.native
  }
}
