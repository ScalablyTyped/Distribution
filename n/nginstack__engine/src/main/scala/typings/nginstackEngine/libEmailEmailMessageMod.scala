package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEmailEmailMessageMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/email/EmailMessage", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EmailMessage {
    
    /* CompleteClass */
    override def decode(mailSource: String): Unit = js.native
    
    /* CompleteClass */
    var header: EmailMessageHeader = js.native
    
    /* CompleteClass */
    var messagesParts: js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/email/EmailMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EmailMessage extends StObject {
    
    def decode(mailSource: String): Unit
    
    var header: EmailMessageHeader
    
    var messagesParts: js.Array[Any]
  }
  object EmailMessage {
    
    inline def apply(decode: String => Unit, header: EmailMessageHeader, messagesParts: js.Array[Any]): EmailMessage = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), header = header.asInstanceOf[js.Any], messagesParts = messagesParts.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailMessage] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: String => Unit): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setHeader(value: EmailMessageHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMessagesParts(value: js.Array[Any]): Self = StObject.set(x, "messagesParts", value.asInstanceOf[js.Any])
      
      inline def setMessagesPartsVarargs(value: Any*): Self = StObject.set(x, "messagesParts", js.Array(value*))
    }
  }
  
  type EmailMessageHeader = typings.nginstackEngine.libEmailEmailMessageHeaderMod.^
}
