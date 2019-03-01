package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservedNodeInfo extends js.Object {
  var addedNodes: js.Array[stdLib.Node]
  var removedNode: js.Array[stdLib.Node]
  var target: stdLib.Node
}

object ObservedNodeInfo {
  @scala.inline
  def apply(addedNodes: js.Array[stdLib.Node], removedNode: js.Array[stdLib.Node], target: stdLib.Node): ObservedNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addedNodes")(addedNodes)
    __obj.updateDynamic("removedNode")(removedNode)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ObservedNodeInfo]
  }
}

