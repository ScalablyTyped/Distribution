package typings.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.popperJs.popperJsStrings.flip
  - typings.popperJs.popperJsStrings.clockwise
  - typings.popperJs.popperJsStrings.counterclockwise
*/
trait Behavior extends js.Object

object Behavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clockwise: typings.popperJs.popperJsStrings.clockwise = this.cast("clockwise")
  @scala.inline
  def counterclockwise: typings.popperJs.popperJsStrings.counterclockwise = this.cast("counterclockwise")
  @scala.inline
  def flip: typings.popperJs.popperJsStrings.flip = this.cast("flip")
}

