package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEmailEmailMessageHeaderMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/email/EmailMessageHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EmailMessageHeader {
    
    /* CompleteClass */
    var cc: js.Array[Any] = js.native
    
    /* CompleteClass */
    var charsetCode: String = js.native
    
    /* CompleteClass */
    var customHeaders: Any = js.native
    
    /* CompleteClass */
    var date: js.Date = js.native
    
    /* CompleteClass */
    var from: String = js.native
    
    /* CompleteClass */
    var messageID: String = js.native
    
    /* CompleteClass */
    var organization: String = js.native
    
    /* CompleteClass */
    var priority: String = js.native
    
    /* CompleteClass */
    var replyTo: String = js.native
    
    /* CompleteClass */
    var subject: String = js.native
    
    /* CompleteClass */
    var to: js.Array[Any] = js.native
    
    /* CompleteClass */
    var xMailer: String = js.native
  }
  @JSImport("@nginstack/engine/lib/email/EmailMessageHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EmailMessageHeader extends StObject {
    
    var cc: js.Array[Any]
    
    var charsetCode: String
    
    var customHeaders: Any
    
    var date: js.Date
    
    var from: String
    
    var messageID: String
    
    var organization: String
    
    var priority: String
    
    var replyTo: String
    
    var subject: String
    
    var to: js.Array[Any]
    
    var xMailer: String
  }
  object EmailMessageHeader {
    
    inline def apply(
      cc: js.Array[Any],
      charsetCode: String,
      customHeaders: Any,
      date: js.Date,
      from: String,
      messageID: String,
      organization: String,
      priority: String,
      replyTo: String,
      subject: String,
      to: js.Array[Any],
      xMailer: String
    ): EmailMessageHeader = {
      val __obj = js.Dynamic.literal(cc = cc.asInstanceOf[js.Any], charsetCode = charsetCode.asInstanceOf[js.Any], customHeaders = customHeaders.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], replyTo = replyTo.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], xMailer = xMailer.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailMessageHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailMessageHeader] (val x: Self) extends AnyVal {
      
      inline def setCc(value: js.Array[Any]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcVarargs(value: Any*): Self = StObject.set(x, "cc", js.Array(value*))
      
      inline def setCharsetCode(value: String): Self = StObject.set(x, "charsetCode", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setTo(value: js.Array[Any]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: Any*): Self = StObject.set(x, "to", js.Array(value*))
      
      inline def setXMailer(value: String): Self = StObject.set(x, "xMailer", value.asInstanceOf[js.Any])
    }
  }
}
