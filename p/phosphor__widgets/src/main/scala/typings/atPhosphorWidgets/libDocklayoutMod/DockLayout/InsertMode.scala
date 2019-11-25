package typings.atPhosphorWidgets.libDocklayoutMod.DockLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported insertion modes.
  *
  * An insert mode is used to specify how a widget should be added
  * to the dock layout relative to a reference widget.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-top`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-left`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-right`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-bottom`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`tab-before`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`tab-after`
*/
trait InsertMode extends js.Object

object InsertMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `split-bottom`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-bottom` = this.cast("split-bottom")
  @scala.inline
  def `split-left`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-left` = this.cast("split-left")
  @scala.inline
  def `split-right`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-right` = this.cast("split-right")
  @scala.inline
  def `split-top`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-top` = this.cast("split-top")
  @scala.inline
  def `tab-after`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`tab-after` = this.cast("tab-after")
  @scala.inline
  def `tab-before`: typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`tab-before` = this.cast("tab-before")
}

