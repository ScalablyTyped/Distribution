package typings.popperJs.mod.Popper

import typings.std.ClientRect
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject extends js.Object {
  var clientHeight: Double
  var clientWidth: Double
  var referenceNode: js.UndefOr[Node] = js.undefined
  def getBoundingClientRect(): ClientRect
}

object ReferenceObject {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    getBoundingClientRect: () => ClientRect,
    referenceNode: Node = null
  ): ReferenceObject = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    if (referenceNode != null) __obj.updateDynamic("referenceNode")(referenceNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
}

