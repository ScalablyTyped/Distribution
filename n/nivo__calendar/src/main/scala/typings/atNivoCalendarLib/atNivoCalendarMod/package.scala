package typings
package atNivoCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoCalendarMod {
  type CalendarCommonProps = stdLib.Partial[atNivoCalendarLib.Anon_Align]
  type CalendarLegend = atNivoLegendsLib.atNivoLegendsMod.LegendProps with atNivoCalendarLib.Anon_ItemCount
  type CalendarSvgProps = CalendarData with CalendarCommonProps with stdLib.Partial[atNivoCalendarLib.Anon_Datum]
  type DateOrString = java.lang.String | stdLib.Date
}
