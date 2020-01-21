package typings.phosphorDragdrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.phosphorDragdrop.phosphorDragdropStrings.none
  - typings.phosphorDragdrop.phosphorDragdropStrings.copy
  - typings.phosphorDragdrop.phosphorDragdropStrings.link
  - typings.phosphorDragdrop.phosphorDragdropStrings.move
*/
trait DropAction extends js.Object

object DropAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def copy: typings.phosphorDragdrop.phosphorDragdropStrings.copy = this.cast("copy")
  @scala.inline
  def link: typings.phosphorDragdrop.phosphorDragdropStrings.link = this.cast("link")
  @scala.inline
  def move: typings.phosphorDragdrop.phosphorDragdropStrings.move = this.cast("move")
  @scala.inline
  def none: typings.phosphorDragdrop.phosphorDragdropStrings.none = this.cast("none")
}

