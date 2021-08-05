package typings.postmark

import typings.postmark.defaultResponseMod.DefaultResponse
import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.Header
import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typings.postmark.supportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("postmark/dist/client/models/message/Message", "Message")
  @js.native
  class Message protected () extends StObject {
    def this(
      From: String,
      Subject: String,
      HtmlBody: js.UndefOr[String],
      TextBody: js.UndefOr[String],
      To: js.UndefOr[String],
      Cc: js.UndefOr[String],
      Bcc: js.UndefOr[String],
      ReplyTo: js.UndefOr[String],
      Tag: js.UndefOr[String],
      TrackOpens: js.UndefOr[Boolean],
      TrackLinks: js.UndefOr[LinkTrackingOptions],
      Headers: js.UndefOr[js.Array[Header]],
      Attachments: js.UndefOr[js.Array[Attachment]],
      Metadata: js.UndefOr[Hash[String]]
    ) = this()
    
    var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
    
    var Bcc: js.UndefOr[String] = js.native
    
    var Cc: js.UndefOr[String] = js.native
    
    var From: String = js.native
    
    var Headers: js.UndefOr[js.Array[Header]] = js.native
    
    var HtmlBody: js.UndefOr[String] = js.native
    
    var MessageStream: js.UndefOr[String] = js.native
    
    var Metadata: js.UndefOr[Hash[String]] = js.native
    
    var ReplyTo: js.UndefOr[String] = js.native
    
    var Subject: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var TextBody: js.UndefOr[String] = js.native
    
    var To: js.UndefOr[String] = js.native
    
    var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
    
    var TrackOpens: js.UndefOr[Boolean] = js.native
  }
  
  trait MessageSendingResponse
    extends StObject
       with DefaultResponse {
    
    var Bcc: js.UndefOr[String] = js.undefined
    
    var Cc: js.UndefOr[String] = js.undefined
    
    var MessageID: js.UndefOr[String] = js.undefined
    
    var SubmittedAt: String
    
    var To: js.UndefOr[String] = js.undefined
  }
  object MessageSendingResponse {
    
    inline def apply(ErrorCode: Double, Message: String, SubmittedAt: String): MessageSendingResponse = {
      val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageSendingResponse]
    }
    
    extension [Self <: MessageSendingResponse](x: Self) {
      
      inline def setBcc(value: String): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "Bcc", js.undefined)
      
      inline def setCc(value: String): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "Cc", js.undefined)
      
      inline def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      inline def setMessageIDUndefined: Self = StObject.set(x, "MessageID", js.undefined)
      
      inline def setSubmittedAt(value: String): Self = StObject.set(x, "SubmittedAt", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
    }
  }
}
