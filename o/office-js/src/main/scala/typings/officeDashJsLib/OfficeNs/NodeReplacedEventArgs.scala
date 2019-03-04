package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the replaced node that raised the nodeReplaced event.
  * 
  * @remarks
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
trait NodeReplacedEventArgs extends js.Object {
  /**
    * Gets whether the replaced node was inserted as part of an undo or redo operation by the user.
    */
  var isUndoRedo: scala.Boolean
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
  def apply(isUndoRedo: scala.Boolean, newNode: CustomXmlNode, oldNode: CustomXmlNode): NodeReplacedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo, newNode = newNode, oldNode = oldNode)
  
    __obj.asInstanceOf[NodeReplacedEventArgs]
  }
}

