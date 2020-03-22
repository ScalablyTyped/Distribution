package typings.oracleOraclejet.ojvalidationBaseMod.LengthValidator

import typings.oracleOraclejet.AnonMax
import typings.oracleOraclejet.AnonTooLong
import typings.oracleOraclejet.oracleOraclejetStrings.codePoint
import typings.oracleOraclejet.oracleOraclejetStrings.codeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var countBy: js.UndefOr[codeUnit | codePoint] = js.undefined
  var hint: js.UndefOr[AnonMax] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messageDetail: js.UndefOr[AnonTooLong] = js.undefined
  var messageSummary: js.UndefOr[AnonTooLong] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    countBy: codeUnit | codePoint = null,
    hint: AnonMax = null,
    max: Int | Double = null,
    messageDetail: AnonTooLong = null,
    messageSummary: AnonTooLong = null,
    min: Int | Double = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (countBy != null) __obj.updateDynamic("countBy")(countBy.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

