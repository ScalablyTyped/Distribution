package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpAttachment extends AttachmentLike {
  /** optional content type for the attachment, if not set will be derived from the filename property */
  var contentType: js.UndefOr[String] = js.native
  /** defines optional content encoding, eg. ‘base64’ or ‘hex’. This only applies if the content is a string. By default an unicode string is assumed. */
  var encoding: js.UndefOr[String] = js.native
  /** is an alternative for content to load the AMP4EMAIL data from an URL */
  var href: js.UndefOr[String] = js.native
  /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
}

object AmpAttachment {
  @scala.inline
  def apply(): AmpAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpAttachment]
  }
  @scala.inline
  implicit class AmpAttachmentOps[Self <: AmpAttachment] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setRaw(value: String | Buffer | Readable | AttachmentLike): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

