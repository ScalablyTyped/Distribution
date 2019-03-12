package typings
package atOracleOraclejetLib.ojvalidationDashDatetimeMod.DateRestrictionValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var dayFormatter: js.UndefOr[
    js.Function1[
      /* param0 */ DayFormatterInput, 
      DayFormatterOutput | scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ]
  ] = js.undefined
  var messageDetail: js.UndefOr[java.lang.String] = js.undefined
  var messageSummary: js.UndefOr[java.lang.String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    dayFormatter: /* param0 */ DayFormatterInput => DayFormatterOutput | scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = null,
    messageDetail: java.lang.String = null,
    messageSummary: java.lang.String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (dayFormatter != null) __obj.updateDynamic("dayFormatter")(js.Any.fromFunction1(dayFormatter))
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

