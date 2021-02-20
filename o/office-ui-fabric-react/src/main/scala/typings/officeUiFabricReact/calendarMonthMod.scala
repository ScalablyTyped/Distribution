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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMonthMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarMonth", "CalendarMonth")
  @js.native
  class CalendarMonth protected ()
    extends Component[ICalendarMonthProps, ICalendarMonthState, js.Any] {
    def this(props: ICalendarMonthProps) = this()
    
    var _calendarYearRef: js.Any = js.native
    
    var _focusOnUpdate: js.Any = js.native
    
    var _isCurrentMonth: js.Any = js.native
    
    var _navigatedMonthRef: js.Any = js.native
    
    var _onCalendarYearRef: js.Any = js.native
    
    var _onHeaderKeyDown: js.Any = js.native
    
    var _onHeaderSelect: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onRenderYear: js.Any = js.native
    
    var _onSelectMonth: js.Any = js.native
    
    var _onSelectMonthKeyDown: js.Any = js.native
    
    var _onSelectNextYear: js.Any = js.native
    
    var _onSelectNextYearKeyDown: js.Any = js.native
    
    var _onSelectPrevYear: js.Any = js.native
    
    var _onSelectPrevYearKeyDown: js.Any = js.native
    
    var _onSelectYear: js.Any = js.native
    
    var _onYearPickerHeaderSelect: js.Any = js.native
    
    var _selectMonthCallbacks: js.Any = js.native
    
    var _yearRangeToNextDecadeLabel: js.Any = js.native
    
    var _yearRangeToPrevDecadeLabel: js.Any = js.native
    
    var _yearRangeToString: js.Any = js.native
    
    var _yearToString: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendarMonth(): Unit = js.native
    
    def focus(): Unit = js.native
    
    /**
      * @deprecated unused, prefer 'ref' and 'componentRef' of ICalendarMonthProps.
      */
    @JSName("refs")
    var refs_CalendarMonth: Dictkey = js.native
  }
  
  @js.native
  trait ICalendarMonth extends StObject {
    
    def focus(): Unit = js.native
  }
  object ICalendarMonth {
    
    @scala.inline
    def apply(focus: () => Unit): ICalendarMonth = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ICalendarMonth]
    }
    
    @scala.inline
    implicit class ICalendarMonthMutableBuilder[Self <: ICalendarMonth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
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
    implicit class ICalendarMonthPropsMutableBuilder[Self <: ICalendarMonthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[ICalendarMonth]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ICalendarMonth | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = StObject.set(x, "dateTimeFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCurrentMonth(value: Boolean): Self = StObject.set(x, "highlightCurrentMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSelectedMonth(value: Boolean): Self = StObject.set(x, "highlightSelectedMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setNavigatedDate(value: Date): Self = StObject.set(x, "navigatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationIcons(value: ICalendarIconStrings): Self = StObject.set(x, "navigationIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = StObject.set(x, "onHeaderSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHeaderSelectUndefined: Self = StObject.set(x, "onHeaderSelect", js.undefined)
      
      @scala.inline
      def setOnNavigateDate(value: (Date, Boolean) => Unit): Self = StObject.set(x, "onNavigateDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrings(value: ICalendarStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToday(value: Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setYearPickerHidden(value: Boolean): Self = StObject.set(x, "yearPickerHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearPickerHiddenUndefined: Self = StObject.set(x, "yearPickerHidden", js.undefined)
    }
  }
  
  @js.native
  trait ICalendarMonthState extends StObject {
    
    /** State used to show/hide month picker */
    var isYearPickerVisible: js.UndefOr[Boolean] = js.native
  }
  object ICalendarMonthState {
    
    @scala.inline
    def apply(): ICalendarMonthState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarMonthState]
    }
    
    @scala.inline
    implicit class ICalendarMonthStateMutableBuilder[Self <: ICalendarMonthState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsYearPickerVisible(value: Boolean): Self = StObject.set(x, "isYearPickerVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsYearPickerVisibleUndefined: Self = StObject.set(x, "isYearPickerVisible", js.undefined)
    }
  }
}
