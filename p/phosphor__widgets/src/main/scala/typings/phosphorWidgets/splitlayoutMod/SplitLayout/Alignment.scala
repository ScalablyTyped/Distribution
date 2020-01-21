package typings.phosphorWidgets.splitlayoutMod.SplitLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a split layout alignment.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorWidgets.phosphorWidgetsStrings.start
  - typings.phosphorWidgets.phosphorWidgetsStrings.center
  - typings.phosphorWidgets.phosphorWidgetsStrings.end
  - typings.phosphorWidgets.phosphorWidgetsStrings.justify
*/
trait Alignment extends js.Object

object Alignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.phosphorWidgets.phosphorWidgetsStrings.center = this.cast("center")
  @scala.inline
  def end: typings.phosphorWidgets.phosphorWidgetsStrings.end = this.cast("end")
  @scala.inline
  def justify: typings.phosphorWidgets.phosphorWidgetsStrings.justify = this.cast("justify")
  @scala.inline
  def start: typings.phosphorWidgets.phosphorWidgetsStrings.start = this.cast("start")
}

