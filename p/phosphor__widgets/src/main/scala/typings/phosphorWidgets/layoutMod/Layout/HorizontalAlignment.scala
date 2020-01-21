package typings.phosphorWidgets.layoutMod.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the horizontal alignment of a widget.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorWidgets.phosphorWidgetsStrings.left
  - typings.phosphorWidgets.phosphorWidgetsStrings.center
  - typings.phosphorWidgets.phosphorWidgetsStrings.right
*/
trait HorizontalAlignment extends js.Object

object HorizontalAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.phosphorWidgets.phosphorWidgetsStrings.center = this.cast("center")
  @scala.inline
  def left: typings.phosphorWidgets.phosphorWidgetsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.phosphorWidgets.phosphorWidgetsStrings.right = this.cast("right")
}

