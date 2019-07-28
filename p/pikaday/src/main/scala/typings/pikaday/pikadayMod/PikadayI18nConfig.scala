package typings.pikaday.pikadayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PikadayI18nConfig extends js.Object {
  var months: js.Array[String]
  var nextMonth: String
  var previousMonth: String
  var weekdays: js.Array[String]
  var weekdaysShort: js.Array[String]
}

object PikadayI18nConfig {
  @scala.inline
  def apply(
    months: js.Array[String],
    nextMonth: String,
    previousMonth: String,
    weekdays: js.Array[String],
    weekdaysShort: js.Array[String]
  ): PikadayI18nConfig = {
    val __obj = js.Dynamic.literal(months = months, nextMonth = nextMonth, previousMonth = previousMonth, weekdays = weekdays, weekdaysShort = weekdaysShort)
  
    __obj.asInstanceOf[PikadayI18nConfig]
  }
}

