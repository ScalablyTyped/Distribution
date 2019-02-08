package typings
package officeDashJsDashPreviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OfficeNs {
  /**
    * The subclass of {@link Office.Item} dealing with appointments.
    * 
    * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
    * You should treat this as a mode of Office.context.mailbox.item. Refer to the
    * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item | Object Model} page for more information.
    */
  type Appointment = Item
  /**
    * Represents a bound text selection in the document.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>TextBindings</td></tr></table>
    *
    * The TextBinding object inherits the id property, type property, getDataAsync method, and setDataAsync method from the {@link Office.Binding} 
    * object. It does not implement any additional properties or methods of its own.
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
    *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Excel </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    */
  type TextBinding = Binding
}
