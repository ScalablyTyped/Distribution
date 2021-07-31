package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTreeParentNode
  extends StObject
     with DefaultTreeNode {
  
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode]
}
object DefaultTreeParentNode {
  
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: String): DefaultTreeParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeParentNode]
  }
  
  @scala.inline
  implicit class DefaultTreeParentNodeMutableBuilder[Self <: DefaultTreeParentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildNodes(value: js.Array[DefaultTreeNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesVarargs(value: DefaultTreeNode*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
  }
}
