package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentItem extends js.Object {
  // The type of attachment. Possible values are: file, item, reference. Required.
  var attachmentType: js.UndefOr[AttachmentType] = js.native
  // The nature of the data in the attachment. Optional.
  var contentType: js.UndefOr[String] = js.native
  // true if the attachment is an inline attachment; otherwise, false. Optional.
  var isInline: js.UndefOr[Boolean] = js.native
  /**
    * The display name of the attachment. This can be a descriptive string and does not have to be the actual file name.
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  // The length of the attachment in bytes. Required.
  var size: js.UndefOr[Double] = js.native
}

object AttachmentItem {
  @scala.inline
  def apply(): AttachmentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentItem]
  }
  @scala.inline
  implicit class AttachmentItemOps[Self <: AttachmentItem] (val x: Self) extends AnyVal {
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
    def setAttachmentType(value: AttachmentType): Self = this.set("attachmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentType: Self = this.set("attachmentType", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInline: Self = this.set("isInline", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

