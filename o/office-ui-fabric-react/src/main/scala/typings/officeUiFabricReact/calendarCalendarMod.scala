package typings.officeUiFabricReact

import typings.officeUiFabricReact.calendarTypesMod.ICalendar
import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarCalendarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
  @js.native
  open class Calendar protected ()
    extends Component[ICalendarProps, ICalendarState, Any]
       with ICalendar {
    def this(props: ICalendarProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCalendar(nextProps: ICalendarProps): Unit = js.native
    
    /* private */ var _dayPicker: Any = js.native
    
    /* private */ var _focusOnUpdate: Any = js.native
    
    /* private */ var _handleEscKey: Any = js.native
    
    /* private */ var _hasFocus: Any = js.native
    
    /* private */ var _monthPicker: Any = js.native
    
    /* private */ var _navigateDayPickerDay: Any = js.native
    
    /* private */ var _navigateMonthPickerDay: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onDatePickerPopupKeyDown: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onGotoToday: Any = js.native
    
    /* private */ var _onGotoTodayClick: Any = js.native
    
    /* private */ var _onGotoTodayKeyDown: Any = js.native
    
    /* private */ var _onHeaderSelect: Any = js.native
    
    /* private */ var _onNavigateDayDate: Any = js.native
    
    /* private */ var _onNavigateMonthDate: Any = js.native
    
    /* private */ var _onSelectDate: Any = js.native
    
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
    inline def defaultProps_=(x: ICalendarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ICalendarState extends StObject {
    
    /** State used to show/hide day picker */
    var isDayPickerVisible: js.UndefOr[Boolean] = js.undefined
    
    /** State used to show/hide month picker */
    var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
    
    /** The currently focused date in the day picker, but not necessarily selected */
    var navigatedDayDate: js.UndefOr[js.Date] = js.undefined
    
    /** The currently focused date in the month picker, but not necessarily selected */
    var navigatedMonthDate: js.UndefOr[js.Date] = js.undefined
    
    /** The currently selected date in the calendar */
    var selectedDate: js.UndefOr[js.Date] = js.undefined
  }
  object ICalendarState {
    
    inline def apply(): ICalendarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarState]
    }
    
    extension [Self <: ICalendarState](x: Self) {
      
      inline def setIsDayPickerVisible(value: Boolean): Self = StObject.set(x, "isDayPickerVisible", value.asInstanceOf[js.Any])
      
      inline def setIsDayPickerVisibleUndefined: Self = StObject.set(x, "isDayPickerVisible", js.undefined)
      
      inline def setIsMonthPickerVisible(value: Boolean): Self = StObject.set(x, "isMonthPickerVisible", value.asInstanceOf[js.Any])
      
      inline def setIsMonthPickerVisibleUndefined: Self = StObject.set(x, "isMonthPickerVisible", js.undefined)
      
      inline def setNavigatedDayDate(value: js.Date): Self = StObject.set(x, "navigatedDayDate", value.asInstanceOf[js.Any])
      
      inline def setNavigatedDayDateUndefined: Self = StObject.set(x, "navigatedDayDate", js.undefined)
      
      inline def setNavigatedMonthDate(value: js.Date): Self = StObject.set(x, "navigatedMonthDate", value.asInstanceOf[js.Any])
      
      inline def setNavigatedMonthDateUndefined: Self = StObject.set(x, "navigatedMonthDate", js.undefined)
      
      inline def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    }
  }
}
