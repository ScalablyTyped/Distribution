package typings.phosphorWidgets.tabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the selection behavior on tab insert.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorWidgets.phosphorWidgetsStrings.none
  - typings.phosphorWidgets.phosphorWidgetsStrings.`select-tab`
  - typings.phosphorWidgets.phosphorWidgetsStrings.`select-tab-if-needed`
*/
trait InsertBehavior extends js.Object

object InsertBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.phosphorWidgets.phosphorWidgetsStrings.none = this.cast("none")
  @scala.inline
  def `select-tab`: typings.phosphorWidgets.phosphorWidgetsStrings.`select-tab` = this.cast("select-tab")
  @scala.inline
  def `select-tab-if-needed`: typings.phosphorWidgets.phosphorWidgetsStrings.`select-tab-if-needed` = this.cast("select-tab-if-needed")
}

