package typings.atPhosphorWidgets.libMenuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a menu item type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.command
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.submenu
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.command = this.cast("command")
  @scala.inline
  def separator: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.separator = this.cast("separator")
  @scala.inline
  def submenu: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.submenu = this.cast("submenu")
}

