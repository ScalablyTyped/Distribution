package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the inserted node that raised the nodeInserted event.
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isUndoRedo")(isUndoRedo)
    __obj.updateDynamic("newNode")(newNode)
    __obj.asInstanceOf[NodeInsertedEventArgs]
  }
}

