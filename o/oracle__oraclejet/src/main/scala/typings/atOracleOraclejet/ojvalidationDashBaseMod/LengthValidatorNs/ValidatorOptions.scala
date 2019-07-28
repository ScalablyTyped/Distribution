package typings.atOracleOraclejet.ojvalidationDashBaseMod.LengthValidatorNs

import typings.atOracleOraclejet.Anon_ExactInRange
import typings.atOracleOraclejet.Anon_TooLong
import typings.atOracleOraclejet.atOracleOraclejetStrings.codePoint
import typings.atOracleOraclejet.atOracleOraclejetStrings.codeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var countBy: js.UndefOr[codeUnit | codePoint] = js.undefined
  var hint: js.UndefOr[Anon_ExactInRange] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messageDetail: js.UndefOr[Anon_TooLong] = js.undefined
  var messageSummary: js.UndefOr[Anon_TooLong] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    countBy: codeUnit | codePoint = null,
    hint: Anon_ExactInRange = null,
    max: Int | Double = null,
    messageDetail: Anon_TooLong = null,
    messageSummary: Anon_TooLong = null,
    min: Int | Double = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (countBy != null) __obj.updateDynamic("countBy")(countBy.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

