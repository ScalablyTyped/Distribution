package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnakeCaseMappersOptions extends js.Object {
  var underscoreBeforeDigits: js.UndefOr[Boolean] = js.undefined
  var upperCase: js.UndefOr[Boolean] = js.undefined
}

object SnakeCaseMappersOptions {
  @scala.inline
  def apply(
    underscoreBeforeDigits: js.UndefOr[Boolean] = js.undefined,
    upperCase: js.UndefOr[Boolean] = js.undefined
  ): SnakeCaseMappersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(underscoreBeforeDigits)) __obj.updateDynamic("underscoreBeforeDigits")(underscoreBeforeDigits)
    if (!js.isUndefined(upperCase)) __obj.updateDynamic("upperCase")(upperCase)
    __obj.asInstanceOf[SnakeCaseMappersOptions]
  }
}

