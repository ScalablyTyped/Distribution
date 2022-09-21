package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Binding extends StObject {
    
    var binding: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object Binding {
    
    inline def apply(): Binding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Binding]
    }
    
    extension [Self <: Binding](x: Self) {
      
      inline def setBinding(value: String): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    def callback(data: Any, envelope: IEnvelope[Any]): Unit
    @JSName("callback")
    var callback_Original: ICallback[Any]
    
    var channel: js.UndefOr[String] = js.undefined
    
    var topic: String
  }
  object Callback {
    
    inline def apply(callback: (Any, /* envelope */ IEnvelope[Any]) => Unit, topic: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: (Any, /* envelope */ IEnvelope[Any]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Channel extends StObject {
    
    var channel: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object Channel {
    
    inline def apply(): Channel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
