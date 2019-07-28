package typings.officeDashJsDashPreview

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
    * The TextBinding object inherits the id property, type property, getDataAsync method, and setDataAsync method from the {@link Office.Binding} 
    * object. It does not implement any additional properties or methods of its own.
    */
  type TextBinding = Binding
}
