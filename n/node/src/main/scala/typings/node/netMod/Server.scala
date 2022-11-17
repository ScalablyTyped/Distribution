package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is used to create a TCP or `IPC` server.
  * @since v0.1.90
  */
@JSImport("net", "Server")
@js.native
open class Server () extends StObject {
  def this(connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  def this(options: ServerOpts) = this()
  def this(options: Unit, connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  def this(options: ServerOpts, connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_listening")
  def addListener(event: "listening", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_connection")
  def addListener(event: "connection", listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_drop")
  def addListener(event: "drop", listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  /**
    * events.EventEmitter
    *   1. close
    *   2. connection
    *   3. error
    *   4. listening
    *   5. drop
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Returns the bound `address`, the address `family` name, and `port` of the server
    * as reported by the operating system if listening on an IP socket
    * (useful to find which port was assigned when getting an OS-assigned address):`{ port: 12346, family: 'IPv4', address: '127.0.0.1' }`.
    *
    * For a server listening on a pipe or Unix domain socket, the name is returned
    * as a string.
    *
    * ```js
    * const server = net.createServer((socket) => {
    *   socket.end('goodbye\n');
    * }).on('error', (err) => {
    *   // Handle errors here.
    *   throw err;
    * });
    *
    * // Grab an arbitrary unused port.
    * server.listen(() => {
    *   console.log('opened server on', server.address());
    * });
    * ```
    *
    * `server.address()` returns `null` before the `'listening'` event has been
    * emitted or after calling `server.close()`.
    * @since v0.1.90
    */
  def address(): AddressInfo | String | Null = js.native
  
  /**
    * Stops the server from accepting new connections and keeps existing
    * connections. This function is asynchronous, the server is finally closed
    * when all connections are ended and the server emits a `'close'` event.
    * The optional `callback` will be called once the `'close'` event occurs. Unlike
    * that event, it will be called with an `Error` as its only argument if the server
    * was not open when it was closed.
    * @since v0.1.90
    * @param callback Called when the server is closed.
    */
  def close(): this.type = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  
  var connections: Double = js.native
  
  @JSName("emit")
  @scala.annotation.targetName("emit_drop")
  def emit(event: "drop"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_listening")
  def emit(event: "listening"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_close")
  def emit(event: "close"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_drop")
  def emit(event: "drop", data: DropArgument): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_error")
  def emit(event: "error", err: js.Error): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_connection")
  def emit(event: "connection", socket: Socket): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  /**
    * Asynchronously get the number of concurrent connections on the server. Works
    * when sockets were sent to forks.
    *
    * Callback should take two arguments `err` and `count`.
    * @since v0.9.7
    */
  def getConnections(cb: js.Function2[/* error */ js.Error | Null, /* count */ Double, Unit]): Unit = js.native
  
  /**
    * Start a server listening for connections. A `net.Server` can be a TCP or
    * an `IPC` server depending on what it listens to.
    *
    * Possible signatures:
    *
    * * `server.listen(handle[, backlog][, callback])`
    * * `server.listen(options[, callback])`
    * * `server.listen(path[, backlog][, callback])` for `IPC` servers
    * * `server.listen([port[, host[, backlog]]][, callback])` for TCP servers
    *
    * This function is asynchronous. When the server starts listening, the `'listening'` event will be emitted. The last parameter `callback`will be added as a listener for the `'listening'`
    * event.
    *
    * All `listen()` methods can take a `backlog` parameter to specify the maximum
    * length of the queue of pending connections. The actual length will be determined
    * by the OS through sysctl settings such as `tcp_max_syn_backlog` and `somaxconn`on Linux. The default value of this parameter is 511 (not 512).
    *
    * All {@link Socket} are set to `SO_REUSEADDR` (see [`socket(7)`](https://man7.org/linux/man-pages/man7/socket.7.html) for
    * details).
    *
    * The `server.listen()` method can be called again if and only if there was an
    * error during the first `server.listen()` call or `server.close()` has been
    * called. Otherwise, an `ERR_SERVER_ALREADY_LISTEN` error will be thrown.
    *
    * One of the most common errors raised when listening is `EADDRINUSE`.
    * This happens when another server is already listening on the requested`port`/`path`/`handle`. One way to handle this would be to retry
    * after a certain amount of time:
    *
    * ```js
    * server.on('error', (e) => {
    *   if (e.code === 'EADDRINUSE') {
    *     console.log('Address in use, retrying...');
    *     setTimeout(() => {
    *       server.close();
    *       server.listen(PORT, HOST);
    *     }, 1000);
    *   }
    * });
    * ```
    */
  def listen(): this.type = js.native
  def listen(handle: Any): this.type = js.native
  def listen(handle: Any, backlog: Double): this.type = js.native
  def listen(handle: Any, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(handle: Any, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(handle: Any, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(options: ListenOptions): this.type = js.native
  def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String): this.type = js.native
  def listen(path: String, backlog: Double): this.type = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(path: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double): this.type = js.native
  def listen(port: Double, backlog: Double): this.type = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: Unit, backlog: Double): this.type = js.native
  def listen(port: Double, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, backlog: Double): this.type = js.native
  def listen(port: Unit, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, hostname: String): this.type = js.native
  def listen(port: Unit, hostname: String, backlog: Double): this.type = js.native
  def listen(port: Unit, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, hostname: String, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, hostname: Unit, backlog: Double): this.type = js.native
  def listen(port: Unit, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, hostname: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  def listen(port: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Indicates whether or not the server is listening for connections.
    * @since v5.7.0
    */
  var listening: Boolean = js.native
  
  /**
    * Set this property to reject connections when the server's connection count gets
    * high.
    *
    * It is not recommended to use this option once a socket has been sent to a child
    * with `child_process.fork()`.
    * @since v0.2.0
    */
  var maxConnections: Double = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_listening")
  def on(event: "listening", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_drop")
  def on(event: "drop", listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_connection")
  def on(event: "connection", listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_listening")
  def once(event: "listening", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_connection")
  def once(event: "connection", listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_drop")
  def once(event: "drop", listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_close")
  def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_listening")
  def prependListener(event: "listening", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_connection")
  def prependListener(event: "connection", listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_drop")
  def prependListener(event: "drop", listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_error")
  def prependListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_listening")
  def prependOnceListener(event: "listening", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_close")
  def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_drop")
  def prependOnceListener(event: "drop", listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_connection")
  def prependOnceListener(event: "connection", listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_error")
  def prependOnceListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Opposite of `unref()`, calling `ref()` on a previously `unref`ed server will _not_ let the program exit if it's the only server left (the default behavior).
    * If the server is `ref`ed calling `ref()` again will have no effect.
    * @since v0.9.1
    */
  def ref(): this.type = js.native
  
  /**
    * Calling `unref()` on a server will allow the program to exit if this is the only
    * active server in the event system. If the server is already `unref`ed calling`unref()` again will have no effect.
    * @since v0.9.1
    */
  def unref(): this.type = js.native
}
