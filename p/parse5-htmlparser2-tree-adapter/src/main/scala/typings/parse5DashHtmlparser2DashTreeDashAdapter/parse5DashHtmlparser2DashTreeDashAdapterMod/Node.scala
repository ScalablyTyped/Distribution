package typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter Node interface.
  */
trait Node extends js.Object {
  /**
    * Next sibling.
    */
  var next: Node
  /**
    * Same as {@link next}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nextSibling: Node
  /**
    * [DOM spec](https://dom.spec.whatwg.org/#dom-node-nodetype)-compatible node {@link type}.
    */
  var nodeType: Double
  /**
    * Parent node.
    */
  var parent: ParentNode
  /**
    * Same as {@link parent}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var parentNode: ParentNode
  /**
    * Previous sibling.
    */
  var prev: Node
  /**
    * Same as {@link prev}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var previousSibling: Node
  /**
    * The type of the node. E.g. {@link Document} will have `type` equal to 'root'`.
    */
  var `type`: String
}

object Node {
  @scala.inline
  def apply(
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: String
  ): Node = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

