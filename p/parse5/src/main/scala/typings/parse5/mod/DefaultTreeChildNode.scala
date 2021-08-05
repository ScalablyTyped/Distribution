package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTreeChildNode
  extends StObject
     with DefaultTreeNode {
  
  /**
    * Parent node.
    */
  var parentNode: DefaultTreeParentNode
}
object DefaultTreeChildNode {
  
  inline def apply(nodeName: String, parentNode: DefaultTreeParentNode): DefaultTreeChildNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeChildNode]
  }
  
  extension [Self <: DefaultTreeChildNode](x: Self) {
    
    inline def setParentNode(value: DefaultTreeParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
