package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentsBcc extends js.Object {
  var attachments: js.UndefOr[js.Array[js.Object]] = js.undefined
  var bcc: js.UndefOr[String | js.Array[String]] = js.undefined
  var cc: js.UndefOr[String | js.Array[String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var mailComposer: js.UndefOr[MailComposer] = js.undefined
  var replyTo: js.UndefOr[String | js.Array[String]] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Anon_AttachmentsBcc {
  @scala.inline
  def apply(
    attachments: js.Array[js.Object] = null,
    bcc: String | js.Array[String] = null,
    cc: String | js.Array[String] = null,
    from: String = null,
    headers: js.Object = null,
    html: String = null,
    mailComposer: MailComposer = null,
    replyTo: String | js.Array[String] = null,
    subject: String = null,
    text: String = null,
    to: String | js.Array[String] = null
  ): Anon_AttachmentsBcc = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (mailComposer != null) __obj.updateDynamic("mailComposer")(mailComposer.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttachmentsBcc]
  }
}

