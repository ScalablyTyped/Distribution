package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateOptions
  extends StObject
     with Options {
  
  // default 'Today'
  var close: js.UndefOr[String] = js.undefined
  
  /**
    * Disable a specific or arbitrary set of dates selectable on the
    * picker. Accepts an array of Date objects, arrays formatted as
    * [YEAR, MONTH, DATE], integers representing days of the week
    * (from 1 to 7), or objects with a range of dates. Switch to a
    * whitelist by setting `true` as the first item in the collection.
    * Enable dates that fall within a range of disabled dates by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The first day of the week can be set to either Sunday or Monday.
    * True or 1 sets it as Monday and false or 0 as Sunday.
    */
  var firstDay: js.UndefOr[Boolean | Double] = js.undefined
  
  // Classes
  var klass: js.UndefOr[DateKlassOptions] = js.undefined
  
  // default 'Close'
  // Accessibility labels
  var labelMonthNext: js.UndefOr[String] = js.undefined
  
  // default 'Next month'
  var labelMonthPrev: js.UndefOr[String] = js.undefined
  
  // default 'Previous month'
  var labelMonthSelect: js.UndefOr[String] = js.undefined
  
  // default 'Select a month'
  var labelYearSelect: js.UndefOr[String] = js.undefined
  
  /**
    * Set the maximum selectable date on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxDateOption] = js.undefined
  
  /**
    * Set the minimum selectable date on the picker. Accepts a Date object,
    * array formatted as [YEAR, MONTH, DATE], a positive or negative integer
    * for a date relative to today, or a boolean (`true` sets it to today,
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxDateOption] = js.undefined
  
  // Strings and translations
  var monthsFull: js.UndefOr[js.Array[String]] = js.undefined
  
  // default 'January' through 'December'
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * True enables the dropdown selector and false replaces it with text
    */
  var selectMonths: js.UndefOr[Boolean] = js.undefined
  
  //default 'Select a year'
  /**
    * True enables the dropdown selector and false replaces it with text.
    * You can also specify the number of years to show in the dropdown
    * using an even integer - half before and half after the year in focus.
    * If true the value will default to 10.
    */
  var selectYears: js.UndefOr[Boolean | Double] = js.undefined
  
  // default 'Sun' through 'Sat'
  var showMonthsShort: js.UndefOr[Boolean] = js.undefined
  
  var showWeekdaysFull: js.UndefOr[Boolean] = js.undefined
  
  // Buttons
  var today: js.UndefOr[String] = js.undefined
  
  // default 'Jan' through 'Dec'
  var weekdaysFull: js.UndefOr[js.Array[String]] = js.undefined
  
  // default 'Sunday' through 'Saturday'
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}
object DateOptions {
  
  inline def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  
  extension [Self <: DateOptions](x: Self) {
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDisable(value: js.Array[Any]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDisableVarargs(value: Any*): Self = StObject.set(x, "disable", js.Array(value*))
    
    inline def setFirstDay(value: Boolean | Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setKlass(value: DateKlassOptions): Self = StObject.set(x, "klass", value.asInstanceOf[js.Any])
    
    inline def setKlassUndefined: Self = StObject.set(x, "klass", js.undefined)
    
    inline def setLabelMonthNext(value: String): Self = StObject.set(x, "labelMonthNext", value.asInstanceOf[js.Any])
    
    inline def setLabelMonthNextUndefined: Self = StObject.set(x, "labelMonthNext", js.undefined)
    
    inline def setLabelMonthPrev(value: String): Self = StObject.set(x, "labelMonthPrev", value.asInstanceOf[js.Any])
    
    inline def setLabelMonthPrevUndefined: Self = StObject.set(x, "labelMonthPrev", js.undefined)
    
    inline def setLabelMonthSelect(value: String): Self = StObject.set(x, "labelMonthSelect", value.asInstanceOf[js.Any])
    
    inline def setLabelMonthSelectUndefined: Self = StObject.set(x, "labelMonthSelect", js.undefined)
    
    inline def setLabelYearSelect(value: String): Self = StObject.set(x, "labelYearSelect", value.asInstanceOf[js.Any])
    
    inline def setLabelYearSelectUndefined: Self = StObject.set(x, "labelYearSelect", js.undefined)
    
    inline def setMax(value: MinOrMaxDateOption): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: MinOrMaxDateOption): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMonthsFull(value: js.Array[String]): Self = StObject.set(x, "monthsFull", value.asInstanceOf[js.Any])
    
    inline def setMonthsFullUndefined: Self = StObject.set(x, "monthsFull", js.undefined)
    
    inline def setMonthsFullVarargs(value: String*): Self = StObject.set(x, "monthsFull", js.Array(value*))
    
    inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
    
    inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
    
    inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
    
    inline def setSelectMonths(value: Boolean): Self = StObject.set(x, "selectMonths", value.asInstanceOf[js.Any])
    
    inline def setSelectMonthsUndefined: Self = StObject.set(x, "selectMonths", js.undefined)
    
    inline def setSelectYears(value: Boolean | Double): Self = StObject.set(x, "selectYears", value.asInstanceOf[js.Any])
    
    inline def setSelectYearsUndefined: Self = StObject.set(x, "selectYears", js.undefined)
    
    inline def setShowMonthsShort(value: Boolean): Self = StObject.set(x, "showMonthsShort", value.asInstanceOf[js.Any])
    
    inline def setShowMonthsShortUndefined: Self = StObject.set(x, "showMonthsShort", js.undefined)
    
    inline def setShowWeekdaysFull(value: Boolean): Self = StObject.set(x, "showWeekdaysFull", value.asInstanceOf[js.Any])
    
    inline def setShowWeekdaysFullUndefined: Self = StObject.set(x, "showWeekdaysFull", js.undefined)
    
    inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setWeekdaysFull(value: js.Array[String]): Self = StObject.set(x, "weekdaysFull", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysFullUndefined: Self = StObject.set(x, "weekdaysFull", js.undefined)
    
    inline def setWeekdaysFullVarargs(value: String*): Self = StObject.set(x, "weekdaysFull", js.Array(value*))
    
    inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
    
    inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value*))
  }
}
