package typings.nodeDashMailjet.nodeDashMailjetMod.EmailNs

import typings.nodeDashMailjet.Anon_Base64Content
import typings.nodeDashMailjet.Anon_Base64ContentContentID
import typings.nodeDashMailjet.Anon_Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendParamsMessage extends js.Object {
  var Attachments: js.UndefOr[js.Array[Anon_Base64Content]] = js.undefined
  var Bcc: js.UndefOr[js.Array[SendParamsRecipient]] = js.undefined
  var Cc: js.UndefOr[js.Array[SendParamsRecipient]] = js.undefined
  var CustomCampaign: js.UndefOr[String] = js.undefined
  var CustomID: js.UndefOr[String] = js.undefined
  var DeduplicateCampaign: js.UndefOr[Boolean] = js.undefined
  var EventPayload: js.UndefOr[String] = js.undefined
  var From: Anon_Email
  var HTMLPart: js.UndefOr[String] = js.undefined
  var Headers: js.UndefOr[js.Object] = js.undefined
  var InlinedAttachments: js.UndefOr[js.Array[Anon_Base64ContentContentID]] = js.undefined
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
    From: Anon_Email,
    Subject: String,
    To: js.Array[SendParamsRecipient],
    Attachments: js.Array[Anon_Base64Content] = null,
    Bcc: js.Array[SendParamsRecipient] = null,
    Cc: js.Array[SendParamsRecipient] = null,
    CustomCampaign: String = null,
    CustomID: String = null,
    DeduplicateCampaign: js.UndefOr[Boolean] = js.undefined,
    EventPayload: String = null,
    HTMLPart: String = null,
    Headers: js.Object = null,
    InlinedAttachments: js.Array[Anon_Base64ContentContentID] = null,
    MonitoringCategory: String = null,
    TemplateID: Int | Double = null,
    TemplateLanguage: js.UndefOr[Boolean] = js.undefined,
    TextPart: String = null,
    URLTags: String = null,
    Variables: js.Object = null
  ): SendParamsMessage = {
    val __obj = js.Dynamic.literal(From = From, Subject = Subject, To = To)
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (Bcc != null) __obj.updateDynamic("Bcc")(Bcc)
    if (Cc != null) __obj.updateDynamic("Cc")(Cc)
    if (CustomCampaign != null) __obj.updateDynamic("CustomCampaign")(CustomCampaign)
    if (CustomID != null) __obj.updateDynamic("CustomID")(CustomID)
    if (!js.isUndefined(DeduplicateCampaign)) __obj.updateDynamic("DeduplicateCampaign")(DeduplicateCampaign)
    if (EventPayload != null) __obj.updateDynamic("EventPayload")(EventPayload)
    if (HTMLPart != null) __obj.updateDynamic("HTMLPart")(HTMLPart)
    if (Headers != null) __obj.updateDynamic("Headers")(Headers)
    if (InlinedAttachments != null) __obj.updateDynamic("InlinedAttachments")(InlinedAttachments)
    if (MonitoringCategory != null) __obj.updateDynamic("MonitoringCategory")(MonitoringCategory)
    if (TemplateID != null) __obj.updateDynamic("TemplateID")(TemplateID.asInstanceOf[js.Any])
    if (!js.isUndefined(TemplateLanguage)) __obj.updateDynamic("TemplateLanguage")(TemplateLanguage)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    if (URLTags != null) __obj.updateDynamic("URLTags")(URLTags)
    if (Variables != null) __obj.updateDynamic("Variables")(Variables)
    __obj.asInstanceOf[SendParamsMessage]
  }
}

