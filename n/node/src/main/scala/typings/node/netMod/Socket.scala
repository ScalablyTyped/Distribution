package typings.node.netMod

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.lookup
import typings.node.nodeStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is an abstraction of a TCP socket or a streaming `IPC` endpoint
  * (uses named pipes on Windows, and Unix domain sockets otherwise). It is also
  * an `EventEmitter`.
  *
  * A `net.Socket` can be created by the user and used directly to interact with
  * a server. For example, it is returned by {@link createConnection},
  * so the user can use it to talk to the server.
  *
  * It can also be created by Node.js and passed to the user when a connection
  * is received. For example, it is passed to the listeners of a `'connection'` event emitted on a {@link Server}, so the user can use
  * it to interact with the client.
  * @since v0.3.4
  */
@JSImport("net", "Socket")
@js.native
open class Socket () extends StObject {
  def this(options: SocketConstructorOpts) = this()
  
  /**
    * events.EventEmitter
    *   1. close
    *   2. connect
    *   3. data
    *   4. drain
    *   5. end
    *   6. error
    *   7. lookup
    *   8. ready
    *   9. timeout
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: typings.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: typings.node.nodeStrings.timeout, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Returns the bound `address`, the address `family` name and `port` of the
    * socket as reported by the operating system:`{ port: 12346, family: 'IPv4', address: '127.0.0.1' }`
    * @since v0.1.90
    */
  def address(): AddressInfo | js.Object = js.native
  
  /**
    * This property shows the number of characters buffered for writing. The buffer
    * may contain strings whose length after encoding is not yet known. So this number
    * is only an approximation of the number of bytes in the buffer.
    *
    * `net.Socket` has the property that `socket.write()` always works. This is to
    * help users get up and running quickly. The computer cannot always keep up
    * with the amount of data that is written to a socket. The network connection
    * simply might be too slow. Node.js will internally queue up the data written to a
    * socket and send it out over the wire when it is possible.
    *
    * The consequence of this internal buffering is that memory may grow.
    * Users who experience large or growing `bufferSize` should attempt to
    * "throttle" the data flows in their program with `socket.pause()` and `socket.resume()`.
    * @since v0.3.8
    * @deprecated Since v14.6.0 - Use `writableLength` instead.
    */
  val bufferSize: Double = js.native
  
  /**
    * The amount of received bytes.
    * @since v0.5.3
    */
  val bytesRead: Double = js.native
  
  /**
    * The amount of bytes sent.
    * @since v0.5.3
    */
  val bytesWritten: Double = js.native
  
  /**
    * Initiate a connection on a given socket.
    *
    * Possible signatures:
    *
    * * `socket.connect(options[, connectListener])`
    * * `socket.connect(path[, connectListener])` for `IPC` connections.
    * * `socket.connect(port[, host][, connectListener])` for TCP connections.
    * * Returns: `net.Socket` The socket itself.
    *
    * This function is asynchronous. When the connection is established, the `'connect'` event will be emitted. If there is a problem connecting,
    * instead of a `'connect'` event, an `'error'` event will be emitted with
    * the error passed to the `'error'` listener.
    * The last parameter `connectListener`, if supplied, will be added as a listener
    * for the `'connect'` event **once**.
    *
    * This function should only be used for reconnecting a socket after`'close'` has been emitted or otherwise it may lead to undefined
    * behavior.
    */
  def connect(options: SocketConnectOpts): this.type = js.native
  def connect(options: SocketConnectOpts, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(path: String): this.type = js.native
  def connect(path: String, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double): this.type = js.native
  def connect(port: Double, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double, host: String): this.type = js.native
  def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): this.type = js.native
  
  /**
    * If `true`,`socket.connect(options[, connectListener])` was
    * called and has not yet finished. It will stay `true` until the socket becomes
    * connected, then it is set to `false` and the `'connect'` event is emitted. Note
    * that the `socket.connect(options[, connectListener])` callback is a listener for the `'connect'` event.
    * @since v6.1.0
    */
  val connecting: Boolean = js.native
  
