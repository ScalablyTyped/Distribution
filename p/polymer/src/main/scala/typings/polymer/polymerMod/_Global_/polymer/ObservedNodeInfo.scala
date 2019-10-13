package typings.polymer.polymerMod._Global_.polymer

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservedNodeInfo extends js.Object {
  var addedNodes: js.Array[Node]
  var removedNode: js.Array[Node]
  var target: Node
}

object ObservedNodeInfo {
  @scala.inline
  def apply(addedNodes: js.Array[Node], removedNode: js.Array[Node], target: Node): ObservedNodeInfo = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes, removedNode = removedNode, target = target)
  
    __obj.asInstanceOf[ObservedNodeInfo]
  }
}

