package typings.nodeRed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeRed.nodeRedStrings.ring
  - typings.nodeRed.nodeRedStrings.dot
*/
trait StatusShape extends js.Object

object StatusShape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dot: typings.nodeRed.nodeRedStrings.dot = this.cast("dot")
  @scala.inline
  def ring: typings.nodeRed.nodeRedStrings.ring = this.cast("ring")
}

