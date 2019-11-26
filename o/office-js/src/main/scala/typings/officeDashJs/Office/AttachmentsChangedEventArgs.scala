package typings.officeDashJs.Office

import typings.officeDashJs.Office.MailboxEnums.AttachmentStatus
import typings.officeDashJs.officeDashJsStrings.olkAttachmentsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsChangedEventArgs extends js.Object {
  /** 
    * Represents the set of attachments that were added or removed. 
    * For each such attachment, gets a subset of {@link Office.AttachmentDetails | AttachmentDetails} properties: `id`, `name`, `size`, and `attachmentType`.
    * 
    * [Api set: Mailbox 1.8]
    */
  var attachmentDetails: js.Array[js.Object]
  /**
    * Gets whether the attachments were added or removed. See {@link Office.MailboxEnums.AttachmentStatus | MailboxEnums.AttachmentStatus} for details.
    * 
    * [Api set: Mailbox 1.8]
    */ 
  var attachmentStatus: AttachmentStatus | String
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox 1.8]
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
    val __obj = js.Dynamic.literal(attachmentDetails = attachmentDetails.asInstanceOf[js.Any], attachmentStatus = attachmentStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsChangedEventArgs]
  }
}

