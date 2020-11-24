package typings.nodeSsdp.mod

import typings.nodeSsdp.nodeSsdpStrings.`advertise-alive`
import typings.nodeSsdp.nodeSsdpStrings.`advertise-bye`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ssdp", "Server")
@js.native
class Server () extends Base {
  def this(opts: ServerOptions) = this()
  
  def advertise(): Unit = js.native
  def advertise(alive: Boolean): Unit = js.native
  
  @JSName("emit")
  def emit_advertisealive(event: `advertise-alive`, headers: SsdpHeaders): Boolean = js.native
  @JSName("emit")
  def emit_advertisebye(event: `advertise-bye`, headers: SsdpHeaders): Boolean = js.native
  
  @JSName("on")
  def on_advertisealive(event: `advertise-alive`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
  @JSName("on")
  def on_advertisebye(event: `advertise-bye`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
  
  @JSName("once")
  def once_advertisealive(event: `advertise-alive`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
  @JSName("once")
  def once_advertisebye(event: `advertise-bye`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
  
  /**
    * Binds UDP socket to an interface/port and starts advertising.
    * @param cb callback to socket.bind
    * @returns promise when socket.bind is ready
    */
  def start(): Unit | js.Promise[Unit] = js.native
  def start(cb: js.Function1[/* error */ Error, Unit]): Unit | js.Promise[Unit] = js.native
  
  /**
    * Advertise shutdown and close UDP socket.
    */
  def stop(): Unit = js.native
}
