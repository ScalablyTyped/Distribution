package typings.nodeIpc

import org.scalablytyped.runtime.Instantiable0
import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import typings.nodeIpc.anon.Family
import typings.nodeIpc.anon.Private
import typings.nodeIpc.mod.NodeIPC.Client
import typings.nodeIpc.mod.NodeIPC.Config
import typings.nodeIpc.mod.NodeIPC.EmptyCallback
import typings.nodeIpc.mod.NodeIPC.Server
import typings.nodeIpc.nodeIpcStrings.ascii
import typings.nodeIpc.nodeIpcStrings.base64
import typings.nodeIpc.nodeIpcStrings.connect
import typings.nodeIpc.nodeIpcStrings.data
import typings.nodeIpc.nodeIpcStrings.destroy
import typings.nodeIpc.nodeIpcStrings.disconnect
import typings.nodeIpc.nodeIpcStrings.error
import typings.nodeIpc.nodeIpcStrings.hex
import typings.nodeIpc.nodeIpcStrings.socketDotdisconnected
import typings.nodeIpc.nodeIpcStrings.ucs2
import typings.nodeIpc.nodeIpcStrings.udp4
import typings.nodeIpc.nodeIpcStrings.udp6
import typings.nodeIpc.nodeIpcStrings.utf16le
import typings.nodeIpc.nodeIpcStrings.utf8
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node-ipc.node-ipc.NodeIPC.IPC & {  IPC :new (): node-ipc.node-ipc.NodeIPC.IPC} */
object mod {
  
