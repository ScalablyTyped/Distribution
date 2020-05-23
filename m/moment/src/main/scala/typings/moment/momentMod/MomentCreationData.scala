package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentCreationData extends js.Object {
  var format: js.UndefOr[MomentFormatSpecification] = js.undefined
  var input: MomentInput
  var isUTC: Boolean
  var locale: Locale_
  var strict: js.UndefOr[Boolean] = js.undefined
}

object MomentCreationData {
  @scala.inline
  def apply(
    isUTC: Boolean,
    locale: Locale_,
    format: MomentFormatSpecification = null,
    input: js.UndefOr[Null | MomentInput] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): MomentCreationData = {
    val __obj = js.Dynamic.literal(isUTC = isUTC.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentCreationData]
  }
}

