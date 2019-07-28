package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateField extends js.Object {
  var dateField: js.UndefOr[String] = js.undefined
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  var formatUsing: js.UndefOr[String] = js.undefined
  var relativeTime: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object Anon_DateField {
  @scala.inline
  def apply(
    dateField: String = null,
    dateOnly: js.UndefOr[Boolean] = js.undefined,
    formatUsing: String = null,
    relativeTime: String = null,
    timeZone: String = null
  ): Anon_DateField = {
    val __obj = js.Dynamic.literal()
    if (dateField != null) __obj.updateDynamic("dateField")(dateField)
    if (!js.isUndefined(dateOnly)) __obj.updateDynamic("dateOnly")(dateOnly)
    if (formatUsing != null) __obj.updateDynamic("formatUsing")(formatUsing)
    if (relativeTime != null) __obj.updateDynamic("relativeTime")(relativeTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Anon_DateField]
  }
}

