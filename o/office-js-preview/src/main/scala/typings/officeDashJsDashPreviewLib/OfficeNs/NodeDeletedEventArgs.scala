package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the deleted node that raised the nodeDeleted event.
  * 
  * @remarks
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this interface is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this interface.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                       </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Word </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
  *  </table>
  */
trait NodeDeletedEventArgs extends js.Object {
  /**
    * Gets whether the node was deleted as part of an Undo/Redo action by the user.
    */
  var isUndoRedo: scala.Boolean
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
  def apply(isUndoRedo: scala.Boolean, oldNextSibling: CustomXmlNode, oldNode: CustomXmlNode): NodeDeletedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo, oldNextSibling = oldNextSibling, oldNode = oldNode)
  
    __obj.asInstanceOf[NodeDeletedEventArgs]
  }
}

