package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateField extends js.Object {
  var dateField: js.UndefOr[String] = js.undefined
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  var formatUsing: js.UndefOr[String] = js.undefined
  var relativeTime: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object AnonDateField {
  @scala.inline
  def apply(
    dateField: String = null,
    dateOnly: js.UndefOr[Boolean] = js.undefined,
    formatUsing: String = null,
    relativeTime: String = null,
    timeZone: String = null
  ): AnonDateField = {
    val __obj = js.Dynamic.literal()
    if (dateField != null) __obj.updateDynamic("dateField")(dateField.asInstanceOf[js.Any])
    if (!js.isUndefined(dateOnly)) __obj.updateDynamic("dateOnly")(dateOnly.asInstanceOf[js.Any])
    if (formatUsing != null) __obj.updateDynamic("formatUsing")(formatUsing.asInstanceOf[js.Any])
    if (relativeTime != null) __obj.updateDynamic("relativeTime")(relativeTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateField]
  }
}

