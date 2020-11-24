package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the deleted node that raised the nodeDeleted event.
  */
@js.native
trait NodeDeletedEventArgs extends js.Object {
  
  /**
    * Gets whether the node was deleted as part of an Undo/Redo action by the user.
    */
  var isUndoRedo: Boolean = js.native
  
  /**
    * Gets the former next sibling of the node that was just deleted from the {@link Office.CustomXmlPart} object.
    */
  var oldNextSibling: CustomXmlNode = js.native
  
  /**
    * Gets the node which was just deleted from the {@link Office.CustomXmlPart} object.
    *
    * Note that this node may have children, if a subtree is being removed from the document. Also, this node will be a "disconnected" node in
    * that you can query down from the node, but you cannot query up the tree - the node appears to exist alone.
    */
  var oldNode: CustomXmlNode = js.native
}
object NodeDeletedEventArgs {
  
  @scala.inline
  def apply(isUndoRedo: Boolean, oldNextSibling: CustomXmlNode, oldNode: CustomXmlNode): NodeDeletedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], oldNextSibling = oldNextSibling.asInstanceOf[js.Any], oldNode = oldNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDeletedEventArgs]
  }
  
  @scala.inline
  implicit class NodeDeletedEventArgsOps[Self <: NodeDeletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsUndoRedo(value: Boolean): Self = this.set("isUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldNextSibling(value: CustomXmlNode): Self = this.set("oldNextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldNode(value: CustomXmlNode): Self = this.set("oldNode", value.asInstanceOf[js.Any])
  }
}
