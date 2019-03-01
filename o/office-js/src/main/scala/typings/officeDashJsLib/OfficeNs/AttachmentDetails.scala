package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an attachment on an item from the server. Read mode only.
  *
  * An array of **AttachmentDetails** objects is returned as the attachments property of an appointment or message item.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait AttachmentDetails extends js.Object {
  /**
    * Gets a value that indicates the type of an attachment.
    */
  var attachmentType: officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentType
  /**
    * Gets the MIME content type of the attachment.
    */
  var contentType: java.lang.String
  /**
    * Gets the Exchange attachment ID of the attachment.
    */
  var id: java.lang.String
  /**
    * Gets a value that indicates whether the attachment should be displayed in the body of the item.
    */
  var isInline: scala.Boolean
  /**
    * Gets the name of the attachment.
    */
  var name: java.lang.String
  /**
    * Gets the size of the attachment in bytes.
    */
  var size: scala.Double
}

object AttachmentDetails {
  @scala.inline
  def apply(
    attachmentType: officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentType,
    contentType: java.lang.String,
    id: java.lang.String,
    isInline: scala.Boolean,
    name: java.lang.String,
    size: scala.Double
  ): AttachmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentType")(attachmentType)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isInline")(isInline)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[AttachmentDetails]
  }
}

