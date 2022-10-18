package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the deleted node that raised the nodeDeleted event.
  */
trait NodeDeletedEventArgs extends StObject {
  
  /**
    * Gets whether the node was deleted as part of an Undo/Redo action by the user.
    */
  var isUndoRedo: Boolean
  
  /**
    * Gets the former next sibling of the node that was just deleted from the {@link Office.CustomXmlPart} object.
    */
  var oldNextSibling: CustomXmlNode
  
  /**
    * Gets the node which was just deleted from the {@link Office.CustomXmlPart} object.
    *
    * Note that this node may have children, if a subtree is being removed from the document. Also, this node will be a "disconnected" node in
    * that you can query down from the node, but you cannot query up the tree - the node appears to exist alone.
    */
  var oldNode: CustomXmlNode
}
object NodeDeletedEventArgs {
  
  inline def apply(isUndoRedo: Boolean, oldNextSibling: CustomXmlNode, oldNode: CustomXmlNode): NodeDeletedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], oldNextSibling = oldNextSibling.asInstanceOf[js.Any], oldNode = oldNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDeletedEventArgs]
  }
  
  extension [Self <: NodeDeletedEventArgs](x: Self) {
    
    inline def setIsUndoRedo(value: Boolean): Self = StObject.set(x, "isUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setOldNextSibling(value: CustomXmlNode): Self = StObject.set(x, "oldNextSibling", value.asInstanceOf[js.Any])
    
    inline def setOldNode(value: CustomXmlNode): Self = StObject.set(x, "oldNode", value.asInstanceOf[js.Any])
  }
}
