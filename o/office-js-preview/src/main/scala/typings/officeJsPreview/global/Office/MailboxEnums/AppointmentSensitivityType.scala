package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* "confidential" */ val Confidential: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Confidential with String = js.native
  /* "normal" */ val Normal: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Normal with String = js.native
  /* "personal" */ val Personal: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Personal with String = js.native
  /* "private" */ val Private: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Private with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType with String
  ] = js.native
}

