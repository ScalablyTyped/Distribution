package typings.parse5Htmlparser2TreeAdapter.mod

import typings.parse5.mod.Location
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter CommentNode interface.
  */
@js.native
trait CommentNode extends Node {
  /**
    * Comment text.
    */
  var data: String = js.native
  /**
    * The name of the node.
    */
  var name: comment = js.native
  /**
    * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nodeValue: String = js.native
  /**
    * Comment source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
}

object CommentNode {
  @scala.inline
  def apply(
    data: String,
    name: comment,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    nodeValue: String,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: String
  ): CommentNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: comment): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCodeLocation(value: Location): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
  }
  
}

