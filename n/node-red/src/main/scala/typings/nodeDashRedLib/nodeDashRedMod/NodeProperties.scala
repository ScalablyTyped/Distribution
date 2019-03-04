package typings
package nodeDashRedLib.nodeDashRedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProperties extends js.Object {
  /** This node's unique identifier. */
  var id: NodeId
  /**
    * The UI visible name for this node. Many nodes
    * allow the user to pick the name and provide
    * a fallback name, if they leave it blank.
    */
  var name: java.lang.String
  /** The type name for this node. */
  var `type`: NodeType
}

object NodeProperties {
  @scala.inline
  def apply(id: NodeId, name: java.lang.String, `type`: NodeType): NodeProperties = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeProperties]
  }
}

