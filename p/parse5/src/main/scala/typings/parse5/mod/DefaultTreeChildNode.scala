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
  
  @scala.inline
  def apply(nodeName: String, parentNode: DefaultTreeParentNode): DefaultTreeChildNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeChildNode]
  }
  
  @scala.inline
  implicit class DefaultTreeChildNodeMutableBuilder[Self <: DefaultTreeChildNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentNode(value: DefaultTreeParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
