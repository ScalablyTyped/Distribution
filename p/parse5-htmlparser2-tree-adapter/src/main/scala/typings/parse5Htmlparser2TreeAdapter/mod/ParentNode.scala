package typings.parse5Htmlparser2TreeAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter ParentNode interface.
  */
@js.native
trait ParentNode extends Node {
  /**
    * Same as {@link children}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var childNodes: js.Array[Node] = js.native
  /**
    * Child nodes.
    */
  var children: js.Array[Node] = js.native
  /**
    * First child of the node.
    */
  var firstChild: Node = js.native
  /**
    * Last child of the node.
    */
  var lastChild: Node = js.native
}

object ParentNode {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: String
  ): ParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentNode]
  }
  @scala.inline
  implicit class ParentNodeOps[Self <: ParentNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: Node*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Node]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: Node): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChild(value: Node): Self = this.set("lastChild", value.asInstanceOf[js.Any])
  }
  
}

