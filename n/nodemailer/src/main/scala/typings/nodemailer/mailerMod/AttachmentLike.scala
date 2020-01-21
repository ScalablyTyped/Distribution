package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentLike extends js.Object {
  /** String, Buffer or a Stream contents for the attachmentent */
  var content: js.UndefOr[String | Buffer | Readable] = js.undefined
  /** path to a file or an URL (data uris are allowed as well) if you want to stream the file instead of including it (better for larger attachments) */
  var path: js.UndefOr[String | Url] = js.undefined
}

object AttachmentLike {
  @scala.inline
  def apply(content: String | Buffer | Readable = null, path: String | Url = null): AttachmentLike = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentLike]
  }
}

