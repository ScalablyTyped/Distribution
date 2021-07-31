package typings.officeUiFabricReact

import typings.officeUiFabricReact.calendarTypesMod.ICalendar
import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarCalendarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[ICalendarProps, ICalendarState, js.Any]
       with ICalendar {
    def this(props: ICalendarProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCalendar(nextProps: ICalendarProps): Unit = js.native
    
    var _dayPicker: js.Any = js.native
    
    var _focusOnUpdate: js.Any = js.native
    
    var _handleEscKey: js.Any = js.native
    
    var _hasFocus: js.Any = js.native
    
    var _monthPicker: js.Any = js.native
    
    var _navigateDayPickerDay: js.Any = js.native
    
    var _navigateMonthPickerDay: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onDatePickerPopupKeyDown: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onGotoToday: js.Any = js.native
    
    var _onGotoTodayClick: js.Any = js.native
    
    var _onGotoTodayKeyDown: js.Any = js.native
    
    var _onHeaderSelect: js.Any = js.native
    
    var _onNavigateDayDate: js.Any = js.native
    
    var _onNavigateMonthDate: js.Any = js.native
    
    var _onSelectDate: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendar(): Unit = js.native
    
    /** Sets focus to the selected date. */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  /* static members */
  object Calendar {
    
    @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar.defaultProps")
    @js.native
    def defaultProps: ICalendarProps = js.native
    @scala.inline
    def defaultProps_=(x: ICalendarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ICalendarState extends StObject {
    
    /** State used to show/hide day picker */
    var isDayPickerVisible: js.UndefOr[Boolean] = js.undefined
    
    /** State used to show/hide month picker */
    var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
    
    /** The currently focused date in the day picker, but not necessarily selected */
    var navigatedDayDate: js.UndefOr[Date] = js.undefined
    
    /** The currently focused date in the month picker, but not necessarily selected */
    var navigatedMonthDate: js.UndefOr[Date] = js.undefined
    
    /** The currently selected date in the calendar */
    var selectedDate: js.UndefOr[Date] = js.undefined
  }
  object ICalendarState {
    
    @scala.inline
    def apply(): ICalendarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarState]
    }
    
    @scala.inline
    implicit class ICalendarStateMutableBuilder[Self <: ICalendarState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDayPickerVisible(value: Boolean): Self = StObject.set(x, "isDayPickerVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDayPickerVisibleUndefined: Self = StObject.set(x, "isDayPickerVisible", js.undefined)
      
      @scala.inline
      def setIsMonthPickerVisible(value: Boolean): Self = StObject.set(x, "isMonthPickerVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMonthPickerVisibleUndefined: Self = StObject.set(x, "isMonthPickerVisible", js.undefined)
      
      @scala.inline
      def setNavigatedDayDate(value: Date): Self = StObject.set(x, "navigatedDayDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigatedDayDateUndefined: Self = StObject.set(x, "navigatedDayDate", js.undefined)
      
      @scala.inline
      def setNavigatedMonthDate(value: Date): Self = StObject.set(x, "navigatedMonthDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigatedMonthDateUndefined: Self = StObject.set(x, "navigatedMonthDate", js.undefined)
      
      @scala.inline
      def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    }
  }
}
