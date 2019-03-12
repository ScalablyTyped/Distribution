package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ssdp", "Client")
@js.native
class Client () extends Base {
  def this(opts: ClientOptions) = this()
  @JSName("emit")
  def emit_response(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.response,
    headers: SsdpHeaders,
    statusCode: scala.Double,
    rinfo: nodeLib.dgramMod.RemoteInfo
  ): scala.Boolean = js.native
  @JSName("on")
  def on_response(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.response,
    listener: js.Function3[
      /* headers */ SsdpHeaders, 
      /* statusCode */ scala.Double, 
      /* rinfo */ nodeLib.dgramMod.RemoteInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.response,
    listener: js.Function3[
      /* headers */ SsdpHeaders, 
      /* statusCode */ scala.Double, 
      /* rinfo */ nodeLib.dgramMod.RemoteInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  def search(serviceType: java.lang.String): scala.Unit | js.Promise[scala.Unit] = js.native
  /**
  	 * Start the listener for multicast notifications from SSDP devices
  	 * @param cb callback to socket.bind
  	 * @returns promise when socket.bind is ready
  	 */
  def start(): js.Promise[scala.Unit] = js.native
  def start(cb: js.Function1[/* error */ stdLib.Error, scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
  	 * Close UDP socket.
  	 */
  def stop(): scala.Unit = js.native
}

