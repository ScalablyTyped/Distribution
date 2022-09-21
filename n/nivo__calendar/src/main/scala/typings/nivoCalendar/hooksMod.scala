package typings.nivoCalendar

import typings.nivoCalendar.anon.BboxBBox
import typings.nivoCalendar.anon.CalendarHeight
import typings.nivoCalendar.anon.Color
import typings.nivoCalendar.anon.Data
import typings.nivoCalendar.anon.Direction
import typings.nivoCalendar.anon.MonthLegendOffset
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPr
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrColors
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrData
import typings.nivoCalendar.anon.Rotation
import typings.nivoCalendar.anon.X
import typings.nivoCalendar.typesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/calendar/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCalendarLayout(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPr): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useCalendarLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def useColorScale(hasDataMinValueMaxValueColorsColorScale: PickRequiredCalendarSvgPrColors): ColorScale = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScale")(hasDataMinValueMaxValueColorsColorScale.asInstanceOf[js.Any]).asInstanceOf[ColorScale]
  
  inline def useDays(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPrData): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDays")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def useMonthLegends[Month /* <: BboxBBox */](hasMonthsDirectionMonthLegendPositionMonthLegendOffset: MonthLegendOffset[Month]): js.Array[Month & X] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMonthLegends")(hasMonthsDirectionMonthLegendPositionMonthLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & X]]
  
  inline def useYearLegends(hasYearsDirectionYearLegendPositionYearLegendOffset: Direction): js.Array[Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useYearLegends")(hasYearsDirectionYearLegendPositionYearLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rotation]]
}
