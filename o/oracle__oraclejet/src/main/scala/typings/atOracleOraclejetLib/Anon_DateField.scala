package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateField extends js.Object {
  var dateField: js.UndefOr[java.lang.String] = js.undefined
  var dateOnly: js.UndefOr[scala.Boolean] = js.undefined
  var formatUsing: js.UndefOr[java.lang.String] = js.undefined
  var relativeTime: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DateField {
  @scala.inline
  def apply(
    dateField: java.lang.String = null,
    dateOnly: js.UndefOr[scala.Boolean] = js.undefined,
    formatUsing: java.lang.String = null,
    relativeTime: java.lang.String = null,
    timeZone: java.lang.String = null
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

