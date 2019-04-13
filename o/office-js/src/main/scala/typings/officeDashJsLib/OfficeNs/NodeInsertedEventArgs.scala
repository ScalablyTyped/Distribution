package typings
package officeDashJsLib.OfficeNs

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
  var isUndoRedo: scala.Boolean
  /**
    * Gets the node that was just added to the CustomXMLPart object.
    * 
    * Note that this node may have children, if a subtree was just added to the document.
    */
  var newNode: CustomXmlNode
}

object NodeInsertedEventArgs {
  @scala.inline
  def apply(isUndoRedo: scala.Boolean, newNode: CustomXmlNode): NodeInsertedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo, newNode = newNode)
  
    __obj.asInstanceOf[NodeInsertedEventArgs]
  }
}

