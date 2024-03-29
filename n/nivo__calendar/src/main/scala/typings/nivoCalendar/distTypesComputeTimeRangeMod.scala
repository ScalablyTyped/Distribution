package typings.nivoCalendar

import typings.nivoCalendar.anon.CellHeight
import typings.nivoCalendar.anon.Coordinates
import typings.nivoCalendar.anon.DateDay
import typings.nivoCalendar.anon.Height
import typings.nivoCalendar.anon.Value
import typings.nivoCalendar.anon.Weeks
import typings.nivoCalendar.anon.Y
import typings.nivoCalendar.distTypesTypesMod.DateOrString
import typings.nivoCalendar.distTypesTypesMod.Weekday
import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeTimeRangeMod {
  
  @JSImport("@nivo/calendar/dist/types/compute/timeRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/calendar/dist/types/compute/timeRange", "ARRAY_OF_WEEKDAYS")
  @js.native
  val ARRAY_OF_WEEKDAYS: js.Array[String] = js.native
  
  inline def computeCellPositions(param0: ComputeCellPositions_): js.Array[Coordinates | typings.nivoCalendar.anon.Day] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellPositions")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Coordinates | typings.nivoCalendar.anon.Day]]
  
  inline def computeCellSize(param0: ComputeCellSize_): CellHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellSize")(param0.asInstanceOf[js.Any]).asInstanceOf[CellHeight]
  
  inline def computeMonthLegends(param0: ComputeMonths): Weeks = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegends")(param0.asInstanceOf[js.Any]).asInstanceOf[Weeks]
  
  inline def computeTotalDays(param0: ComputeTotalDays_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTotalDays")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def computeWeekdays(param0: ComputeWeekdays_): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWeekdays")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
  
  inline def getDayIndex(date: js.Date, firstWeekday: Weekday): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayIndex")(date.asInstanceOf[js.Any], firstWeekday.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFirstWeekdayIndex(weekday: Weekday): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstWeekdayIndex")(weekday.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ComputeBaseDimensionProps extends StObject {
    
    var cellHeight: Double
    
    var cellWidth: Double
  }
  object ComputeBaseDimensionProps {
    
    inline def apply(cellHeight: Double, cellWidth: Double): ComputeBaseDimensionProps = {
      val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeBaseDimensionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeBaseDimensionProps] (val x: Self) extends AnyVal {
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeBaseProps extends StObject {
    
    var direction: horizontal | vertical
  }
  object ComputeBaseProps {
    
    inline def apply(direction: horizontal | vertical): ComputeBaseProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeBaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeBaseProps] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeBaseSpaceProps extends StObject {
    
    var daySpacing: Double
    
    var offset: Double
  }
  object ComputeBaseSpaceProps {
    
    inline def apply(daySpacing: Double, offset: Double): ComputeBaseSpaceProps = {
      val __obj = js.Dynamic.literal(daySpacing = daySpacing.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeBaseSpaceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeBaseSpaceProps] (val x: Self) extends AnyVal {
      
      inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeCellPositions_
    extends StObject
       with ComputeBaseProps
       with ComputeBaseSpaceProps
       with ComputeBaseDimensionProps {
    
    def colorScale(value: Double): String
    
    var data: js.Array[DateDay]
    
    var emptyColor: String
    
    var firstWeekday: Weekday
    
    var from: js.UndefOr[DateOrString] = js.undefined
    
    var to: js.UndefOr[DateOrString] = js.undefined
  }
  object ComputeCellPositions_ {
    
    inline def apply(
      cellHeight: Double,
      cellWidth: Double,
      colorScale: Double => String,
      data: js.Array[DateDay],
      daySpacing: Double,
      direction: horizontal | vertical,
      emptyColor: String,
      firstWeekday: Weekday,
      offset: Double
    ): ComputeCellPositions_ = {
      val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], colorScale = js.Any.fromFunction1(colorScale), data = data.asInstanceOf[js.Any], daySpacing = daySpacing.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], emptyColor = emptyColor.asInstanceOf[js.Any], firstWeekday = firstWeekday.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeCellPositions_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeCellPositions_] (val x: Self) extends AnyVal {
      
      inline def setColorScale(value: Double => String): Self = StObject.set(x, "colorScale", js.Any.fromFunction1(value))
      
      inline def setData(value: js.Array[DateDay]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: DateDay*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekday(value: Weekday): Self = StObject.set(x, "firstWeekday", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: DateOrString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: DateOrString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait ComputeCellSize_
    extends StObject
       with ComputeBaseProps
       with ComputeBaseSpaceProps {
    
    var height: Double
    
    var square: Boolean
    
    var totalDays: Double
    
    var width: Double
  }
  object ComputeCellSize_ {
    
    inline def apply(
      daySpacing: Double,
      direction: horizontal | vertical,
      height: Double,
      offset: Double,
      square: Boolean,
      totalDays: Double,
      width: Double
    ): ComputeCellSize_ = {
      val __obj = js.Dynamic.literal(daySpacing = daySpacing.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any], totalDays = totalDays.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeCellSize_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeCellSize_] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setTotalDays(value: Double): Self = StObject.set(x, "totalDays", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @nivo/calendar.@nivo/calendar/dist/types/compute/timeRange.ComputeBaseProps */
  /* Inlined parent std.Omit<@nivo/calendar.@nivo/calendar/dist/types/compute/timeRange.ComputeBaseSpaceProps, 'offset'> */
  /* Inlined parent @nivo/calendar.@nivo/calendar/dist/types/compute/timeRange.ComputeBaseDimensionProps */
  trait ComputeMonths extends StObject {
    
    var cellHeight: Double
    
    var cellWidth: Double
    
    var daySpacing: Double
    
    var days: js.Array[Day]
    
    var direction: horizontal | vertical
  }
  object ComputeMonths {
    
    inline def apply(
      cellHeight: Double,
      cellWidth: Double,
      daySpacing: Double,
      days: js.Array[Day],
      direction: horizontal | vertical
    ): ComputeMonths = {
      val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], daySpacing = daySpacing.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeMonths]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeMonths] (val x: Self) extends AnyVal {
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
      
      inline def setDays(value: js.Array[Day]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Day*): Self = StObject.set(x, "days", js.Array(value*))
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeTotalDays_ extends StObject {
    
    var data: js.Array[DateDay]
    
    var from: js.UndefOr[DateOrString] = js.undefined
    
    var to: js.UndefOr[DateOrString] = js.undefined
  }
  object ComputeTotalDays_ {
    
    inline def apply(data: js.Array[DateDay]): ComputeTotalDays_ = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeTotalDays_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeTotalDays_] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[DateDay]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: DateDay*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFrom(value: DateOrString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: DateOrString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@nivo/calendar.@nivo/calendar/dist/types/compute/timeRange.ComputeBaseProps, 'daysInRange'> */
  /* Inlined parent std.Omit<@nivo/calendar.@nivo/calendar/dist/types/compute/timeRange.ComputeBaseSpaceProps, 'offset'> */
  /* Inlined parent @nivo/calendar.@nivo/calendar/dist/types/compute/timeRange.ComputeBaseDimensionProps */
  trait ComputeWeekdays_ extends StObject {
    
    var arrayOfWeekdays: js.UndefOr[js.Array[String]] = js.undefined
    
    var cellHeight: Double
    
    var cellWidth: Double
    
    var daySpacing: Double
    
    var direction: horizontal | vertical
    
    var firstWeekday: Weekday
    
    var ticks: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ComputeWeekdays_ {
    
    inline def apply(
      cellHeight: Double,
      cellWidth: Double,
      daySpacing: Double,
      direction: horizontal | vertical,
      firstWeekday: Weekday
    ): ComputeWeekdays_ = {
      val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], daySpacing = daySpacing.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], firstWeekday = firstWeekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeWeekdays_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeWeekdays_] (val x: Self) extends AnyVal {
      
      inline def setArrayOfWeekdays(value: js.Array[String]): Self = StObject.set(x, "arrayOfWeekdays", value.asInstanceOf[js.Any])
      
      inline def setArrayOfWeekdaysUndefined: Self = StObject.set(x, "arrayOfWeekdays", js.undefined)
      
      inline def setArrayOfWeekdaysVarargs(value: String*): Self = StObject.set(x, "arrayOfWeekdays", js.Array(value*))
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekday(value: Weekday): Self = StObject.set(x, "firstWeekday", value.asInstanceOf[js.Any])
      
      inline def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value*))
    }
  }
  
  trait Day extends StObject {
    
    var color: String
    
    var coordinates: Y
    
    var date: js.Date
    
    var day: String
    
    var firstWeek: Double
    
    var month: Double
    
    var value: js.UndefOr[Double] = js.undefined
    
    var year: Double
  }
  object Day {
    
    inline def apply(
      color: String,
      coordinates: Y,
      date: js.Date,
      day: String,
      firstWeek: Double,
      month: Double,
      year: Double
    ): Day = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], firstWeek = firstWeek.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Day]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCoordinates(value: Y): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setFirstWeek(value: Double): Self = StObject.set(x, "firstWeek", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait Month extends StObject {
    
    var bbox: Height
    
    var date: js.Date
    
    var firstWeek: Double
    
    var month: Double
    
    var year: Double
  }
  object Month {
    
    inline def apply(bbox: Height, date: js.Date, firstWeek: Double, month: Double, year: Double): Month = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], firstWeek = firstWeek.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Month]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: Height): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFirstWeek(value: Double): Self = StObject.set(x, "firstWeek", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
