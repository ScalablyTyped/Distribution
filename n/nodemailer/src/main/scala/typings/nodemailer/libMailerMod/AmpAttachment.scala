package typings.nodemailer.libMailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpAttachment extends AttachmentLike {
  /** optional content type for the attachment, if not set will be derived from the filename property */
  var contentType: js.UndefOr[String] = js.undefined
  /** defines optional content encoding, eg. ‘base64’ or ‘hex’. This only applies if the content is a string. By default an unicode string is assumed. */
  var encoding: js.UndefOr[String] = js.undefined
  /** is an alternative for content to load the AMP4EMAIL data from an URL */
  var href: js.UndefOr[String] = js.undefined
  /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.undefined
}

object AmpAttachment {
  @scala.inline
  def apply(
    content: String | Buffer | Readable = null,
    contentType: String = null,
    encoding: String = null,
    href: String = null,
    path: String | Url = null,
    raw: String | Buffer | Readable | AttachmentLike = null
  ): AmpAttachment = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (href != null) __obj.updateDynamic("href")(href)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpAttachment]
  }
}

