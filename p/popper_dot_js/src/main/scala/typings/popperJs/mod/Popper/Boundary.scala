package typings.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.popperJs.popperJsStrings.scrollParent
  - typings.popperJs.popperJsStrings.viewport
  - typings.popperJs.popperJsStrings.window
*/
trait Boundary extends js.Object

object Boundary {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scrollParent: typings.popperJs.popperJsStrings.scrollParent = this.cast("scrollParent")
  @scala.inline
  def viewport: typings.popperJs.popperJsStrings.viewport = this.cast("viewport")
  @scala.inline
  def window: typings.popperJs.popperJsStrings.window = this.cast("window")
}

