package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the inserted node that raised the nodeInserted event.
  */
@js.native
trait NodeInsertedEventArgs extends js.Object {
  
  /**
    * Gets whether the node was inserted as part of an Undo/Redo action by the user.
    */
  var isUndoRedo: Boolean = js.native
  
  /**
    * Gets the node that was just added to the CustomXMLPart object.
    *
    * Note that this node may have children, if a subtree was just added to the document.
    */
  var newNode: CustomXmlNode = js.native
}
object NodeInsertedEventArgs {
  
  @scala.inline
  def apply(isUndoRedo: Boolean, newNode: CustomXmlNode): NodeInsertedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInsertedEventArgs]
  }
  
  @scala.inline
  implicit class NodeInsertedEventArgsOps[Self <: NodeInsertedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setNewNode(value: CustomXmlNode): Self = this.set("newNode", value.asInstanceOf[js.Any])
  }
}
