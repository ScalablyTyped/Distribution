package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkMessage extends js.Object {
  var Attachments: js.UndefOr[js.Array[PostmarkAttachment]] = js.undefined
  var Bcc: js.UndefOr[java.lang.String] = js.undefined
  var Cc: js.UndefOr[java.lang.String] = js.undefined
  var From: java.lang.String
  var HTMLBody: js.UndefOr[java.lang.String] = js.undefined
  var Headers: js.UndefOr[js.Array[PostmarkMessageHeader]] = js.undefined
  var ReplyTo: js.UndefOr[java.lang.String] = js.undefined
  var Subject: js.UndefOr[java.lang.String] = js.undefined
  var Tag: js.UndefOr[java.lang.String] = js.undefined
  var TextBody: js.UndefOr[java.lang.String] = js.undefined
  var To: java.lang.String
  var TrackLinks: js.UndefOr[java.lang.String] = js.undefined
  var TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
}

object PostmarkMessage {
  @scala.inline
  def apply(
    From: java.lang.String,
    To: java.lang.String,
    Attachments: js.Array[PostmarkAttachment] = null,
    Bcc: java.lang.String = null,
    Cc: java.lang.String = null,
    HTMLBody: java.lang.String = null,
    Headers: js.Array[PostmarkMessageHeader] = null,
    ReplyTo: java.lang.String = null,
    Subject: java.lang.String = null,
    Tag: java.lang.String = null,
    TextBody: java.lang.String = null,
    TrackLinks: java.lang.String = null,
    TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
  ): PostmarkMessage = {
    val __obj = js.Dynamic.literal(From = From, To = To)
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (Bcc != null) __obj.updateDynamic("Bcc")(Bcc)
    if (Cc != null) __obj.updateDynamic("Cc")(Cc)
    if (HTMLBody != null) __obj.updateDynamic("HTMLBody")(HTMLBody)
    if (Headers != null) __obj.updateDynamic("Headers")(Headers)
    if (ReplyTo != null) __obj.updateDynamic("ReplyTo")(ReplyTo)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody)
    if (TrackLinks != null) __obj.updateDynamic("TrackLinks")(TrackLinks)
    if (!js.isUndefined(TrackOpens)) __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[PostmarkMessage]
  }
}

