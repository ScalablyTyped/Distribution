package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMessageBufferMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/messaging/MessageBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MessageBuffer {
    
    /* CompleteClass */
    override def add(targetId: String, message: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var messages_ : Any = js.native
    
    /* CompleteClass */
    override def retrieve(): js.Array[Message] = js.native
  }
  @JSImport("@nginstack/web-framework/lib/messaging/MessageBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MessageBuffer extends StObject {
    
    def add(targetId: String, message: Any): Unit
    
    /* private */ var messages_ : Any
    
    def retrieve(): js.Array[Message]
  }
  object MessageBuffer {
    
    inline def apply(add: (String, Any) => Unit, messages_ : Any, retrieve: () => js.Array[Message]): MessageBuffer = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), messages_ = messages_.asInstanceOf[js.Any], retrieve = js.Any.fromFunction0(retrieve))
      __obj.asInstanceOf[MessageBuffer]
    }
    
    extension [Self <: MessageBuffer](x: Self) {
      
      inline def setAdd(value: (String, Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setMessages_(value: Any): Self = StObject.set(x, "messages_", value.asInstanceOf[js.Any])
      
      inline def setRetrieve(value: () => js.Array[Message]): Self = StObject.set(x, "retrieve", js.Any.fromFunction0(value))
    }
  }
}
