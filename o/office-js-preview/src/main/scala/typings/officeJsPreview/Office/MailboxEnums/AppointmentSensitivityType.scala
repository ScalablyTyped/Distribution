package typings.officeJsPreview.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentSensitivityType extends js.Object

/**
  * Specifies the sensitivity type of an appointment.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  *
  * @beta
  */
@JSGlobal("Office.MailboxEnums.AppointmentSensitivityType")
@js.native
object AppointmentSensitivityType extends js.Object {
  /**
    * Treat the item as confidential.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Confidential extends AppointmentSensitivityType
  
  /**
    * The item needs no special treatment.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Normal extends AppointmentSensitivityType
  
  /**
    * Treat the item as personal.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Personal extends AppointmentSensitivityType
  
  /**
    * Treat the item as private.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Private extends AppointmentSensitivityType
  
}

