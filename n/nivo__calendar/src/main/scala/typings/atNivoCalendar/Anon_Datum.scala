package typings.atNivoCalendar

import typings.atNivoCalendar.atNivoCalendarMod.CalendarDayData
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.SVGRectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  def onClick(datum: CalendarDayData, event: MouseEvent[SVGRectElement, NativeMouseEvent]): Unit
}

object Anon_Datum {
  @scala.inline
  def apply(onClick: (CalendarDayData, MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Anon_Datum = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[Anon_Datum]
  }
}

