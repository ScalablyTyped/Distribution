package typings.nodeHtmlParser.nodeMod

import typings.nodeHtmlParser.typeMod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var childNodes: js.Array[Node] = js.native
  var nodeType: NodeType = js.native
  var rawText: String = js.native
  var text: String = js.native
}

object Node {
  @scala.inline
  def apply(childNodes: js.Array[Node], nodeType: NodeType, rawText: String, text: String): Node = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setChildNodesVarargs(value: Node*): Self = this.set("childNodes", js.Array(value :_*))
    @scala.inline
    def setChildNodes(value: js.Array[Node]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: NodeType): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawText(value: String): Self = this.set("rawText", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

