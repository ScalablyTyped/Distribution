package typings.node.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeNumbers.`-1`
  - typings.node.nodeNumbers.`0`
  - typings.node.nodeNumbers.`1`
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def `-1`: typings.node.nodeNumbers.`-1` = this.cast(-1)
  @scala.inline
  def `0`: typings.node.nodeNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typings.node.nodeNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

