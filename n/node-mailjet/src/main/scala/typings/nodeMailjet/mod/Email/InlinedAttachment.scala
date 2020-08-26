package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlinedAttachment extends Attachment {
  var ContentID: String = js.native
}

object InlinedAttachment {
  @scala.inline
  def apply(Base64Content: String, ContentID: String, ContentType: String, Filename: String): InlinedAttachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentID = ContentID.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinedAttachment]
  }
  @scala.inline
  implicit class InlinedAttachmentOps[Self <: InlinedAttachment] (val x: Self) extends AnyVal {
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
    def setContentID(value: String): Self = this.set("ContentID", value.asInstanceOf[js.Any])
  }
  
}

