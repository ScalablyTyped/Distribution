package typings.parse5Htmlparser2TreeAdapter.mod

import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter DocumentFragment interface.
  */
@js.native
trait DocumentFragment extends ParentNode {
  /**
    * The name of the node.
    */
  var name: root = js.native
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_DocumentFragment: root = js.native
}

object DocumentFragment {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: root,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: root
  ): DocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFragment]
  }
  @scala.inline
  implicit class DocumentFragmentOps[Self <: DocumentFragment] (val x: Self) extends AnyVal {
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
    def setName(value: root): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: root): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

