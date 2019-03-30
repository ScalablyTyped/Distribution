package typings
package atNivoCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoCalendarLibStrings {
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait horizontal
    extends atNivoCalendarLib.atNivoCalendarMod.CalendarDirection
  
  @js.native
  sealed trait vertical
    extends atNivoCalendarLib.atNivoCalendarMod.CalendarDirection
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

