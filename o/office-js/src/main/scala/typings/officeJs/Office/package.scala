package typings.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Office {
  /**
    * The subclass of {@link Office.Item | Item} dealing with appointments.
    * 
    * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
    * You should treat this as a mode of Office.context.mailbox.item. Refer to the
    * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/requirement-set-1.8/office.context.mailbox.item | Object Model} page for more information.
    * 
    * Child interfaces:
    *
    * - {@link Office.AppointmentCompose | AppointmentCompose}
    * 
    * - {@link Office.AppointmentRead | AppointmentRead}
    */
  type Appointment = typings.officeJs.Office.Item
  /**
    * The compose mode of {@link Office.Item | Office.context.mailbox.item}.
    * 
    * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
    * You should treat this as a mode of Office.context.mailbox.item. Refer to the
    * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/requirement-set-1.8/office.context.mailbox.item | Object Model} page for more information.
    * 
    * Child interfaces:
    *
    * - {@link Office.AppointmentCompose | AppointmentCompose}
    * 
    * - {@link Office.MessageCompose | MessageCompose}
    */
  type ItemCompose = typings.officeJs.Office.Item
  /**
    * The read mode of {@link Office.Item | Office.context.mailbox.item}.
    * 
    * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
    * You should treat this as a mode of Office.context.mailbox.item. Refer to the
    * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/requirement-set-1.8/office.context.mailbox.item | Object Model} page for more information.
    * 
    * Child interfaces:
    *
    * - {@link Office.AppointmentRead | AppointmentRead}
    * 
    * - {@link Office.MessageRead | MessageRead}
    */
  type ItemRead = typings.officeJs.Office.Item
  /**
    * A subclass of {@link Office.Item | Item} for messages.
    * 
    * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
    * You should treat this as a mode of Office.context.mailbox.item. Refer to the
    * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/requirement-set-1.8/office.context.mailbox.item | Object Model} page for more information.
    * 
    * Child interfaces:
    *
    * - {@link Office.MessageCompose | MessageCompose}
    * 
    * - {@link Office.MessageRead | MessageRead}
    */
  type Message = typings.officeJs.Office.Item
  /**
    * Represents a bound text selection in the document.
    * 
    * The TextBinding object inherits the id property, type property, getDataAsync method, and setDataAsync method from the {@link Office.Binding} 
    * object. It does not implement any additional properties or methods of its own.
    */
  type TextBinding = typings.officeJs.Office.Binding
}
