package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateKlassOptions
  extends StObject
     with KlassOptions {
  
  // default 'picker__footer'
  // Today & close buttons
  var buttonClose: js.UndefOr[String] = js.undefined
  
  // default 'picker__button--close'
  var buttonToday: js.UndefOr[String] = js.undefined
  
  // default 'picker__weekday'
  // Day states
  var day: js.UndefOr[String] = js.undefined
  
  // default 'picker__day--outfocus'
  // The picker footer
  var footer: js.UndefOr[String] = js.undefined
  
  // The picker header
  var header: js.UndefOr[String] = js.undefined
  
  // default 'picker__day'
  var infocus: js.UndefOr[String] = js.undefined
  
  // default 'picker__nav--disabled'
  // Month & year labels
  var month: js.UndefOr[String] = js.undefined
  
  // default 'picker__nav--next'
  var navDisabled: js.UndefOr[String] = js.undefined
  
  // default 'picker__nav--prev'
  var navNext: js.UndefOr[String] = js.undefined
  
  // default 'picker__header'
  // Month navigation
  var navPrev: js.UndefOr[String] = js.undefined
  
  // default 'picker__day--infocus'
  var outfocus: js.UndefOr[String] = js.undefined
  
  // default 'picker__year'
  // Month & year dropdowns
  var selectMonth: js.UndefOr[String] = js.undefined
  
  // default 'picker__select--month'
  var selectYear: js.UndefOr[String] = js.undefined
  
  // default 'picker__select--year'
  // Table of dates
  var table: js.UndefOr[String] = js.undefined
  
  // default 'picker__table'
  // Weekday labels
  var weekdays: js.UndefOr[String] = js.undefined
  
  // default 'picker__month'
  var year: js.UndefOr[String] = js.undefined
}
object DateKlassOptions {
  
  inline def apply(): DateKlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateKlassOptions]
  }
  
  extension [Self <: DateKlassOptions](x: Self) {
    
    inline def setButtonClose(value: String): Self = StObject.set(x, "buttonClose", value.asInstanceOf[js.Any])
    
    inline def setButtonCloseUndefined: Self = StObject.set(x, "buttonClose", js.undefined)
    
    inline def setButtonToday(value: String): Self = StObject.set(x, "buttonToday", value.asInstanceOf[js.Any])
    
    inline def setButtonTodayUndefined: Self = StObject.set(x, "buttonToday", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setInfocus(value: String): Self = StObject.set(x, "infocus", value.asInstanceOf[js.Any])
    
    inline def setInfocusUndefined: Self = StObject.set(x, "infocus", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNavDisabled(value: String): Self = StObject.set(x, "navDisabled", value.asInstanceOf[js.Any])
    
    inline def setNavDisabledUndefined: Self = StObject.set(x, "navDisabled", js.undefined)
    
    inline def setNavNext(value: String): Self = StObject.set(x, "navNext", value.asInstanceOf[js.Any])
    
    inline def setNavNextUndefined: Self = StObject.set(x, "navNext", js.undefined)
    
    inline def setNavPrev(value: String): Self = StObject.set(x, "navPrev", value.asInstanceOf[js.Any])
    
    inline def setNavPrevUndefined: Self = StObject.set(x, "navPrev", js.undefined)
    
    inline def setOutfocus(value: String): Self = StObject.set(x, "outfocus", value.asInstanceOf[js.Any])
    
    inline def setOutfocusUndefined: Self = StObject.set(x, "outfocus", js.undefined)
    
    inline def setSelectMonth(value: String): Self = StObject.set(x, "selectMonth", value.asInstanceOf[js.Any])
    
    inline def setSelectMonthUndefined: Self = StObject.set(x, "selectMonth", js.undefined)
    
    inline def setSelectYear(value: String): Self = StObject.set(x, "selectYear", value.asInstanceOf[js.Any])
    
    inline def setSelectYearUndefined: Self = StObject.set(x, "selectYear", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setWeekdays(value: String): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
