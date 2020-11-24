package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.AttachmentContentFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the content of an attachment on a message or appointment item.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait AttachmentContent extends js.Object {
  
  /**
    * The content of an attachment as a string.
    */
  var content: String = js.native
  
  /**
    * The string format to use for an attachment's content.
    * 
    * For file attachments, the formatting is a base64-encoded string.
    * 
    * For item attachments that represent messages and were attached by drag-and-drop or "Attach Item",
    * the formatting is a string representing an .eml formatted file.
    * **Important**: If a message item was attached by drag-and-drop in Outlook on the web, then `getAttachmentContentAsync` throws an error.
    * 
    * For item attachments that represent calendar items and were attached by drag-and-drop or "Attach Item",
    * the formatting is a string representing an .icalendar file.
    * **Important**: If a calendar item was attached by drag-and-drop in Outlook on the web, then `getAttachmentContentAsync` throws an error.
    * 
    * For cloud attachments, the formatting is a URL string.
    */
  var format: AttachmentContentFormat | String = js.native
}
object AttachmentContent {
  
  @scala.inline
  def apply(content: String, format: AttachmentContentFormat | String): AttachmentContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentContent]
  }
  
  @scala.inline
  implicit class AttachmentContentOps[Self <: AttachmentContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: AttachmentContentFormat | String): Self = this.set("format", value.asInstanceOf[js.Any])
  }
}
