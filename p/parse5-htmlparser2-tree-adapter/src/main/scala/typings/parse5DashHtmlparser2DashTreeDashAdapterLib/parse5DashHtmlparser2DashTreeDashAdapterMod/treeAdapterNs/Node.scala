package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

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
  var nodeType: scala.Double
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
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    next: Node,
    nextSibling: Node,
    nodeType: scala.Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: java.lang.String
  ): Node = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.asInstanceOf[Node]
  }
}

