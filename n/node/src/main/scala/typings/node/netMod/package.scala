package typings.node.netMod

import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Aliases to {@link createConnection}.
  *
  * Possible signatures:
  *
  * * {@link connect}
  * * {@link connect} for `IPC` connections.
  * * {@link connect} for TCP connections.
  */
inline def connect(options: NetConnectOpts): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[Socket]
inline def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def connect(path: String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any]).asInstanceOf[Socket]
inline def connect(path: String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def connect(port: Double): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[Socket]
inline def connect(port: Double, host: String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def connect(port: Double, host: Unit, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]

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
inline def createConnection(options: NetConnectOpts): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Socket]
inline def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def createConnection(path: String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any]).asInstanceOf[Socket]
inline def createConnection(path: String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def createConnection(port: Double): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[Socket]
inline def createConnection(port: Double, host: String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
inline def createConnection(port: Double, host: Unit, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]

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
inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
inline def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[Server]
inline def createServer(options: Unit, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
inline def createServer(options: ServerOpts): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
inline def createServer(options: ServerOpts, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]

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

type LookupFunction = js.Function3[
/* hostname */ String, 
/* options */ LookupOneOptions, 
/* callback */ js.Function3[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* address */ String, 
  /* family */ Double, 
  Unit
], 
Unit]
