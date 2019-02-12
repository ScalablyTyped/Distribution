package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/net.js
@JSImport("net", "Server")
@js.native
class Server ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(connectionListener: js.Function1[/* socket */ Socket, scala.Unit]) = this()
  def this(options: nodeLib.Anon_AllowHalfOpen) = this()
  def this(options: nodeLib.Anon_AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, scala.Unit]) = this()
  var connections: scala.Double = js.native
  var listening: scala.Boolean = js.native
  var maxConnections: scala.Double = js.native
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connection(event: nodeLib.nodeLibStrings.connection, listener: js.Function1[/* socket */ Socket, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  def address(): AddressInfo | java.lang.String | scala.Null = js.native
  def close(): this.type = js.native
  def close(callback: js.Function): this.type = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_connection(event: nodeLib.nodeLibStrings.connection, socket: Socket): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: nodeLib.nodeLibStrings.listening): scala.Boolean = js.native
  def getConnections(cb: js.Function2[/* error */ nodeLib.Error | scala.Null, /* count */ scala.Double, scala.Unit]): scala.Unit = js.native
  def listen(): this.type = js.native
  def listen(handle: js.Any): this.type = js.native
  def listen(handle: js.Any, backlog: scala.Double): this.type = js.native
  def listen(handle: js.Any, backlog: scala.Double, listeningListener: js.Function): this.type = js.native
  def listen(handle: js.Any, listeningListener: js.Function): this.type = js.native
  def listen(options: ListenOptions): this.type = js.native
  def listen(options: ListenOptions, listeningListener: js.Function): this.type = js.native
  def listen(path: java.lang.String): this.type = js.native
  def listen(path: java.lang.String, backlog: scala.Double): this.type = js.native
  def listen(path: java.lang.String, backlog: scala.Double, listeningListener: js.Function): this.type = js.native
  def listen(path: java.lang.String, listeningListener: js.Function): this.type = js.native
  def listen(port: scala.Double): this.type = js.native
  def listen(port: scala.Double, backlog: scala.Double): this.type = js.native
  def listen(port: scala.Double, backlog: scala.Double, listeningListener: js.Function): this.type = js.native
  def listen(port: scala.Double, hostname: java.lang.String): this.type = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): this.type = js.native
  def listen(
    port: scala.Double,
    hostname: java.lang.String,
    backlog: scala.Double,
    listeningListener: js.Function
  ): this.type = js.native
  def listen(port: scala.Double, hostname: java.lang.String, listeningListener: js.Function): this.type = js.native
  def listen(port: scala.Double, listeningListener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_connection(event: nodeLib.nodeLibStrings.connection, listener: js.Function1[/* socket */ Socket, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_connection(event: nodeLib.nodeLibStrings.connection, listener: js.Function1[/* socket */ Socket, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connection(event: nodeLib.nodeLibStrings.connection, listener: js.Function1[/* socket */ Socket, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connection(event: nodeLib.nodeLibStrings.connection, listener: js.Function1[/* socket */ Socket, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  def ref(): this.type = js.native
  def unref(): this.type = js.native
}

