package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the inserted node that raised the nodeInserted event.
  */
trait NodeInsertedEventArgs extends js.Object {
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
  @scala.inline
  def apply(isUndoRedo: Boolean, newNode: CustomXmlNode): NodeInsertedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeInsertedEventArgs]
  }
}

