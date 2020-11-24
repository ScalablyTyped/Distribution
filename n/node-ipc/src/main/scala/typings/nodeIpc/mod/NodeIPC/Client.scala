package typings.nodeIpc.mod.NodeIPC

import typings.node.Buffer
import typings.node.netMod.Socket
import typings.nodeIpc.nodeIpcStrings.connect
import typings.nodeIpc.nodeIpcStrings.data
import typings.nodeIpc.nodeIpcStrings.destroy
import typings.nodeIpc.nodeIpcStrings.disconnect
import typings.nodeIpc.nodeIpcStrings.error
import typings.nodeIpc.nodeIpcStrings.socketDotdisconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  def emit(event: String): Client = js.native
  def emit(event: String, value: js.Any): Client = js.native
  
  /**
    * Unbind subscribed events
    */
  def off(event: String, handler: js.Any): Client = js.native
  
  /**
    * triggered when a JSON message is received. The event name will be the type string from your message
    * and the param will be the data object from your message eg : { type:'myEvent',data:{a:1}}
    */
  def on(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Client = js.native
  /**
    * connect - triggered when socket connected
    * disconnect - triggered by client when socket has disconnected from server
    * destroy - triggered when socket has been totally destroyed, no further auto retries will happen and all references are gone
    */
  @JSName("on")
  def on_connect(event: connect, callback: js.Function0[Unit]): Client = js.native
  /**
    * triggered when ipc.config.rawBuffer is true and a message is received
    */
  @JSName("on")
  def on_data(event: data, callback: js.Function1[/* buffer */ Buffer, Unit]): Client = js.native
  @JSName("on")
  def on_destroy(event: destroy, callback: js.Function0[Unit]): Client = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, callback: js.Function0[Unit]): Client = js.native
  /**
    * triggered when an error has occured
    */
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ js.Any, Unit]): Client = js.native
  /**
    * triggered by server when a client socket has disconnected
    */
  @JSName("on")
  def on_socketdisconnected(
    event: socketDotdisconnected,
    callback: js.Function2[/* socket */ Socket, /* destroyedSocketID */ String, Unit]
  ): Client = js.native
}