  /**
    * See `writable.destroyed` for further details.
    */
  val destroyed: Boolean = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close, hadError: Boolean): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: typings.node.nodeStrings.connect): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, data: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: js.Error, address: String, family: String, host: String): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: js.Error, address: String, family: Double, host: String): Boolean = js.native
  @JSName("emit")
  def emit_ready(event: ready): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: typings.node.nodeStrings.timeout): Boolean = js.native
  
  /**
    * Half-closes the socket. i.e., it sends a FIN packet. It is possible the
    * server will still send some data.
    *
    * See `writable.end()` for further details.
    * @since v0.1.90
    * @param [encoding='utf8'] Only used when data is `string`.
    * @param callback Optional callback for when the socket is finished.
    * @return The socket itself.
    */
  def end(): this.type = js.native
  def end(buffer: String): this.type = js.native
  def end(buffer: String, callback: js.Function0[Unit]): this.type = js.native
  def end(buffer: js.typedarray.Uint8Array): this.type = js.native
  def end(buffer: js.typedarray.Uint8Array, callback: js.Function0[Unit]): this.type = js.native
  def end(callback: js.Function0[Unit]): this.type = js.native
  def end(str: String, encoding: Unit, callback: js.Function0[Unit]): this.type = js.native
  def end(str: String, encoding: BufferEncoding): this.type = js.native
  def end(str: String, encoding: BufferEncoding, callback: js.Function0[Unit]): this.type = js.native
  def end(str: js.typedarray.Uint8Array, encoding: Unit, callback: js.Function0[Unit]): this.type = js.native
  def end(str: js.typedarray.Uint8Array, encoding: BufferEncoding): this.type = js.native
  def end(str: js.typedarray.Uint8Array, encoding: BufferEncoding, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * The string representation of the local IP address the remote client is
    * connecting on. For example, in a server listening on `'0.0.0.0'`, if a client
    * connects on `'192.168.1.1'`, the value of `socket.localAddress` would be`'192.168.1.1'`.
    * @since v0.9.6
    */
  val localAddress: js.UndefOr[String] = js.native
  
  /**
    * The string representation of the local IP family. `'IPv4'` or `'IPv6'`.
    * @since v18.8.0, v16.18.0
    */
  val localFamily: js.UndefOr[String] = js.native
  
  /**
    * The numeric representation of the local port. For example, `80` or `21`.
    * @since v0.9.6
    */
  val localPort: js.UndefOr[Double] = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: typings.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: typings.node.nodeStrings.timeout, listener: js.Function0[Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(event: typings.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_timeout(event: typings.node.nodeStrings.timeout, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Pauses the reading of data. That is, `'data'` events will not be emitted.
    * Useful to throttle back an upload.
    * @return The socket itself.
    */
  def pause(): this.type = js.native
  
  /**
    * This is `true` if the socket is not connected yet, either because `.connect()`has not yet been called or because it is still in the process of connecting
    * (see `socket.connecting`).
    * @since v11.2.0, v10.16.0
    */
  val pending: Boolean = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: typings.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: typings.node.nodeStrings.timeout, listener: js.Function0[Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: typings.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: typings.node.nodeStrings.timeout, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * This property represents the state of the connection as a string.
    *
    * * If the stream is connecting `socket.readyState` is `opening`.
    * * If the stream is readable and writable, it is `open`.
    * * If the stream is readable and not writable, it is `readOnly`.
    * * If the stream is not readable and writable, it is `writeOnly`.
    * @since v0.5.0
    */
  val readyState: SocketReadyState = js.native
  
  /**
    * Opposite of `unref()`, calling `ref()` on a previously `unref`ed socket will _not_ let the program exit if it's the only socket left (the default behavior).
    * If the socket is `ref`ed calling `ref` again will have no effect.
    * @since v0.9.1
    * @return The socket itself.
    */
  def ref(): this.type = js.native
  
  /**
    * The string representation of the remote IP address. For example,`'74.125.127.100'` or `'2001:4860:a005::68'`. Value may be `undefined` if
    * the socket is destroyed (for example, if the client disconnected).
    * @since v0.5.10
    */
  val remoteAddress: js.UndefOr[String] = js.native
  
  /**
    * The string representation of the remote IP family. `'IPv4'` or `'IPv6'`.
    * @since v0.11.14
    */
  val remoteFamily: js.UndefOr[String] = js.native
  
  /**
    * The numeric representation of the remote port. For example, `80` or `21`.
    * @since v0.5.10
    */
  val remotePort: js.UndefOr[Double] = js.native
  
  /**
    * Close the TCP connection by sending an RST packet and destroy the stream.
    * If this TCP socket is in connecting status, it will send an RST packet and destroy this TCP socket once it is connected.
    * Otherwise, it will call `socket.destroy` with an `ERR_SOCKET_CLOSED` Error.
    * If this is not a TCP socket (for example, a pipe), calling this method will immediately throw an `ERR_INVALID_HANDLE_TYPE` Error.
    * @since v18.3.0, v16.17.0
    */
  def resetAndDestroy(): this.type = js.native
  
  /**
    * Resumes reading after a call to `socket.pause()`.
    * @return The socket itself.
    */
  def resume(): this.type = js.native
  
  /**
    * Set the encoding for the socket as a `Readable Stream`. See `readable.setEncoding()` for more information.
    * @since v0.1.90
    * @return The socket itself.
    */
  def setEncoding(): this.type = js.native
  def setEncoding(encoding: BufferEncoding): this.type = js.native
  
  /**
    * Enable/disable keep-alive functionality, and optionally set the initial
    * delay before the first keepalive probe is sent on an idle socket.
    *
    * Set `initialDelay` (in milliseconds) to set the delay between the last
    * data packet received and the first keepalive probe. Setting `0` for`initialDelay` will leave the value unchanged from the default
    * (or previous) setting.
    *
    * Enabling the keep-alive functionality will set the following socket options:
    *
    * * `SO_KEEPALIVE=1`
    * * `TCP_KEEPIDLE=initialDelay`
    * * `TCP_KEEPCNT=10`
    * * `TCP_KEEPINTVL=1`
    * @since v0.1.92
    * @param [enable=false]
    * @param [initialDelay=0]
    * @return The socket itself.
    */
  def setKeepAlive(): this.type = js.native
  def setKeepAlive(enable: Boolean): this.type = js.native
  def setKeepAlive(enable: Boolean, initialDelay: Double): this.type = js.native
  def setKeepAlive(enable: Unit, initialDelay: Double): this.type = js.native
  
  /**
    * Enable/disable the use of Nagle's algorithm.
    *
    * When a TCP connection is created, it will have Nagle's algorithm enabled.
    *
    * Nagle's algorithm delays data before it is sent via the network. It attempts
    * to optimize throughput at the expense of latency.
    *
    * Passing `true` for `noDelay` or not passing an argument will disable Nagle's
    * algorithm for the socket. Passing `false` for `noDelay` will enable Nagle's
    * algorithm.
    * @since v0.1.90
    * @param [noDelay=true]
    * @return The socket itself.
    */
  def setNoDelay(): this.type = js.native
  def setNoDelay(noDelay: Boolean): this.type = js.native
  
  /**
    * Sets the socket to timeout after `timeout` milliseconds of inactivity on
    * the socket. By default `net.Socket` do not have a timeout.
    *
    * When an idle timeout is triggered the socket will receive a `'timeout'` event but the connection will not be severed. The user must manually call `socket.end()` or `socket.destroy()` to
    * end the connection.
    *
    * ```js
    * socket.setTimeout(3000);
    * socket.on('timeout', () => {
    *   console.log('socket timeout');
    *   socket.end();
    * });
    * ```
    *
    * If `timeout` is 0, then the existing idle timeout is disabled.
    *
    * The optional `callback` parameter will be added as a one-time listener for the `'timeout'` event.
    * @since v0.1.90
    * @return The socket itself.
    */
  def setTimeout(timeout: Double): this.type = js.native
  def setTimeout(timeout: Double, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * The socket timeout in milliseconds as set by `socket.setTimeout()`.
    * It is `undefined` if a timeout has not been set.
    * @since v10.7.0
    */
  val timeout: js.UndefOr[Double] = js.native
  
  /**
    * Calling `unref()` on a socket will allow the program to exit if this is the only
    * active socket in the event system. If the socket is already `unref`ed calling`unref()` again will have no effect.
    * @since v0.9.1
    * @return The socket itself.
    */
  def unref(): this.type = js.native
  
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
  /**
    * Sends data on the socket. The second parameter specifies the encoding in the
    * case of a string. It defaults to UTF8 encoding.
    *
    * Returns `true` if the entire data was flushed successfully to the kernel
    * buffer. Returns `false` if all or part of the data was queued in user memory.`'drain'` will be emitted when the buffer is again free.
    *
    * The optional `callback` parameter will be executed when the data is finally
    * written out, which may not be immediately.
    *
    * See `Writable` stream `write()` method for more
    * information.
    * @since v0.1.90
    * @param [encoding='utf8'] Only used when data is `string`.
    */
  def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
  def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
  def write(str: String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
  def write(str: String, encoding: BufferEncoding): Boolean = js.native
  def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
  def write(
    str: js.typedarray.Uint8Array,
    encoding: Unit,
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
  def write(str: js.typedarray.Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def write(
    str: js.typedarray.Uint8Array,
    encoding: BufferEncoding,
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
}
