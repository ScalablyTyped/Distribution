package typings.phosphorWidgets.tabpanelMod.TabPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for tab placement in a tab bar.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorWidgets.phosphorWidgetsStrings.top
  - typings.phosphorWidgets.phosphorWidgetsStrings.left
  - typings.phosphorWidgets.phosphorWidgetsStrings.right
  - typings.phosphorWidgets.phosphorWidgetsStrings.bottom
*/
trait TabPlacement extends js.Object

object TabPlacement {
  @scala.inline
  def bottom: typings.phosphorWidgets.phosphorWidgetsStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.phosphorWidgets.phosphorWidgetsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.phosphorWidgets.phosphorWidgetsStrings.right = this.cast("right")
  @scala.inline
  def top: typings.phosphorWidgets.phosphorWidgetsStrings.top = this.cast("top")
}

