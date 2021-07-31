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
    
    @scala.inline
    def apply(): Binding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Binding]
    }
    
    @scala.inline
    implicit class BindingMutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinding(value: String): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    def callback(data: js.Any, envelope: IEnvelope[js.Any]): Unit
    @JSName("callback")
    var callback_Original: ICallback[js.Any]
    
    var channel: js.UndefOr[String] = js.undefined
    
    var topic: String
  }
  object Callback {
    
    @scala.inline
    def apply(callback: (js.Any, /* envelope */ IEnvelope[js.Any]) => Unit, topic: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (js.Any, /* envelope */ IEnvelope[js.Any]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Channel extends StObject {
    
    var channel: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object Channel {
    
    @scala.inline
    def apply(): Channel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
