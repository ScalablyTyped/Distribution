package typings.naverWhale.whale.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  def disconnect(): Unit
  
  var name: String
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: typings.chrome.chrome.runtime.PortDisconnectEvent
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: typings.chrome.chrome.runtime.PortMessageEvent
  
  def postMessage(message: Any): Unit
  
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[typings.chrome.chrome.runtime.MessageSender] = js.undefined
}
object Port {
  
  inline def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: typings.chrome.chrome.runtime.PortDisconnectEvent,
    onMessage: typings.chrome.chrome.runtime.PortMessageEvent,
    postMessage: Any => Unit
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnDisconnect(value: typings.chrome.chrome.runtime.PortDisconnectEvent): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: typings.chrome.chrome.runtime.PortMessageEvent): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    inline def setSender(value: typings.chrome.chrome.runtime.MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
