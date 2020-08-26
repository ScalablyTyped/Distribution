package typings.nodeHtmlParser.textMod

import typings.nodeHtmlParser.nodeMod.Node
import typings.nodeHtmlParser.typeMod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextNode extends Node {
  /**
    * Detect if the node contains only white space.
    * @return {bool}
    */
  def isWhitespace: Boolean = js.native
  /**
    * Get unescaped text value of current node and its children.
    * @return {string} text content
    */
  @JSName("text")
  def text_MTextNode: String = js.native
}

object TextNode {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    isWhitespace: () => Boolean,
    nodeType: NodeType,
    rawText: String,
    text: () => String
  ): TextNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], isWhitespace = js.Any.fromFunction0(isWhitespace), nodeType = nodeType.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[TextNode]
  }
  @scala.inline
  implicit class TextNodeOps[Self <: TextNode] (val x: Self) extends AnyVal {
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
    def setIsWhitespace(value: () => Boolean): Self = this.set("isWhitespace", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: () => String): Self = this.set("text", js.Any.fromFunction0(value))
  }
  
}

