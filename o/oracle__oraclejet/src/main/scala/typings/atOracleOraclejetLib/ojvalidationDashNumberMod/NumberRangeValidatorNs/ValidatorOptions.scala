package typings
package atOracleOraclejetLib.ojvalidationDashNumberMod.NumberRangeValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: js.UndefOr[atOracleOraclejetLib.ojvalidationDashNumberMod.NumberConverter] = js.undefined
  var hint: js.UndefOr[atOracleOraclejetLib.Anon_ExactInRange] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var messageDetail: js.UndefOr[atOracleOraclejetLib.Anon_ExactRangeOverflowRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[atOracleOraclejetLib.Anon_RangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: atOracleOraclejetLib.ojvalidationDashNumberMod.NumberConverter = null,
    hint: atOracleOraclejetLib.Anon_ExactInRange = null,
    max: scala.Int | scala.Double = null,
    messageDetail: atOracleOraclejetLib.Anon_ExactRangeOverflowRangeUnderflow = null,
    messageSummary: atOracleOraclejetLib.Anon_RangeOverflowRangeUnderflow = null,
    min: scala.Int | scala.Double = null
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

