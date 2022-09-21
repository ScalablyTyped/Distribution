package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The subclass of {@link Office.Item | Item} dealing with appointments.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. For more information, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/preview-requirement-set/office.context.mailbox.item | Object Model} page.
  *
  * Child interfaces:
  *
  * - {@link Office.AppointmentCompose | AppointmentCompose}
  *
  * - {@link Office.AppointmentRead | AppointmentRead}
  */
type Appointment = Item

/**
  * The compose mode of {@link Office.Item | Office.context.mailbox.item}.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. For more information, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/preview-requirement-set/office.context.mailbox.item | Object Model} page.
  *
  * Child interfaces:
  *
  * - {@link Office.AppointmentCompose | AppointmentCompose}
  *
  * - {@link Office.MessageCompose | MessageCompose}
  */
type ItemCompose = Item

/**
  * The read mode of {@link Office.Item | Office.context.mailbox.item}.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. For more information, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/preview-requirement-set/office.context.mailbox.item | Object Model} page.
  *
  * Child interfaces:
  *
  * - {@link Office.AppointmentRead | AppointmentRead}
  *
  * - {@link Office.MessageRead | MessageRead}
  */
type ItemRead = Item

/**
  * A subclass of {@link Office.Item | Item} for messages.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. For more information, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/preview-requirement-set/office.context.mailbox.item | Object Model} page.
  *
  * Child interfaces:
  *
  * - {@link Office.MessageCompose | MessageCompose}
  *
  * - {@link Office.MessageRead | MessageRead}
  */
type Message = Item

/**
  * Represents a bound text selection in the document.
  *
  * The TextBinding object inherits the id property, type property, getDataAsync method, and setDataAsync method from the {@link Office.Binding}
  * object. It does not implement any additional properties or methods of its own.
  */
type TextBinding = Binding
