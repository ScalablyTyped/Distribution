package typings.nodeHtmlParser.commentMod

import typings.nodeHtmlParser.nodeMod.Node
import typings.nodeHtmlParser.typeMod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentNode extends Node {
  /**
    * Get unescaped text value of current node and its children.
    * @return {string} text content
    */
  @JSName("text")
  def text_MCommentNode: String = js.native
}

object CommentNode {
  @scala.inline
  def apply(childNodes: js.Array[Node], nodeType: NodeType, rawText: String, text: () => String): CommentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[CommentNode]
  }
  @scala.inline
  implicit class CommentNodeOps[Self <: CommentNode] (val x: Self) extends AnyVal {
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
    def setText(value: () => String): Self = this.set("text", js.Any.fromFunction0(value))
  }
  
}

