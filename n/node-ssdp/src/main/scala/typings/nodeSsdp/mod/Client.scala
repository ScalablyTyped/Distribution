package typings.nodeSsdp.mod

import typings.node.dgramMod.RemoteInfo
import typings.nodeSsdp.nodeSsdpStrings.response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ssdp", "Client")
@js.native
class Client () extends Base {
  def this(opts: ClientOptions) = this()
  
  @JSName("emit")
  def emit_response(event: response, headers: SsdpHeaders, statusCode: Double, rinfo: RemoteInfo): Boolean = js.native
  
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function3[/* headers */ SsdpHeaders, /* statusCode */ Double, /* rinfo */ RemoteInfo, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_response(
    event: response,
    listener: js.Function3[/* headers */ SsdpHeaders, /* statusCode */ Double, /* rinfo */ RemoteInfo, Unit]
  ): this.type = js.native
  
  def search(serviceType: String): Unit | js.Promise[Unit] = js.native
  
  /**
    * Start the listener for multicast notifications from SSDP devices
    * @param cb callback to socket.bind
    * @returns promise when socket.bind is ready
    */
  def start(): js.Promise[Unit] = js.native
  def start(cb: js.Function1[/* error */ Error, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Close UDP socket.
    */
  def stop(): Unit = js.native
}
