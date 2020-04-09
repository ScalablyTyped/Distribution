package typings.notyf.notyfOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.notyf.notyfStrings.left
  - typings.notyf.notyfStrings.center
  - typings.notyf.notyfStrings.right
*/
trait NotyfHorizontalPosition extends js.Object

object NotyfHorizontalPosition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.notyf.notyfStrings.center = this.cast("center")
  @scala.inline
  def left: typings.notyf.notyfStrings.left = this.cast("left")
  @scala.inline
  def right: typings.notyf.notyfStrings.right = this.cast("right")
}

