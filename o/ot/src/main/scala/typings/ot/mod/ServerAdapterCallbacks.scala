package typings.ot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerAdapterCallbacks extends js.Object {
  
  def ack(): Unit = js.native
  
  def client_left(clientId: String): Unit = js.native
  
  def clients(clients: js.Any): Unit = js.native
  
  def operation(operation: SerializedTextOperation): Unit = js.native
  
  def reconnect(): Unit = js.native
  
  def selection(clientId: String, selection: String): Unit = js.native
  
  def set_name(clientId: String, name: String): Unit = js.native
}
object ServerAdapterCallbacks {
  
  @scala.inline
  def apply(
    ack: () => Unit,
    client_left: String => Unit,
    clients: js.Any => Unit,
    operation: SerializedTextOperation => Unit,
    reconnect: () => Unit,
    selection: (String, String) => Unit,
    set_name: (String, String) => Unit
  ): ServerAdapterCallbacks = {
    val __obj = js.Dynamic.literal(ack = js.Any.fromFunction0(ack), client_left = js.Any.fromFunction1(client_left), clients = js.Any.fromFunction1(clients), operation = js.Any.fromFunction1(operation), reconnect = js.Any.fromFunction0(reconnect), selection = js.Any.fromFunction2(selection), set_name = js.Any.fromFunction2(set_name))
    __obj.asInstanceOf[ServerAdapterCallbacks]
  }
  
  @scala.inline
  implicit class ServerAdapterCallbacksOps[Self <: ServerAdapterCallbacks] (val x: Self) extends AnyVal {
    
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
    def setAck(value: () => Unit): Self = this.set("ack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClient_left(value: String => Unit): Self = this.set("client_left", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClients(value: js.Any => Unit): Self = this.set("clients", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOperation(value: SerializedTextOperation => Unit): Self = this.set("operation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReconnect(value: () => Unit): Self = this.set("reconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelection(value: (String, String) => Unit): Self = this.set("selection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_name(value: (String, String) => Unit): Self = this.set("set_name", js.Any.fromFunction2(value))
  }
}
