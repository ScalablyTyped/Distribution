package typings.nodemailer.libMailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.Url
import typings.nodemailer.nodemailerNumbers.`false`
import typings.nodemailer.nodemailerStrings.`7bit`
import typings.nodemailer.nodemailerStrings.`inline`
import typings.nodemailer.nodemailerStrings.`quoted-printable`
import typings.nodemailer.nodemailerStrings.attachment
import typings.nodemailer.nodemailerStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends AttachmentLike {
  /** optional content id for using inline images in HTML message source. Using cid sets the default contentDisposition to 'inline' and moves the attachment into a multipart/related mime node, so use it only if you actually want to use this attachment as an embedded image */
  var cid: js.UndefOr[String] = js.undefined
  /** optional content disposition type for the attachment, defaults to ‘attachment’ */
  var contentDisposition: js.UndefOr[attachment | `inline`] = js.undefined
  /** optional transfer encoding for the attachment, if not set it will be derived from the contentType property. Example values: quoted-printable, base64. If it is unset then base64 encoding is used for the attachment. If it is set to false then previous default applies (base64 for most, 7bit for text). */
  var contentTransferEncoding: js.UndefOr[`7bit` | base64 | `quoted-printable` | `false`] = js.undefined
  /** optional content type for the attachment, if not set will be derived from the filename property */
  var contentType: js.UndefOr[String] = js.undefined
  /** If set and content is string, then encodes the content to a Buffer using the specified encoding. Example values: base64, hex, binary etc. Useful if you want to use binary attachments in a JSON formatted e-mail object */
  var encoding: js.UndefOr[String] = js.undefined
  /** filename to be reported as the name of the attached file, use of unicode is allowed. If you do not want to use a filename, set this value as false, otherwise a filename is generated automatically */
  var filename: js.UndefOr[String | `false`] = js.undefined
  /** is an object of additional headers */
  var headers: js.UndefOr[Headers] = js.undefined
  /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    cid: String = null,
    content: String | Buffer | Readable = null,
    contentDisposition: attachment | `inline` = null,
    contentTransferEncoding: `7bit` | base64 | `quoted-printable` | `false` = null,
    contentType: String = null,
    encoding: String = null,
    filename: String | `false` = null,
    headers: Headers = null,
    path: String | Url = null,
    raw: String | Buffer | Readable | AttachmentLike = null
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentTransferEncoding != null) __obj.updateDynamic("contentTransferEncoding")(contentTransferEncoding.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

