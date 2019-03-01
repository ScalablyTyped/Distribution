package typings
package pikadayDashTimeLib.pikadayDashTimeMod.PikadayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PikadayI18nConfig extends js.Object {
  var months: js.Array[java.lang.String]
  var nextMonth: java.lang.String
  var previousMonth: java.lang.String
  var weekdays: js.Array[java.lang.String]
  var weekdaysShort: js.Array[java.lang.String]
}

object PikadayI18nConfig {
  @scala.inline
  def apply(
    months: js.Array[java.lang.String],
    nextMonth: java.lang.String,
    previousMonth: java.lang.String,
    weekdays: js.Array[java.lang.String],
    weekdaysShort: js.Array[java.lang.String]
  ): PikadayI18nConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("nextMonth")(nextMonth)
    __obj.updateDynamic("previousMonth")(previousMonth)
    __obj.updateDynamic("weekdays")(weekdays)
    __obj.updateDynamic("weekdaysShort")(weekdaysShort)
    __obj.asInstanceOf[PikadayI18nConfig]
  }
}

