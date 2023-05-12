package typings.nivoCalendar

import typings.nivoCalendar.anon.BboxBBox
import typings.nivoCalendar.anon.CalendarHeight
import typings.nivoCalendar.anon.CellHeight
import typings.nivoCalendar.anon.Color
import typings.nivoCalendar.anon.Coordinates
import typings.nivoCalendar.anon.Data
import typings.nivoCalendar.anon.Day
import typings.nivoCalendar.anon.Direction
import typings.nivoCalendar.anon.MonthLegendOffset
import typings.nivoCalendar.anon.Months
import typings.nivoCalendar.anon.OmitCalendarCanvasPropswi
import typings.nivoCalendar.anon.OmitCalendarSvgPropsheigh
import typings.nivoCalendar.anon.OmitTimeRangeSvgPropsheig
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPr
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPr0
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrColorScale
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrColors
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrData
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrDirection
import typings.nivoCalendar.anon.Rotation
import typings.nivoCalendar.anon.Value
import typings.nivoCalendar.anon.Weeks
import typings.nivoCalendar.anon.X
import typings.nivoCalendar.distTypesComputeTimeRangeMod.ComputeCellPositions_
import typings.nivoCalendar.distTypesComputeTimeRangeMod.ComputeCellSize_
import typings.nivoCalendar.distTypesComputeTimeRangeMod.ComputeMonths
import typings.nivoCalendar.distTypesComputeTimeRangeMod.ComputeTotalDays_
import typings.nivoCalendar.distTypesComputeTimeRangeMod.ComputeWeekdays_
import typings.nivoCalendar.distTypesTypesMod.CalendarCanvasProps
import typings.nivoCalendar.distTypesTypesMod.CalendarDatum
import typings.nivoCalendar.distTypesTypesMod.CalendarLegendProps
import typings.nivoCalendar.distTypesTypesMod.CalendarSvgProps
import typings.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import typings.nivoCalendar.distTypesTypesMod.ColorScale
import typings.nivoCalendar.distTypesTypesMod.TimeRangeSvgProps
import typings.nivoCalendar.distTypesTypesMod.Weekday
import typings.nivoCalendar.nivoCalendarBooleans.`true`
import typings.nivoCalendar.nivoCalendarInts.`0`
import typings.nivoCalendar.nivoCalendarInts.`10`
import typings.nivoCalendar.nivoCalendarInts.`1`
import typings.nivoCalendar.nivoCalendarInts.`2`
import typings.nivoCalendar.nivoCalendarInts.`30`
import typings.nivoCalendar.nivoCalendarInts.`75`
import typings.nivoCalendar.nivoCalendarStrings.Numbersign000
import typings.nivoCalendar.nivoCalendarStrings.Numbersignfff
import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCalendar.nivoCalendarStrings.before
import typings.nivoCalendar.nivoCalendarStrings.center
import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.img
import typings.nivoCalendar.nivoCalendarStrings.sunday
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/calendar", "ARRAY_OF_WEEKDAYS")
  @js.native
  val ARRAY_OF_WEEKDAYS: js.Array[String] = js.native
  
  inline def Calendar(param0: CalendarSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Calendar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CalendarCanvas(param0: CalendarCanvasProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CalendarCanvas")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCalendar(props: OmitCalendarSvgPropsheigh): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCalendar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCalendarCanvas(props: OmitCalendarCanvasPropswi): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCalendarCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveTimeRange(props: OmitTimeRangeSvgPropsheig): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTimeRange")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimeRange(param0: TimeRangeSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeRange")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def bindDaysData(param0: PickRequiredCalendarSvgPrColorScale): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindDaysData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  object calendarCanvasDefaultProps {
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.align")
    @js.native
    val align: center = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.colors")
    @js.native
    val colors: js.Array[String] = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.dayBorderColor")
    @js.native
    val dayBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.dayBorderWidth")
    @js.native
    val dayBorderWidth: `1` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.daySpacing")
    @js.native
    val daySpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.direction")
    @js.native
    val direction: horizontal = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.emptyColor")
    @js.native
    val emptyColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.legends")
    @js.native
    val legends: js.Array[CalendarLegendProps] = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthBorderColor")
    @js.native
    val monthBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthBorderWidth")
    @js.native
    val monthBorderWidth: `2` = js.native
    
    inline def monthLegend(_year: Double, _month: Double, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthLegend")(_year.asInstanceOf[js.Any], _month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthLegendOffset")
    @js.native
    val monthLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthLegendPosition")
    @js.native
    val monthLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthSpacing")
    @js.native
    val monthSpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.pixelRatio")
    @js.native
    val pixelRatio: Double = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.tooltip")
    @js.native
    val tooltip: MemoExoticComponent[js.Function1[/* param0 */ CalendarTooltipProps, Element | Null]] = js.native
    
    inline def yearLegend(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearLegend")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.yearLegendOffset")
    @js.native
    val yearLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.yearLegendPosition")
    @js.native
    val yearLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.yearSpacing")
    @js.native
    val yearSpacing: `30` = js.native
  }
  
  object calendarDefaultProps {
    
    @JSImport("@nivo/calendar", "calendarDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.align")
    @js.native
    val align: center = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.colors")
    @js.native
    val colors: js.Array[String] = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.dayBorderColor")
    @js.native
    val dayBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.dayBorderWidth")
    @js.native
    val dayBorderWidth: `1` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.daySpacing")
    @js.native
    val daySpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.direction")
    @js.native
    val direction: horizontal = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.emptyColor")
    @js.native
    val emptyColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.legends")
    @js.native
    val legends: js.Array[CalendarLegendProps] = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthBorderColor")
    @js.native
    val monthBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthBorderWidth")
    @js.native
    val monthBorderWidth: `2` = js.native
    
    inline def monthLegend(_year: Double, _month: Double, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthLegend")(_year.asInstanceOf[js.Any], _month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthLegendOffset")
    @js.native
    val monthLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthLegendPosition")
    @js.native
    val monthLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthSpacing")
    @js.native
    val monthSpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.role")
    @js.native
    val role: img = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.tooltip")
    @js.native
    val tooltip: MemoExoticComponent[js.Function1[/* param0 */ CalendarTooltipProps, Element | Null]] = js.native
    
    inline def yearLegend(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearLegend")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.yearLegendOffset")
    @js.native
    val yearLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.yearLegendPosition")
    @js.native
    val yearLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.yearSpacing")
    @js.native
    val yearSpacing: `30` = js.native
  }
  
  inline def computeCellPositions(param0: ComputeCellPositions_): js.Array[Coordinates | Day] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellPositions")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Coordinates | Day]]
  
  inline def computeCellSize(param0: ComputeCellSize_): CellHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellSize")(param0.asInstanceOf[js.Any]).asInstanceOf[CellHeight]
  
  inline def computeDomain_auto(
    data: js.Array[CalendarDatum],
    minSpec: NonNullable[js.UndefOr[auto | Double]],
    maxSpec: NonNullable[js.UndefOr[auto | Double]]
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDomain")(data.asInstanceOf[js.Any], minSpec.asInstanceOf[js.Any], maxSpec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def computeLayout(param0: PickRequiredCalendarSvgPr): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def computeMonthLegendPositions[Month /* <: BboxBBox */](param0: PickRequiredCalendarSvgPr0 & Months[Month]): js.Array[Month & X] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegendPositions")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & X]]
  
  inline def computeMonthLegends(param0: ComputeMonths): Weeks = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegends")(param0.asInstanceOf[js.Any]).asInstanceOf[Weeks]
  
  inline def computeTotalDays(param0: ComputeTotalDays_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTotalDays")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def computeWeekdays(param0: ComputeWeekdays_): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWeekdays")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
  
  inline def computeYearLegendPositions(param0: PickRequiredCalendarSvgPrDirection): js.Array[Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeYearLegendPositions")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rotation]]
  
  inline def getDayIndex(date: js.Date, firstWeekday: Weekday): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayIndex")(date.asInstanceOf[js.Any], firstWeekday.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFirstWeekdayIndex(weekday: Weekday): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstWeekdayIndex")(weekday.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object timeRangeDefaultProps {
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.align")
    @js.native
    val align: center = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.colors")
    @js.native
    val colors: js.Array[String] = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.dayBorderColor")
    @js.native
    val dayBorderColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.dayBorderWidth")
    @js.native
    val dayBorderWidth: `1` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.dayRadius")
    @js.native
    val dayRadius: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.daySpacing")
    @js.native
    val daySpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.direction")
    @js.native
    val direction: horizontal = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.emptyColor")
    @js.native
    val emptyColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.firstWeekday")
    @js.native
    val firstWeekday: sunday = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.legends")
    @js.native
    val legends: js.Array[CalendarLegendProps] = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthBorderColor")
    @js.native
    val monthBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthBorderWidth")
    @js.native
    val monthBorderWidth: `2` = js.native
    
    inline def monthLegend(_year: Double, _month: Double, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthLegend")(_year.asInstanceOf[js.Any], _month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthLegendOffset")
    @js.native
    val monthLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthLegendPosition")
    @js.native
    val monthLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthSpacing")
    @js.native
    val monthSpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.role")
    @js.native
    val role: img = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.square")
    @js.native
    val square: `true` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.tooltip")
    @js.native
    val tooltip: MemoExoticComponent[js.Function1[/* param0 */ CalendarTooltipProps, Element | Null]] = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.weekdayLegendOffset")
    @js.native
    val weekdayLegendOffset: `75` = js.native
    
    inline def yearLegend(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearLegend")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.yearLegendOffset")
    @js.native
    val yearLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.yearLegendPosition")
    @js.native
    val yearLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.yearSpacing")
    @js.native
    val yearSpacing: `30` = js.native
  }
  
  inline def useCalendarLayout(param0: PickRequiredCalendarSvgPr): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useCalendarLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def useColorScale(param0: PickRequiredCalendarSvgPrColors): ColorScale = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScale")(param0.asInstanceOf[js.Any]).asInstanceOf[ColorScale]
  
  inline def useDays(param0: PickRequiredCalendarSvgPrData): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDays")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def useMonthLegends[Month /* <: BboxBBox */](param0: MonthLegendOffset[Month]): js.Array[Month & X] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMonthLegends")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & X]]
  
  inline def useYearLegends(param0: Direction): js.Array[Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useYearLegends")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rotation]]
}
