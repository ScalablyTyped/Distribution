package typings
package nodemailerLib.libMailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An array of alternative text contents (in addition to text and html parts) */
  var alternatives: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** An array of attachment objects */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Bcc: field */
  var bcc: js.UndefOr[java.lang.String | Address | (js.Array[java.lang.String | Address])] = js.undefined
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Cc: field */
  var cc: js.UndefOr[java.lang.String | Address | (js.Array[java.lang.String | Address])] = js.undefined
  /** optional Date value, current UTC string will be used if not set */
  var date: js.UndefOr[stdLib.Date | java.lang.String] = js.undefined
  /** if set to true then fails with an error when a node tries to load content from a file */
  var disableFileAccess: js.UndefOr[scala.Boolean] = js.undefined
  /** if set to true then fails with an error when a node tries to load content from URL */
  var disableUrlAccess: js.UndefOr[scala.Boolean] = js.undefined
  /** is an object with DKIM options */
  var dkim: js.UndefOr[nodemailerLib.libDkimMod.Options] = js.undefined
  /** optional transfer encoding for the textual parts */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** optional SMTP envelope, if auto generated envelope is not suitable */
  var envelope: js.UndefOr[Envelope | nodemailerLib.libMimeDashNodeMod.Envelope] = js.undefined
  /** The e-mail address of the sender. All e-mail addresses can be plain 'sender@server.com' or formatted 'Sender Name <sender@server.com>' */
  var from: js.UndefOr[java.lang.String | Address] = js.undefined
  /** An object or array of additional header fields */
  var headers: js.UndefOr[Headers] = js.undefined
  /** The HTML version of the message */
  var html: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike] = js.undefined
  /** iCalendar event, same usage as with text and html. Event method attribute defaults to ‘PUBLISH’ or define it yourself: {method: 'REQUEST', content: iCalString}. This value is added as an additional alternative to html or text. Only utf-8 content is allowed */
  var icalEvent: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | IcalAttachment] = js.undefined
  /** The message-id this message is replying */
  var inReplyTo: js.UndefOr[java.lang.String | Address] = js.undefined
  /** An object where key names are converted into list headers. List key help becomes List-Help header etc. */
  var list: js.UndefOr[ListHeaders] = js.undefined
  /** optional Message-Id value, random value will be generated if not set */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ java.lang.String, java.lang.String]] = js.undefined
  /** if set then overwrites entire message output with this value. The value is not parsed, so you should still set address headers or the envelope value for the message to work */
  var raw: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike] = js.undefined
  /** Message-id list (an array or space separated string) */
  var references: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** An e-mail address that will appear on the Reply-To: field */
  var replyTo: js.UndefOr[java.lang.String | Address] = js.undefined
  /** An e-mail address that will appear on the Sender: field */
  var sender: js.UndefOr[java.lang.String | Address] = js.undefined
  /** The subject of the e-mail */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /** The plaintext version of the message */
  var text: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike] = js.undefined
  /** set explicitly which encoding to use for text parts (quoted-printable or base64). If not set then encoding is detected from text content (mostly ascii means quoted-printable, otherwise base64) */
  var textEncoding: js.UndefOr[TextEncoding] = js.undefined
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the To: field */
  var to: js.UndefOr[java.lang.String | Address | (js.Array[java.lang.String | Address])] = js.undefined
  /** Apple Watch specific HTML version of the message, same usage as with text and html */
  var watchHtml: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alternatives: js.Array[Attachment] = null,
    attachments: js.Array[Attachment] = null,
    bcc: java.lang.String | Address | (js.Array[java.lang.String | Address]) = null,
    cc: java.lang.String | Address | (js.Array[java.lang.String | Address]) = null,
    date: stdLib.Date | java.lang.String = null,
    disableFileAccess: js.UndefOr[scala.Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[scala.Boolean] = js.undefined,
    dkim: nodemailerLib.libDkimMod.Options = null,
    encoding: java.lang.String = null,
    envelope: Envelope | nodemailerLib.libMimeDashNodeMod.Envelope = null,
    from: java.lang.String | Address = null,
    headers: Headers = null,
    html: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike = null,
    icalEvent: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | IcalAttachment = null,
    inReplyTo: java.lang.String | Address = null,
    list: ListHeaders = null,
    messageId: java.lang.String = null,
    normalizeHeaderKey: /* key */ java.lang.String => java.lang.String = null,
    raw: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike = null,
    references: java.lang.String | js.Array[java.lang.String] = null,
    replyTo: java.lang.String | Address = null,
    sender: java.lang.String | Address = null,
    subject: java.lang.String = null,
    text: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike = null,
    textEncoding: TextEncoding = null,
    to: java.lang.String | Address | (js.Array[java.lang.String | Address]) = null,
    watchHtml: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | AttachmentLike = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess)
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess)
    if (dkim != null) __obj.updateDynamic("dkim")(dkim)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icalEvent != null) __obj.updateDynamic("icalEvent")(icalEvent.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (watchHtml != null) __obj.updateDynamic("watchHtml")(watchHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

