package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the content of an attachment on a message or appointment item.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
trait AttachmentContent extends js.Object {
  /**
    * The content of an attachment as a string.
    */
  var content: java.lang.String
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
  var format: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat
}

object AttachmentContent {
  @scala.inline
  def apply(
    content: java.lang.String,
    format: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat
  ): AttachmentContent = {
    val __obj = js.Dynamic.literal(content = content, format = format)
  
    __obj.asInstanceOf[AttachmentContent]
  }
}

