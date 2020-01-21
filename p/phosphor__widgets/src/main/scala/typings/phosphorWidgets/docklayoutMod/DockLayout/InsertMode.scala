package typings.phosphorWidgets.docklayoutMod.DockLayout

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
  - typings.phosphorWidgets.phosphorWidgetsStrings.`split-top`
  - typings.phosphorWidgets.phosphorWidgetsStrings.`split-left`
  - typings.phosphorWidgets.phosphorWidgetsStrings.`split-right`
  - typings.phosphorWidgets.phosphorWidgetsStrings.`split-bottom`
  - typings.phosphorWidgets.phosphorWidgetsStrings.`tab-before`
  - typings.phosphorWidgets.phosphorWidgetsStrings.`tab-after`
*/
trait InsertMode extends js.Object

object InsertMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `split-bottom`: typings.phosphorWidgets.phosphorWidgetsStrings.`split-bottom` = this.cast("split-bottom")
  @scala.inline
  def `split-left`: typings.phosphorWidgets.phosphorWidgetsStrings.`split-left` = this.cast("split-left")
  @scala.inline
  def `split-right`: typings.phosphorWidgets.phosphorWidgetsStrings.`split-right` = this.cast("split-right")
  @scala.inline
  def `split-top`: typings.phosphorWidgets.phosphorWidgetsStrings.`split-top` = this.cast("split-top")
  @scala.inline
  def `tab-after`: typings.phosphorWidgets.phosphorWidgetsStrings.`tab-after` = this.cast("tab-after")
  @scala.inline
  def `tab-before`: typings.phosphorWidgets.phosphorWidgetsStrings.`tab-before` = this.cast("tab-before")
}

