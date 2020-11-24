package typings.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Port extends js.Object {
  
  def disconnect(): Unit = js.native
  
  var name: String = js.native
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: typings.chrome.chrome.runtime.PortDisconnectEvent = js.native
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: typings.chrome.chrome.runtime.PortMessageEvent = js.native
  
  def postMessage(message: js.Any): Unit = js.native
  
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[typings.chrome.chrome.runtime.MessageSender] = js.native
}
object Port {
  
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: typings.chrome.chrome.runtime.PortDisconnectEvent,
    onMessage: typings.chrome.chrome.runtime.PortMessageEvent,
    postMessage: js.Any => Unit
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDisconnect(value: typings.chrome.chrome.runtime.PortDisconnectEvent): Self = this.set("onDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: typings.chrome.chrome.runtime.PortMessageEvent): Self = this.set("onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessage(value: js.Any => Unit): Self = this.set("postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSender(value: typings.chrome.chrome.runtime.MessageSender): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
  }
}
