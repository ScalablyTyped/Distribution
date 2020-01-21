package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentContentFormat extends js.Object

/**
  * Specifies the formatting that applies to an attachment's content.
  * 
  * [Api set: Mailbox 1.8]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentContentFormat with String] = js.native
  /* "base64" */ @js.native
  object Base64 extends TopLevel[Base64 with String]
  
  /* "eml" */ @js.native
  object Eml extends TopLevel[Eml with String]
  
  /* "iCalendar" */ @js.native
  object ICalendar extends TopLevel[ICalendar with String]
  
  /* "url" */ @js.native
  object Url extends TopLevel[Url with String]
  
}

