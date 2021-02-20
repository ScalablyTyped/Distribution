package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeNode extends StObject {
  
  /**
    * The name of the node. E.g. {@link Document} will have `nodeName` equal to '#document'`.
    */
  var nodeName: String = js.native
}
object DefaultTreeNode {
  
  @scala.inline
  def apply(nodeName: String): DefaultTreeNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeNode]
  }
  
  @scala.inline
  implicit class DefaultTreeNodeMutableBuilder[Self <: DefaultTreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
  }
}
