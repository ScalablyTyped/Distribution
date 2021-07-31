package typings.nodeObserver

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-observer", JSImport.Namespace)
  @js.native
  val ^ : Observer = js.native
  
  trait Observer extends StObject {
    
    /**
      * triggering event
      * @param targetObj objects that subscribe to events
      * @param eventName the event name
      * @param data passed to the callback function when the event is fired
      */
    def send(targetObj: js.Object, eventName: String, data: js.Any): Unit
    
    /**
      * subscirpt event
      * @param targetObj objects that subscribe to events
      * @param eventName the event name
      * @param callback callback function executed when an event is fired
      */
    def subscribe(targetObj: js.Object, eventName: String, callback: js.Any): Unit
    
    var subscribers: js.Array[js.Object]
    
    /**
      * unsubscript event
      * @param targetObj objects that subscribe to events
      * @param eventName the event name
      */
    def unsubscribe(targetObj: js.Object, eventName: String): Unit
  }
  object Observer {
    
    @scala.inline
    def apply(
      send: (js.Object, String, js.Any) => Unit,
      subscribe: (js.Object, String, js.Any) => Unit,
      subscribers: js.Array[js.Object],
      unsubscribe: (js.Object, String) => Unit
    ): Observer = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction3(send), subscribe = js.Any.fromFunction3(subscribe), subscribers = subscribers.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2(unsubscribe))
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSend(value: (js.Object, String, js.Any) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSubscribe(value: (js.Object, String, js.Any) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSubscribers(value: js.Array[js.Object]): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribersVarargs(value: js.Object*): Self = StObject.set(x, "subscribers", js.Array(value :_*))
      
      @scala.inline
      def setUnsubscribe(value: (js.Object, String) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    }
  }
  
  type _To = Observer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Observer = ^
}
