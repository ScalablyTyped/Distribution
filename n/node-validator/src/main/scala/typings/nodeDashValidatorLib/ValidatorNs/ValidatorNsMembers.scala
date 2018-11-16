package typings
package nodeDashValidatorLib.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Validator")
@js.native
object ValidatorNsMembers extends js.Object {
  def bodyValidator(validator: Validatable): js.Any = js.native
  def express(validator: Validatable): js.Any = js.native
  def expressParams(validator: Validatable): js.Any = js.native
  def expressQuery(validator: Validatable): js.Any = js.native
  def isAnyObject(): IsObjectValidator = js.native
  def isArray(): Validatable = js.native
  def isArray(validator: Validatable): Validatable = js.native
  def isArray(validator: Validatable, options: nodeDashValidatorLib.ValidatorOptionsNs.Options): Validatable = js.native
  def isBoolean(): Validatable = js.native
  def isDate(): Validatable = js.native
  def isDate(options: nodeDashValidatorLib.ValidatorOptionsNs.IsDateOptions): Validatable = js.native
  def isInteger(): Validatable = js.native
  def isInteger(options: nodeDashValidatorLib.ValidatorOptionsNs.IsNumberOptions): Validatable = js.native
  def isIsoDate(): Validatable = js.native
  def isIsoDate(options: nodeDashValidatorLib.ValidatorOptionsNs.IsDateOptions): Validatable = js.native
  def isIsoDateTime(): Validatable = js.native
  def isIsoDateTime(options: nodeDashValidatorLib.ValidatorOptionsNs.IsDateOptions): Validatable = js.native
  def isNumber(): Validatable = js.native
  def isNumber(options: nodeDashValidatorLib.ValidatorOptionsNs.IsNumberOptions): Validatable = js.native
  def isObject(): IsObjectValidator = js.native
  def isString(): Validatable = js.native
  def isString(options: nodeDashValidatorLib.ValidatorOptionsNs.IsStringOptions): Validatable = js.native
  def isStringOrNull(): Validatable = js.native
  def isStringOrNull(options: nodeDashValidatorLib.ValidatorOptionsNs.IsStringOptions): Validatable = js.native
  def paramsValidator(validator: Validatable): js.Any = js.native
  def queryValidator(validator: Validatable): js.Any = js.native
  def run(
    validator: Validatable,
    value: js.Any,
    callback: js.Function2[/* errorCount */ stdLib.Number, /* errors */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
}

