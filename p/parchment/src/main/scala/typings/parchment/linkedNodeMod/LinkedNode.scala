package typings.parchment.linkedNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedNode extends js.Object {
  var next: LinkedNode | Null
  var prev: LinkedNode | Null
  def length(): Double
}

object LinkedNode {
  @scala.inline
  def apply(length: () => Double, next: LinkedNode = null, prev: LinkedNode = null): LinkedNode = {
    val __obj = js.Dynamic.literal(length = js.Any.fromFunction0(length), next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedNode]
  }
}

