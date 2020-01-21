package typings.oracleOraclejet.ojvalidationNumberMod.NumberRangeValidator

import typings.oracleOraclejet.AnonExactInRange
import typings.oracleOraclejet.AnonExactRangeOverflowRangeUnderflow
import typings.oracleOraclejet.AnonRangeOverflowRangeUnderflow
import typings.oracleOraclejet.ojvalidationNumberMod.NumberConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: js.UndefOr[NumberConverter] = js.undefined
  var hint: js.UndefOr[AnonExactInRange] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messageDetail: js.UndefOr[AnonExactRangeOverflowRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[AnonRangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: NumberConverter = null,
    hint: AnonExactInRange = null,
    max: Int | Double = null,
    messageDetail: AnonExactRangeOverflowRangeUnderflow = null,
    messageSummary: AnonRangeOverflowRangeUnderflow = null,
    min: Int | Double = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

