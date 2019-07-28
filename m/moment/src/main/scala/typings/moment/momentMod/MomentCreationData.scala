package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentCreationData extends js.Object {
  var format: js.UndefOr[MomentFormatSpecification] = js.undefined
  var input: MomentInput
  var isUTC: Boolean
  var locale: Locale
  var strict: js.UndefOr[Boolean] = js.undefined
}

object MomentCreationData {
  @scala.inline
  def apply(
    input: MomentInput,
    isUTC: Boolean,
    locale: Locale,
    format: MomentFormatSpecification = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): MomentCreationData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], isUTC = isUTC, locale = locale)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[MomentCreationData]
  }
}

