package typings
package pikadayLib.pikadayMod.PikadayNs

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
    val __obj = js.Dynamic.literal(months = months, nextMonth = nextMonth, previousMonth = previousMonth, weekdays = weekdays, weekdaysShort = weekdaysShort)
  
    __obj.asInstanceOf[PikadayI18nConfig]
  }
}

