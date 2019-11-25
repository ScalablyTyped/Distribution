package typings.atPhosphorWidgets.libTabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the selection behavior on tab remove.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.none
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`select-tab-after`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`select-tab-before`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`select-previous-tab`
*/
trait RemoveBehavior extends js.Object

object RemoveBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.none = this.cast("none")
  @scala.inline
  def `select-previous-tab`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`select-previous-tab` = this.cast("select-previous-tab")
  @scala.inline
  def `select-tab-after`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`select-tab-after` = this.cast("select-tab-after")
  @scala.inline
  def `select-tab-before`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`select-tab-before` = this.cast("select-tab-before")
}

