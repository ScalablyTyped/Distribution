package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the type of recurrence.
  *
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RecurrenceType")
@js.native
object RecurrenceType extends js.Object {
  /* "daily" */ val Daily: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Daily with String = js.native
  /* "monthly" */ val Monthly: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Monthly with String = js.native
  /* "weekday" */ val Weekday: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekday with String = js.native
  /* "weekly" */ val Weekly: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekly with String = js.native
  /* "yearly" */ val Yearly: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Yearly with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.RecurrenceType with String] = js.native
}

