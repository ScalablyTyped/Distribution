package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comms extends StObject {
  
  def connect(): Unit
  
  def subscribe(topic: String, callback: CommSubscriber): Unit
  
  def unsubscribe(topic: String, callback: CommSubscriber): Unit
}
object Comms {
  
  @scala.inline
  def apply(
    connect: () => Unit,
    subscribe: (String, CommSubscriber) => Unit,
    unsubscribe: (String, CommSubscriber) => Unit
  ): Comms = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[Comms]
  }
  
  @scala.inline
  implicit class CommsMutableBuilder[Self <: Comms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: (String, CommSubscriber) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribe(value: (String, CommSubscriber) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
  }
}
