package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpValidatorFactory extends js.Object {
  def createValidator(options: atOracleOraclejetLib.ojvalidationDashBaseMod.RegExpValidatorNs.ValidatorOptions): RegExpValidator
}

object RegExpValidatorFactory {
  @scala.inline
  def apply(
    createValidator: js.Function1[
      atOracleOraclejetLib.ojvalidationDashBaseMod.RegExpValidatorNs.ValidatorOptions, 
      RegExpValidator
    ]
  ): RegExpValidatorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createValidator")(createValidator)
    __obj.asInstanceOf[RegExpValidatorFactory]
  }
}

