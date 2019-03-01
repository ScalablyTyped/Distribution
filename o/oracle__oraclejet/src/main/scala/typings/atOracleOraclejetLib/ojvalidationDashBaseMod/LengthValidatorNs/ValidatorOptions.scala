package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod.LengthValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var countBy: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.codeUnit | atOracleOraclejetLib.atOracleOraclejetLibStrings.codePoint
  ] = js.undefined
  var hint: js.UndefOr[atOracleOraclejetLib.Anon_ExactInRange] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var messageDetail: js.UndefOr[atOracleOraclejetLib.Anon_TooLong] = js.undefined
  var messageSummary: js.UndefOr[atOracleOraclejetLib.Anon_TooLong] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    countBy: atOracleOraclejetLib.atOracleOraclejetLibStrings.codeUnit | atOracleOraclejetLib.atOracleOraclejetLibStrings.codePoint = null,
    hint: atOracleOraclejetLib.Anon_ExactInRange = null,
    max: scala.Int | scala.Double = null,
    messageDetail: atOracleOraclejetLib.Anon_TooLong = null,
    messageSummary: atOracleOraclejetLib.Anon_TooLong = null,
    min: scala.Int | scala.Double = null
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

