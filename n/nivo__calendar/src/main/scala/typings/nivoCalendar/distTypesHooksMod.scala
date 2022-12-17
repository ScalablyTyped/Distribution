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
import typings.nivoCalendar.distTypesTypesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/calendar/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCalendarLayout(param0: PickRequiredCalendarSvgPr): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useCalendarLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def useColorScale(param0: PickRequiredCalendarSvgPrColors): ColorScale = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScale")(param0.asInstanceOf[js.Any]).asInstanceOf[ColorScale]
  
  inline def useDays(param0: PickRequiredCalendarSvgPrData): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDays")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def useMonthLegends[Month /* <: BboxBBox */](param0: MonthLegendOffset[Month]): js.Array[Month & X] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMonthLegends")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & X]]
  
  inline def useYearLegends(param0: Direction): js.Array[Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useYearLegends")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rotation]]
}
