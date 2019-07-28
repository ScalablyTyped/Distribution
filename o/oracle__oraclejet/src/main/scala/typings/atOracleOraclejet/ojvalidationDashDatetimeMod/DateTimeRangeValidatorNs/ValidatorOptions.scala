package typings.atOracleOraclejet.ojvalidationDashDatetimeMod.DateTimeRangeValidatorNs

import typings.atOracleOraclejet.Anon_InRangeMax
import typings.atOracleOraclejet.Anon_RangeOverflowRangeUnderflow
import typings.atOracleOraclejet.ojvalidationDashDatetimeMod.DateTimeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: DateTimeConverter
  var hint: js.UndefOr[Anon_InRangeMax] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var messageDetail: js.UndefOr[Anon_RangeOverflowRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[Anon_RangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var translationKey: js.UndefOr[String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: DateTimeConverter,
    hint: Anon_InRangeMax = null,
    max: String = null,
    messageDetail: Anon_RangeOverflowRangeUnderflow = null,
    messageSummary: Anon_RangeOverflowRangeUnderflow = null,
    min: String = null,
    translationKey: String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal(converter = converter)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (max != null) __obj.updateDynamic("max")(max)
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    if (min != null) __obj.updateDynamic("min")(min)
    if (translationKey != null) __obj.updateDynamic("translationKey")(translationKey)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

