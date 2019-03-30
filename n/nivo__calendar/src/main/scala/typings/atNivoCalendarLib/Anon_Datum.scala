package typings
package atNivoCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  def onClick(
    datum: atNivoCalendarLib.atNivoCalendarMod.CalendarDayData,
    event: reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGRectElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object Anon_Datum {
  @scala.inline
  def apply(
    onClick: (atNivoCalendarLib.atNivoCalendarMod.CalendarDayData, reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGRectElement, reactLib.NativeMouseEvent]) => scala.Unit
  ): Anon_Datum = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[Anon_Datum]
  }
}

