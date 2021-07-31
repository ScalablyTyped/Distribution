package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.WritableStream
import typings.node.anon.AllowHalfOpen
import typings.node.anon.End
import typings.node.childProcessMod.SendHandle
import typings.node.dnsMod.LookupOneOptions
import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.close
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.connection
import typings.node.nodeStrings.data
import typings.node.nodeStrings.error
import typings.node.nodeStrings.listening
import typings.node.nodeStrings.lookup
import typings.node.nodeStrings.timeout
import typings.node.streamMod.Duplex
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netMod {
  
  @JSImport("net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/net.js
  @JSImport("net", "Server")
  @js.native
  class Server ()
    extends EventEmitter
       with SendHandle {
    def this(connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
    def this(options: AllowHalfOpen) = this()
    def this(options: Unit, connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
    def this(options: AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    
    def address(): AddressInfo | java.lang.String | Null = js.native
    
    def close(): this.type = js.native
    def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    
    var connections: Double = js.native
    
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
    def listen(handle: js.Any, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(handle: js.Any, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(options: ListenOptions): this.type = js.native
    def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(path: java.lang.String): this.type = js.native
    def listen(path: java.lang.String, backlog: Double): this.type = js.native
    def listen(path: java.lang.String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(path: java.lang.String, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(path: java.lang.String, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double): this.type = js.native
    def listen(port: Double, backlog: Double): this.type = js.native
    def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: java.lang.String): this.type = js.native
    def listen(port: Double, hostname: java.lang.String, backlog: Double): this.type = js.native
    def listen(port: Double, hostname: java.lang.String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: java.lang.String, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: java.lang.String, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: Unit, backlog: Double): this.type = js.native
    def listen(port: Double, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, backlog: Double): this.type = js.native
    def listen(port: Unit, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, hostname: java.lang.String): this.type = js.native
    def listen(port: Unit, hostname: java.lang.String, backlog: Double): this.type = js.native
    def listen(port: Unit, hostname: java.lang.String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, hostname: java.lang.String, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, hostname: java.lang.String, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, hostname: Unit, backlog: Double): this.type = js.native
    def listen(port: Unit, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, hostname: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Unit, listeningListener: js.Function0[Unit]): this.type = js.native
    
    var listening: Boolean = js.native
    
    var maxConnections: Double = js.native
    
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
  
  @JSImport("net", "Socket")
  @js.native
  class Socket ()
    extends Duplex
       with SendHandle {
    def this(options: SocketConstructorOpts) = this()
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_lookup(
      event: lookup,
      listener: js.Function4[
          /* err */ Error, 
          /* address */ java.lang.String, 
          /* family */ java.lang.String | Double, 
          /* host */ java.lang.String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    
    def address(): AddressInfo | js.Object = js.native
    
    val bufferSize: Double = js.native
    
    val bytesRead: Double = js.native
    
    val bytesWritten: Double = js.native
    
    def connect(options: SocketConnectOpts): this.type = js.native
    def connect(options: SocketConnectOpts, connectionListener: js.Function0[Unit]): this.type = js.native
    def connect(path: java.lang.String): this.type = js.native
    def connect(path: java.lang.String, connectionListener: js.Function0[Unit]): this.type = js.native
    def connect(port: Double): this.type = js.native
    def connect(port: Double, connectionListener: js.Function0[Unit]): this.type = js.native
    def connect(port: Double, host: java.lang.String): this.type = js.native
    def connect(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): this.type = js.native
    
    val connecting: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close, had_error: Boolean): Boolean = js.native
    @JSName("emit")
    def emit_connect(event: connect): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, data: Buffer): Boolean = js.native
    @JSName("emit")
    def emit_lookup(
      event: lookup,
      err: Error,
      address: java.lang.String,
      family: java.lang.String,
      host: java.lang.String
    ): Boolean = js.native
    @JSName("emit")
    def emit_lookup(event: lookup, err: Error, address: java.lang.String, family: Double, host: java.lang.String): Boolean = js.native
    @JSName("emit")
    def emit_timeout(event: timeout): Boolean = js.native
    
    def end(buffer: java.lang.String): Unit = js.native
    def end(buffer: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
    def end(buffer: Uint8Array): Unit = js.native
    def end(buffer: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(str: Uint8Array, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
    def end(str: Uint8Array, encoding: BufferEncoding): Unit = js.native
    def end(str: Uint8Array, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    val localAddress: java.lang.String = js.native
    
    val localPort: Double = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_lookup(
      event: lookup,
      listener: js.Function4[
          /* err */ Error, 
          /* address */ java.lang.String, 
          /* family */ java.lang.String | Double, 
          /* host */ java.lang.String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_lookup(
      event: lookup,
      listener: js.Function4[
          /* err */ Error, 
          /* address */ java.lang.String, 
          /* family */ java.lang.String | Double, 
          /* host */ java.lang.String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_lookup(
      event: lookup,
      listener: js.Function4[
          /* err */ Error, 
          /* address */ java.lang.String, 
          /* family */ java.lang.String | Double, 
          /* host */ java.lang.String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_lookup(
      event: lookup,
      listener: js.Function4[
          /* err */ Error, 
          /* address */ java.lang.String, 
          /* family */ java.lang.String | Double, 
          /* host */ java.lang.String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    
    def ref(): this.type = js.native
    
    val remoteAddress: js.UndefOr[java.lang.String] = js.native
    
    val remoteFamily: js.UndefOr[java.lang.String] = js.native
    
    val remotePort: js.UndefOr[Double] = js.native
    
    def setEncoding(): this.type = js.native
    
    def setKeepAlive(): this.type = js.native
    def setKeepAlive(enable: Boolean): this.type = js.native
    def setKeepAlive(enable: Boolean, initialDelay: Double): this.type = js.native
    def setKeepAlive(enable: Unit, initialDelay: Double): this.type = js.native
    
    def setNoDelay(): this.type = js.native
    def setNoDelay(noDelay: Boolean): this.type = js.native
    
    def setTimeout(timeout: Double): this.type = js.native
    def setTimeout(timeout: Double, callback: js.Function0[Unit]): this.type = js.native
    
    def unref(): this.type = js.native
    
    def write(buffer: java.lang.String): Boolean = js.native
    def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
    // Extended base methods
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
    def write(str: java.lang.String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
    def write(str: java.lang.String, encoding: BufferEncoding): Boolean = js.native
    def write(
      str: java.lang.String,
      encoding: BufferEncoding,
      cb: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Boolean = js.native
    def write(str: Uint8Array, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
    def write(str: Uint8Array, encoding: BufferEncoding): Boolean = js.native
    def write(str: Uint8Array, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
  }
  
  @scala.inline
  def connect(options: NetConnectOpts): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(path: java.lang.String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def connect(path: java.lang.String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double, host: java.lang.String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double, host: Unit, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  
  @scala.inline
  def createConnection(options: NetConnectOpts): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(path: java.lang.String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def createConnection(path: java.lang.String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double, host: java.lang.String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double, host: Unit, connectionListener: js.Function0[Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  
  @scala.inline
  def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  @scala.inline
  def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: Unit, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(options: AllowHalfOpen): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @scala.inline
  def isIP(input: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isIPv4(input: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIPv6(input: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AddressInfo extends StObject {
    
    var address: java.lang.String
    
    var family: java.lang.String
    
    var port: Double
  }
  object AddressInfo {
    
    @scala.inline
    def apply(address: java.lang.String, family: java.lang.String, port: Double): AddressInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInfo]
    }
    
    @scala.inline
    implicit class AddressInfoMutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: java.lang.String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOpts extends StObject {
    
    /**
      * If specified, incoming data is stored in a single buffer and passed to the supplied callback when data arrives on the socket.
      * Note: this will cause the streaming functionality to not provide any data, however events like 'error', 'end', and 'close' will
      * still be emitted as normal and methods like pause() and resume() will also behave as expected.
      */
    var onread: js.UndefOr[OnReadOpts] = js.undefined
  }
  object ConnectOpts {
    
    @scala.inline
    def apply(): ConnectOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOpts]
    }
    
    @scala.inline
    implicit class ConnectOptsMutableBuilder[Self <: ConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnread(value: OnReadOpts): Self = StObject.set(x, "onread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnreadUndefined: Self = StObject.set(x, "onread", js.undefined)
    }
  }
  
  trait IpcNetConnectOpts
    extends StObject
       with IpcSocketConnectOpts
       with SocketConstructorOpts
       with NetConnectOpts {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IpcNetConnectOpts {
    
    @scala.inline
    def apply(path: java.lang.String): IpcNetConnectOpts = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpcNetConnectOpts]
    }
    
    @scala.inline
    implicit class IpcNetConnectOptsMutableBuilder[Self <: IpcNetConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait IpcSocketConnectOpts
    extends StObject
       with ConnectOpts
       with SocketConnectOpts {
    
    var path: java.lang.String
  }
  object IpcSocketConnectOpts {
    
    @scala.inline
    def apply(path: java.lang.String): IpcSocketConnectOpts = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpcSocketConnectOpts]
    }
    
    @scala.inline
    implicit class IpcSocketConnectOptsMutableBuilder[Self <: IpcSocketConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListenOptions extends StObject {
    
    var backlog: js.UndefOr[Double] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[java.lang.String] = js.undefined
    
    /**
      * @default false
      */
    var ipv6Only: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var readableAll: js.UndefOr[Boolean] = js.undefined
    
    var writableAll: js.UndefOr[Boolean] = js.undefined
  }
  object ListenOptions {
    
    @scala.inline
    def apply(): ListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenOptions]
    }
    
    @scala.inline
    implicit class ListenOptionsMutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIpv6Only(value: Boolean): Self = StObject.set(x, "ipv6Only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6OnlyUndefined: Self = StObject.set(x, "ipv6Only", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReadableAll(value: Boolean): Self = StObject.set(x, "readableAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableAllUndefined: Self = StObject.set(x, "readableAll", js.undefined)
      
      @scala.inline
      def setWritableAll(value: Boolean): Self = StObject.set(x, "writableAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableAllUndefined: Self = StObject.set(x, "writableAll", js.undefined)
    }
  }
  
  type LookupFunction = js.Function3[
    /* hostname */ java.lang.String, 
    /* options */ LookupOneOptions, 
    /* callback */ js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.netMod.TcpNetConnectOpts
    - typings.node.netMod.IpcNetConnectOpts
  */
  trait NetConnectOpts extends StObject
  object NetConnectOpts {
    
    @scala.inline
    def IpcNetConnectOpts(path: java.lang.String): typings.node.netMod.IpcNetConnectOpts = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.netMod.IpcNetConnectOpts]
    }
    
    @scala.inline
    def TcpNetConnectOpts(port: Double): typings.node.netMod.TcpNetConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.netMod.TcpNetConnectOpts]
    }
  }
  
  trait OnReadOpts extends StObject {
    
    var buffer: Uint8Array | js.Function0[Uint8Array]
    
    /**
      * This function is called for every chunk of incoming data.
      * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
      * Return false from this function to implicitly pause() the socket.
      */
    def callback(bytesWritten: Double, buf: Uint8Array): Boolean
  }
  object OnReadOpts {
    
    @scala.inline
    def apply(buffer: Uint8Array | js.Function0[Uint8Array], callback: (Double, Uint8Array) => Boolean): OnReadOpts = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback))
      __obj.asInstanceOf[OnReadOpts]
    }
    
    @scala.inline
    implicit class OnReadOptsMutableBuilder[Self <: OnReadOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Uint8Array | js.Function0[Uint8Array]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferFunction0(value: () => Uint8Array): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallback(value: (Double, Uint8Array) => Boolean): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.netMod.TcpSocketConnectOpts
    - typings.node.netMod.IpcSocketConnectOpts
  */
  trait SocketConnectOpts extends StObject
  object SocketConnectOpts {
    
    @scala.inline
    def IpcSocketConnectOpts(path: java.lang.String): typings.node.netMod.IpcSocketConnectOpts = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.netMod.IpcSocketConnectOpts]
    }
    
    @scala.inline
    def TcpSocketConnectOpts(port: Double): typings.node.netMod.TcpSocketConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.netMod.TcpSocketConnectOpts]
    }
  }
  
  trait SocketConstructorOpts extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var fd: js.UndefOr[Double] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object SocketConstructorOpts {
    
    @scala.inline
    def apply(): SocketConstructorOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketConstructorOpts]
    }
    
    @scala.inline
    implicit class SocketConstructorOptsMutableBuilder[Self <: SocketConstructorOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  trait TcpNetConnectOpts
    extends StObject
       with TcpSocketConnectOpts
       with SocketConstructorOpts
       with NetConnectOpts {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object TcpNetConnectOpts {
    
    @scala.inline
    def apply(port: Double): TcpNetConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpNetConnectOpts]
    }
    
    @scala.inline
    implicit class TcpNetConnectOptsMutableBuilder[Self <: TcpNetConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait TcpSocketConnectOpts
    extends StObject
       with ConnectOpts
       with SocketConnectOpts {
    
    var family: js.UndefOr[Double] = js.undefined
    
    var hints: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[java.lang.String] = js.undefined
    
    var localAddress: js.UndefOr[java.lang.String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    var port: Double
  }
  object TcpSocketConnectOpts {
    
    @scala.inline
    def apply(port: Double): TcpSocketConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpSocketConnectOpts]
    }
    
    @scala.inline
    implicit class TcpSocketConnectOptsMutableBuilder[Self <: TcpSocketConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: java.lang.String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setLookup(
        value: (/* hostname */ java.lang.String, /* options */ LookupOneOptions, /* callback */ js.Function3[
              /* err */ ErrnoException | Null, 
              /* address */ java.lang.String, 
              /* family */ Double, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
