package typings.officeDashJsDashPreview.Office

import typings.officeDashJsDashPreview.Office.MailboxEnums.AttachmentStatus
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.olkAttachmentsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsChangedEventArgs extends js.Object {
  /** 
    * Represents the set of attachments that were added or removed. 
    * For each such attachment, gets a subset of {@link AttachmentDetails} properties: `id`, `name`, `size`, and `attachmentType`.
    * 
    * [Api set: Mailbox Preview]
    */
  var attachmentDetails: js.Array[js.Object]
  /**
    * Gets whether the attachments were added or removed. See {@link MailboxEnums.AttachmentStatus} for details.
    * 
    * [Api set: Mailbox Preview]
    */ 
  var attachmentStatus: AttachmentStatus | String
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox Preview]
    */
  var `type`: olkAttachmentsChanged
}

object AttachmentsChangedEventArgs {
  @scala.inline
  def apply(
    attachmentDetails: js.Array[js.Object],
    attachmentStatus: AttachmentStatus | String,
    `type`: olkAttachmentsChanged
  ): AttachmentsChangedEventArgs = {
    val __obj = js.Dynamic.literal(attachmentDetails = attachmentDetails, attachmentStatus = attachmentStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttachmentsChangedEventArgs]
  }
}

