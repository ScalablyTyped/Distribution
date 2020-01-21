package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the replaced node that raised the nodeReplaced event.
  */
trait NodeReplacedEventArgs extends js.Object {
  /**
    * Gets whether the replaced node was inserted as part of an undo or redo operation by the user.
    */
  var isUndoRedo: Boolean
  /**
    * Gets the node that was just added to the CustomXMLPart object.
    * 
    * Note that this node may have children, if a subtree was just added to the document.
    */
  var newNode: CustomXmlNode
  /**
    * Gets the node which was just deleted (replaced) from the CustomXmlPart object.
    * 
    * Note that this node may have children, if a subtree is being removed from the document. Also, this node will be a "disconnected" node in 
    * that you can query down from the node, but you cannot query up the tree - the node appears to exist alone.
    */
  var oldNode: CustomXmlNode
}

object NodeReplacedEventArgs {
  @scala.inline
  def apply(isUndoRedo: Boolean, newNode: CustomXmlNode, oldNode: CustomXmlNode): NodeReplacedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], oldNode = oldNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeReplacedEventArgs]
  }
}

