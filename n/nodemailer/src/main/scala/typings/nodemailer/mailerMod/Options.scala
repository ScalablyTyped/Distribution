package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.nodemailer.nodemailerStrings.high
import typings.nodemailer.nodemailerStrings.low
import typings.nodemailer.nodemailerStrings.normal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An array of alternative text contents (in addition to text and html parts) */
  var alternatives: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** AMP4EMAIL specific HTML version of the message, same usage as with text and html. Make sure it is a full and valid AMP4EMAIL document, otherwise the displaying email client falls back to html and ignores the amp part */
  var amp: js.UndefOr[String | Buffer | Readable | AmpAttachment] = js.undefined
  /** An array of attachment objects */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Bcc: field */
  var bcc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.undefined
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Cc: field */
  var cc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.undefined
  /** optional Date value, current UTC string will be used if not set */
  var date: js.UndefOr[Date | String] = js.undefined
  /** if set to true then fails with an error when a node tries to load content from a file */
  var disableFileAccess: js.UndefOr[Boolean] = js.undefined
  /** if set to true then fails with an error when a node tries to load content from URL */
  var disableUrlAccess: js.UndefOr[Boolean] = js.undefined
  /** is an object with DKIM options */
  var dkim: js.UndefOr[typings.nodemailer.dkimMod.Options] = js.undefined
  /** optional transfer encoding for the textual parts */
  var encoding: js.UndefOr[String] = js.undefined
  /** optional SMTP envelope, if auto generated envelope is not suitable */
  var envelope: js.UndefOr[Envelope | typings.nodemailer.mimeNodeMod.Envelope] = js.undefined
  /** The e-mail address of the sender. All e-mail addresses can be plain 'sender@server.com' or formatted 'Sender Name <sender@server.com>' */
  var from: js.UndefOr[String | Address] = js.undefined
  /** An object or array of additional header fields */
  var headers: js.UndefOr[Headers] = js.undefined
  /** The HTML version of the message */
  var html: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.undefined
  /** iCalendar event, same usage as with text and html. Event method attribute defaults to ‘PUBLISH’ or define it yourself: {method: 'REQUEST', content: iCalString}. This value is added as an additional alternative to html or text. Only utf-8 content is allowed */
  var icalEvent: js.UndefOr[String | Buffer | Readable | IcalAttachment] = js.undefined
  /** The message-id this message is replying */
  var inReplyTo: js.UndefOr[String | Address] = js.undefined
  /** An object where key names are converted into list headers. List key help becomes List-Help header etc. */
  var list: js.UndefOr[ListHeaders] = js.undefined
  /** optional Message-Id value, random value will be generated if not set */
  var messageId: js.UndefOr[String] = js.undefined
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
  var priority: js.UndefOr[high | normal | low] = js.undefined
  /** if set then overwrites entire message output with this value. The value is not parsed, so you should still set address headers or the envelope value for the message to work */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.undefined
  /** Message-id list (an array or space separated string) */
  var references: js.UndefOr[String | js.Array[String]] = js.undefined
  /** An e-mail address that will appear on the Reply-To: field */
  var replyTo: js.UndefOr[String | Address] = js.undefined
  /** An e-mail address that will appear on the Sender: field */
  var sender: js.UndefOr[String | Address] = js.undefined
  /** The subject of the e-mail */
  var subject: js.UndefOr[String] = js.undefined
  /** The plaintext version of the message */
  var text: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.undefined
  /** set explicitly which encoding to use for text parts (quoted-printable or base64). If not set then encoding is detected from text content (mostly ascii means quoted-printable, otherwise base64) */
  var textEncoding: js.UndefOr[TextEncoding] = js.undefined
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the To: field */
  var to: js.UndefOr[String | Address | (js.Array[String | Address])] = js.undefined
  /** Apple Watch specific HTML version of the message, same usage as with text and html */
  var watchHtml: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alternatives: js.Array[Attachment] = null,
    amp: String | Buffer | Readable | AmpAttachment = null,
    attachments: js.Array[Attachment] = null,
    bcc: String | Address | (js.Array[String | Address]) = null,
    cc: String | Address | (js.Array[String | Address]) = null,
    date: Date | String = null,
    disableFileAccess: js.UndefOr[Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[Boolean] = js.undefined,
    dkim: typings.nodemailer.dkimMod.Options = null,
    encoding: String = null,
    envelope: Envelope | typings.nodemailer.mimeNodeMod.Envelope = null,
    from: String | Address = null,
    headers: Headers = null,
    html: String | Buffer | Readable | AttachmentLike = null,
    icalEvent: String | Buffer | Readable | IcalAttachment = null,
    inReplyTo: String | Address = null,
    list: ListHeaders = null,
    messageId: String = null,
    normalizeHeaderKey: /* key */ String => String = null,
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
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (amp != null) __obj.updateDynamic("amp")(amp.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess.get.asInstanceOf[js.Any])
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
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
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

