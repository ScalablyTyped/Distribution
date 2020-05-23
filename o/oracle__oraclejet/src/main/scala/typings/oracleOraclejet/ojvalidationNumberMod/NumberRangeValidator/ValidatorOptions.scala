package typings.oracleOraclejet.ojvalidationNumberMod.NumberRangeValidator

import typings.oracleOraclejet.anon.ExactRangeOverflow
import typings.oracleOraclejet.anon.Max
import typings.oracleOraclejet.anon.RangeOverflowRangeUnderflow
import typings.oracleOraclejet.ojvalidationNumberMod.NumberConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: js.UndefOr[NumberConverter] = js.undefined
  var hint: js.UndefOr[Max] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messageDetail: js.UndefOr[ExactRangeOverflow] = js.undefined
  var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: NumberConverter = null,
    hint: Max = null,
    max: js.UndefOr[Double] = js.undefined,
    messageDetail: ExactRangeOverflow = null,
    messageSummary: RangeOverflowRangeUnderflow = null,
    min: js.UndefOr[Double] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

