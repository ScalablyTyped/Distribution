package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeParentNode extends DefaultTreeNode {
  
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode] = js.native
}
object DefaultTreeParentNode {
  
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: String): DefaultTreeParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeParentNode]
  }
  
  @scala.inline
  implicit class DefaultTreeParentNodeOps[Self <: DefaultTreeParentNode] (val x: Self) extends AnyVal {
    
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
    def setChildNodesVarargs(value: DefaultTreeNode*): Self = this.set("childNodes", js.Array(value :_*))
    
    @scala.inline
    def setChildNodes(value: js.Array[DefaultTreeNode]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
  }
}
