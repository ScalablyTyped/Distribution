package typings.atNivoCalendar

import typings.atNivoCalendar.Anon_Align
import typings.atNivoCalendar.Anon_Datum
import typings.atNivoCalendar.Anon_ItemCount
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoCalendarMod {
  type CalendarCommonProps = Partial[Anon_Align]
  type CalendarLegend = LegendProps with Anon_ItemCount
  type CalendarSvgProps = CalendarData with CalendarCommonProps with Partial[Anon_Datum]
  type DateOrString = String | Date
}
