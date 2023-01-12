package typings.postmark

import typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment
import typings.postmark.distClientModelsMessageSupportingTypesMod.Header
import typings.postmark.distClientModelsMessagesOutboundMessageMod.Recipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsMessagesInboundMessageMod {
  
  trait InboundMessage extends StObject {
    
    var Attachments: js.Array[Attachment]
    
    var Bcc: String
    
    var BccFull: js.Array[InboundRecipient]
    
    var Cc: String
    
    var CcFull: js.Array[InboundRecipient]
    
    var Date: String
    
    var From: String
    
    var FromFull: InboundRecipient
    
    var FromName: String
    
    var MailboxHash: String
    
    var MessageID: String
    
    var MessageStream: String
    
    var OriginalRecipient: String
    
    var ReplyTo: String
    
    var Status: String
    
    var Subject: String
    
    var Tag: js.UndefOr[String] = js.undefined
    
    var To: String
    
    var ToFull: js.Array[InboundRecipient]
  }
  object InboundMessage {
    
    inline def apply(
      Attachments: js.Array[Attachment],
      Bcc: String,
      BccFull: js.Array[InboundRecipient],
      Cc: String,
      CcFull: js.Array[InboundRecipient],
      Date: String,
      From: String,
      FromFull: InboundRecipient,
      FromName: String,
      MailboxHash: String,
      MessageID: String,
      MessageStream: String,
      OriginalRecipient: String,
      ReplyTo: String,
      Status: String,
      Subject: String,
      To: String,
      ToFull: js.Array[InboundRecipient]
    ): InboundMessage = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InboundMessage] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "Attachments", js.Array(value*))
      
      inline def setBcc(value: String): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
      
      inline def setBccFull(value: js.Array[InboundRecipient]): Self = StObject.set(x, "BccFull", value.asInstanceOf[js.Any])
      
      inline def setBccFullVarargs(value: InboundRecipient*): Self = StObject.set(x, "BccFull", js.Array(value*))
      
      inline def setCc(value: String): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
      
      inline def setCcFull(value: js.Array[InboundRecipient]): Self = StObject.set(x, "CcFull", value.asInstanceOf[js.Any])
      
      inline def setCcFullVarargs(value: InboundRecipient*): Self = StObject.set(x, "CcFull", js.Array(value*))
      
      inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
      
      inline def setFromFull(value: InboundRecipient): Self = StObject.set(x, "FromFull", value.asInstanceOf[js.Any])
      
      inline def setFromName(value: String): Self = StObject.set(x, "FromName", value.asInstanceOf[js.Any])
      
      inline def setMailboxHash(value: String): Self = StObject.set(x, "MailboxHash", value.asInstanceOf[js.Any])
      
      inline def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      inline def setOriginalRecipient(value: String): Self = StObject.set(x, "OriginalRecipient", value.asInstanceOf[js.Any])
      
      inline def setReplyTo(value: String): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
      
      inline def setToFull(value: js.Array[InboundRecipient]): Self = StObject.set(x, "ToFull", value.asInstanceOf[js.Any])
      
      inline def setToFullVarargs(value: InboundRecipient*): Self = StObject.set(x, "ToFull", js.Array(value*))
    }
  }
  
  trait InboundMessageDetails
    extends StObject
       with InboundMessage {
    
    var BlockedReason: String
    
    var Headers: js.Array[Header]
    
    var HtmlBody: String
    
    var StrippedTextReply: String
    
    var TextBody: String
  }
  object InboundMessageDetails {
    
    inline def apply(
      Attachments: js.Array[Attachment],
      Bcc: String,
      BccFull: js.Array[InboundRecipient],
      BlockedReason: String,
      Cc: String,
      CcFull: js.Array[InboundRecipient],
      Date: String,
      From: String,
      FromFull: InboundRecipient,
      FromName: String,
      Headers: js.Array[Header],
      HtmlBody: String,
      MailboxHash: String,
      MessageID: String,
      MessageStream: String,
      OriginalRecipient: String,
      ReplyTo: String,
      Status: String,
      StrippedTextReply: String,
      Subject: String,
      TextBody: String,
      To: String,
      ToFull: js.Array[InboundRecipient]
    ): InboundMessageDetails = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], BlockedReason = BlockedReason.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StrippedTextReply = StrippedTextReply.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundMessageDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InboundMessageDetails] (val x: Self) extends AnyVal {
      
      inline def setBlockedReason(value: String): Self = StObject.set(x, "BlockedReason", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "Headers", js.Array(value*))
      
      inline def setHtmlBody(value: String): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      inline def setStrippedTextReply(value: String): Self = StObject.set(x, "StrippedTextReply", value.asInstanceOf[js.Any])
      
      inline def setTextBody(value: String): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
    }
  }
  
  trait InboundMessages extends StObject {
    
    var InboundMessages: js.Array[InboundMessage]
    
    var TotalCount: String
  }
  object InboundMessages {
    
    inline def apply(InboundMessages: js.Array[InboundMessage], TotalCount: String): InboundMessages = {
      val __obj = js.Dynamic.literal(InboundMessages = InboundMessages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InboundMessages] (val x: Self) extends AnyVal {
      
      inline def setInboundMessages(value: js.Array[InboundMessage]): Self = StObject.set(x, "InboundMessages", value.asInstanceOf[js.Any])
      
      inline def setInboundMessagesVarargs(value: InboundMessage*): Self = StObject.set(x, "InboundMessages", js.Array(value*))
      
      inline def setTotalCount(value: String): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait InboundRecipient
    extends StObject
       with Recipient {
    
    var MailboxHash: String
  }
  object InboundRecipient {
    
    inline def apply(Email: String, MailboxHash: String, Name: String): InboundRecipient = {
      val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundRecipient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InboundRecipient] (val x: Self) extends AnyVal {
      
      inline def setMailboxHash(value: String): Self = StObject.set(x, "MailboxHash", value.asInstanceOf[js.Any])
    }
  }
}
