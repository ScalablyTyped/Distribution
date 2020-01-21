package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item namespace is used to access the currently selected message, meeting request, or appointment. 
  * You can determine the type of the item by using the `itemType` property.
  *
  * If you want to see IntelliSense for only a specific type or mode, cast this item to one of the following:
  *
  * - {@link Office.Appointment | Appointment}
  * 
  * - {@link Office.AppointmentCompose | AppointmentCompose}
  * 
  * - {@link Office.AppointmentRead | AppointmentRead}
  * 
  * - {@link Office.Message | Message}
  * 
  * - {@link Office.MessageCompose | MessageCompose}
  * 
  * - {@link Office.MessageRead | MessageRead}
  * 
  * - {@link Office.ItemCompose | ItemCompose}
  * 
  * - {@link Office.ItemRead | ItemRead}
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait Item extends js.Object

