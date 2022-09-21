package typings.ncom

import typings.ncom.ncomBooleans.`true`
import typings.ncom.ncomStrings.connection
import typings.ncom.ncomStrings.error
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.ListenOptions
import typings.node.netMod.Socket
import typings.node.netMod.SocketConstructorOpts
import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ncom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ncom", "ComServer")
  @js.native
  open class ComServer () extends EventEmitter {
    def this(options: ComServerOptions) = this()
    def this(options: SecureComServerOptions) = this()
    
    @JSName("addListener")
    def addListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    // tslint:enable:unified-signatures
    /**
      * Forwards to net.Server.close()
      */
    def close(): this.type = js.native
    def close(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    
    /**
      * Forwards to net.Server.listen()
      */
    // tslint:disable:unified-signatures Copied from net.d.ts, where the rule is disabled
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
    
    @JSName("on")
    def on_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  }
  
  @JSImport("ncom", "ComSocket")
  @js.native
  open class ComSocket protected () extends EventEmitter {
    def this(options: SocketConstructorOpts, id: String) = this()
    def this(options: Socket, id: String) = this()
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var batchDuration: Double = js.native
    
    var connected: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    
    def end(): Unit = js.native
    
    var id: String = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var socket: Socket = js.native
    
    def write(data: Any): Unit = js.native
    def write(data: Any, writeOptions: WriteOptions): Unit = js.native
  }
  
  inline def createServer(): ComServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[ComServer]
  inline def createServer(listener: ConnectionListener): ComServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(listener.asInstanceOf[js.Any]).asInstanceOf[ComServer]
  inline def createServer(options: Unit, listener: ConnectionListener): ComServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ComServer]
  inline def createServer(options: ComServerOptions): ComServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[ComServer]
  inline def createServer(options: ComServerOptions, listener: ConnectionListener): ComServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ComServer]
  inline def createServer(options: SecureComServerOptions): ComServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[ComServer]
  inline def createServer(options: SecureComServerOptions, listener: ConnectionListener): ComServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ComServer]
  
  trait ComServerOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
  }
  object ComServerOptions {
    
    inline def apply(): ComServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComServerOptions]
    }
    
    extension [Self <: ComServerOptions](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setPauseOnConnect(value: Boolean): Self = StObject.set(x, "pauseOnConnect", value.asInstanceOf[js.Any])
      
      inline def setPauseOnConnectUndefined: Self = StObject.set(x, "pauseOnConnect", js.undefined)
    }
  }
  
  type ConnectionListener = js.Function1[/* socket */ ComSocket, Unit]
  
  type FilterFunction = js.Function1[/* data */ Any, String]
  
  trait SecureComServerOptions
    extends StObject
       with TlsOptions {
    
    var secure: `true`
  }
  object SecureComServerOptions {
    
    inline def apply(): SecureComServerOptions = {
      val __obj = js.Dynamic.literal(secure = true)
      __obj.asInstanceOf[SecureComServerOptions]
    }
    
    extension [Self <: SecureComServerOptions](x: Self) {
      
      inline def setSecure(value: `true`): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriteOptions extends StObject {
    
    var batch: js.UndefOr[Boolean] = js.undefined
    
    var filters: js.UndefOr[js.Array[FilterFunction]] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setFilters(value: js.Array[FilterFunction]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: FilterFunction*): Self = StObject.set(x, "filters", js.Array(value*))
    }
  }
}
