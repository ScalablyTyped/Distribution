package typings.ncom

import typings.ncom.ncomBooleans.`true`
import typings.ncom.ncomStrings.connection
import typings.ncom.ncomStrings.error
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.ListenOptions
import typings.node.netMod.Socket
import typings.node.netMod.SocketConstructorOpts
import typings.node.tlsMod.TlsOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ncom", "ComServer")
  @js.native
  class ComServer () extends EventEmitter {
    def this(options: ComServerOptions) = this()
    def this(options: SecureComServerOptions) = this()
    
    @JSName("addListener")
    def addListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    // tslint:enable:unified-signatures
    /**
      * Forwards to net.Server.close()
      */
    def close(): this.type = js.native
    def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    
    /**
      * Forwards to net.Server.listen()
      */
    // tslint:disable:unified-signatures Copied from net.d.ts, where the rule is disabled
    def listen(): this.type = js.native
    def listen(handle: js.Any): this.type = js.native
    def listen(handle: js.Any, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(handle: js.Any, backlog: Double): this.type = js.native
    def listen(handle: js.Any, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(handle: js.Any, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(options: ListenOptions): this.type = js.native
    def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(path: String): this.type = js.native
    def listen(path: String, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(path: String, backlog: Double): this.type = js.native
    def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(path: String, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], backlog: Double): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(
      port: js.UndefOr[scala.Nothing],
      hostname: js.UndefOr[scala.Nothing],
      backlog: js.UndefOr[scala.Nothing],
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], hostname: js.UndefOr[scala.Nothing], backlog: Double): this.type = js.native
    def listen(
      port: js.UndefOr[scala.Nothing],
      hostname: js.UndefOr[scala.Nothing],
      backlog: Double,
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(
      port: js.UndefOr[scala.Nothing],
      hostname: js.UndefOr[scala.Nothing],
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], hostname: String): this.type = js.native
    def listen(
      port: js.UndefOr[scala.Nothing],
      hostname: String,
      backlog: js.UndefOr[scala.Nothing],
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], hostname: String, backlog: Double): this.type = js.native
    def listen(
      port: js.UndefOr[scala.Nothing],
      hostname: String,
      backlog: Double,
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double): this.type = js.native
    def listen(port: Double, backlog: Double): this.type = js.native
    def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(
      port: Double,
      hostname: js.UndefOr[scala.Nothing],
      backlog: js.UndefOr[scala.Nothing],
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double): this.type = js.native
    def listen(
      port: Double,
      hostname: js.UndefOr[scala.Nothing],
      backlog: Double,
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: Double, hostname: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: String): this.type = js.native
    def listen(
      port: Double,
      hostname: String,
      backlog: js.UndefOr[scala.Nothing],
      listeningListener: js.Function0[Unit]
    ): this.type = js.native
    def listen(port: Double, hostname: String, backlog: Double): this.type = js.native
    def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, listeningListener: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_connection(event: connection, listener: ConnectionListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  }
  
  @JSImport("ncom", "ComSocket")
  @js.native
  class ComSocket protected () extends EventEmitter {
    def this(options: SocketConstructorOpts, id: String) = this()
    def this(options: Socket, id: String) = this()
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var batchDuration: Double = js.native
    
    var connected: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    
    def end(): Unit = js.native
    
    var id: String = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var socket: Socket = js.native
    
    def write(data: js.Any): Unit = js.native
    def write(data: js.Any, writeOptions: WriteOptions): Unit = js.native
  }
  
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(): ComServer = js.native
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(listener: ConnectionListener): ComServer = js.native
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(options: js.UndefOr[scala.Nothing], listener: ConnectionListener): ComServer = js.native
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(options: ComServerOptions): ComServer = js.native
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(options: ComServerOptions, listener: ConnectionListener): ComServer = js.native
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(options: SecureComServerOptions): ComServer = js.native
  @JSImport("ncom", "createServer")
  @js.native
  def createServer(options: SecureComServerOptions, listener: ConnectionListener): ComServer = js.native
  
  @js.native
  trait ComServerOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.native
    
    var pauseOnConnect: js.UndefOr[Boolean] = js.native
  }
  object ComServerOptions {
    
    @scala.inline
    def apply(): ComServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComServerOptions]
    }
    
    @scala.inline
    implicit class ComServerOptionsMutableBuilder[Self <: ComServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setPauseOnConnect(value: Boolean): Self = StObject.set(x, "pauseOnConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnConnectUndefined: Self = StObject.set(x, "pauseOnConnect", js.undefined)
    }
  }
  
  type ConnectionListener = js.Function1[/* socket */ ComSocket, Unit]
  
  type FilterFunction = js.Function1[/* data */ js.Any, String]
  
  @js.native
  trait SecureComServerOptions extends TlsOptions {
    
    var secure: `true` = js.native
  }
  object SecureComServerOptions {
    
    @scala.inline
    def apply(secure: `true`): SecureComServerOptions = {
      val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecureComServerOptions]
    }
    
    @scala.inline
    implicit class SecureComServerOptionsMutableBuilder[Self <: SecureComServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecure(value: `true`): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WriteOptions extends StObject {
    
    var batch: js.UndefOr[Boolean] = js.native
    
    var filters: js.UndefOr[js.Array[FilterFunction]] = js.native
  }
  object WriteOptions {
    
    @scala.inline
    def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit class WriteOptionsMutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[FilterFunction]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: FilterFunction*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
}
