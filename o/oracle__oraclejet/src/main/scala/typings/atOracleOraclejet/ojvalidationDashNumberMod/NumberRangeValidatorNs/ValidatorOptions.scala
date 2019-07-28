package typings.atOracleOraclejet.ojvalidationDashNumberMod.NumberRangeValidatorNs

import typings.atOracleOraclejet.Anon_ExactInRange
import typings.atOracleOraclejet.Anon_ExactRangeOverflowRangeUnderflow
import typings.atOracleOraclejet.Anon_RangeOverflowRangeUnderflow
import typings.atOracleOraclejet.ojvalidationDashNumberMod.NumberConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: js.UndefOr[NumberConverter] = js.undefined
  var hint: js.UndefOr[Anon_ExactInRange] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messageDetail: js.UndefOr[Anon_ExactRangeOverflowRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[Anon_RangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: NumberConverter = null,
    hint: Anon_ExactInRange = null,
    max: Int | Double = null,
    messageDetail: Anon_ExactRangeOverflowRangeUnderflow = null,
    messageSummary: Anon_RangeOverflowRangeUnderflow = null,
    min: Int | Double = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

