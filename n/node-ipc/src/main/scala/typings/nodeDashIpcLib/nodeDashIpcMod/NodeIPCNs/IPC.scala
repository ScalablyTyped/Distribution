package typings
package nodeDashIpcLib.nodeDashIpcMod.NodeIPCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPC extends js.Object {
  /**
    * Set these variables in the ipc.config scope to overwrite or set default values
    */
  var config: Config = js.native
  /**
    * This is where socket connection refrences will be stored when connecting to them as a client via the ipc.connectTo
    * or iupc.connectToNet. They will be stored based on the ID used to create them, eg : ipc.of.mySocket
    */
  var of: js.Any = js.native
  /**
    * This is a refrence to the server created by ipc.serve or ipc.serveNet
    */
  var server: Server = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#connectto
    * Used for connecting as a client to local Unix Sockets and Windows Sockets.
    * This is the fastest way for processes on the same machine to communicate
    * because it bypasses the network card which TCP and UDP must both use.
    * @param id is the string id of the socket being connected to.
    * The socket with this id is added to the ipc.of object when created.
    * @param path is the path of the Unix Domain Socket File, if the System is Windows,
    * this will automatically be converted to an appropriate pipe with the same information as the Unix Domain Socket File.
    * If not set this will default to ipc.config.socketRoot+ipc.config.appspace+id
    * @param callback this is the function to execute when the socket has been created
    */
  def connectTo(id: java.lang.String): scala.Unit = js.native
  def connectTo(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def connectTo(id: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def connectTo(id: java.lang.String, path: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#connecttonet
    * Used to connect as a client to a TCP or TLS socket via the network card.
    * This can be local or remote, if local, it is recommended that you use the Unix
    * and Windows Socket Implementaion of connectTo instead as it is much faster since it avoids the network card altogether.
    * For TLS and SSL Sockets see the node-ipc TLS and SSL docs.
    * They have a few additional requirements, and things to know about and so have their own doc.
    * @param id is the string id of the socket being connected to. For TCP & TLS sockets,
    * this id is added to the ipc.of object when the socket is created with a reference to the socket
    * @param host is the host on which the TCP or TLS socket resides.
    * This will default to ipc.config.networkHost if not specified
    * @param port the port on which the TCP or TLS socket resides
    * @param callback 	this is the function to execute when the socket has been created
    */
  def connectToNet(id: java.lang.String): scala.Unit = js.native
  def connectToNet(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def connectToNet(id: java.lang.String, hostOrPort: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#connecttonet
    * Used to connect as a client to a TCP or TLS socket via the network card.
    * This can be local or remote, if local, it is recommended that you use the Unix
    * and Windows Socket Implementaion of connectTo instead as it is much faster since it avoids the network card altogether.
    * For TLS and SSL Sockets see the node-ipc TLS and SSL docs.
    * They have a few additional requirements, and things to know about and so have their own doc.
    * @param id is the string id of the socket being connected to.
    * For TCP & TLS sockets, this id is added to the ipc.of object when the socket is created with a reference to the socket
    * @param host is the host on which the TCP or TLS socket resides. This will default to ipc.config.networkHost if not specified
    * @param port the port on which the TCP or TLS socket resides
    * @param callback 	this is the function to execute when the socket has been created
    */
  def connectToNet(id: java.lang.String, hostOrPort: scala.Double): scala.Unit = js.native
  def connectToNet(id: java.lang.String, hostOrPort: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def connectToNet(id: java.lang.String, host: java.lang.String): scala.Unit = js.native
  def connectToNet(id: java.lang.String, host: java.lang.String, port: scala.Double): scala.Unit = js.native
  def connectToNet(
    id: java.lang.String,
    host: java.lang.String,
    port: scala.Double,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#disconnect
    * Used to disconnect a client from a Unix, Windows, TCP or TLS socket.
    * The socket and its refrence will be removed from memory and the ipc.of scope.
    * This can be local or remote. UDP clients do not maintain connections and so there are no Clients and this method has no value to them
    * @param id is the string id of the socket from which to disconnect
    */
  def disconnect(id: java.lang.String): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#log
    */
  def log(args: js.Any*): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    * @param callback This is a function to be called after the Server has started.
    * This can also be done by binding an event to the start event like ipc.server.on('start',function(){});
    */
  def serve(): scala.Unit = js.native
  def serve(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    * @param path This is the path of the Unix Domain Socket File, if the System is Windows,
    * this will automatically be converted to an appropriate pipe with the same information as the Unix Domain Socket File.
    * If not set this will default to ipc.config.socketRoot+ipc.config.appspace+id
    * @param callback This is a function to be called after the Server has started.
    * This can also be done by binding an event to the start event like ipc.server.on('start',function(){});
    */
  def serve(path: java.lang.String): scala.Unit = js.native
  def serve(path: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param host If not specified this defaults to the first address in os.networkInterfaces().
    * For TCP, TLS & UDP servers this is most likely going to be 127.0.0.1 or ::1
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
    * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
    * @param callback Function to be called when the server is created
    */
  def serveNet(): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param callback Function to be called when the server is created
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    */
  def serveNet(callbackOrPort: EmptyCallback): scala.Unit = js.native
  def serveNet(callbackOrPort: scala.Double): scala.Unit = js.native
  def serveNet(host: java.lang.String): scala.Unit = js.native
  def serveNet(host: java.lang.String, port: scala.Double): scala.Unit = js.native
  def serveNet(host: java.lang.String, port: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
    * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
    * @param callback Function to be called when the server is created
    */
  @JSName("serveNet")
  def serveNet_udp4(UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp4): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp4, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: java.lang.String, port: scala.Double, UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp4): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(
    host: java.lang.String,
    port: scala.Double,
    UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp4,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp6): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp6, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: java.lang.String, port: scala.Double, UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp6): scala.Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(
    host: java.lang.String,
    port: scala.Double,
    UDPType: nodeDashIpcLib.nodeDashIpcLibStrings.udp6,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

