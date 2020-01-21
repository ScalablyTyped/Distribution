package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.Url
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcalAttachment extends AttachmentLike {
  /** defines optional content encoding, eg. ‘base64’ or ‘hex’. This only applies if the content is a string. By default an unicode string is assumed. */
  var encoding: js.UndefOr[String] = js.undefined
  /** optional filename, defaults to ‘invite.ics’ */
  var filename: js.UndefOr[String | `false`] = js.undefined
  /** is an alternative for content to load the calendar data from an URL */
  var href: js.UndefOr[String] = js.undefined
  /** optional method, case insensitive, defaults to ‘publish’. Other possible values would be ‘request’, ‘reply’, ‘cancel’ or any other valid calendar method listed in RFC5546. This should match the METHOD: value in calendar event file. */
  var method: js.UndefOr[String] = js.undefined
}

object IcalAttachment {
  @scala.inline
  def apply(
    content: String | Buffer | Readable = null,
    encoding: String = null,
    filename: String | `false` = null,
    href: String = null,
    method: String = null,
    path: String | Url = null
  ): IcalAttachment = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcalAttachment]
  }
}

