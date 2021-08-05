package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendParamsMessage extends StObject {
  
  var Attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  var Bcc: js.UndefOr[js.Array[SendParamsRecipient]] = js.undefined
  
  var Cc: js.UndefOr[js.Array[SendParamsRecipient]] = js.undefined
  
  var CustomCampaign: js.UndefOr[String] = js.undefined
  
  var CustomID: js.UndefOr[String] = js.undefined
  
  var DeduplicateCampaign: js.UndefOr[Boolean] = js.undefined
  
  var EventPayload: js.UndefOr[String] = js.undefined
  
  var From: typings.nodeMailjet.anon.Email
  
  var HTMLPart: js.UndefOr[String] = js.undefined
  
  var Headers: js.UndefOr[js.Object] = js.undefined
  
  var InlinedAttachments: js.UndefOr[js.Array[InlinedAttachment]] = js.undefined
  
  var MonitoringCategory: js.UndefOr[String] = js.undefined
  
  var ReplyTo: js.UndefOr[SendParamsRecipient] = js.undefined
  
  var Sender: js.UndefOr[typings.nodeMailjet.anon.Email] = js.undefined
  
  var Subject: js.UndefOr[String] = js.undefined
  
  var TemplateID: js.UndefOr[Double] = js.undefined
  
  var TemplateLanguage: js.UndefOr[Boolean] = js.undefined
  
  var TextPart: js.UndefOr[String] = js.undefined
  
  var To: js.Array[SendParamsRecipient]
  
  var URLTags: js.UndefOr[String] = js.undefined
  
  var Variables: js.UndefOr[js.Object] = js.undefined
}
object SendParamsMessage {
  
  inline def apply(From: typings.nodeMailjet.anon.Email, To: js.Array[SendParamsRecipient]): SendParamsMessage = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParamsMessage]
  }
  
  extension [Self <: SendParamsMessage](x: Self) {
    
    inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
    
    inline def setBcc(value: js.Array[SendParamsRecipient]): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "Bcc", js.undefined)
    
    inline def setBccVarargs(value: SendParamsRecipient*): Self = StObject.set(x, "Bcc", js.Array(value :_*))
    
    inline def setCc(value: js.Array[SendParamsRecipient]): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "Cc", js.undefined)
    
    inline def setCcVarargs(value: SendParamsRecipient*): Self = StObject.set(x, "Cc", js.Array(value :_*))
    
    inline def setCustomCampaign(value: String): Self = StObject.set(x, "CustomCampaign", value.asInstanceOf[js.Any])
    
    inline def setCustomCampaignUndefined: Self = StObject.set(x, "CustomCampaign", js.undefined)
    
    inline def setCustomID(value: String): Self = StObject.set(x, "CustomID", value.asInstanceOf[js.Any])
    
    inline def setCustomIDUndefined: Self = StObject.set(x, "CustomID", js.undefined)
    
    inline def setDeduplicateCampaign(value: Boolean): Self = StObject.set(x, "DeduplicateCampaign", value.asInstanceOf[js.Any])
    
    inline def setDeduplicateCampaignUndefined: Self = StObject.set(x, "DeduplicateCampaign", js.undefined)
    
    inline def setEventPayload(value: String): Self = StObject.set(x, "EventPayload", value.asInstanceOf[js.Any])
    
    inline def setEventPayloadUndefined: Self = StObject.set(x, "EventPayload", js.undefined)
    
    inline def setFrom(value: typings.nodeMailjet.anon.Email): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setHTMLPart(value: String): Self = StObject.set(x, "HTMLPart", value.asInstanceOf[js.Any])
    
    inline def setHTMLPartUndefined: Self = StObject.set(x, "HTMLPart", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
    
    inline def setInlinedAttachments(value: js.Array[InlinedAttachment]): Self = StObject.set(x, "InlinedAttachments", value.asInstanceOf[js.Any])
    
    inline def setInlinedAttachmentsUndefined: Self = StObject.set(x, "InlinedAttachments", js.undefined)
    
    inline def setInlinedAttachmentsVarargs(value: InlinedAttachment*): Self = StObject.set(x, "InlinedAttachments", js.Array(value :_*))
    
    inline def setMonitoringCategory(value: String): Self = StObject.set(x, "MonitoringCategory", value.asInstanceOf[js.Any])
    
    inline def setMonitoringCategoryUndefined: Self = StObject.set(x, "MonitoringCategory", js.undefined)
    
    inline def setReplyTo(value: SendParamsRecipient): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "ReplyTo", js.undefined)
    
    inline def setSender(value: typings.nodeMailjet.anon.Email): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "Sender", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    inline def setTemplateID(value: Double): Self = StObject.set(x, "TemplateID", value.asInstanceOf[js.Any])
    
    inline def setTemplateIDUndefined: Self = StObject.set(x, "TemplateID", js.undefined)
    
    inline def setTemplateLanguage(value: Boolean): Self = StObject.set(x, "TemplateLanguage", value.asInstanceOf[js.Any])
    
    inline def setTemplateLanguageUndefined: Self = StObject.set(x, "TemplateLanguage", js.undefined)
    
    inline def setTextPart(value: String): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
    
    inline def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
    
    inline def setTo(value: js.Array[SendParamsRecipient]): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: SendParamsRecipient*): Self = StObject.set(x, "To", js.Array(value :_*))
    
    inline def setURLTags(value: String): Self = StObject.set(x, "URLTags", value.asInstanceOf[js.Any])
    
    inline def setURLTagsUndefined: Self = StObject.set(x, "URLTags", js.undefined)
    
    inline def setVariables(value: js.Object): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
  }
}
