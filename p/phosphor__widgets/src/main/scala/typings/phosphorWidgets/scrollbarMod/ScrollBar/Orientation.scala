package typings.phosphorWidgets.scrollbarMod.ScrollBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a scroll bar orientation.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorWidgets.phosphorWidgetsStrings.horizontal
  - typings.phosphorWidgets.phosphorWidgetsStrings.vertical
*/
trait Orientation extends js.Object

object Orientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.phosphorWidgets.phosphorWidgetsStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.phosphorWidgets.phosphorWidgetsStrings.vertical = this.cast("vertical")
}

