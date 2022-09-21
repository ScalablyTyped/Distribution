package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The item namespace is used to access the currently selected message, meeting request, or appointment. 
  * You can determine the type of the item by using the `itemType` property.
  *
  * To see the full member list, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item | Object Model} page.
  *
  * If you want to see IntelliSense for only a specific type or mode, cast this item to one of the following:
  *
  * - {@link Office.AppointmentCompose | AppointmentCompose}
  * 
  * - {@link Office.AppointmentRead | AppointmentRead}
  * 
  * - {@link Office.MessageCompose | MessageCompose}
  * 
  * - {@link Office.MessageRead | MessageRead}
  *
  * @remarks
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer, Appointment Attendee, Message Compose, Message Read
  */
trait Item extends StObject
