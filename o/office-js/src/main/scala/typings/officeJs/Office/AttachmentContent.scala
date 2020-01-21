package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.AttachmentContentFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the content of an attachment on a message or appointment item.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait AttachmentContent extends js.Object {
  /**
    * The content of an attachment as a string.
    */
  var content: String
  /**
    * The string format to use for an attachment's content.
    * 
    * For file attachments, the formatting is a base64-encoded string.
    * 
    * For item attachments that represent messages, the formatting is a string representing an .eml formatted file.
    * 
    * For item attachments that represent calendar items, the formatting is a string representing an .icalendar file.
    * 
    * For cloud attachments, the formatting is a URL string.
    */
  var format: AttachmentContentFormat | String
}

object AttachmentContent {
  @scala.inline
  def apply(content: String, format: AttachmentContentFormat | String): AttachmentContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachmentContent]
  }
}

