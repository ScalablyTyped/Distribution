package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateField extends js.Object {
  var dateField: js.UndefOr[String] = js.undefined
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  var formatUsing: js.UndefOr[String] = js.undefined
  var relativeTime: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object DateField {
  @scala.inline
  def apply(
    dateField: String = null,
    dateOnly: js.UndefOr[Boolean] = js.undefined,
    formatUsing: String = null,
    relativeTime: String = null,
    timeZone: String = null
  ): DateField = {
    val __obj = js.Dynamic.literal()
    if (dateField != null) __obj.updateDynamic("dateField")(dateField.asInstanceOf[js.Any])
    if (!js.isUndefined(dateOnly)) __obj.updateDynamic("dateOnly")(dateOnly.get.asInstanceOf[js.Any])
    if (formatUsing != null) __obj.updateDynamic("formatUsing")(formatUsing.asInstanceOf[js.Any])
    if (relativeTime != null) __obj.updateDynamic("relativeTime")(relativeTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateField]
  }
}

