package typings.officeUiFabricReact.calendarMonthMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typings.react.mod.ClassAttributes
import typings.std.Date
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarMonthProps extends ClassAttributes[CalendarMonth] {
  
  var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.native
  
  var dateTimeFormatter: ICalendarFormatDateCallbacks = js.native
  
  var highlightCurrentMonth: Boolean = js.native
  
  var highlightSelectedMonth: Boolean = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var navigatedDate: Date = js.native
  
  var navigationIcons: ICalendarIconStrings = js.native
  
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
  
  def onNavigateDate(date: Date, focusOnNavigatedDay: Boolean): Unit = js.native
  
  var selectedDate: Date = js.native
  
  var strings: ICalendarStrings = js.native
  
  var today: js.UndefOr[Date] = js.native
  
  var yearPickerHidden: js.UndefOr[Boolean] = js.native
}
object ICalendarMonthProps {
  
  @scala.inline
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (Date, Boolean) => Unit,
    selectedDate: Date,
    strings: ICalendarStrings
  ): ICalendarMonthProps = {
    val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarMonthProps]
  }
  
  @scala.inline
  implicit class ICalendarMonthPropsOps[Self <: ICalendarMonthProps] (val x: Self) extends AnyVal {
    
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
    def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = this.set("dateTimeFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCurrentMonth(value: Boolean): Self = this.set("highlightCurrentMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSelectedMonth(value: Boolean): Self = this.set("highlightSelectedMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatedDate(value: Date): Self = this.set("navigatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationIcons(value: ICalendarIconStrings): Self = this.set("navigationIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNavigateDate(value: (Date, Boolean) => Unit): Self = this.set("onNavigateDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedDate(value: Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrings(value: ICalendarStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICalendarMonth | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ICalendarMonth]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = this.set("onHeaderSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHeaderSelect: Self = this.set("onHeaderSelect", js.undefined)
    
    @scala.inline
    def setToday(value: Date): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setYearPickerHidden(value: Boolean): Self = this.set("yearPickerHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearPickerHidden: Self = this.set("yearPickerHidden", js.undefined)
  }
}
