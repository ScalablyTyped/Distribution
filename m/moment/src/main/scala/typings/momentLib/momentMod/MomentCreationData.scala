package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentCreationData extends js.Object {
  var format: js.UndefOr[MomentFormatSpecification] = js.undefined
  var input: MomentInput
  var isUTC: scala.Boolean
  var locale: Locale
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object MomentCreationData {
  @scala.inline
  def apply(
    input: MomentInput,
    isUTC: scala.Boolean,
    locale: Locale,
    format: MomentFormatSpecification = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): MomentCreationData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], isUTC = isUTC, locale = locale)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[MomentCreationData]
  }
}

