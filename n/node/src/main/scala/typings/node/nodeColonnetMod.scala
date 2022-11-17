package typings.node

import typings.node.netMod.NetConnectOpts
import typings.node.netMod.ServerOpts
import typings.node.netMod.SocketAddressInitOptions
import typings.node.netMod.SocketConstructorOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonnetMod {
  
  @JSImport("node:net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `BlockList` object can be used with some network APIs to specify rules for
    * disabling inbound or outbound access to specific IP addresses, IP ranges, or
    * IP subnets.
    * @since v15.0.0, v14.18.0
    */
  @JSImport("node:net", "BlockList")
  @js.native
  open class BlockList ()
    extends typings.node.netMod.BlockList
  
  /**
    * This class is used to create a TCP or `IPC` server.
    * @since v0.1.90
    */
  @JSImport("node:net", "Server")
  @js.native
  open class Server () extends StObject {
    def this(connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]) = this()
    def this(options: ServerOpts) = this()
    def this(options: Unit, connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]) = this()
    def this(
      options: ServerOpts,
      connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]
    ) = this()
  }
  
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
  @JSImport("node:net", "Socket")
  @js.native
  open class Socket () extends StObject {
    def this(options: SocketConstructorOpts) = this()
  }
  
  /**
    * @since v15.14.0, v14.18.0
    */
  @JSImport("node:net", "SocketAddress")
  @js.native
  open class SocketAddress protected ()
    extends typings.node.netMod.SocketAddress {
    def this(options: SocketAddressInitOptions) = this()
  }
  
  /**
    * Aliases to {@link createConnection}.
    *
    * Possible signatures:
    *
    * * {@link connect}
    * * {@link connect} for `IPC` connections.
    * * {@link connect} for TCP connections.
    */
  inline def connect(options: NetConnectOpts): typings.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(path: String): typings.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(path: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(port: Double): typings.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(port: Double, host: String): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def connect(port: Double, host: Unit, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  
  /**
    * A factory function, which creates a new {@link Socket},
    * immediately initiates connection with `socket.connect()`,
    * then returns the `net.Socket` that starts the connection.
    *
    * When the connection is established, a `'connect'` event will be emitted
    * on the returned socket. The last parameter `connectListener`, if supplied,
    * will be added as a listener for the `'connect'` event **once**.
    *
    * Possible signatures:
    *
    * * {@link createConnection}
    * * {@link createConnection} for `IPC` connections.
    * * {@link createConnection} for TCP connections.
    *
    * The {@link connect} function is an alias to this function.
    */
  inline def createConnection(options: NetConnectOpts): typings.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(path: String): typings.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(path: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(port: Double): typings.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(port: Double, host: String): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  inline def createConnection(port: Double, host: Unit, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Socket]
  
  /**
    * Creates a new TCP or `IPC` server.
    *
    * If `allowHalfOpen` is set to `true`, when the other end of the socket
    * signals the end of transmission, the server will only send back the end of
    * transmission when `socket.end()` is explicitly called. For example, in the
    * context of TCP, when a FIN packed is received, a FIN packed is sent
    * back only when `socket.end()` is explicitly called. Until then the
    * connection is half-closed (non-readable but still writable). See `'end'` event and [RFC 1122](https://tools.ietf.org/html/rfc1122) (section 4.2.2.13) for more information.
    *
    * If `pauseOnConnect` is set to `true`, then the socket associated with each
    * incoming connection will be paused, and no data will be read from its handle.
    * This allows connections to be passed between processes without any data being
    * read by the original process. To begin reading data from a paused socket, call `socket.resume()`.
    *
    * The server can be a TCP server or an `IPC` server, depending on what it `listen()` to.
    *
    * Here is an example of a TCP echo server which listens for connections
    * on port 8124:
    *
    * ```js
    * const net = require('net');
    * const server = net.createServer((c) => {
    *   // 'connection' listener.
    *   console.log('client connected');
    *   c.on('end', () => {
    *     console.log('client disconnected');
    *   });
    *   c.write('hello\r\n');
    *   c.pipe(c);
    * });
    * server.on('error', (err) => {
    *   throw err;
    * });
    * server.listen(8124, () => {
    *   console.log('server bound');
    * });
    * ```
    *
    * Test this by using `telnet`:
    *
    * ```console
    * $ telnet localhost 8124
    * ```
    *
    * To listen on the socket `/tmp/echo.sock`:
    *
    * ```js
    * server.listen('/tmp/echo.sock', () => {
    *   console.log('server bound');
    * });
    * ```
    *
    * Use `nc` to connect to a Unix domain socket server:
    *
    * ```console
    * $ nc -U /tmp/echo.sock
    * ```
    * @since v0.5.0
    * @param connectionListener Automatically set as a listener for the {@link 'connection'} event.
    */
  inline def createServer(): typings.node.netMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.netMod.Server]
  inline def createServer(connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]): typings.node.netMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Server]
  inline def createServer(options: Unit, connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]): typings.node.netMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Server]
  inline def createServer(options: ServerOpts): typings.node.netMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.netMod.Server]
  inline def createServer(
    options: ServerOpts,
    connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]
  ): typings.node.netMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.netMod.Server]
  
  /**
    * Returns `6` if `input` is an IPv6 address. Returns `4` if `input` is an IPv4
    * address in [dot-decimal notation](https://en.wikipedia.org/wiki/Dot-decimal_notation) with no leading zeroes. Otherwise, returns`0`.
    *
    * ```js
    * net.isIP('::1'); // returns 6
    * net.isIP('127.0.0.1'); // returns 4
    * net.isIP('127.000.000.001'); // returns 0
    * net.isIP('127.0.0.1/24'); // returns 0
    * net.isIP('fhqwhgads'); // returns 0
    * ```
    * @since v0.3.0
    */
  inline def isIP(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns `true` if `input` is an IPv4 address in [dot-decimal notation](https://en.wikipedia.org/wiki/Dot-decimal_notation) with no
    * leading zeroes. Otherwise, returns `false`.
    *
    * ```js
    * net.isIPv4('127.0.0.1'); // returns true
    * net.isIPv4('127.000.000.001'); // returns false
    * net.isIPv4('127.0.0.1/24'); // returns false
    * net.isIPv4('fhqwhgads'); // returns false
    * ```
    * @since v0.3.0
    */
  inline def isIPv4(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns `true` if `input` is an IPv6 address. Otherwise, returns `false`.
    *
    * ```js
    * net.isIPv6('::1'); // returns true
    * net.isIPv6('fhqwhgads'); // returns false
    * ```
    * @since v0.3.0
    */
  inline def isIPv6(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
