package typings
package nodeDashValidatorLib.nodeDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-validator", JSImport.Namespace)
@js.native
object nodeDashValidatorModMembers extends js.Object {
  def bodyValidator(validator: nodeDashValidatorLib.ValidatorNs.Validatable): js.Any = js.native
  def express(validator: nodeDashValidatorLib.ValidatorNs.Validatable): js.Any = js.native
  def expressParams(validator: nodeDashValidatorLib.ValidatorNs.Validatable): js.Any = js.native
  def expressQuery(validator: nodeDashValidatorLib.ValidatorNs.Validatable): js.Any = js.native
  def isAnyObject(): nodeDashValidatorLib.ValidatorNs.IsObjectValidator = js.native
  def isArray(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isArray(validator: nodeDashValidatorLib.ValidatorNs.Validatable): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isArray(
    validator: nodeDashValidatorLib.ValidatorNs.Validatable,
    options: nodeDashValidatorLib.ValidatorOptionsNs.Options
  ): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isBoolean(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isDate(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isDate(options: nodeDashValidatorLib.ValidatorOptionsNs.IsDateOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isInteger(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isInteger(options: nodeDashValidatorLib.ValidatorOptionsNs.IsNumberOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isIsoDate(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isIsoDate(options: nodeDashValidatorLib.ValidatorOptionsNs.IsDateOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isIsoDateTime(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isIsoDateTime(options: nodeDashValidatorLib.ValidatorOptionsNs.IsDateOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isNumber(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isNumber(options: nodeDashValidatorLib.ValidatorOptionsNs.IsNumberOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isObject(): nodeDashValidatorLib.ValidatorNs.IsObjectValidator = js.native
  def isString(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isString(options: nodeDashValidatorLib.ValidatorOptionsNs.IsStringOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isStringOrNull(): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def isStringOrNull(options: nodeDashValidatorLib.ValidatorOptionsNs.IsStringOptions): nodeDashValidatorLib.ValidatorNs.Validatable = js.native
  def paramsValidator(validator: nodeDashValidatorLib.ValidatorNs.Validatable): js.Any = js.native
  def queryValidator(validator: nodeDashValidatorLib.ValidatorNs.Validatable): js.Any = js.native
  def run(
    validator: nodeDashValidatorLib.ValidatorNs.Validatable,
    value: js.Any,
    callback: js.Function2[/* errorCount */ stdLib.Number, /* errors */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
}

