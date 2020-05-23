package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnakeCaseMappersOptions extends js.Object {
  var underscoreBeforeDigits: js.UndefOr[Boolean] = js.undefined
  var underscoreBetweenUppercaseLetters: js.UndefOr[Boolean] = js.undefined
  var upperCase: js.UndefOr[Boolean] = js.undefined
}

object SnakeCaseMappersOptions {
  @scala.inline
  def apply(
    underscoreBeforeDigits: js.UndefOr[Boolean] = js.undefined,
    underscoreBetweenUppercaseLetters: js.UndefOr[Boolean] = js.undefined,
    upperCase: js.UndefOr[Boolean] = js.undefined
  ): SnakeCaseMappersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(underscoreBeforeDigits)) __obj.updateDynamic("underscoreBeforeDigits")(underscoreBeforeDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underscoreBetweenUppercaseLetters)) __obj.updateDynamic("underscoreBetweenUppercaseLetters")(underscoreBetweenUppercaseLetters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upperCase)) __obj.updateDynamic("upperCase")(upperCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnakeCaseMappersOptions]
  }
}