  @JSImport("node-ipc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node-ipc", "IPC")
  @js.native
  open class IPC ()
    extends StObject
       with typings.nodeIpc.mod.NodeIPC.IPC
  @JSImport("node-ipc", "IPC")
  @js.native
  def IPC: Instantiable0[typings.nodeIpc.mod.NodeIPC.IPC] = js.native
  inline def IPC_=(x: Instantiable0[typings.nodeIpc.mod.NodeIPC.IPC]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPC")(x.asInstanceOf[js.Any])
  
  /**
    * Set these variables in the ipc.config scope to overwrite or set default values
    */
  @JSImport("node-ipc", "config")
  @js.native
  def config: Config = js.native
  inline def config_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
  
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
  /**
    * https://www.npmjs.com/package/node-ipc#connectto
    * Used for connecting as a client to local Unix Sockets and Windows Sockets.
    * This is the fastest way for processes on the same machine to communicate
    * because it bypasses the network card which TCP and UDP must both use.
    * @param id is the string id of the socket being connected to.
    * The socket with this id is added to the ipc.of object when created.
    * @param callback this is the function to execute when the socket has been created
    */
  inline def connectTo(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def connectTo(id: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectTo(id: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(id.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectTo(id: String, path: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(id.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectTo(id: String, path: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(id.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    * @param callback     this is the function to execute when the socket has been created
    */
  /**
    * https://www.npmjs.com/package/node-ipc#connecttonet
    * Used to connect as a client to a TCP or TLS socket via the network card.
    * This can be local or remote, if local, it is recommended that you use the Unix
    * and Windows Socket Implementaion of connectTo instead as it is much faster since it avoids the network card altogether.
    * For TLS and SSL Sockets see the node-ipc TLS and SSL docs.
    * They have a few additional requirements, and things to know about and so have their own doc.
    * @param id is the string id of the socket being connected to. For TCP & TLS sockets,
    * this id is added to the ipc.of object when the socket is created with a reference to the socket
    * @param callback     this is the function to execute when the socket has been created
    */
  inline def connectToNet(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def connectToNet(id: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, hostOrPort: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], hostOrPort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    * @param callback     this is the function to execute when the socket has been created
    */
  inline def connectToNet(id: String, hostOrPort: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], hostOrPort.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, hostOrPort: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], hostOrPort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: String, port: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: String, port: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: Unit, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: Unit, port: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectToNet(id: String, host: Unit, port: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToNet")(id.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * https://www.npmjs.com/package/node-ipc#disconnect
    * Used to disconnect a client from a Unix, Windows, TCP or TLS socket.
    * The socket and its refrence will be removed from memory and the ipc.of scope.
    * This can be local or remote. UDP clients do not maintain connections and so there are no Clients and this method has no value to them
    * @param id is the string id of the socket from which to disconnect
    */
  inline def disconnect(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * https://www.npmjs.com/package/node-ipc#log
    */
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /**
    * This is where socket connection references will be stored when connecting to them as a client via the ipc.connectTo
    * or iupc.connectToNet. They will be stored based on the ID used to create them, eg : ipc.of.mySocket
    */
  @JSImport("node-ipc", "of")
  @js.native
  def of: Record[String, Client] = js.native
  inline def of_=(x: Record[String, Client]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("of")(x.asInstanceOf[js.Any])
  
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    * @param callback This is a function to be called after the Server has started.
    * This can also be done by binding an event to the start event like ipc.server.on('start',function(){});
    */
  inline def serve(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serve")().asInstanceOf[Unit]
  inline def serve(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serve")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    */
  inline def serve(callback: Null): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serve")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  inline def serve(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serve")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def serve(path: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serve")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param host If not specified this defaults to the first address in os.networkInterfaces().
    * For TCP, TLS & UDP servers this is most likely going to be 127.0.0.1 or ::1
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
    * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
    * @param callback Function to be called when the server is created
    */
  inline def serveNet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")().asInstanceOf[Unit]
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
    * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
    * @param callback Function to be called when the server is created
    */
  inline def serveNet(UDPType: udp4 | udp6): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(UDPType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def serveNet(UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(callbackOrPort: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(callbackOrPort.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param callback Function to be called when the server is created
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    */
  inline def serveNet(callbackOrPort: EmptyCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(callbackOrPort.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def serveNet(host: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param host If not specified this defaults to the first address in os.networkInterfaces().
    * For TCP, TLS & UDP servers this is most likely going to be 127.0.0.1 or ::1
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    * @param callback Function to be called when the server is created
    */
  inline def serveNet(host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Double, UDPType: udp4 | udp6): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Double, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Double, UDPType: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Unit, UDPType: udp4 | udp6): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Unit, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: String, port: Unit, UDPType: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Double, UDPType: udp4 | udp6): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Double, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Double, UDPType: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Unit, UDPType: udp4 | udp6): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Unit, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serveNet(host: Unit, port: Unit, UDPType: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveNet")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], UDPType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This is a refrence to the server created by ipc.serve or ipc.serveNet
    */
  @JSImport("node-ipc", "server")
  @js.native
  def server: Server = js.native
  inline def server_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("server")(x.asInstanceOf[js.Any])
  
  object NodeIPC {
    
    @js.native
    trait Client extends StObject {
      
      def emit(event: String): Client = js.native
      def emit(event: String, value: Any): Client = js.native
      
      /**
        * Unbind subscribed events
        */
      def off(event: String, handler: Any): Client = js.native
      
      /**
        * connect - triggered when socket connected
        * disconnect - triggered by client when socket has disconnected from server
        * destroy - triggered when socket has been totally destroyed, no further auto retries will happen and all references are gone
        */
      def on(event: connect | disconnect | destroy, callback: js.Function0[Unit]): Client = js.native
      /**
        * triggered when a JSON message is received. The event name will be the type string from your message
        * and the param will be the data object from your message eg : { type:'myEvent',data:{a:1}}
        */
      def on(event: String, callback: js.Function1[/* repeated */ Any, Unit]): Client = js.native
      /**
        * triggered when ipc.config.rawBuffer is true and a message is received
        */
      @JSName("on")
      def on_data(event: data, callback: js.Function1[/* buffer */ Buffer, Unit]): Client = js.native
      /**
        * triggered when an error has occured
        */
      @JSName("on")
      def on_error(event: error, callback: js.Function1[/* err */ Any, Unit]): Client = js.native
      /**
        * triggered by server when a client socket has disconnected
        */
      @JSName("on")
      def on_socketdisconnected(
        event: socketDotdisconnected,
        callback: js.Function2[/* socket */ Socket, /* destroyedSocketID */ String, Unit]
      ): Client = js.native
    }
    
    trait Config extends StObject {
      
      /**
        * Default: 'app.'
        * Used for Unix Socket (Unix Domain Socket) namespacing.
        * If not set specifically, the Unix Domain Socket will combine the socketRoot, appspace,
        * and id to form the Unix Socket Path for creation or binding.
        * This is available incase you have many apps running on your system, you may have several sockets with the same id,
        * but if you change the appspace, you will still have app specic unique sockets
        */
      var appspace: String
      
      /**
        * Default: 'utf8'
        * the default encoding for data sent on sockets. Mostly used if rawBuffer is set to true.
        * Valid values are : ascii utf8 utf16le ucs2 base64 hex
        */
      var encoding: ascii | utf8 | utf16le | ucs2 | base64 | hex
      
      /**
        * Default: os.hostname()
        * The id of this socket or service
        */
      var id: String
      
      /**
        * Primarily used when specifying which interface a client should connect through.
        * see the socket.connect documentation in the node.js api https://nodejs.org/api/net.html#net_socket_connect_options_connectlistener
        */
      var interfaces: Family
      
      /**
        * Default: 5
        * Set the depth for util.inspect during ipc.log
        */
      var logDepth: Double
      
      /**
        * Default: true
        * Turn on/off util.inspect colors for ipc.log
        */
      var logInColor: Boolean
      
      /**
        * Default: console.log
        * The function which receives the output from ipc.log; should take a single string argument
        */
      def logger(msg: String): Unit
      
      /**
        * Default: 100
        * This is the max number of connections allowed to a socket. It is currently only being set on Unix Sockets.
        * Other Socket types are using the system defaults
        */
      var maxConnections: Double
      
      /*  */
      /**
        * Default: false
        * if set, it represents the maximum number of retries after each disconnect before giving up
        * and completely killing a specific connection
        */
      var maxRetries: Boolean | Double
      
      /**
        * Default: 'localhost'
        * The local or remote host on which TCP, TLS or UDP Sockets should connect
        * Should resolve to 127.0.0.1 or ::1 see the table below related to this
        */
      var networkHost: String
      
      /**
        * Default: 8000
        * The default port on which TCP, TLS, or UDP sockets should connect
        */
      var networkPort: Double
      
      /**
        * Default: false
        * If true, data will be sent and received as a raw node Buffer NOT an Object as JSON.
        * This is great for Binary or hex IPC, and communicating with other processes in languages like C and C++
        */
      var rawBuffer: Boolean
      
      /**
        * Default: false
        * Makes the pipe readable for all users including windows services
        */
      var readableAll: Boolean
      
      /**
        * Default: 500
        * This is the time in milliseconds a client will wait before trying to reconnect to a server if the connection is lost.
        * This does not effect UDP sockets since they do not have a client server relationship like Unix Sockets and TCP Sockets
        */
      var retry: Double
      
      /**
        * Default: false
        * Turn on/off logging default is false which means logging is on
        */
      var silent: Boolean
      
      /**
        * Default: '/tmp/'
        * The directory in which to create or bind to a Unix Socket
        */
      var socketRoot: String
      
      /**
        * Default: false
        * Defaults to false meaning clients will continue to retry to connect to servers indefinitely at the retry interval.
        * If set to any number the client will stop retrying when that number is exceeded after each disconnect.
        * If set to true in real time it will immediately stop trying to connect regardless of maxRetries.
        * If set to 0, the client will NOT try to reconnect
        */
      var stopRetrying: Boolean
      
      /**
        * Default: false
        * Synchronous requests. Clients will not send new requests until the server answers
        */
      var sync: Boolean
      
      var tls: Private
      
      /**
        * Default: true
        * Defaults to true meaning that the module will take care of deleting the IPC socket prior to startup.
        * If you use node-ipc in a clustered environment where there will be multiple listeners on the same socket,
        * you must set this to false and then take care of deleting the socket in your own code.
        */
      var unlink: Boolean
      
      /**
        * Default: false
        * Makes the pipe writable for all users including windows services
        */
      var writableAll: Boolean
    }
    object Config {
      
      inline def apply(
        appspace: String,
        encoding: ascii | utf8 | utf16le | ucs2 | base64 | hex,
        id: String,
        interfaces: Family,
        logDepth: Double,
        logInColor: Boolean,
        logger: String => Unit,
        maxConnections: Double,
        maxRetries: Boolean | Double,
        networkHost: String,
        networkPort: Double,
        rawBuffer: Boolean,
        readableAll: Boolean,
        retry: Double,
        silent: Boolean,
        socketRoot: String,
        stopRetrying: Boolean,
        sync: Boolean,
        tls: Private,
        unlink: Boolean,
        writableAll: Boolean
      ): Config = {
        val __obj = js.Dynamic.literal(appspace = appspace.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], logDepth = logDepth.asInstanceOf[js.Any], logInColor = logInColor.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger), maxConnections = maxConnections.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], networkHost = networkHost.asInstanceOf[js.Any], networkPort = networkPort.asInstanceOf[js.Any], rawBuffer = rawBuffer.asInstanceOf[js.Any], readableAll = readableAll.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], socketRoot = socketRoot.asInstanceOf[js.Any], stopRetrying = stopRetrying.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any], writableAll = writableAll.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        inline def setAppspace(value: String): Self = StObject.set(x, "appspace", value.asInstanceOf[js.Any])
        
        inline def setEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | hex): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setInterfaces(value: Family): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
        
        inline def setLogDepth(value: Double): Self = StObject.set(x, "logDepth", value.asInstanceOf[js.Any])
        
        inline def setLogInColor(value: Boolean): Self = StObject.set(x, "logInColor", value.asInstanceOf[js.Any])
        
        inline def setLogger(value: String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
        
        inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
        
        inline def setMaxRetries(value: Boolean | Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
        
        inline def setNetworkHost(value: String): Self = StObject.set(x, "networkHost", value.asInstanceOf[js.Any])
        
        inline def setNetworkPort(value: Double): Self = StObject.set(x, "networkPort", value.asInstanceOf[js.Any])
        
        inline def setRawBuffer(value: Boolean): Self = StObject.set(x, "rawBuffer", value.asInstanceOf[js.Any])
        
        inline def setReadableAll(value: Boolean): Self = StObject.set(x, "readableAll", value.asInstanceOf[js.Any])
        
        inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setSocketRoot(value: String): Self = StObject.set(x, "socketRoot", value.asInstanceOf[js.Any])
        
        inline def setStopRetrying(value: Boolean): Self = StObject.set(x, "stopRetrying", value.asInstanceOf[js.Any])
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setTls(value: Private): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
        
        inline def setUnlink(value: Boolean): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
        
        inline def setWritableAll(value: Boolean): Self = StObject.set(x, "writableAll", value.asInstanceOf[js.Any])
      }
    }
    
    type EmptyCallback = js.Function0[Unit]
    
    @js.native
    trait IPC extends StObject {
      
      /**
        * Set these variables in the ipc.config scope to overwrite or set default values
        */
      var config: Config = js.native
      
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
      def connectTo(id: String): Unit = js.native
      def connectTo(id: String, callback: js.Function0[Unit]): Unit = js.native
      def connectTo(id: String, path: String): Unit = js.native
      def connectTo(id: String, path: String, callback: js.Function0[Unit]): Unit = js.native
      def connectTo(id: String, path: Unit, callback: js.Function0[Unit]): Unit = js.native
      
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
        * @param callback     this is the function to execute when the socket has been created
        */
      def connectToNet(id: String): Unit = js.native
      def connectToNet(id: String, callback: js.Function0[Unit]): Unit = js.native
      def connectToNet(id: String, hostOrPort: String, callback: js.Function0[Unit]): Unit = js.native
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
        * @param callback     this is the function to execute when the socket has been created
        */
      def connectToNet(id: String, hostOrPort: Double): Unit = js.native
      def connectToNet(id: String, hostOrPort: Double, callback: js.Function0[Unit]): Unit = js.native
      def connectToNet(id: String, host: String): Unit = js.native
      def connectToNet(id: String, host: String, port: Double): Unit = js.native
      def connectToNet(id: String, host: String, port: Double, callback: js.Function0[Unit]): Unit = js.native
      def connectToNet(id: String, host: String, port: Unit, callback: js.Function0[Unit]): Unit = js.native
      def connectToNet(id: String, host: Unit, port: Double): Unit = js.native
      def connectToNet(id: String, host: Unit, port: Double, callback: js.Function0[Unit]): Unit = js.native
      def connectToNet(id: String, host: Unit, port: Unit, callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * https://www.npmjs.com/package/node-ipc#disconnect
        * Used to disconnect a client from a Unix, Windows, TCP or TLS socket.
        * The socket and its refrence will be removed from memory and the ipc.of scope.
        * This can be local or remote. UDP clients do not maintain connections and so there are no Clients and this method has no value to them
        * @param id is the string id of the socket from which to disconnect
        */
      def disconnect(id: String): Unit = js.native
      
      /**
        * https://www.npmjs.com/package/node-ipc#log
        */
      def log(args: Any*): Unit = js.native
      
      /**
        * This is where socket connection references will be stored when connecting to them as a client via the ipc.connectTo
        * or iupc.connectToNet. They will be stored based on the ID used to create them, eg : ipc.of.mySocket
        */
      var of: Record[String, Client] = js.native
      
      /**
        * https://www.npmjs.com/package/node-ipc#serve
        * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
        * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
        * @param callback This is a function to be called after the Server has started.
        * This can also be done by binding an event to the start event like ipc.server.on('start',function(){});
        */
      def serve(): Unit = js.native
      def serve(callback: js.Function0[Unit]): Unit = js.native
      /**
        * https://www.npmjs.com/package/node-ipc#serve
        * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
        * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
        */
      def serve(callback: Null): Unit = js.native
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
      def serve(path: String): Unit = js.native
      def serve(path: String, callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * https://www.npmjs.com/package/node-ipc#servenet
        * @param host If not specified this defaults to the first address in os.networkInterfaces().
        * For TCP, TLS & UDP servers this is most likely going to be 127.0.0.1 or ::1
        * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
        * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
        * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
        * @param callback Function to be called when the server is created
        */
      def serveNet(): Unit = js.native
      /**
        * https://www.npmjs.com/package/node-ipc#servenet
        * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
        * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
        * @param callback Function to be called when the server is created
        */
      def serveNet(UDPType: udp4 | udp6): Unit = js.native
      def serveNet(UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(callbackOrPort: Double): Unit = js.native
      /**
        * https://www.npmjs.com/package/node-ipc#servenet
        * @param callback Function to be called when the server is created
        * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
        */
      def serveNet(callbackOrPort: EmptyCallback): Unit = js.native
      def serveNet(host: String): Unit = js.native
      def serveNet(host: String, port: Double): Unit = js.native
      def serveNet(host: String, port: Double, UDPType: udp4 | udp6): Unit = js.native
      def serveNet(host: String, port: Double, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: String, port: Double, UDPType: Unit, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: String, port: Double, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: String, port: Unit, UDPType: udp4 | udp6): Unit = js.native
      def serveNet(host: String, port: Unit, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: String, port: Unit, UDPType: Unit, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: Unit, port: Double): Unit = js.native
      def serveNet(host: Unit, port: Double, UDPType: udp4 | udp6): Unit = js.native
      def serveNet(host: Unit, port: Double, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: Unit, port: Double, UDPType: Unit, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: Unit, port: Unit, UDPType: udp4 | udp6): Unit = js.native
      def serveNet(host: Unit, port: Unit, UDPType: udp4 | udp6, callback: js.Function0[Unit]): Unit = js.native
      def serveNet(host: Unit, port: Unit, UDPType: Unit, callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * This is a refrence to the server created by ipc.serve or ipc.serveNet
        */
      var server: Server = js.native
    }
    
    @js.native
    trait Server
      extends StObject
         with Client {
      
      def broadcast(event: String): Client = js.native
      def broadcast(event: String, value: Any): Client = js.native
      
      def emit(socketConfig: Socket): Server = js.native
      def emit(socketConfig: Socket, value: Any): Server = js.native
      def emit(socketConfig: SocketConfig): Server = js.native
      def emit(socketConfig: SocketConfig, value: Any): Server = js.native
      def emit(socket: Socket, event: String): Server = js.native
      def emit(socket: Socket, event: String, value: Any): Server = js.native
      def emit(socket: SocketConfig, event: String): Server = js.native
      def emit(socket: SocketConfig, event: String, value: Any): Server = js.native
      def emit(value: Any): Client = js.native
      
      /**
        * start serving need top call serve or serveNet first to set up the server
        */
      def start(): Unit = js.native
      
      /**
        * close the server and stop serving
        */
      def stop(): Unit = js.native
    }
    
    trait SocketConfig extends StObject {
      
      var address: js.UndefOr[String] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
    }
    object SocketConfig {
      
      inline def apply(): SocketConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SocketConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SocketConfig] (val x: Self) extends AnyVal {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
  }
}
