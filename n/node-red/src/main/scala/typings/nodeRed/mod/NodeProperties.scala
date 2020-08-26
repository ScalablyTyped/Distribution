package typings.nodeRed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProperties extends js.Object {
  /** This node's unique identifier. */
  var id: NodeId = js.native
  /**
    * The UI visible name for this node. Many nodes
    * allow the user to pick the name and provide
    * a fallback name, if they leave it blank.
    */
  var name: String = js.native
  /** The type name for this node. */
  var `type`: NodeType = js.native
}

object NodeProperties {
  @scala.inline
  def apply(id: NodeId, name: String, `type`: NodeType): NodeProperties = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  implicit class NodePropertiesOps[Self <: NodeProperties] (val x: Self) extends AnyVal {
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
    def setId(value: NodeId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NodeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

