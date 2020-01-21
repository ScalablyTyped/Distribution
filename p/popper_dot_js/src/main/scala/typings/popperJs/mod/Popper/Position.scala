package typings.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.popperJs.popperJsStrings.top
  - typings.popperJs.popperJsStrings.right
  - typings.popperJs.popperJsStrings.bottom
  - typings.popperJs.popperJsStrings.left
*/
trait Position extends js.Object

object Position {
  @scala.inline
  def bottom: typings.popperJs.popperJsStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.popperJs.popperJsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.popperJs.popperJsStrings.right = this.cast("right")
  @scala.inline
  def top: typings.popperJs.popperJsStrings.top = this.cast("top")
}

