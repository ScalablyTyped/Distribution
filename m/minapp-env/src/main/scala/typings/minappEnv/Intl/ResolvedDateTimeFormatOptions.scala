package typings.minappEnv.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedDateTimeFormatOptions extends js.Object {
  var calendar: String = js.native
  var day: js.UndefOr[String] = js.native
  var era: js.UndefOr[String] = js.native
  var hour: js.UndefOr[String] = js.native
  var hour12: js.UndefOr[Boolean] = js.native
  var locale: String = js.native
  var minute: js.UndefOr[String] = js.native
  var month: js.UndefOr[String] = js.native
  var numberingSystem: String = js.native
  var second: js.UndefOr[String] = js.native
  var timeZone: String = js.native
  var timeZoneName: js.UndefOr[String] = js.native
  var weekday: js.UndefOr[String] = js.native
  var year: js.UndefOr[String] = js.native
}

object ResolvedDateTimeFormatOptions {
  @scala.inline
  def apply(calendar: String, locale: String, numberingSystem: String, timeZone: String): ResolvedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
  }
  @scala.inline
  implicit class ResolvedDateTimeFormatOptionsOps[Self <: ResolvedDateTimeFormatOptions] (val x: Self) extends AnyVal {
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
    def setCalendar(value: String): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setEra(value: String): Self = this.set("era", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEra: Self = this.set("era", js.undefined)
    @scala.inline
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setHour12(value: Boolean): Self = this.set("hour12", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour12: Self = this.set("hour12", js.undefined)
    @scala.inline
    def setMinute(value: String): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setSecond(value: String): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setTimeZoneName(value: String): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZoneName: Self = this.set("timeZoneName", js.undefined)
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

