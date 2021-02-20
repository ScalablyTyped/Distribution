package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Binding extends StObject {
    
    var binding: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var topic: js.UndefOr[String] = js.native
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
  
  @js.native
  trait Callback extends StObject {
    
    def callback(data: js.Any, envelope: IEnvelope[_]): Unit = js.native
    @JSName("callback")
    var callback_Original: ICallback[_] = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var topic: String = js.native
  }
  
  @js.native
  trait Channel extends StObject {
    
    var channel: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var topic: js.UndefOr[String] = js.native
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
