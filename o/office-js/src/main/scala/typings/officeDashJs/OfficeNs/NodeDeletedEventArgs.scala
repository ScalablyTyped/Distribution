package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the deleted node that raised the nodeDeleted event.
  */
trait NodeDeletedEventArgs extends js.Object {
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
  @scala.inline
  def apply(isUndoRedo: Boolean, oldNextSibling: CustomXmlNode, oldNode: CustomXmlNode): NodeDeletedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo, oldNextSibling = oldNextSibling, oldNode = oldNode)
  
    __obj.asInstanceOf[NodeDeletedEventArgs]
  }
}

