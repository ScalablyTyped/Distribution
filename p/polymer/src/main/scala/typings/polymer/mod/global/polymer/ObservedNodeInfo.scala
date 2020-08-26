package typings.polymer.mod.global.polymer

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservedNodeInfo extends js.Object {
  var addedNodes: js.Array[Node] = js.native
  var removedNode: js.Array[Node] = js.native
  var target: Node = js.native
}

object ObservedNodeInfo {
  @scala.inline
  def apply(addedNodes: js.Array[Node], removedNode: js.Array[Node], target: Node): ObservedNodeInfo = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNode = removedNode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservedNodeInfo]
  }
  @scala.inline
  implicit class ObservedNodeInfoOps[Self <: ObservedNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddedNodesVarargs(value: Node*): Self = this.set("addedNodes", js.Array(value :_*))
    @scala.inline
    def setAddedNodes(value: js.Array[Node]): Self = this.set("addedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedNodeVarargs(value: Node*): Self = this.set("removedNode", js.Array(value :_*))
    @scala.inline
    def setRemovedNode(value: js.Array[Node]): Self = this.set("removedNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Node): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

