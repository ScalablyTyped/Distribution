package typings.node.netMod

import typings.node.AnonAllowHalfOpen
import typings.node.childProcessMod.SendHandle
import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.close
import typings.node.nodeStrings.connection
import typings.node.nodeStrings.error
import typings.node.nodeStrings.listening
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/net.js
@JSImport("net", "Server")
@js.native
class Server ()
  extends EventEmitter
     with SendHandle {
  def this(connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  def this(options: AnonAllowHalfOpen) = this()
  def this(options: AnonAllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  var connections: Double = js.native
  var listening: Boolean = js.native
  var maxConnections: Double = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  def address(): AddressInfo | String | Null = js.native
  def close(): this.type = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_connection(event: connection, socket: Socket): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening): Boolean = js.native
  def getConnections(cb: js.Function2[/* error */ Error | Null, /* count */ Double, Unit]): Unit = js.native
  def listen(): this.type = js.native
  def listen(handle: js.Any): this.type = js.native
  def listen(handle: js.Any, backlog: Double): this.type = js.native
  def listen(handle: js.Any, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(options: ListenOptions): this.type = js.native
  def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String): this.type = js.native
  def listen(path: String, backlog: Double): this.type = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double): this.type = js.native
  def listen(port: Double, backlog: Double): this.type = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  def ref(): this.type = js.native
  def unref(): this.type = js.native
}

