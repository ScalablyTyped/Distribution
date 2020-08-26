package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.AttachmentStatus
import typings.officeJsPreview.officeJsPreviewStrings.olkAttachmentsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsChangedEventArgs extends js.Object {
  /**
    * Represents the set of attachments that were added or removed.
    * For each such attachment, gets `id`, `name`, `size`, and `attachmentType` properties.
    *
    * [Api set: Mailbox 1.8]
    */
  var attachmentDetails: js.Array[js.Object] = js.native
  /**
    * Gets whether the attachments were added or removed. See {@link Office.MailboxEnums.AttachmentStatus | MailboxEnums.AttachmentStatus} for details.
    *
    * [Api set: Mailbox 1.8]
    */
  var attachmentStatus: AttachmentStatus | String = js.native
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    *
    * [Api set: Mailbox 1.8]
    */
  var `type`: olkAttachmentsChanged = js.native
}

object AttachmentsChangedEventArgs {
  @scala.inline
  def apply(
    attachmentDetails: js.Array[js.Object],
    attachmentStatus: AttachmentStatus | String,
    `type`: olkAttachmentsChanged
  ): AttachmentsChangedEventArgs = {
    val __obj = js.Dynamic.literal(attachmentDetails = attachmentDetails.asInstanceOf[js.Any], attachmentStatus = attachmentStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsChangedEventArgs]
  }
  @scala.inline
  implicit class AttachmentsChangedEventArgsOps[Self <: AttachmentsChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setAttachmentDetailsVarargs(value: js.Object*): Self = this.set("attachmentDetails", js.Array(value :_*))
    @scala.inline
    def setAttachmentDetails(value: js.Array[js.Object]): Self = this.set("attachmentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentStatus(value: AttachmentStatus | String): Self = this.set("attachmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: olkAttachmentsChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

