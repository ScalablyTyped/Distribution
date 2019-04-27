package typings
package nodemailerLib.libSesDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends MailOptions
     with nodemailerLib.nodemailerMod.TransportOptions {
  /** is an option that expects an instantiated aws.SES object */
  var SES: js.Any
   // aws-sdk.SES object
  /** How many messages per second is allowed to be delivered to SES */
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /** How many parallel connections to allow towards SES */
  var sendingRate: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    SES: js.Any,
    alternatives: js.Array[nodemailerLib.libMailerMod.Attachment] = null,
    attachments: js.Array[nodemailerLib.libMailerMod.Attachment] = null,
    bcc: java.lang.String | nodemailerLib.libMailerMod.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.Address]) = null,
    cc: java.lang.String | nodemailerLib.libMailerMod.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.Address]) = null,
    component: java.lang.String = null,
    date: stdLib.Date | java.lang.String = null,
    disableFileAccess: js.UndefOr[scala.Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[scala.Boolean] = js.undefined,
    dkim: nodemailerLib.libDkimMod.Options = null,
    encoding: java.lang.String = null,
    envelope: nodemailerLib.libMailerMod.Envelope | nodemailerLib.libMimeDashNodeMod.Envelope = null,
    from: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    headers: nodemailerLib.libMailerMod.Headers = null,
    html: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null,
    icalEvent: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.IcalAttachment = null,
    inReplyTo: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    list: nodemailerLib.libMailerMod.ListHeaders = null,
    maxConnections: scala.Int | scala.Double = null,
    messageId: java.lang.String = null,
    normalizeHeaderKey: /* key */ java.lang.String => java.lang.String = null,
    priority: nodemailerLib.nodemailerLibStrings.high | nodemailerLib.nodemailerLibStrings.normal | nodemailerLib.nodemailerLibStrings.low = null,
    raw: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null,
    references: java.lang.String | js.Array[java.lang.String] = null,
    replyTo: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    sender: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    sendingRate: scala.Int | scala.Double = null,
    ses: js.Object = null,
    subject: java.lang.String = null,
    text: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null,
    textEncoding: nodemailerLib.libMailerMod.TextEncoding = null,
    to: java.lang.String | nodemailerLib.libMailerMod.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.Address]) = null,
    watchHtml: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(SES = SES)
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
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
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (sendingRate != null) __obj.updateDynamic("sendingRate")(sendingRate.asInstanceOf[js.Any])
    if (ses != null) __obj.updateDynamic("ses")(ses)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (watchHtml != null) __obj.updateDynamic("watchHtml")(watchHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

