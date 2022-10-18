package typings.nivoCalendar

import typings.nivoCalendar.anon.BboxBBox
import typings.nivoCalendar.anon.CalendarHeight
import typings.nivoCalendar.anon.Color
import typings.nivoCalendar.anon.Data
import typings.nivoCalendar.anon.Direction
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrAlign
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrColorScale
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrData
import typings.nivoCalendar.anon.Rotation
import typings.nivoCalendar.anon.X
import typings.nivoCalendar.anon.YearLegendOffset
import typings.nivoCalendar.distTypesTypesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/calendar/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCalendarLayout(
    hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPrAlign
  ): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useCalendarLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def useColorScale(hasDataMinValueMaxValueColorsColorScale: PickRequiredCalendarSvgPrColorScale): ColorScale = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScale")(hasDataMinValueMaxValueColorsColorScale.asInstanceOf[js.Any]).asInstanceOf[ColorScale]
  
  inline def useDays(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPrData): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDays")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def useMonthLegends[Month /* <: BboxBBox */](hasMonthsDirectionMonthLegendPositionMonthLegendOffset: Direction[Month]): js.Array[Month & Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMonthLegends")(hasMonthsDirectionMonthLegendPositionMonthLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & Rotation]]
  
  inline def useYearLegends(hasYearsDirectionYearLegendPositionYearLegendOffset: YearLegendOffset): js.Array[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("useYearLegends")(hasYearsDirectionYearLegendPositionYearLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[X]]
}
