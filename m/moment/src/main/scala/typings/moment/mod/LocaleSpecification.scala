package typings.moment.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleSpecification
  extends StObject
     with // Allow anything: in general any property that is passed as locale spec is
// put in the locale object so it can be used by locale functions
/* x */ StringDictionary[js.Any] {
  
  var calendar: js.UndefOr[CalendarSpec] = js.undefined
  
  var eras: js.UndefOr[js.Array[EraSpec]] = js.undefined
  
  var invalidDate: js.UndefOr[String] = js.undefined
  
  var isPM: js.UndefOr[js.Function1[/* input */ String, Boolean]] = js.undefined
  
  var longDateFormat: js.UndefOr[LongDateFormatSpec] = js.undefined
  
  var meridiem: js.UndefOr[
    js.Function3[/* hour */ Double, /* minute */ Double, /* isLower */ Boolean, String]
  ] = js.undefined
  
  var meridiemParse: js.UndefOr[RegExp] = js.undefined
  
  var months: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  
  var monthsShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
  
  var ordinalParse: js.UndefOr[RegExp] = js.undefined
  
  var relativeTime: js.UndefOr[RelativeTimeSpec] = js.undefined
  
  var week: js.UndefOr[WeekSpec] = js.undefined
  
  var weekdays: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  
  var weekdaysMin: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
  
  var weekdaysShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
}
object LocaleSpecification {
  
  inline def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  
  extension [Self <: LocaleSpecification](x: Self) {
    
    inline def setCalendar(value: CalendarSpec): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setEras(value: js.Array[EraSpec]): Self = StObject.set(x, "eras", value.asInstanceOf[js.Any])
    
    inline def setErasUndefined: Self = StObject.set(x, "eras", js.undefined)
    
    inline def setErasVarargs(value: EraSpec*): Self = StObject.set(x, "eras", js.Array(value :_*))
    
    inline def setInvalidDate(value: String): Self = StObject.set(x, "invalidDate", value.asInstanceOf[js.Any])
    
    inline def setInvalidDateUndefined: Self = StObject.set(x, "invalidDate", js.undefined)
    
    inline def setIsPM(value: /* input */ String => Boolean): Self = StObject.set(x, "isPM", js.Any.fromFunction1(value))
    
    inline def setIsPMUndefined: Self = StObject.set(x, "isPM", js.undefined)
    
    inline def setLongDateFormat(value: LongDateFormatSpec): Self = StObject.set(x, "longDateFormat", value.asInstanceOf[js.Any])
    
    inline def setLongDateFormatUndefined: Self = StObject.set(x, "longDateFormat", js.undefined)
    
    inline def setMeridiem(value: (/* hour */ Double, /* minute */ Double, /* isLower */ Boolean) => String): Self = StObject.set(x, "meridiem", js.Any.fromFunction3(value))
    
    inline def setMeridiemParse(value: RegExp): Self = StObject.set(x, "meridiemParse", value.asInstanceOf[js.Any])
    
    inline def setMeridiemParseUndefined: Self = StObject.set(x, "meridiemParse", js.undefined)
    
    inline def setMeridiemUndefined: Self = StObject.set(x, "meridiem", js.undefined)
    
    inline def setMonths(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "months", js.Any.fromFunction2(value))
    
    inline def setMonthsShort(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
    
    inline def setMonthsShortFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "monthsShort", js.Any.fromFunction2(value))
    
    inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
    
    inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
    
    inline def setOrdinal(value: /* n */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
    
    inline def setOrdinalParse(value: RegExp): Self = StObject.set(x, "ordinalParse", value.asInstanceOf[js.Any])
    
    inline def setOrdinalParseUndefined: Self = StObject.set(x, "ordinalParse", js.undefined)
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setRelativeTime(value: RelativeTimeSpec): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setRelativeTimeUndefined: Self = StObject.set(x, "relativeTime", js.undefined)
    
    inline def setWeek(value: WeekSpec): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    inline def setWeekdays(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "weekdays", js.Any.fromFunction2(value))
    
    inline def setWeekdaysMin(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysMinFunction1(value: /* momentToFormat */ Moment => String): Self = StObject.set(x, "weekdaysMin", js.Any.fromFunction1(value))
    
    inline def setWeekdaysMinUndefined: Self = StObject.set(x, "weekdaysMin", js.undefined)
    
    inline def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value :_*))
    
    inline def setWeekdaysShort(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysShortFunction1(value: /* momentToFormat */ Moment => String): Self = StObject.set(x, "weekdaysShort", js.Any.fromFunction1(value))
    
    inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
    
    inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
    
    inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
  }
}
