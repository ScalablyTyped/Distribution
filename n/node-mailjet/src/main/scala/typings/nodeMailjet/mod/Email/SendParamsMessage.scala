package typings.nodeMailjet.mod.Email

import typings.nodeMailjet.AnonBase64Content
import typings.nodeMailjet.AnonBase64ContentContentID
import typings.nodeMailjet.AnonEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendParamsMessage extends js.Object {
  var Attachments: js.UndefOr[js.Array[AnonBase64Content]] = js.undefined
  var Bcc: js.UndefOr[js.Array[SendParamsRecipient]] = js.undefined
  var Cc: js.UndefOr[js.Array[SendParamsRecipient]] = js.undefined
  var CustomCampaign: js.UndefOr[String] = js.undefined
  var CustomID: js.UndefOr[String] = js.undefined
  var DeduplicateCampaign: js.UndefOr[Boolean] = js.undefined
  var EventPayload: js.UndefOr[String] = js.undefined
  var From: AnonEmail
  var HTMLPart: js.UndefOr[String] = js.undefined
  var Headers: js.UndefOr[js.Object] = js.undefined
  var InlinedAttachments: js.UndefOr[js.Array[AnonBase64ContentContentID]] = js.undefined
  var MonitoringCategory: js.UndefOr[String] = js.undefined
  var Subject: String
  var TemplateID: js.UndefOr[Double] = js.undefined
  var TemplateLanguage: js.UndefOr[Boolean] = js.undefined
  var TextPart: js.UndefOr[String] = js.undefined
  var To: js.Array[SendParamsRecipient]
  var URLTags: js.UndefOr[String] = js.undefined
  var Variables: js.UndefOr[js.Object] = js.undefined
}

object SendParamsMessage {
  @scala.inline
  def apply(
    From: AnonEmail,
    Subject: String,
    To: js.Array[SendParamsRecipient],
    Attachments: js.Array[AnonBase64Content] = null,
    Bcc: js.Array[SendParamsRecipient] = null,
    Cc: js.Array[SendParamsRecipient] = null,
    CustomCampaign: String = null,
    CustomID: String = null,
    DeduplicateCampaign: js.UndefOr[Boolean] = js.undefined,
    EventPayload: String = null,
    HTMLPart: String = null,
    Headers: js.Object = null,
    InlinedAttachments: js.Array[AnonBase64ContentContentID] = null,
    MonitoringCategory: String = null,
    TemplateID: Int | Double = null,
    TemplateLanguage: js.UndefOr[Boolean] = js.undefined,
    TextPart: String = null,
    URLTags: String = null,
    Variables: js.Object = null
  ): SendParamsMessage = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments.asInstanceOf[js.Any])
    if (Bcc != null) __obj.updateDynamic("Bcc")(Bcc.asInstanceOf[js.Any])
    if (Cc != null) __obj.updateDynamic("Cc")(Cc.asInstanceOf[js.Any])
    if (CustomCampaign != null) __obj.updateDynamic("CustomCampaign")(CustomCampaign.asInstanceOf[js.Any])
    if (CustomID != null) __obj.updateDynamic("CustomID")(CustomID.asInstanceOf[js.Any])
    if (!js.isUndefined(DeduplicateCampaign)) __obj.updateDynamic("DeduplicateCampaign")(DeduplicateCampaign.asInstanceOf[js.Any])
    if (EventPayload != null) __obj.updateDynamic("EventPayload")(EventPayload.asInstanceOf[js.Any])
    if (HTMLPart != null) __obj.updateDynamic("HTMLPart")(HTMLPart.asInstanceOf[js.Any])
    if (Headers != null) __obj.updateDynamic("Headers")(Headers.asInstanceOf[js.Any])
    if (InlinedAttachments != null) __obj.updateDynamic("InlinedAttachments")(InlinedAttachments.asInstanceOf[js.Any])
    if (MonitoringCategory != null) __obj.updateDynamic("MonitoringCategory")(MonitoringCategory.asInstanceOf[js.Any])
    if (TemplateID != null) __obj.updateDynamic("TemplateID")(TemplateID.asInstanceOf[js.Any])
    if (!js.isUndefined(TemplateLanguage)) __obj.updateDynamic("TemplateLanguage")(TemplateLanguage.asInstanceOf[js.Any])
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart.asInstanceOf[js.Any])
    if (URLTags != null) __obj.updateDynamic("URLTags")(URLTags.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParamsMessage]
  }
}

