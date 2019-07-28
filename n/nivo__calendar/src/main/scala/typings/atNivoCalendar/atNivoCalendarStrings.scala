package typings.atNivoCalendar

import typings.atNivoCalendar.atNivoCalendarMod.CalendarDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoCalendarStrings {
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait horizontal extends CalendarDirection
  
  @js.native
  sealed trait vertical extends CalendarDirection
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

