package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailMessageMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/mail/MailMessage", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MailMessage {
    
    /* CompleteClass */
    override def decode(mailSource: String): Unit = js.native
    
    /* CompleteClass */
    var header: Any = js.native
    
    /* CompleteClass */
    var messagesParts: js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/mail/MailMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MailMessage extends StObject {
    
    def decode(mailSource: String): Unit
    
    var header: Any
    
    var messagesParts: js.Array[Any]
  }
  object MailMessage {
    
    inline def apply(decode: String => Unit, header: Any, messagesParts: js.Array[Any]): MailMessage = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), header = header.asInstanceOf[js.Any], messagesParts = messagesParts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailMessage]
    }
    
    extension [Self <: MailMessage](x: Self) {
      
      inline def setDecode(value: String => Unit): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMessagesParts(value: js.Array[Any]): Self = StObject.set(x, "messagesParts", value.asInstanceOf[js.Any])
      
      inline def setMessagesPartsVarargs(value: Any*): Self = StObject.set(x, "messagesParts", js.Array(value*))
    }
  }
}
