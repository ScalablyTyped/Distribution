package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendParamsMessage extends js.Object {
  var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
  var Bcc: js.UndefOr[js.Array[SendParamsRecipient]] = js.native
  var Cc: js.UndefOr[js.Array[SendParamsRecipient]] = js.native
  var CustomCampaign: js.UndefOr[String] = js.native
  var CustomID: js.UndefOr[String] = js.native
  var DeduplicateCampaign: js.UndefOr[Boolean] = js.native
  var EventPayload: js.UndefOr[String] = js.native
  var From: typings.nodeMailjet.anon.Email = js.native
  var HTMLPart: js.UndefOr[String] = js.native
  var Headers: js.UndefOr[js.Object] = js.native
  var InlinedAttachments: js.UndefOr[js.Array[InlinedAttachment]] = js.native
  var MonitoringCategory: js.UndefOr[String] = js.native
  var ReplyTo: js.UndefOr[SendParamsRecipient] = js.native
  var Sender: js.UndefOr[typings.nodeMailjet.anon.Email] = js.native
  var Subject: String = js.native
  var TemplateID: js.UndefOr[Double] = js.native
  var TemplateLanguage: js.UndefOr[Boolean] = js.native
  var TextPart: js.UndefOr[String] = js.native
  var To: js.Array[SendParamsRecipient] = js.native
  var URLTags: js.UndefOr[String] = js.native
  var Variables: js.UndefOr[js.Object] = js.native
}

object SendParamsMessage {
  @scala.inline
  def apply(From: typings.nodeMailjet.anon.Email, Subject: String, To: js.Array[SendParamsRecipient]): SendParamsMessage = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParamsMessage]
  }
  @scala.inline
  implicit class SendParamsMessageOps[Self <: SendParamsMessage] (val x: Self) extends AnyVal {
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
    def setFrom(value: typings.nodeMailjet.anon.Email): Self = this.set("From", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: SendParamsRecipient*): Self = this.set("To", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[SendParamsRecipient]): Self = this.set("To", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("Attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("Attachments", js.undefined)
    @scala.inline
    def setBccVarargs(value: SendParamsRecipient*): Self = this.set("Bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: js.Array[SendParamsRecipient]): Self = this.set("Bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("Bcc", js.undefined)
    @scala.inline
    def setCcVarargs(value: SendParamsRecipient*): Self = this.set("Cc", js.Array(value :_*))
    @scala.inline
    def setCc(value: js.Array[SendParamsRecipient]): Self = this.set("Cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("Cc", js.undefined)
    @scala.inline
    def setCustomCampaign(value: String): Self = this.set("CustomCampaign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCampaign: Self = this.set("CustomCampaign", js.undefined)
    @scala.inline
    def setCustomID(value: String): Self = this.set("CustomID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomID: Self = this.set("CustomID", js.undefined)
    @scala.inline
    def setDeduplicateCampaign(value: Boolean): Self = this.set("DeduplicateCampaign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeduplicateCampaign: Self = this.set("DeduplicateCampaign", js.undefined)
    @scala.inline
    def setEventPayload(value: String): Self = this.set("EventPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventPayload: Self = this.set("EventPayload", js.undefined)
    @scala.inline
    def setHTMLPart(value: String): Self = this.set("HTMLPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTMLPart: Self = this.set("HTMLPart", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("Headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("Headers", js.undefined)
    @scala.inline
    def setInlinedAttachmentsVarargs(value: InlinedAttachment*): Self = this.set("InlinedAttachments", js.Array(value :_*))
    @scala.inline
    def setInlinedAttachments(value: js.Array[InlinedAttachment]): Self = this.set("InlinedAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlinedAttachments: Self = this.set("InlinedAttachments", js.undefined)
    @scala.inline
    def setMonitoringCategory(value: String): Self = this.set("MonitoringCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringCategory: Self = this.set("MonitoringCategory", js.undefined)
    @scala.inline
    def setReplyTo(value: SendParamsRecipient): Self = this.set("ReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("ReplyTo", js.undefined)
    @scala.inline
    def setSender(value: typings.nodeMailjet.anon.Email): Self = this.set("Sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("Sender", js.undefined)
    @scala.inline
    def setTemplateID(value: Double): Self = this.set("TemplateID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateID: Self = this.set("TemplateID", js.undefined)
    @scala.inline
    def setTemplateLanguage(value: Boolean): Self = this.set("TemplateLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLanguage: Self = this.set("TemplateLanguage", js.undefined)
    @scala.inline
    def setTextPart(value: String): Self = this.set("TextPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPart: Self = this.set("TextPart", js.undefined)
    @scala.inline
    def setURLTags(value: String): Self = this.set("URLTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURLTags: Self = this.set("URLTags", js.undefined)
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("Variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
  
}

