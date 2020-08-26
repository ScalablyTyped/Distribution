package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  var Base64Content: String = js.native
  var ContentType: String = js.native
  var Filename: String = js.native
}

object Attachment {
  @scala.inline
  def apply(Base64Content: String, ContentType: String, Filename: String): Attachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
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
    def setBase64Content(value: String): Self = this.set("Base64Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("Filename", value.asInstanceOf[js.Any])
  }
  
}

