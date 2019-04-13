package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkMessageWithTemplate extends js.Object {
  var Bcc: js.UndefOr[java.lang.String] = js.undefined
  var Cc: js.UndefOr[java.lang.String] = js.undefined
  var From: java.lang.String
  var Headers: js.UndefOr[js.Array[PostmarkMessageHeader]] = js.undefined
  var ReplyTo: js.UndefOr[java.lang.String] = js.undefined
  var Subject: js.UndefOr[java.lang.String] = js.undefined
  var Tag: js.UndefOr[java.lang.String] = js.undefined
  var TemplateId: js.UndefOr[java.lang.String] = js.undefined
  var TemplateModel: js.UndefOr[js.Any] = js.undefined
  var To: java.lang.String
  var TrackLinks: js.UndefOr[java.lang.String] = js.undefined
  var TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
}

object PostmarkMessageWithTemplate {
  @scala.inline
  def apply(
    From: java.lang.String,
    To: java.lang.String,
    Bcc: java.lang.String = null,
    Cc: java.lang.String = null,
    Headers: js.Array[PostmarkMessageHeader] = null,
    ReplyTo: java.lang.String = null,
    Subject: java.lang.String = null,
    Tag: java.lang.String = null,
    TemplateId: java.lang.String = null,
    TemplateModel: js.Any = null,
    TrackLinks: java.lang.String = null,
    TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
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

