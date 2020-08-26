package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpValidatorFactory extends js.Object {
  def createValidator(options: ValidatorOptions): RegExpValidator = js.native
}

object RegExpValidatorFactory {
  @scala.inline
  def apply(createValidator: ValidatorOptions => RegExpValidator): RegExpValidatorFactory = {
    val __obj = js.Dynamic.literal(createValidator = js.Any.fromFunction1(createValidator))
    __obj.asInstanceOf[RegExpValidatorFactory]
  }
  @scala.inline
  implicit class RegExpValidatorFactoryOps[Self <: RegExpValidatorFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateValidator(value: ValidatorOptions => RegExpValidator): Self = this.set("createValidator", js.Any.fromFunction1(value))
  }
  
}

