package typings.postmark

import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.Header
import typings.postmark.outboundMessageMod.Recipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboundMessageMod {
  
  @js.native
  trait InboundMessage extends StObject {
    
    var Attachments: js.Array[Attachment] = js.native
    
    var Bcc: String = js.native
    
    var BccFull: js.Array[InboundRecipient] = js.native
    
    var Cc: String = js.native
    
    var CcFull: js.Array[InboundRecipient] = js.native
    
    var Date: String = js.native
    
    var From: String = js.native
    
    var FromFull: InboundRecipient = js.native
    
    var FromName: String = js.native
    
    var MailboxHash: String = js.native
    
    var MessageID: String = js.native
    
    var MessageStream: String = js.native
    
    var OriginalRecipient: String = js.native
    
    var ReplyTo: String = js.native
    
    var Status: String = js.native
    
    var Subject: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var To: String = js.native
    
    var ToFull: js.Array[InboundRecipient] = js.native
  }
  object InboundMessage {
    
    @scala.inline
    def apply(
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
    implicit class InboundMessageMutableBuilder[Self <: InboundMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
      
      @scala.inline
      def setBcc(value: String): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccFull(value: js.Array[InboundRecipient]): Self = StObject.set(x, "BccFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccFullVarargs(value: InboundRecipient*): Self = StObject.set(x, "BccFull", js.Array(value :_*))
      
      @scala.inline
      def setCc(value: String): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcFull(value: js.Array[InboundRecipient]): Self = StObject.set(x, "CcFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcFullVarargs(value: InboundRecipient*): Self = StObject.set(x, "CcFull", js.Array(value :_*))
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromFull(value: InboundRecipient): Self = StObject.set(x, "FromFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromName(value: String): Self = StObject.set(x, "FromName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailboxHash(value: String): Self = StObject.set(x, "MailboxHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalRecipient(value: String): Self = StObject.set(x, "OriginalRecipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyTo(value: String): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFull(value: js.Array[InboundRecipient]): Self = StObject.set(x, "ToFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFullVarargs(value: InboundRecipient*): Self = StObject.set(x, "ToFull", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InboundMessageDetails extends InboundMessage {
    
    var BlockedReason: String = js.native
    
    var Headers: js.Array[Header] = js.native
    
    var HtmlBody: String = js.native
    
    var StrippedTextReply: String = js.native
    
    var TextBody: String = js.native
  }
  object InboundMessageDetails {
    
    @scala.inline
    def apply(
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
    implicit class InboundMessageDetailsMutableBuilder[Self <: InboundMessageDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockedReason(value: String): Self = StObject.set(x, "BlockedReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: Header*): Self = StObject.set(x, "Headers", js.Array(value :_*))
      
      @scala.inline
      def setHtmlBody(value: String): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrippedTextReply(value: String): Self = StObject.set(x, "StrippedTextReply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBody(value: String): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InboundMessages extends StObject {
    
    var InboundMessages: js.Array[InboundMessage] = js.native
    
    var TotalCount: String = js.native
  }
  object InboundMessages {
    
    @scala.inline
    def apply(InboundMessages: js.Array[InboundMessage], TotalCount: String): InboundMessages = {
      val __obj = js.Dynamic.literal(InboundMessages = InboundMessages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundMessages]
    }
    
    @scala.inline
    implicit class InboundMessagesMutableBuilder[Self <: InboundMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInboundMessages(value: js.Array[InboundMessage]): Self = StObject.set(x, "InboundMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundMessagesVarargs(value: InboundMessage*): Self = StObject.set(x, "InboundMessages", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: String): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InboundRecipient extends Recipient {
    
    var MailboxHash: String = js.native
  }
  object InboundRecipient {
    
    @scala.inline
    def apply(Email: String, MailboxHash: String, Name: String): InboundRecipient = {
      val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundRecipient]
    }
    
    @scala.inline
    implicit class InboundRecipientMutableBuilder[Self <: InboundRecipient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMailboxHash(value: String): Self = StObject.set(x, "MailboxHash", value.asInstanceOf[js.Any])
    }
  }
}
