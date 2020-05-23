package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an entity's type.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.EntityType")
@js.native
object EntityType extends js.Object {
  /* "address" */ val Address: typings.officeJsPreview.Office.MailboxEnums.EntityType.Address with String = js.native
  /* "contact" */ val Contact: typings.officeJsPreview.Office.MailboxEnums.EntityType.Contact with String = js.native
  /* "emailAddress" */ val EmailAddress: typings.officeJsPreview.Office.MailboxEnums.EntityType.EmailAddress with String = js.native
  /* "meetingSuggestion" */ val MeetingSuggestion: typings.officeJsPreview.Office.MailboxEnums.EntityType.MeetingSuggestion with String = js.native
  /* "phoneNumber" */ val PhoneNumber: typings.officeJsPreview.Office.MailboxEnums.EntityType.PhoneNumber with String = js.native
  /* "taskSuggestion" */ val TaskSuggestion: typings.officeJsPreview.Office.MailboxEnums.EntityType.TaskSuggestion with String = js.native
  /* "url" */ val Url: typings.officeJsPreview.Office.MailboxEnums.EntityType.Url with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.EntityType with String] = js.native
}

