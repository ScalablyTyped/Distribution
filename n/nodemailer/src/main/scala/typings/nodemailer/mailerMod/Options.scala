package typings.nodemailer.mailerMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.nodemailer.anon.Value
import typings.nodemailer.nodemailerStrings.high
import typings.nodemailer.nodemailerStrings.low
import typings.nodemailer.nodemailerStrings.normal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** An array of alternative text contents (in addition to text and html parts) */
  var alternatives: js.UndefOr[js.Array[Attachment]] = js.native
  /** AMP4EMAIL specific HTML version of the message, same usage as with text and html. Make sure it is a full and valid AMP4EMAIL document, otherwise the displaying email client falls back to html and ignores the amp part */
  var amp: js.UndefOr[String | Buffer | Readable | AmpAttachment] = js.native
  /** An array of attachment objects */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Bcc: field */
  var bcc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Cc: field */
  var cc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
  /** optional Date value, current UTC string will be used if not set */
  var date: js.UndefOr[Date | String] = js.native
  /** if set to true then fails with an error when a node tries to load content from a file */
  var disableFileAccess: js.UndefOr[Boolean] = js.native
  /** if set to true then fails with an error when a node tries to load content from URL */
  var disableUrlAccess: js.UndefOr[Boolean] = js.native
  /** is an object with DKIM options */
  var dkim: js.UndefOr[typings.nodemailer.dkimMod.Options] = js.native
  /** optional transfer encoding for the textual parts */
  var encoding: js.UndefOr[String] = js.native
  /** optional SMTP envelope, if auto generated envelope is not suitable */
  var envelope: js.UndefOr[Envelope | typings.nodemailer.mimeNodeMod.Envelope] = js.native
  /** The e-mail address of the sender. All e-mail addresses can be plain 'sender@server.com' or formatted 'Sender Name <sender@server.com>' */
  var from: js.UndefOr[String | Address] = js.native
  /** An object or array of additional header fields */
  var headers: js.UndefOr[Headers] = js.native
  /** The HTML version of the message */
  var html: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  /** iCalendar event, same usage as with text and html. Event method attribute defaults to ‘PUBLISH’ or define it yourself: {method: 'REQUEST', content: iCalString}. This value is added as an additional alternative to html or text. Only utf-8 content is allowed */
  var icalEvent: js.UndefOr[String | Buffer | Readable | IcalAttachment] = js.native
  /** The message-id this message is replying */
  var inReplyTo: js.UndefOr[String | Address] = js.native
  /** An object where key names are converted into list headers. List key help becomes List-Help header etc. */
  var list: js.UndefOr[ListHeaders] = js.native
  /** optional Message-Id value, random value will be generated if not set */
  var messageId: js.UndefOr[String] = js.native
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
  var priority: js.UndefOr[high | normal | low] = js.native
  /** if set then overwrites entire message output with this value. The value is not parsed, so you should still set address headers or the envelope value for the message to work */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  /** Message-id list (an array or space separated string) */
  var references: js.UndefOr[String | js.Array[String]] = js.native
  /** An e-mail address that will appear on the Reply-To: field */
  var replyTo: js.UndefOr[String | Address] = js.native
  /** An e-mail address that will appear on the Sender: field */
  var sender: js.UndefOr[String | Address] = js.native
  /** The subject of the e-mail */
  var subject: js.UndefOr[String] = js.native
  /** The plaintext version of the message */
  var text: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  /** set explicitly which encoding to use for text parts (quoted-printable or base64). If not set then encoding is detected from text content (mostly ascii means quoted-printable, otherwise base64) */
  var textEncoding: js.UndefOr[TextEncoding] = js.native
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the To: field */
  var to: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
  /** Apple Watch specific HTML version of the message, same usage as with text and html */
  var watchHtml: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlternativesVarargs(value: Attachment*): Self = this.set("alternatives", js.Array(value :_*))
    @scala.inline
    def setAlternatives(value: js.Array[Attachment]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    @scala.inline
    def setAmp(value: String | Buffer | Readable | AmpAttachment): Self = this.set("amp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmp: Self = this.set("amp", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBccVarargs(value: (String | Address)*): Self = this.set("bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: String | Address | (js.Array[String | Address])): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCcVarargs(value: (String | Address)*): Self = this.set("cc", js.Array(value :_*))
    @scala.inline
    def setCc(value: String | Address | (js.Array[String | Address])): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    @scala.inline
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDisableFileAccess(value: Boolean): Self = this.set("disableFileAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFileAccess: Self = this.set("disableFileAccess", js.undefined)
    @scala.inline
    def setDisableUrlAccess(value: Boolean): Self = this.set("disableUrlAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableUrlAccess: Self = this.set("disableUrlAccess", js.undefined)
    @scala.inline
    def setDkim(value: typings.nodemailer.dkimMod.Options): Self = this.set("dkim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDkim: Self = this.set("dkim", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEnvelope(value: Envelope | typings.nodemailer.mimeNodeMod.Envelope): Self = this.set("envelope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvelope: Self = this.set("envelope", js.undefined)
    @scala.inline
    def setFrom(value: String | Address): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: Value*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHtml(value: String | Buffer | Readable | AttachmentLike): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIcalEvent(value: String | Buffer | Readable | IcalAttachment): Self = this.set("icalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcalEvent: Self = this.set("icalEvent", js.undefined)
    @scala.inline
    def setInReplyTo(value: String | Address): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setList(value: ListHeaders): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setNormalizeHeaderKey(value: /* key */ String => String): Self = this.set("normalizeHeaderKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizeHeaderKey: Self = this.set("normalizeHeaderKey", js.undefined)
    @scala.inline
    def setPriority(value: high | normal | low): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setRaw(value: String | Buffer | Readable | AttachmentLike): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setReferencesVarargs(value: String*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: String | js.Array[String]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    @scala.inline
    def setReplyTo(value: String | Address): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setSender(value: String | Address): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: String | Buffer | Readable | AttachmentLike): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextEncoding(value: TextEncoding): Self = this.set("textEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEncoding: Self = this.set("textEncoding", js.undefined)
    @scala.inline
    def setToVarargs(value: (String | Address)*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: String | Address | (js.Array[String | Address])): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setWatchHtml(value: String | Buffer | Readable | AttachmentLike): Self = this.set("watchHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchHtml: Self = this.set("watchHtml", js.undefined)
  }
  
}

