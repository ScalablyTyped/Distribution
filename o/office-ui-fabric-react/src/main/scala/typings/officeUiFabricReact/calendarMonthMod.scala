package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Dictkey
import typings.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.std.Date
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMonthMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarMonth", "CalendarMonth")
  @js.native
  class CalendarMonth protected ()
    extends Component[ICalendarMonthProps, ICalendarMonthState, js.Any] {
    def this(props: ICalendarMonthProps) = this()
    
    /* private */ var _calendarYearRef: js.Any = js.native
    
    /* private */ var _focusOnUpdate: js.Any = js.native
    
    /* private */ var _isCurrentMonth: js.Any = js.native
    
    /* private */ var _navigatedMonthRef: js.Any = js.native
    
    /* private */ var _onCalendarYearRef: js.Any = js.native
    
    /* private */ var _onHeaderKeyDown: js.Any = js.native
    
    /* private */ var _onHeaderSelect: js.Any = js.native
    
    /* private */ var _onKeyDown: js.Any = js.native
    
    /* private */ var _onRenderYear: js.Any = js.native
    
    /* private */ var _onSelectMonth: js.Any = js.native
    
    /* private */ var _onSelectMonthKeyDown: js.Any = js.native
    
    /* private */ var _onSelectNextYear: js.Any = js.native
    
    /* private */ var _onSelectNextYearKeyDown: js.Any = js.native
    
    /* private */ var _onSelectPrevYear: js.Any = js.native
    
    /* private */ var _onSelectPrevYearKeyDown: js.Any = js.native
    
    /* private */ var _onSelectYear: js.Any = js.native
    
    /* private */ var _onYearPickerHeaderSelect: js.Any = js.native
    
    /* private */ var _selectMonthCallbacks: js.Any = js.native
    
    /* private */ var _yearRangeToNextDecadeLabel: js.Any = js.native
    
    /* private */ var _yearRangeToPrevDecadeLabel: js.Any = js.native
    
    /* private */ var _yearRangeToString: js.Any = js.native
    
    /* private */ var _yearToString: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendarMonth(): Unit = js.native
    
    def focus(): Unit = js.native
    
    /**
      * @deprecated unused, prefer 'ref' and 'componentRef' of ICalendarMonthProps.
      */
    @JSName("refs")
    var refs_CalendarMonth: Dictkey = js.native
  }
  
  trait ICalendarMonth extends StObject {
    
    def focus(): Unit
  }
  object ICalendarMonth {
    
    inline def apply(focus: () => Unit): ICalendarMonth = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ICalendarMonth]
    }
    
    extension [Self <: ICalendarMonth](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait ICalendarMonthProps
    extends StObject
       with ClassAttributes[CalendarMonth] {
    
    var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.undefined
    
    var dateTimeFormatter: ICalendarFormatDateCallbacks
    
    var highlightCurrentMonth: Boolean
    
    var highlightSelectedMonth: Boolean
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var navigatedDate: Date
    
    var navigationIcons: ICalendarIconStrings
    
    var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
    
    def onNavigateDate(date: Date, focusOnNavigatedDay: Boolean): Unit
    
    var selectedDate: Date
    
    var strings: ICalendarStrings
    
    var today: js.UndefOr[Date] = js.undefined
    
    var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  }
  object ICalendarMonthProps {
    
    inline def apply(
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
    
    extension [Self <: ICalendarMonthProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[ICalendarMonth]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ICalendarMonth | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = StObject.set(x, "dateTimeFormatter", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentMonth(value: Boolean): Self = StObject.set(x, "highlightCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setHighlightSelectedMonth(value: Boolean): Self = StObject.set(x, "highlightSelectedMonth", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigatedDate(value: Date): Self = StObject.set(x, "navigatedDate", value.asInstanceOf[js.Any])
      
      inline def setNavigationIcons(value: ICalendarIconStrings): Self = StObject.set(x, "navigationIcons", value.asInstanceOf[js.Any])
      
      inline def setOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = StObject.set(x, "onHeaderSelect", js.Any.fromFunction1(value))
      
      inline def setOnHeaderSelectUndefined: Self = StObject.set(x, "onHeaderSelect", js.undefined)
      
      inline def setOnNavigateDate(value: (Date, Boolean) => Unit): Self = StObject.set(x, "onNavigateDate", js.Any.fromFunction2(value))
      
      inline def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: ICalendarStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setToday(value: Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setYearPickerHidden(value: Boolean): Self = StObject.set(x, "yearPickerHidden", value.asInstanceOf[js.Any])
      
      inline def setYearPickerHiddenUndefined: Self = StObject.set(x, "yearPickerHidden", js.undefined)
    }
  }
  
  trait ICalendarMonthState extends StObject {
    
    /** State used to show/hide month picker */
    var isYearPickerVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ICalendarMonthState {
    
    inline def apply(): ICalendarMonthState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarMonthState]
    }
    
    extension [Self <: ICalendarMonthState](x: Self) {
      
      inline def setIsYearPickerVisible(value: Boolean): Self = StObject.set(x, "isYearPickerVisible", value.asInstanceOf[js.Any])
      
      inline def setIsYearPickerVisibleUndefined: Self = StObject.set(x, "isYearPickerVisible", js.undefined)
    }
  }
}
