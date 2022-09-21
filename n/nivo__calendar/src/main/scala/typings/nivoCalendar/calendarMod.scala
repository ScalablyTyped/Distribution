package typings.nivoCalendar

import typings.nivoCalendar.anon.BboxBBox
import typings.nivoCalendar.anon.CalendarHeight
import typings.nivoCalendar.anon.Color
import typings.nivoCalendar.anon.Data
import typings.nivoCalendar.anon.Months
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPr
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPr0
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrColorScale
import typings.nivoCalendar.anon.PickRequiredCalendarSvgPrDirection
import typings.nivoCalendar.anon.Rotation
import typings.nivoCalendar.anon.X
import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCalendar.typesMod.CalendarDatum
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("@nivo/calendar/dist/types/compute/calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindDaysData(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPrColorScale): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindDaysData")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def computeDomain_auto(
    data: js.Array[CalendarDatum],
    minSpec: NonNullable[js.UndefOr[auto | Double]],
    maxSpec: NonNullable[js.UndefOr[auto | Double]]
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDomain")(data.asInstanceOf[js.Any], minSpec.asInstanceOf[js.Any], maxSpec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def computeLayout(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPr): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def computeMonthLegendPositions[Month /* <: BboxBBox */](hasMonthsDirectionPositionOffset: PickRequiredCalendarSvgPr0 & Months[Month]): js.Array[Month & X] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegendPositions")(hasMonthsDirectionPositionOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & X]]
  
  inline def computeYearLegendPositions(hasYearsDirectionPositionOffset: PickRequiredCalendarSvgPrDirection): js.Array[Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeYearLegendPositions")(hasYearsDirectionPositionOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rotation]]
}
