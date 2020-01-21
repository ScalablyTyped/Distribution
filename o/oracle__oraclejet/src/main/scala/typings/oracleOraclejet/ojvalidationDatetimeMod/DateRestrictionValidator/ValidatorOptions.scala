package typings.oracleOraclejet.ojvalidationDatetimeMod.DateRestrictionValidator

import typings.oracleOraclejet.oracleOraclejetStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var dayFormatter: js.UndefOr[js.Function1[/* param0 */ DayFormatterInput, DayFormatterOutput | Null | all]] = js.undefined
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageSummary: js.UndefOr[String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    dayFormatter: /* param0 */ DayFormatterInput => DayFormatterOutput | Null | all = null,
    messageDetail: String = null,
    messageSummary: String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (dayFormatter != null) __obj.updateDynamic("dayFormatter")(js.Any.fromFunction1(dayFormatter))
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

