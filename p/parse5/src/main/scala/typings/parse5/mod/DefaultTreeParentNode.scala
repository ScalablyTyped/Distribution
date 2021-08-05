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
  
  inline def apply(childNodes: js.Array[DefaultTreeNode], nodeName: String): DefaultTreeParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeParentNode]
  }
  
  extension [Self <: DefaultTreeParentNode](x: Self) {
    
    inline def setChildNodes(value: js.Array[DefaultTreeNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildNodesVarargs(value: DefaultTreeNode*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
  }
}
