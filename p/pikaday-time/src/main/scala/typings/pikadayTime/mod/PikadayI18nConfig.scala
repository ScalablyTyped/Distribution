package typings.pikadayTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PikadayI18nConfig extends js.Object {
  var months: js.Array[String] = js.native
  var nextMonth: String = js.native
  var previousMonth: String = js.native
  var weekdays: js.Array[String] = js.native
  var weekdaysShort: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PikadayI18nConfig]
  }
  @scala.inline
  implicit class PikadayI18nConfigOps[Self <: PikadayI18nConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMonth(value: String): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousMonth(value: String): Self = this.set("previousMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
  }
  
}

