package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentsBcc extends js.Object {
  var attachments: js.UndefOr[js.Array[js.Object]] = js.undefined
  var bcc: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var cc: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var mailComposer: js.UndefOr[MailComposer] = js.undefined
  var replyTo: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_AttachmentsBcc {
  @scala.inline
  def apply(
    attachments: js.Array[js.Object] = null,
    bcc: java.lang.String | js.Array[java.lang.String] = null,
    cc: java.lang.String | js.Array[java.lang.String] = null,
    from: java.lang.String = null,
    headers: js.Object = null,
    html: java.lang.String = null,
    mailComposer: MailComposer = null,
    replyTo: java.lang.String | js.Array[java.lang.String] = null,
    subject: java.lang.String = null,
    text: java.lang.String = null,
    to: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_AttachmentsBcc = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (html != null) __obj.updateDynamic("html")(html)
    if (mailComposer != null) __obj.updateDynamic("mailComposer")(mailComposer)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttachmentsBcc]
  }
}

