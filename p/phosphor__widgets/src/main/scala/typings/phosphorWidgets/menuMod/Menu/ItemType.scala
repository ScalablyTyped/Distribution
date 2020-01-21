package typings.phosphorWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a menu item type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorWidgets.phosphorWidgetsStrings.command
  - typings.phosphorWidgets.phosphorWidgetsStrings.submenu
  - typings.phosphorWidgets.phosphorWidgetsStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typings.phosphorWidgets.phosphorWidgetsStrings.command = this.cast("command")
  @scala.inline
  def separator: typings.phosphorWidgets.phosphorWidgetsStrings.separator = this.cast("separator")
  @scala.inline
  def submenu: typings.phosphorWidgets.phosphorWidgetsStrings.submenu = this.cast("submenu")
}

