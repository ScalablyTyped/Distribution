package typings
package nodemailerLib.libMailerMod.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends AttachmentLike {
  /** optional content id for using inline images in HTML message source. Using cid sets the default contentDisposition to 'inline' and moves the attachment into a multipart/related mime node, so use it only if you actually want to use this attachment as an embedded image */
  var cid: js.UndefOr[java.lang.String] = js.undefined
  /** optional content disposition type for the attachment, defaults to ‘attachment’ */
  var contentDisposition: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.attachment | nodemailerLib.nodemailerLibStrings.`inline`
  ] = js.undefined
  /** optional transfer encoding for the attachment, if not set it will be derived from the contentType property. Example values: quoted-printable, base64. If it is unset then base64 encoding is used for the attachment. If it is set to false then previous default applies (base64 for most, 7bit for text). */
  var contentTransferEncoding: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.`7bit` | nodemailerLib.nodemailerLibStrings.base64 | nodemailerLib.nodemailerLibStrings.`quoted-printable` | nodemailerLib.nodemailerLibNumbers.`false`
  ] = js.undefined
  /** optional content type for the attachment, if not set will be derived from the filename property */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** If set and content is string, then encodes the content to a Buffer using the specified encoding. Example values: base64, hex, binary etc. Useful if you want to use binary attachments in a JSON formatted e-mail object */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** filename to be reported as the name of the attached file, use of unicode is allowed. If you do not want to use a filename, set this value as false, otherwise a filename is generated automatically */
  var filename: js.UndefOr[java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`] = js.undefined
  /** is an object of additional headers */
  var headers: js.UndefOr[Headers] = js.undefined
  /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
  var raw: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    cid: java.lang.String = null,
    content: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    contentDisposition: nodemailerLib.nodemailerLibStrings.attachment | nodemailerLib.nodemailerLibStrings.`inline` = null,
    contentTransferEncoding: nodemailerLib.nodemailerLibStrings.`7bit` | nodemailerLib.nodemailerLibStrings.base64 | nodemailerLib.nodemailerLibStrings.`quoted-printable` | nodemailerLib.nodemailerLibNumbers.`false` = null,
    contentType: java.lang.String = null,
    encoding: java.lang.String = null,
    filename: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = null,
    headers: Headers = null,
    path: java.lang.String | nodeLib.urlMod.Url = null,
    raw: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike = null
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentTransferEncoding != null) __obj.updateDynamic("contentTransferEncoding")(contentTransferEncoding.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

