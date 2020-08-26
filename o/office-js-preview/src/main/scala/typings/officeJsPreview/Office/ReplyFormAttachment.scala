package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file or item attachment. Used when displaying a reply form.
  */
@js.native
trait ReplyFormAttachment extends js.Object {
  /**
    * Only used if type is set to file. If true, indicates that the attachment will be shown inline in the message body, and should not be
    * displayed in the attachment list.
    */
  var inLine: js.UndefOr[Boolean] = js.native
  /**
    * Only used if type is set to item. The EWS item id of the attachment. This is a string up to 100 characters.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * A string that contains the name of the attachment, up to 255 characters in length.
    */
  var name: String = js.native
  /**
    * Indicates the type of attachment. Must be file for a file attachment or item for an item attachment.
    */
  var `type`: String = js.native
  /**
    * Only used if type is set to file. The URI of the location for the file.
    */
  var url: js.UndefOr[String] = js.native
}

object ReplyFormAttachment {
  @scala.inline
  def apply(name: String, `type`: String): ReplyFormAttachment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyFormAttachment]
  }
  @scala.inline
  implicit class ReplyFormAttachmentOps[Self <: ReplyFormAttachment] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInLine(value: Boolean): Self = this.set("inLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInLine: Self = this.set("inLine", js.undefined)
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

