package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the inserted node that raised the nodeInserted event.
  */
trait NodeInsertedEventArgs extends StObject {
  
  /**
    * Gets whether the node was inserted as part of an Undo/Redo action by the user.
    */
  var isUndoRedo: Boolean
  
  /**
    * Gets the node that was just added to the CustomXMLPart object.
    *
    * Note that this node may have children, if a subtree was just added to the document.
    */
  var newNode: CustomXmlNode
}
object NodeInsertedEventArgs {
  
  inline def apply(isUndoRedo: Boolean, newNode: CustomXmlNode): NodeInsertedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInsertedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeInsertedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIsUndoRedo(value: Boolean): Self = StObject.set(x, "isUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setNewNode(value: CustomXmlNode): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
  }
}
