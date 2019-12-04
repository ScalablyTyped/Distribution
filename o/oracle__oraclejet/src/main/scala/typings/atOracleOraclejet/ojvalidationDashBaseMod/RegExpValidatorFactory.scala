package typings.atOracleOraclejet.ojvalidationDashBaseMod

import typings.atOracleOraclejet.ojvalidationDashBaseMod.RegExpValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpValidatorFactory extends js.Object {
  def createValidator(options: ValidatorOptions): RegExpValidator
}

object RegExpValidatorFactory {
  @scala.inline
  def apply(createValidator: ValidatorOptions => RegExpValidator): RegExpValidatorFactory = {
    val __obj = js.Dynamic.literal(createValidator = js.Any.fromFunction1(createValidator))
  
    __obj.asInstanceOf[RegExpValidatorFactory]
  }
}

