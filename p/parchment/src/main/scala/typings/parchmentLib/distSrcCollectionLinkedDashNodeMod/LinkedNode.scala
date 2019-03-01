package typings
package parchmentLib.distSrcCollectionLinkedDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedNode extends js.Object {
  var next: LinkedNode | scala.Null
  var prev: LinkedNode | scala.Null
  def length(): scala.Double
}

object LinkedNode {
  @scala.inline
  def apply(length: js.Function0[scala.Double], next: LinkedNode = null, prev: LinkedNode = null): LinkedNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[LinkedNode]
  }
}

