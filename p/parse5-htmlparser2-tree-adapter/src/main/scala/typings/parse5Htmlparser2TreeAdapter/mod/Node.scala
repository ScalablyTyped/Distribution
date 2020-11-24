package typings.parse5Htmlparser2TreeAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * htmlparser2 tree adapter Node interface.
  */
@js.native
trait Node extends js.Object {
  
  /**
    * Next sibling.
    */
  var next: Node = js.native
  
  /**
    * Same as {@link next}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nextSibling: Node = js.native
  
  /**
    * [DOM spec](https://dom.spec.whatwg.org/#dom-node-nodetype)-compatible node {@link type}.
    */
  var nodeType: Double = js.native
  
  /**
    * Parent node.
    */
  var parent: ParentNode = js.native
  
  /**
    * Same as {@link parent}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var parentNode: ParentNode = js.native
  
  /**
    * Previous sibling.
    */
  var prev: Node = js.native
  
  /**
    * Same as {@link prev}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var previousSibling: Node = js.native
  
  /**
    * The type of the node. E.g. {@link Document} will have `type` equal to 'root'`.
    */
  var `type`: String = js.native
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
    def setNext(value: Node): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSibling(value: Node): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ParentNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: ParentNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: Node): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSibling(value: Node): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
