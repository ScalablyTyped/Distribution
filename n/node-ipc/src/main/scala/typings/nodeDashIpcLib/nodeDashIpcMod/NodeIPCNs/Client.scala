package typings
package nodeDashIpcLib.nodeDashIpcMod.NodeIPCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def emit(event: java.lang.String): Client = js.native
  def emit(event: java.lang.String, value: js.Any): Client = js.native
  /**
    * Unbind subscribed events
    */
  def off(event: java.lang.String, handler: js.Any): Client = js.native
  /**
    * triggered when a JSON message is received. The event name will be the type string from your message
    * and the param will be the data object from your message eg : { type:'myEvent',data:{a:1}}
    */
  def on(event: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Client = js.native
  /**
    * connect - triggered when socket connected
    * disconnect - triggered by client when socket has disconnected from server
    * destroy - triggered when socket has been totally destroyed, no further auto retries will happen and all references are gone
    */
  @JSName("on")
  def on_connect(event: nodeDashIpcLib.nodeDashIpcLibStrings.connect, callback: js.Function0[scala.Unit]): Client = js.native
  /**
    * triggered when ipc.config.rawBuffer is true and a message is received
    */
  @JSName("on")
  def on_data(
    event: nodeDashIpcLib.nodeDashIpcLibStrings.data,
    callback: js.Function1[/* buffer */ nodeLib.Buffer, scala.Unit]
  ): Client = js.native
  @JSName("on")
  def on_destroy(event: nodeDashIpcLib.nodeDashIpcLibStrings.destroy, callback: js.Function0[scala.Unit]): Client = js.native
  @JSName("on")
  def on_disconnect(event: nodeDashIpcLib.nodeDashIpcLibStrings.disconnect, callback: js.Function0[scala.Unit]): Client = js.native
  /**
    * triggered when an error has occured
    */
  @JSName("on")
  def on_error(
    event: nodeDashIpcLib.nodeDashIpcLibStrings.error,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): Client = js.native
  /**
    * triggered by server when a client socket has disconnected
    */
  @JSName("on")
  def on_socketdisconnected(
    event: nodeDashIpcLib.nodeDashIpcLibStrings.socketDOTdisconnected,
    callback: js.Function2[
      /* socket */ nodeLib.netMod.Socket, 
      /* destroyedSocketID */ java.lang.String, 
      scala.Unit
    ]
  ): Client = js.native
}

