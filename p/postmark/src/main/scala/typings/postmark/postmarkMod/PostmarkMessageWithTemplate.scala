package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkMessageWithTemplate extends js.Object {
  var Bcc: js.UndefOr[String] = js.undefined
  var Cc: js.UndefOr[String] = js.undefined
  var From: String
  var Headers: js.UndefOr[js.Array[PostmarkMessageHeader]] = js.undefined
  var ReplyTo: js.UndefOr[String] = js.undefined
  var Subject: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var TemplateId: js.UndefOr[String] = js.undefined
  var TemplateModel: js.UndefOr[js.Any] = js.undefined
  var To: String
  var TrackLinks: js.UndefOr[String] = js.undefined
  var TrackOpens: js.UndefOr[Boolean] = js.undefined
}

object PostmarkMessageWithTemplate {
  @scala.inline
  def apply(
    From: String,
    To: String,
    Bcc: String = null,
    Cc: String = null,
    Headers: js.Array[PostmarkMessageHeader] = null,
    ReplyTo: String = null,
    Subject: String = null,
    Tag: String = null,
    TemplateId: String = null,
    TemplateModel: js.Any = null,
    TrackLinks: String = null,
    TrackOpens: js.UndefOr[Boolean] = js.undefined
  ): PostmarkMessageWithTemplate = {
    val __obj = js.Dynamic.literal(From = From, To = To)
    if (Bcc != null) __obj.updateDynamic("Bcc")(Bcc)
    if (Cc != null) __obj.updateDynamic("Cc")(Cc)
    if (Headers != null) __obj.updateDynamic("Headers")(Headers)
    if (ReplyTo != null) __obj.updateDynamic("ReplyTo")(ReplyTo)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId)
    if (TemplateModel != null) __obj.updateDynamic("TemplateModel")(TemplateModel)
    if (TrackLinks != null) __obj.updateDynamic("TrackLinks")(TrackLinks)
    if (!js.isUndefined(TrackOpens)) __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[PostmarkMessageWithTemplate]
  }
}

