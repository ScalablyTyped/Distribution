package typings.momentMini.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
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
  implicit class LocaleSpecificationMutableBuilder[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: CalendarSpec): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setInvalidDate(value: String): Self = StObject.set(x, "invalidDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidDateUndefined: Self = StObject.set(x, "invalidDate", js.undefined)
    
    @scala.inline
    def setIsPM(value: /* input */ String => Boolean): Self = StObject.set(x, "isPM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPMUndefined: Self = StObject.set(x, "isPM", js.undefined)
    
    @scala.inline
    def setLongDateFormat(value: LongDateFormatSpec): Self = StObject.set(x, "longDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateFormatUndefined: Self = StObject.set(x, "longDateFormat", js.undefined)
    
    @scala.inline
    def setMeridiem(value: (/* hour */ Double, /* minute */ Double, /* isLower */ Boolean) => String): Self = StObject.set(x, "meridiem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMeridiemParse(value: RegExp): Self = StObject.set(x, "meridiemParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiemParseUndefined: Self = StObject.set(x, "meridiemParse", js.undefined)
    
    @scala.inline
    def setMeridiemUndefined: Self = StObject.set(x, "meridiem", js.undefined)
    
    @scala.inline
    def setMonths(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "months", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonthsShort(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsShortFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "monthsShort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
    
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
    
    @scala.inline
    def setOrdinal(value: /* n */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrdinalParse(value: RegExp): Self = StObject.set(x, "ordinalParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinalParseUndefined: Self = StObject.set(x, "ordinalParse", js.undefined)
    
    @scala.inline
    def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    @scala.inline
    def setRelativeTime(value: RelativeTimeSpec): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTimeUndefined: Self = StObject.set(x, "relativeTime", js.undefined)
    
    @scala.inline
    def setWeek(value: WeekSpec): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    @scala.inline
    def setWeekdays(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdaysFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "weekdays", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWeekdaysMin(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdaysMinFunction1(value: /* momentToFormat */ Moment => String): Self = StObject.set(x, "weekdaysMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeekdaysMinUndefined: Self = StObject.set(x, "weekdaysMin", js.undefined)
    
    @scala.inline
    def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysShort(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdaysShortFunction1(value: /* momentToFormat */ Moment => String): Self = StObject.set(x, "weekdaysShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
    
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
  }
}
