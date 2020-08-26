package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentLike extends js.Object {
  /** String, Buffer or a Stream contents for the attachmentent */
  var content: js.UndefOr[String | Buffer | Readable] = js.native
  /** path to a file or an URL (data uris are allowed as well) if you want to stream the file instead of including it (better for larger attachments) */
  var path: js.UndefOr[String | Url] = js.native
}

object AttachmentLike {
  @scala.inline
  def apply(): AttachmentLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentLike]
  }
  @scala.inline
  implicit class AttachmentLikeOps[Self <: AttachmentLike] (val x: Self) extends AnyVal {
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
    def setContent(value: String | Buffer | Readable): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setPath(value: String | Url): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

