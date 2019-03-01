package typings
package atOracleOraclejetLib.ojvalidationDashDatetimeMod.DateTimeRangeValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: atOracleOraclejetLib.ojvalidationDashDatetimeMod.DateTimeConverter
  var hint: js.UndefOr[atOracleOraclejetLib.Anon_InRangeMax] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var messageDetail: js.UndefOr[atOracleOraclejetLib.Anon_RangeOverflowRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[atOracleOraclejetLib.Anon_RangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
  var translationKey: js.UndefOr[java.lang.String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: atOracleOraclejetLib.ojvalidationDashDatetimeMod.DateTimeConverter,
    hint: atOracleOraclejetLib.Anon_InRangeMax = null,
    max: java.lang.String = null,
    messageDetail: atOracleOraclejetLib.Anon_RangeOverflowRangeUnderflow = null,
    messageSummary: atOracleOraclejetLib.Anon_RangeOverflowRangeUnderflow = null,
    min: java.lang.String = null,
    translationKey: java.lang.String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("converter")(converter)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (max != null) __obj.updateDynamic("max")(max)
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    if (min != null) __obj.updateDynamic("min")(min)
    if (translationKey != null) __obj.updateDynamic("translationKey")(translationKey)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

