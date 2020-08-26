package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeNode extends js.Object {
  /**
    * The name of the node. E.g. {@link Document} will have `nodeName` equal to '#document'`.
    */
  var nodeName: String = js.native
}

object DefaultTreeNode {
  @scala.inline
  def apply(nodeName: String): DefaultTreeNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeNode]
  }
  @scala.inline
  implicit class DefaultTreeNodeOps[Self <: DefaultTreeNode] (val x: Self) extends AnyVal {
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
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
  }
  
}

