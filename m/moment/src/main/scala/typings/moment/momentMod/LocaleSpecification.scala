package typings.moment.momentMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleSpecification
  extends // Allow anything: in general any property that is passed as locale spec is
// put in the locale object so it can be used by locale functions
/* x */ StringDictionary[js.Any] {
  
  var calendar: js.UndefOr[CalendarSpec] = js.native
  
  var invalidDate: js.UndefOr[String] = js.native
  
  var isPM: js.UndefOr[js.Function1[/* input */ String, Boolean]] = js.native
  
  var longDateFormat: js.UndefOr[LongDateFormatSpec] = js.native
  
  var meridiem: js.UndefOr[
    js.Function3[/* hour */ Double, /* minute */ Double, /* isLower */ Boolean, String]
  ] = js.native
  
  var meridiemParse: js.UndefOr[RegExp] = js.native
  
  var months: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.native
  
  var monthsShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.native
  
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
  
  var ordinalParse: js.UndefOr[RegExp] = js.native
  
  var relativeTime: js.UndefOr[RelativeTimeSpec] = js.native
  
  var week: js.UndefOr[WeekSpec] = js.native
  
  var weekdays: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.native
  
  var weekdaysMin: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.native
  
  var weekdaysShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.native
}
object LocaleSpecification {
  
  @scala.inline
  def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  
  @scala.inline
  implicit class LocaleSpecificationOps[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
    
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
    def setCalendar(value: CalendarSpec): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setInvalidDate(value: String): Self = this.set("invalidDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidDate: Self = this.set("invalidDate", js.undefined)
    
    @scala.inline
    def setIsPM(value: /* input */ String => Boolean): Self = this.set("isPM", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsPM: Self = this.set("isPM", js.undefined)
    
    @scala.inline
    def setLongDateFormat(value: LongDateFormatSpec): Self = this.set("longDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongDateFormat: Self = this.set("longDateFormat", js.undefined)
    
    @scala.inline
    def setMeridiem(value: (/* hour */ Double, /* minute */ Double, /* isLower */ Boolean) => String): Self = this.set("meridiem", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMeridiem: Self = this.set("meridiem", js.undefined)
    
    @scala.inline
    def setMeridiemParse(value: RegExp): Self = this.set("meridiemParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemParse: Self = this.set("meridiemParse", js.undefined)
    
    @scala.inline
    def setMonthsFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = this.set("months", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setMonthsShortFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = this.set("monthsShort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthsShort(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsShort: Self = this.set("monthsShort", js.undefined)
    
    @scala.inline
    def setOrdinal(value: /* n */ Double => String): Self = this.set("ordinal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setOrdinalParse(value: RegExp): Self = this.set("ordinalParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinalParse: Self = this.set("ordinalParse", js.undefined)
    
    @scala.inline
    def setRelativeTime(value: RelativeTimeSpec): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeTime: Self = this.set("relativeTime", js.undefined)
    
    @scala.inline
    def setWeek(value: WeekSpec): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    
    @scala.inline
    def setWeekdaysFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = this.set("weekdays", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    
    @scala.inline
    def setWeekdays(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    
    @scala.inline
    def setWeekdaysMinVarargs(value: String*): Self = this.set("weekdaysMin", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysMinFunction1(value: /* momentToFormat */ Moment => String): Self = this.set("weekdaysMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeekdaysMin(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = this.set("weekdaysMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysMin: Self = this.set("weekdaysMin", js.undefined)
    
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysShortFunction1(value: /* momentToFormat */ Moment => String): Self = this.set("weekdaysShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeekdaysShort(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysShort: Self = this.set("weekdaysShort", js.undefined)
  }
}
