package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ssdp", "Server")
@js.native
class Server () extends Base {
  def this(opts: ServerOptions) = this()
  def advertise(): scala.Unit = js.native
  def advertise(alive: scala.Boolean): scala.Unit = js.native
  @JSName("emit")
  def `emit_advertise-alive`(event: nodeDashSsdpLib.nodeDashSsdpLibStrings.`advertise-alive`, headers: SsdpHeaders): scala.Boolean = js.native
  @JSName("emit")
  def `emit_advertise-bye`(event: nodeDashSsdpLib.nodeDashSsdpLibStrings.`advertise-bye`, headers: SsdpHeaders): scala.Boolean = js.native
  @JSName("on")
  def `on_advertise-alive`(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.`advertise-alive`,
    listener: js.Function1[/* headers */ SsdpHeaders, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_advertise-bye`(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.`advertise-bye`,
    listener: js.Function1[/* headers */ SsdpHeaders, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_advertise-alive`(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.`advertise-alive`,
    listener: js.Function1[/* headers */ SsdpHeaders, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_advertise-bye`(
    event: nodeDashSsdpLib.nodeDashSsdpLibStrings.`advertise-bye`,
    listener: js.Function1[/* headers */ SsdpHeaders, scala.Unit]
  ): this.type = js.native
  /**
  	 * Binds UDP socket to an interface/port and starts advertising.
  	 * @param cb callback to socket.bind
  	 * @returns promise when socket.bind is ready
  	 */
  def start(): scala.Unit | js.Promise[scala.Unit] = js.native
  def start(cb: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit | js.Promise[scala.Unit] = js.native
  /**
  	 * Advertise shutdown and close UDP socket.
  	 */
  def stop(): scala.Unit = js.native
}

