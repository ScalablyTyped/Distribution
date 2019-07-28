package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentContentFormat extends js.Object

/**
  * Specifies the formatting that applies to an attachment's content.
  * 
  * [Api set: Mailbox Preview]
  * 
  * @remarks
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
@JSGlobal("Office.MailboxEnums.AttachmentContentFormat")
@js.native
object AttachmentContentFormat extends js.Object {
  /**
    * The content of the attachment is returned as a base64-encoded string.
    */
  @js.native
  sealed trait Base64 extends AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing an .eml formatted file.
    */
  @js.native
  sealed trait Eml extends AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing an .icalendar formatted file.
    */
  @js.native
  sealed trait ICalendar extends AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing a URL.
    */
  @js.native
  sealed trait Url extends AttachmentContentFormat
  
  /* "base64" */ val Base64: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.AttachmentContentFormat.Base64 with String = js.native
  /* "eml" */ val Eml: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.AttachmentContentFormat.Eml with String = js.native
  /* "iCalendar" */ val ICalendar: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.AttachmentContentFormat.ICalendar with String = js.native
  /* "url" */ val Url: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.AttachmentContentFormat.Url with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentContentFormat with String] = js.native
}

