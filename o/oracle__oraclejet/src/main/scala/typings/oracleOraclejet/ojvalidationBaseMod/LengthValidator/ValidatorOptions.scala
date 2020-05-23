package typings.oracleOraclejet.ojvalidationBaseMod.LengthValidator

import typings.oracleOraclejet.anon.Max
import typings.oracleOraclejet.anon.TooLong
import typings.oracleOraclejet.oracleOraclejetStrings.codePoint
import typings.oracleOraclejet.oracleOraclejetStrings.codeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var countBy: js.UndefOr[codeUnit | codePoint] = js.undefined
  var hint: js.UndefOr[Max] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messageDetail: js.UndefOr[TooLong] = js.undefined
  var messageSummary: js.UndefOr[TooLong] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    countBy: codeUnit | codePoint = null,
    hint: Max = null,
    max: js.UndefOr[Double] = js.undefined,
    messageDetail: TooLong = null,
    messageSummary: TooLong = null,
    min: js.UndefOr[Double] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (countBy != null) __obj.updateDynamic("countBy")(countBy.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

