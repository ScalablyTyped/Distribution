package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarDayMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarDay", "CalendarDay")
  @js.native
  open class CalendarDay protected () extends Component[ICalendarDayProps, ICalendarDayState, Any] {
    def this(props: ICalendarDayProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCalendarDay(nextProps: ICalendarDayProps): Unit = js.native
    
    /* private */ var _applyFunctionToDayRefs: Any = js.native
    
    /**
      * Returns the index of the last element in the array where the predicate is true, and -1
      * otherwise
      * @param items Array of items to be iterated over using the predicate
      * @param predicate find calls predicate once for each element of the array, in descending
      * order, until it finds one where predicate returns true if such an element is found.
      */
    /* private */ var _findLastIndex: Any = js.native
    
    /* private */ var _getBoundedDateRange: Any = js.native
    
    /* private */ var _getHighlightedCornerStyle: Any = js.native
    
    /* private */ var _getIsRestrictedDate: Any = js.native
    
    /* private */ var _getWeekCornerStyles: Any = js.native
    
    /* private */ var _getWeeks: Any = js.native
    
    /* private */ var _navigateMonthEdge: Any = js.native
    
    /* private */ var _onClose: Any = js.native
    
    /* private */ var _onCloseButtonKeyDown: Any = js.native
    
    /* private */ var _onDayKeyDown: Any = js.native
    
    /* private */ var _onDayMouseDown: Any = js.native
    
    /* private */ var _onDayMouseLeave: Any = js.native
    
    /* private */ var _onDayMouseOver: Any = js.native
    
    /* private */ var _onDayMouseUp: Any = js.native
    
    /* private */ var _onHeaderKeyDown: Any = js.native
    
    /* private */ var _onHeaderSelect: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onNextMonthKeyDown: Any = js.native
    
    /* private */ var _onPrevMonthKeyDown: Any = js.native
    
    /* private */ var _onSelectDate: Any = js.native
    
    /* private */ var _onSelectNextMonth: Any = js.native
    
    /* private */ var _onSelectPrevMonth: Any = js.native
    
    /* private */ var _onTableMouseLeave: Any = js.native
    
    /* private */ var _onTableMouseUp: Any = js.native
    
    /* private */ var _setDayCellRef: Any = js.native
    
    /* private */ var days: Any = js.native
    
    def focus(): Unit = js.native
    
    /* private */ var navigatedDay: Any = js.native
  }
  
  trait ICalendarDay extends StObject {
    
    def focus(): Unit
  }
  object ICalendarDay {
    
    inline def apply(focus: () => Unit): ICalendarDay = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ICalendarDay]
    }
    
    extension [Self <: ICalendarDay](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ICalendarDayProps
    extends StObject
       with ClassAttributes[CalendarDay] {
    
    var allFocusable: js.UndefOr[Boolean] = js.native
    
    var autoNavigateOnSelection: Boolean = js.native
    
    var componentRef: js.UndefOr[IRefObject[ICalendarDay]] = js.native
    
    var dateRangeType: DateRangeType = js.native
    
    var dateTimeFormatter: ICalendarFormatDateCallbacks = js.native
    
    var firstDayOfWeek: DayOfWeek = js.native
    
    var firstWeekOfYear: FirstWeekOfYear = js.native
    
    var maxDate: js.UndefOr[js.Date] = js.native
    
    var minDate: js.UndefOr[js.Date] = js.native
    
    var navigatedDate: js.Date = js.native
    
    var navigationIcons: ICalendarIconStrings = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
    
    def onNavigateDate(date: js.Date, focusOnNavigatedDay: Boolean): Unit = js.native
    
    def onSelectDate(date: js.Date): Unit = js.native
    def onSelectDate(date: js.Date, selectedDateRangeArray: js.Array[js.Date]): Unit = js.native
    
    var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.native
    
    var selectedDate: js.Date = js.native
    
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    
    var strings: ICalendarStrings = js.native
    
    var today: js.UndefOr[js.Date] = js.native
    
    var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
  }
  
  trait ICalendarDayState extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.undefined
    
    var weeks: js.UndefOr[js.Array[js.Array[IDayInfo]]] = js.undefined
  }
  object ICalendarDayState {
    
    inline def apply(): ICalendarDayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarDayState]
    }
    
    extension [Self <: ICalendarDayState](x: Self) {
      
      inline def setActiveDescendantId(value: String): Self = StObject.set(x, "activeDescendantId", value.asInstanceOf[js.Any])
      
      inline def setActiveDescendantIdUndefined: Self = StObject.set(x, "activeDescendantId", js.undefined)
      
      inline def setWeeks(value: js.Array[js.Array[IDayInfo]]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      inline def setWeeksVarargs(value: js.Array[IDayInfo]*): Self = StObject.set(x, "weeks", js.Array(value*))
    }
  }
  
  trait IDayInfo extends StObject {
    
    var date: String
    
    var isInBounds: Boolean
    
    var isInMonth: Boolean
    
    var isSelected: Boolean
    
    var isToday: Boolean
    
    var key: String
    
    def onSelected(ev: SyntheticEvent[HTMLElement, Event]): Unit
    
    var originalDate: js.Date
  }
  object IDayInfo {
    
    inline def apply(
      date: String,
      isInBounds: Boolean,
      isInMonth: Boolean,
      isSelected: Boolean,
      isToday: Boolean,
      key: String,
      onSelected: SyntheticEvent[HTMLElement, Event] => Unit,
      originalDate: js.Date
    ): IDayInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onSelected = js.Any.fromFunction1(onSelected), originalDate = originalDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDayInfo]
    }
    
    extension [Self <: IDayInfo](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setIsInBounds(value: Boolean): Self = StObject.set(x, "isInBounds", value.asInstanceOf[js.Any])
      
      inline def setIsInMonth(value: Boolean): Self = StObject.set(x, "isInMonth", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnSelected(value: SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
      
      inline def setOriginalDate(value: js.Date): Self = StObject.set(x, "originalDate", value.asInstanceOf[js.Any])
    }
  }
}
