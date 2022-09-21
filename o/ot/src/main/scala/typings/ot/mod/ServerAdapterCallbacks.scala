package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerAdapterCallbacks extends StObject {
  
  def ack(): Unit
  
  def client_left(clientId: String): Unit
  
  def clients(clients: Any): Unit
  
  def operation(operation: SerializedTextOperation): Unit
  
  def reconnect(): Unit
  
  def selection(clientId: String, selection: String): Unit
  
  def set_name(clientId: String, name: String): Unit
}
object ServerAdapterCallbacks {
  
  inline def apply(
    ack: () => Unit,
    client_left: String => Unit,
    clients: Any => Unit,
    operation: SerializedTextOperation => Unit,
    reconnect: () => Unit,
    selection: (String, String) => Unit,
    set_name: (String, String) => Unit
  ): ServerAdapterCallbacks = {
    val __obj = js.Dynamic.literal(ack = js.Any.fromFunction0(ack), client_left = js.Any.fromFunction1(client_left), clients = js.Any.fromFunction1(clients), operation = js.Any.fromFunction1(operation), reconnect = js.Any.fromFunction0(reconnect), selection = js.Any.fromFunction2(selection), set_name = js.Any.fromFunction2(set_name))
    __obj.asInstanceOf[ServerAdapterCallbacks]
  }
  
  extension [Self <: ServerAdapterCallbacks](x: Self) {
    
    inline def setAck(value: () => Unit): Self = StObject.set(x, "ack", js.Any.fromFunction0(value))
    
    inline def setClient_left(value: String => Unit): Self = StObject.set(x, "client_left", js.Any.fromFunction1(value))
    
    inline def setClients(value: Any => Unit): Self = StObject.set(x, "clients", js.Any.fromFunction1(value))
    
    inline def setOperation(value: SerializedTextOperation => Unit): Self = StObject.set(x, "operation", js.Any.fromFunction1(value))
    
    inline def setReconnect(value: () => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction0(value))
    
    inline def setSelection(value: (String, String) => Unit): Self = StObject.set(x, "selection", js.Any.fromFunction2(value))
    
    inline def setSet_name(value: (String, String) => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction2(value))
  }
}
