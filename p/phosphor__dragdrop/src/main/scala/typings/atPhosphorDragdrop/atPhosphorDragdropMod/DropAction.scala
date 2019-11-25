package typings.atPhosphorDragdrop.atPhosphorDragdropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorDragdrop.atPhosphorDragdropStrings.none
  - typings.atPhosphorDragdrop.atPhosphorDragdropStrings.copy
  - typings.atPhosphorDragdrop.atPhosphorDragdropStrings.link
  - typings.atPhosphorDragdrop.atPhosphorDragdropStrings.move
*/
trait DropAction extends js.Object

object DropAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def copy: typings.atPhosphorDragdrop.atPhosphorDragdropStrings.copy = this.cast("copy")
  @scala.inline
  def link: typings.atPhosphorDragdrop.atPhosphorDragdropStrings.link = this.cast("link")
  @scala.inline
  def move: typings.atPhosphorDragdrop.atPhosphorDragdropStrings.move = this.cast("move")
  @scala.inline
  def none: typings.atPhosphorDragdrop.atPhosphorDragdropStrings.none = this.cast("none")
}

