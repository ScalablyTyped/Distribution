package typings.nodemailer.libSendmailDashTransportMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.nodemailer.libMailerMod.Address
import typings.nodemailer.libMailerMod.AmpAttachment
import typings.nodemailer.libMailerMod.Attachment
import typings.nodemailer.libMailerMod.AttachmentLike
import typings.nodemailer.libMailerMod.Envelope
import typings.nodemailer.libMailerMod.Headers
import typings.nodemailer.libMailerMod.IcalAttachment
import typings.nodemailer.libMailerMod.ListHeaders
import typings.nodemailer.libMailerMod.TextEncoding
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.nodemailerMod.TransportOptions
import typings.nodemailer.nodemailerStrings.high
import typings.nodemailer.nodemailerStrings.low
import typings.nodemailer.nodemailerStrings.normal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.nodemailer.libMailerMod.Options
     with TransportOptions {
  /** an optional array of command line options to pass to the sendmail command (ie. ["-f", "foo@blurdybloop.com"]). This overrides all default arguments except for ’-i’ and recipient list so you need to make sure you have all required arguments set (ie. the ‘-f’ flag). */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
  var newline: js.UndefOr[String] = js.undefined
  /** path to the sendmail command (defaults to ‘sendmail’) */
  var path: js.UndefOr[String] = js.undefined
  var sendmail: `true`
}

object Options {
  @scala.inline
  def apply(
    sendmail: `true`,
    alternatives: js.Array[Attachment] = null,
    amp: String | Buffer | Readable | AmpAttachment = null,
    args: js.Array[String] = null,
    attachments: js.Array[Attachment] = null,
    bcc: String | Address | (js.Array[String | Address]) = null,
    cc: String | Address | (js.Array[String | Address]) = null,
    component: String = null,
    date: Date | String = null,
    disableFileAccess: js.UndefOr[Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[Boolean] = js.undefined,
    dkim: typings.nodemailer.libDkimMod.Options = null,
    encoding: String = null,
    envelope: Envelope | typings.nodemailer.libMimeDashNodeMod.Envelope = null,
    from: String | Address = null,
    headers: Headers = null,
    html: String | Buffer | Readable | AttachmentLike = null,
    icalEvent: String | Buffer | Readable | IcalAttachment = null,
    inReplyTo: String | Address = null,
    list: ListHeaders = null,
    messageId: String = null,
    newline: String = null,
    normalizeHeaderKey: /* key */ String => String = null,
    path: String = null,
    priority: high | normal | low = null,
    raw: String | Buffer | Readable | AttachmentLike = null,
    references: String | js.Array[String] = null,
    replyTo: String | Address = null,
    sender: String | Address = null,
    subject: String = null,
    text: String | Buffer | Readable | AttachmentLike = null,
    textEncoding: TextEncoding = null,
    to: String | Address | (js.Array[String | Address]) = null,
    watchHtml: String | Buffer | Readable | AttachmentLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(sendmail = sendmail.asInstanceOf[js.Any])
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (amp != null) __obj.updateDynamic("amp")(amp.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess.asInstanceOf[js.Any])
    if (dkim != null) __obj.updateDynamic("dkim")(dkim.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icalEvent != null) __obj.updateDynamic("icalEvent")(icalEvent.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (watchHtml != null) __obj.updateDynamic("watchHtml")(watchHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

