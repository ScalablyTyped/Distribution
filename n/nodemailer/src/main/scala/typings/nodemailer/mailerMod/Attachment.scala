package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.nodemailer.anon.Value
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerStrings.`7bit`
import typings.nodemailer.nodemailerStrings.`inline`
import typings.nodemailer.nodemailerStrings.`quoted-printable`
import typings.nodemailer.nodemailerStrings.attachment
import typings.nodemailer.nodemailerStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends AttachmentLike {
  
  /** optional content id for using inline images in HTML message source. Using cid sets the default contentDisposition to 'inline' and moves the attachment into a multipart/related mime node, so use it only if you actually want to use this attachment as an embedded image */
  var cid: js.UndefOr[String] = js.native
  
  /** optional content disposition type for the attachment, defaults to ‘attachment’ */
  var contentDisposition: js.UndefOr[attachment | `inline`] = js.native
  
  /** optional transfer encoding for the attachment, if not set it will be derived from the contentType property. Example values: quoted-printable, base64. If it is unset then base64 encoding is used for the attachment. If it is set to false then previous default applies (base64 for most, 7bit for text). */
  var contentTransferEncoding: js.UndefOr[`7bit` | base64 | `quoted-printable` | `false`] = js.native
  
  /** optional content type for the attachment, if not set will be derived from the filename property */
  var contentType: js.UndefOr[String] = js.native
  
  /** If set and content is string, then encodes the content to a Buffer using the specified encoding. Example values: base64, hex, binary etc. Useful if you want to use binary attachments in a JSON formatted e-mail object */
  var encoding: js.UndefOr[String] = js.native
  
  /** filename to be reported as the name of the attached file, use of unicode is allowed. If you do not want to use a filename, set this value as false, otherwise a filename is generated automatically */
  var filename: js.UndefOr[String | `false`] = js.native
  
  /** is an object of additional headers */
  var headers: js.UndefOr[Headers] = js.native
  
  /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
}
object Attachment {
  
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
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
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: attachment | `inline`): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    
    @scala.inline
    def setContentTransferEncoding(value: `7bit` | base64 | `quoted-printable` | `false`): Self = this.set("contentTransferEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTransferEncoding: Self = this.set("contentTransferEncoding", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFilename(value: String | `false`): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: Value*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setRaw(value: String | Buffer | Readable | AttachmentLike): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
