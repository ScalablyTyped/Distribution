package typings.ncom.mod

import typings.ncom.ncomStrings.connection
import typings.ncom.ncomStrings.error
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.ListenOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncom", "ComServer")
@js.native
class ComServer () extends EventEmitter {
  def this(options: ComServerOptions) = this()
  def this(options: SecureComServerOptions) = this()
  @JSName("addListener")
  def addListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Forwards to net.Server.close()
    */
  def close(): this.type = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("emit")
  def emit_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  /**
    * Forwards to net.Server.listen()
    */
  // tslint:disable:unified-signatures Copied from net.d.ts, where the rule is disabled
  def listen(): this.type = js.native
  def listen(handle: js.Any): this.type = js.native
  def listen(handle: js.Any, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(handle: js.Any, backlog: Double): this.type = js.native
  def listen(handle: js.Any, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(options: ListenOptions): this.type = js.native
  def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String): this.type = js.native
  def listen(path: String, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String, backlog: Double): this.type = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], backlog: Double): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: js.UndefOr[scala.Nothing],
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: js.UndefOr[scala.Nothing], backlog: Double): this.type = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: js.UndefOr[scala.Nothing],
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: String): this.type = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: String,
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: String, backlog: Double): this.type = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: String,
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double): this.type = js.native
  def listen(port: Double, backlog: Double): this.type = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(
    port: Double,
    hostname: js.UndefOr[scala.Nothing],
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double): this.type = js.native
  def listen(
    port: Double,
    hostname: js.UndefOr[scala.Nothing],
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String): this.type = js.native
  def listen(
    port: Double,
    hostname: String,
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
}

