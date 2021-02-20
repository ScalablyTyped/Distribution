package typings.node

import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ReadOnlyDict
import typings.node.netMod.Socket
import typings.node.nodeStrings.abort
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.continue
import typings.node.nodeStrings.fifo
import typings.node.nodeStrings.information
import typings.node.nodeStrings.lifo
import typings.node.nodeStrings.response
import typings.node.nodeStrings.socket
import typings.node.nodeStrings.timeout
import typings.node.nodeStrings.upgrade
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http", "Agent")
  @js.native
  class Agent () extends StObject {
    def this(opts: AgentOptions) = this()
    
    /**
      * Destroy any sockets that are currently in use by the agent.
      * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
      * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
      * sockets may hang open for quite a long time before the server terminates them.
      */
    def destroy(): Unit = js.native
    
    val freeSockets: ReadOnlyDict[js.Array[Socket]] = js.native
    
    var maxFreeSockets: Double = js.native
    
    var maxSockets: Double = js.native
    
    var maxTotalSockets: Double = js.native
    
    val requests: ReadOnlyDict[js.Array[IncomingMessage]] = js.native
    
    val sockets: ReadOnlyDict[js.Array[Socket]] = js.native
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  @JSImport("http", "ClientRequest")
  @js.native
  class ClientRequest protected () extends OutgoingMessage {
    def this(url: java.lang.String) = this()
    def this(url: ClientRequestArgs) = this()
    def this(url: URL_) = this()
    def this(url: java.lang.String, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
    def this(url: ClientRequestArgs, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
    def this(url: URL_, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
    
    def abort(): Unit = js.native
    
    var aborted: Boolean = js.native
    
    @JSName("addListener")
    def addListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connect(
      event: connect,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_upgrade(
      event: upgrade,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    
    var host: java.lang.String = js.native
    
    var method: java.lang.String = js.native
    
    def onSocket(socket: Socket): Unit = js.native
    
    @JSName("on")
    def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connect(
      event: connect,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
    @JSName("on")
    def on_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("on")
    def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_upgrade(
      event: upgrade,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_connect(
      event: connect,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
    @JSName("once")
    def once_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("once")
    def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_upgrade(
      event: upgrade,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    
    var path: java.lang.String = js.native
    
    @JSName("prependListener")
    def prependListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_connect(
      event: connect,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_upgrade(
      event: upgrade,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connect(
      event: connect,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_upgrade(
      event: upgrade,
      listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
    ): this.type = js.native
    
    var protocol: java.lang.String = js.native
    
    def setNoDelay(): Unit = js.native
    def setNoDelay(noDelay: Boolean): Unit = js.native
    
    def setSocketKeepAlive(): Unit = js.native
    def setSocketKeepAlive(enable: js.UndefOr[scala.Nothing], initialDelay: Double): Unit = js.native
    def setSocketKeepAlive(enable: Boolean): Unit = js.native
    def setSocketKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
  }
  
  @JSImport("http", "IncomingMessage")
  @js.native
  class IncomingMessage protected () extends Readable {
    def this(socket: Socket) = this()
    
    var aborted: Boolean = js.native
    
    var complete: Boolean = js.native
    
    /**
      * @deprecate Use `socket` instead.
      */
    var connection: Socket = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var httpVersion: java.lang.String = js.native
    
    var httpVersionMajor: Double = js.native
    
    var httpVersionMinor: Double = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var method: js.UndefOr[java.lang.String] = js.native
    
    var rawHeaders: js.Array[java.lang.String] = js.native
    
    var rawTrailers: js.Array[java.lang.String] = js.native
    
    def setTimeout(msecs: Double): this.type = js.native
    def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
    
    var socket: Socket = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusMessage: js.UndefOr[java.lang.String] = js.native
    
    var trailers: Dict[java.lang.String] = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var url: js.UndefOr[java.lang.String] = js.native
  }
  
  @JSImport("http", "METHODS")
  @js.native
  val METHODS: js.Array[java.lang.String] = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  @JSImport("http", "OutgoingMessage")
  @js.native
  class OutgoingMessage () extends Writable {
    
    def addTrailers(headers: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): Unit = js.native
    def addTrailers(headers: OutgoingHttpHeaders): Unit = js.native
    
    var chunkedEncoding: Boolean = js.native
    
    /**
      * @deprecate Use `socket` instead.
      */
    var connection: Socket | Null = js.native
    
    /**
      * @deprecated Use `writableEnded` instead.
      */
    var finished: Boolean = js.native
    
    def flushHeaders(): Unit = js.native
    
    def getHeader(name: java.lang.String): js.UndefOr[Double | java.lang.String | js.Array[java.lang.String]] = js.native
    
    def getHeaderNames(): js.Array[java.lang.String] = js.native
    
    def getHeaders(): OutgoingHttpHeaders = js.native
    
    def hasHeader(name: java.lang.String): Boolean = js.native
    
    var headersSent: Boolean = js.native
    
    def removeHeader(name: java.lang.String): Unit = js.native
    
    var sendDate: Boolean = js.native
    
    def setHeader(name: java.lang.String, value: java.lang.String): Unit = js.native
    def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): Unit = js.native
    def setHeader(name: java.lang.String, value: Double): Unit = js.native
    
    def setTimeout(msecs: Double): this.type = js.native
    def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
    
    var shouldKeepAlive: Boolean = js.native
    
    var socket: Socket | Null = js.native
    
    var upgrading: Boolean = js.native
    
    var useChunkedEncodingByDefault: Boolean = js.native
  }
  
  @JSImport("http", "Server")
  @js.native
  class Server ()
    extends typings.node.netMod.Server
       with HttpBase {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  @JSImport("http", "ServerResponse")
  @js.native
  class ServerResponse protected () extends OutgoingMessage {
    def this(req: IncomingMessage) = this()
    
    def assignSocket(socket: Socket): Unit = js.native
    
    def detachSocket(socket: Socket): Unit = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: java.lang.String = js.native
    
    // https://github.com/nodejs/node/blob/master/test/parallel/test-http-write-callbacks.js#L53
    // no args in writeContinue callback
    def writeContinue(): Unit = js.native
    def writeContinue(callback: js.Function0[Unit]): Unit = js.native
    
    def writeHead(statusCode: Double): this.type = js.native
    def writeHead(statusCode: Double, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
    def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: js.Array[OutgoingHttpHeader]): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: OutgoingHttpHeaders): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: java.lang.String): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: java.lang.String, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: java.lang.String, headers: OutgoingHttpHeaders): this.type = js.native
    
    def writeProcessing(): Unit = js.native
  }
  
  @JSImport("http", "createServer")
  @js.native
  def createServer(): Server = js.native
  @JSImport("http", "createServer")
  @js.native
  def createServer(options: ServerOptions): Server = js.native
  @JSImport("http", "createServer")
  @js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): Server = js.native
  @JSImport("http", "createServer")
  @js.native
  def createServer(requestListener: RequestListener): Server = js.native
  
  @JSImport("http", "get")
  @js.native
  def get(options: java.lang.String): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(options: RequestOptions): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(options: URL_): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(url: URL_, options: RequestOptions): ClientRequest = js.native
  @JSImport("http", "get")
  @js.native
  def get(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  @JSImport("http", "globalAgent")
  @js.native
  def globalAgent: Agent = js.native
  @scala.inline
  def globalAgent_=(x: Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 16KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  @JSImport("http", "maxHeaderSize")
  @js.native
  val maxHeaderSize: Double = js.native
  
  @JSImport("http", "request")
  @js.native
  def request(options: java.lang.String): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(options: RequestOptions): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(options: URL_): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(url: URL_, options: RequestOptions): ClientRequest = js.native
  @JSImport("http", "request")
  @js.native
  def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  @js.native
  trait AgentOptions extends StObject {
    
    /**
      * Keep sockets around in a pool to be used by other requests in the future. Default = false
      */
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    /**
      * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
      * Only relevant if keepAlive is set to true.
      */
    var keepAliveMsecs: js.UndefOr[Double] = js.native
    
    /**
      * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
      */
    var maxFreeSockets: js.UndefOr[Double] = js.native
    
    /**
      * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
      */
    var maxSockets: js.UndefOr[Double] = js.native
    
    /**
      * Maximum number of sockets allowed for all hosts in total. Each request will use a new socket until the maximum is reached. Default: Infinity.
      */
    var maxTotalSockets: js.UndefOr[Double] = js.native
    
    /**
      * Scheduling strategy to apply when picking the next free socket to use. Default: 'fifo'.
      */
    var scheduling: js.UndefOr[fifo | lifo] = js.native
    
    /**
      * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object AgentOptions {
    
    @scala.inline
    def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    @scala.inline
    implicit class AgentOptionsMutableBuilder[Self <: AgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      @scala.inline
      def setMaxTotalSockets(value: Double): Self = StObject.set(x, "maxTotalSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTotalSocketsUndefined: Self = StObject.set(x, "maxTotalSockets", js.undefined)
      
      @scala.inline
      def setScheduling(value: fifo | lifo): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ClientRequestArgs extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.native
    
    var agent: js.UndefOr[Agent | Boolean] = js.native
    
    var auth: js.UndefOr[java.lang.String | Null] = js.native
    
    // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.native
    
    var defaultPort: js.UndefOr[Double | java.lang.String] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var host: js.UndefOr[java.lang.String | Null] = js.native
    
    var hostname: js.UndefOr[java.lang.String | Null] = js.native
    
    var localAddress: js.UndefOr[java.lang.String] = js.native
    
    /**
      * @default 8192
      */
    var maxHeaderSize: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[java.lang.String] = js.native
    
    var path: js.UndefOr[java.lang.String | Null] = js.native
    
    var port: js.UndefOr[Double | java.lang.String | Null] = js.native
    
    var protocol: js.UndefOr[java.lang.String | Null] = js.native
    
    var setHost: js.UndefOr[Boolean] = js.native
    
    var socketPath: js.UndefOr[java.lang.String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ClientRequestArgs {
    
    @scala.inline
    def apply(): ClientRequestArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientRequestArgs]
    }
    
    @scala.inline
    implicit class ClientRequestArgsMutableBuilder[Self <: ClientRequestArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setDefaultPort(value: Double | java.lang.String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: java.lang.String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMethod(value: java.lang.String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double | java.lang.String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSocketPath(value: java.lang.String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  @js.native
  trait HttpBase extends StObject {
    
    /**
      * Limit the amount of time the parser will wait to receive the complete HTTP headers.
      * @default 60000
      * {@link https://nodejs.org/api/http.html#http_server_headerstimeout}
      */
    var headersTimeout: Double = js.native
    
    var keepAliveTimeout: Double = js.native
    
    /**
      * Limits maximum incoming headers count. If set to 0, no limit will be applied.
      * @default 2000
      * {@link https://nodejs.org/api/http.html#http_server_maxheaderscount}
      */
    var maxHeadersCount: Double | Null = js.native
    
    /**
      * Sets the timeout value in milliseconds for receiving the entire request from the client.
      * @default 0
      * {@link https://nodejs.org/api/http.html#http_server_requesttimeout}
      */
    var requestTimeout: Double = js.native
    
    def setTimeout(): this.type = js.native
    def setTimeout(callback: js.Function0[Unit]): this.type = js.native
    def setTimeout(msecs: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): this.type = js.native
    def setTimeout(msecs: Double): this.type = js.native
    def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
    
    var timeout: Double = js.native
  }
  
  // incoming headers will never contain number
  @js.native
  trait IncomingHttpHeaders
    extends Dict[java.lang.String | js.Array[java.lang.String]] {
    
    var accept: js.UndefOr[java.lang.String] = js.native
    
    var `accept-language`: js.UndefOr[java.lang.String] = js.native
    
    var `accept-patch`: js.UndefOr[java.lang.String] = js.native
    
    var `accept-ranges`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-allow-credentials`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-allow-headers`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-allow-methods`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-allow-origin`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-expose-headers`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-max-age`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-request-headers`: js.UndefOr[java.lang.String] = js.native
    
    var `access-control-request-method`: js.UndefOr[java.lang.String] = js.native
    
    var age: js.UndefOr[java.lang.String] = js.native
    
    var allow: js.UndefOr[java.lang.String] = js.native
    
    var `alt-svc`: js.UndefOr[java.lang.String] = js.native
    
    var authorization: js.UndefOr[java.lang.String] = js.native
    
    var `cache-control`: js.UndefOr[java.lang.String] = js.native
    
    var connection: js.UndefOr[java.lang.String] = js.native
    
    var `content-disposition`: js.UndefOr[java.lang.String] = js.native
    
    var `content-encoding`: js.UndefOr[java.lang.String] = js.native
    
    var `content-language`: js.UndefOr[java.lang.String] = js.native
    
    var `content-length`: js.UndefOr[java.lang.String] = js.native
    
    var `content-location`: js.UndefOr[java.lang.String] = js.native
    
    var `content-range`: js.UndefOr[java.lang.String] = js.native
    
    var `content-type`: js.UndefOr[java.lang.String] = js.native
    
    var cookie: js.UndefOr[java.lang.String] = js.native
    
    var date: js.UndefOr[java.lang.String] = js.native
    
    var expect: js.UndefOr[java.lang.String] = js.native
    
    var expires: js.UndefOr[java.lang.String] = js.native
    
    var forwarded: js.UndefOr[java.lang.String] = js.native
    
    var from: js.UndefOr[java.lang.String] = js.native
    
    var host: js.UndefOr[java.lang.String] = js.native
    
    var `if-match`: js.UndefOr[java.lang.String] = js.native
    
    var `if-modified-since`: js.UndefOr[java.lang.String] = js.native
    
    var `if-none-match`: js.UndefOr[java.lang.String] = js.native
    
    var `if-unmodified-since`: js.UndefOr[java.lang.String] = js.native
    
    var `last-modified`: js.UndefOr[java.lang.String] = js.native
    
    var location: js.UndefOr[java.lang.String] = js.native
    
    var origin: js.UndefOr[java.lang.String] = js.native
    
    var pragma: js.UndefOr[java.lang.String] = js.native
    
    var `proxy-authenticate`: js.UndefOr[java.lang.String] = js.native
    
    var `proxy-authorization`: js.UndefOr[java.lang.String] = js.native
    
    var `public-key-pins`: js.UndefOr[java.lang.String] = js.native
    
    var range: js.UndefOr[java.lang.String] = js.native
    
    var referer: js.UndefOr[java.lang.String] = js.native
    
    var `retry-after`: js.UndefOr[java.lang.String] = js.native
    
    var `sec-websocket-accept`: js.UndefOr[java.lang.String] = js.native
    
    var `sec-websocket-extensions`: js.UndefOr[java.lang.String] = js.native
    
    var `sec-websocket-key`: js.UndefOr[java.lang.String] = js.native
    
    var `sec-websocket-protocol`: js.UndefOr[java.lang.String] = js.native
    
    var `sec-websocket-version`: js.UndefOr[java.lang.String] = js.native
    
    var `set-cookie`: js.UndefOr[js.Array[java.lang.String]] = js.native
    
    var `strict-transport-security`: js.UndefOr[java.lang.String] = js.native
    
    var tk: js.UndefOr[java.lang.String] = js.native
    
    var trailer: js.UndefOr[java.lang.String] = js.native
    
    var `transfer-encoding`: js.UndefOr[java.lang.String] = js.native
    
    var upgrade: js.UndefOr[java.lang.String] = js.native
    
    var `user-agent`: js.UndefOr[java.lang.String] = js.native
    
    var vary: js.UndefOr[java.lang.String] = js.native
    
    var via: js.UndefOr[java.lang.String] = js.native
    
    var warning: js.UndefOr[java.lang.String] = js.native
    
    var `www-authenticate`: js.UndefOr[java.lang.String] = js.native
  }
  object IncomingHttpHeaders {
    
    @scala.inline
    def apply(): IncomingHttpHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncomingHttpHeaders]
    }
    
    @scala.inline
    implicit class IncomingHttpHeadersMutableBuilder[Self <: IncomingHttpHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: java.lang.String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-language`(value: java.lang.String): Self = StObject.set(x, "accept-language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-languageUndefined`: Self = StObject.set(x, "accept-language", js.undefined)
      
      @scala.inline
      def `setAccept-patch`(value: java.lang.String): Self = StObject.set(x, "accept-patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-patchUndefined`: Self = StObject.set(x, "accept-patch", js.undefined)
      
      @scala.inline
      def `setAccept-ranges`(value: java.lang.String): Self = StObject.set(x, "accept-ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-rangesUndefined`: Self = StObject.set(x, "accept-ranges", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def `setAccess-control-allow-credentials`(value: java.lang.String): Self = StObject.set(x, "access-control-allow-credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-allow-credentialsUndefined`: Self = StObject.set(x, "access-control-allow-credentials", js.undefined)
      
      @scala.inline
      def `setAccess-control-allow-headers`(value: java.lang.String): Self = StObject.set(x, "access-control-allow-headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-allow-headersUndefined`: Self = StObject.set(x, "access-control-allow-headers", js.undefined)
      
      @scala.inline
      def `setAccess-control-allow-methods`(value: java.lang.String): Self = StObject.set(x, "access-control-allow-methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-allow-methodsUndefined`: Self = StObject.set(x, "access-control-allow-methods", js.undefined)
      
      @scala.inline
      def `setAccess-control-allow-origin`(value: java.lang.String): Self = StObject.set(x, "access-control-allow-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-allow-originUndefined`: Self = StObject.set(x, "access-control-allow-origin", js.undefined)
      
      @scala.inline
      def `setAccess-control-expose-headers`(value: java.lang.String): Self = StObject.set(x, "access-control-expose-headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-expose-headersUndefined`: Self = StObject.set(x, "access-control-expose-headers", js.undefined)
      
      @scala.inline
      def `setAccess-control-max-age`(value: java.lang.String): Self = StObject.set(x, "access-control-max-age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-max-ageUndefined`: Self = StObject.set(x, "access-control-max-age", js.undefined)
      
      @scala.inline
      def `setAccess-control-request-headers`(value: java.lang.String): Self = StObject.set(x, "access-control-request-headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-request-headersUndefined`: Self = StObject.set(x, "access-control-request-headers", js.undefined)
      
      @scala.inline
      def `setAccess-control-request-method`(value: java.lang.String): Self = StObject.set(x, "access-control-request-method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccess-control-request-methodUndefined`: Self = StObject.set(x, "access-control-request-method", js.undefined)
      
      @scala.inline
      def setAge(value: java.lang.String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
      
      @scala.inline
      def setAllow(value: java.lang.String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      @scala.inline
      def `setAlt-svc`(value: java.lang.String): Self = StObject.set(x, "alt-svc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAlt-svcUndefined`: Self = StObject.set(x, "alt-svc", js.undefined)
      
      @scala.inline
      def setAuthorization(value: java.lang.String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      @scala.inline
      def `setCache-control`(value: java.lang.String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
      
      @scala.inline
      def setConnection(value: java.lang.String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def `setContent-disposition`(value: java.lang.String): Self = StObject.set(x, "content-disposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-dispositionUndefined`: Self = StObject.set(x, "content-disposition", js.undefined)
      
      @scala.inline
      def `setContent-encoding`(value: java.lang.String): Self = StObject.set(x, "content-encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-encodingUndefined`: Self = StObject.set(x, "content-encoding", js.undefined)
      
      @scala.inline
      def `setContent-language`(value: java.lang.String): Self = StObject.set(x, "content-language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-languageUndefined`: Self = StObject.set(x, "content-language", js.undefined)
      
      @scala.inline
      def `setContent-length`(value: java.lang.String): Self = StObject.set(x, "content-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-lengthUndefined`: Self = StObject.set(x, "content-length", js.undefined)
      
      @scala.inline
      def `setContent-location`(value: java.lang.String): Self = StObject.set(x, "content-location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-locationUndefined`: Self = StObject.set(x, "content-location", js.undefined)
      
      @scala.inline
      def `setContent-range`(value: java.lang.String): Self = StObject.set(x, "content-range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-rangeUndefined`: Self = StObject.set(x, "content-range", js.undefined)
      
      @scala.inline
      def `setContent-type`(value: java.lang.String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
      
      @scala.inline
      def setCookie(value: java.lang.String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDate(value: java.lang.String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setExpect(value: java.lang.String): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectUndefined: Self = StObject.set(x, "expect", js.undefined)
      
      @scala.inline
      def setExpires(value: java.lang.String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setForwarded(value: java.lang.String): Self = StObject.set(x, "forwarded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardedUndefined: Self = StObject.set(x, "forwarded", js.undefined)
      
      @scala.inline
      def setFrom(value: java.lang.String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def `setIf-match`(value: java.lang.String): Self = StObject.set(x, "if-match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIf-matchUndefined`: Self = StObject.set(x, "if-match", js.undefined)
      
      @scala.inline
      def `setIf-modified-since`(value: java.lang.String): Self = StObject.set(x, "if-modified-since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIf-modified-sinceUndefined`: Self = StObject.set(x, "if-modified-since", js.undefined)
      
      @scala.inline
      def `setIf-none-match`(value: java.lang.String): Self = StObject.set(x, "if-none-match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIf-none-matchUndefined`: Self = StObject.set(x, "if-none-match", js.undefined)
      
      @scala.inline
      def `setIf-unmodified-since`(value: java.lang.String): Self = StObject.set(x, "if-unmodified-since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIf-unmodified-sinceUndefined`: Self = StObject.set(x, "if-unmodified-since", js.undefined)
      
      @scala.inline
      def `setLast-modified`(value: java.lang.String): Self = StObject.set(x, "last-modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLast-modifiedUndefined`: Self = StObject.set(x, "last-modified", js.undefined)
      
      @scala.inline
      def setLocation(value: java.lang.String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPragma(value: java.lang.String): Self = StObject.set(x, "pragma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPragmaUndefined: Self = StObject.set(x, "pragma", js.undefined)
      
      @scala.inline
      def `setProxy-authenticate`(value: java.lang.String): Self = StObject.set(x, "proxy-authenticate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setProxy-authenticateUndefined`: Self = StObject.set(x, "proxy-authenticate", js.undefined)
      
      @scala.inline
      def `setProxy-authorization`(value: java.lang.String): Self = StObject.set(x, "proxy-authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setProxy-authorizationUndefined`: Self = StObject.set(x, "proxy-authorization", js.undefined)
      
      @scala.inline
      def `setPublic-key-pins`(value: java.lang.String): Self = StObject.set(x, "public-key-pins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPublic-key-pinsUndefined`: Self = StObject.set(x, "public-key-pins", js.undefined)
      
      @scala.inline
      def setRange(value: java.lang.String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setReferer(value: java.lang.String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
      
      @scala.inline
      def `setRetry-after`(value: java.lang.String): Self = StObject.set(x, "retry-after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRetry-afterUndefined`: Self = StObject.set(x, "retry-after", js.undefined)
      
      @scala.inline
      def `setSec-websocket-accept`(value: java.lang.String): Self = StObject.set(x, "sec-websocket-accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSec-websocket-acceptUndefined`: Self = StObject.set(x, "sec-websocket-accept", js.undefined)
      
      @scala.inline
      def `setSec-websocket-extensions`(value: java.lang.String): Self = StObject.set(x, "sec-websocket-extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSec-websocket-extensionsUndefined`: Self = StObject.set(x, "sec-websocket-extensions", js.undefined)
      
      @scala.inline
      def `setSec-websocket-key`(value: java.lang.String): Self = StObject.set(x, "sec-websocket-key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSec-websocket-keyUndefined`: Self = StObject.set(x, "sec-websocket-key", js.undefined)
      
      @scala.inline
      def `setSec-websocket-protocol`(value: java.lang.String): Self = StObject.set(x, "sec-websocket-protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSec-websocket-protocolUndefined`: Self = StObject.set(x, "sec-websocket-protocol", js.undefined)
      
      @scala.inline
      def `setSec-websocket-version`(value: java.lang.String): Self = StObject.set(x, "sec-websocket-version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSec-websocket-versionUndefined`: Self = StObject.set(x, "sec-websocket-version", js.undefined)
      
      @scala.inline
      def `setSet-cookie`(value: js.Array[java.lang.String]): Self = StObject.set(x, "set-cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSet-cookieUndefined`: Self = StObject.set(x, "set-cookie", js.undefined)
      
      @scala.inline
      def `setSet-cookieVarargs`(value: java.lang.String*): Self = StObject.set(x, "set-cookie", js.Array(value :_*))
      
      @scala.inline
      def `setStrict-transport-security`(value: java.lang.String): Self = StObject.set(x, "strict-transport-security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrict-transport-securityUndefined`: Self = StObject.set(x, "strict-transport-security", js.undefined)
      
      @scala.inline
      def setTk(value: java.lang.String): Self = StObject.set(x, "tk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTkUndefined: Self = StObject.set(x, "tk", js.undefined)
      
      @scala.inline
      def setTrailer(value: java.lang.String): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailerUndefined: Self = StObject.set(x, "trailer", js.undefined)
      
      @scala.inline
      def `setTransfer-encoding`(value: java.lang.String): Self = StObject.set(x, "transfer-encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransfer-encodingUndefined`: Self = StObject.set(x, "transfer-encoding", js.undefined)
      
      @scala.inline
      def setUpgrade(value: java.lang.String): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      @scala.inline
      def `setUser-agent`(value: java.lang.String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
      
      @scala.inline
      def setVary(value: java.lang.String): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaryUndefined: Self = StObject.set(x, "vary", js.undefined)
      
      @scala.inline
      def setVia(value: java.lang.String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
      
      @scala.inline
      def setWarning(value: java.lang.String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      @scala.inline
      def `setWww-authenticate`(value: java.lang.String): Self = StObject.set(x, "www-authenticate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWww-authenticateUndefined`: Self = StObject.set(x, "www-authenticate", js.undefined)
    }
  }
  
  @js.native
  trait InformationEvent extends StObject {
    
    var headers: IncomingHttpHeaders = js.native
    
    var httpVersion: java.lang.String = js.native
    
    var httpVersionMajor: Double = js.native
    
    var httpVersionMinor: Double = js.native
    
    var rawHeaders: js.Array[java.lang.String] = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: java.lang.String = js.native
  }
  object InformationEvent {
    
    @scala.inline
    def apply(
      headers: IncomingHttpHeaders,
      httpVersion: java.lang.String,
      httpVersionMajor: Double,
      httpVersionMinor: Double,
      rawHeaders: js.Array[java.lang.String],
      statusCode: Double,
      statusMessage: java.lang.String
    ): InformationEvent = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], httpVersionMajor = httpVersionMajor.asInstanceOf[js.Any], httpVersionMinor = httpVersionMinor.asInstanceOf[js.Any], rawHeaders = rawHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[InformationEvent]
    }
    
    @scala.inline
    implicit class InformationEventMutableBuilder[Self <: InformationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersion(value: java.lang.String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionMajor(value: Double): Self = StObject.set(x, "httpVersionMajor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionMinor(value: Double): Self = StObject.set(x, "httpVersionMinor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawHeaders(value: js.Array[java.lang.String]): Self = StObject.set(x, "rawHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawHeadersVarargs(value: java.lang.String*): Self = StObject.set(x, "rawHeaders", js.Array(value :_*))
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: java.lang.String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
  
  // outgoing headers allows numbers (as they are converted internally to strings)
  type OutgoingHttpHeader = Double | java.lang.String | js.Array[java.lang.String]
  
  type OutgoingHttpHeaders = Dict[OutgoingHttpHeader]
  
  type RequestListener = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  
  // although RequestOptions are passed as ClientRequestArgs to ClientRequest directly,
  // create interface RequestOptions would make the naming more clear to developers
  type RequestOptions = ClientRequestArgs
  
  @js.native
  trait ServerOptions extends StObject {
    
    var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]] = js.native
    
    var ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, typings.node.httpMod.ServerResponse]] = js.native
    
    /**
      * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
      * Using the insecure parser should be avoided.
      * See --insecure-http-parser for more information.
      * @default false
      */
    var insecureHTTPParser: js.UndefOr[Boolean] = js.native
    
    /**
      * Optionally overrides the value of
      * [`--max-http-header-size`][] for requests received by this server, i.e.
      * the maximum length of request headers in bytes.
      * @default 8192
      */
    var maxHeaderSize: js.UndefOr[Double] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingMessageUndefined: Self = StObject.set(x, "IncomingMessage", js.undefined)
      
      @scala.inline
      def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setServerResponse(value: Instantiable1[/* req */ IncomingMessage, ServerResponse]): Self = StObject.set(x, "ServerResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerResponseUndefined: Self = StObject.set(x, "ServerResponse", js.undefined)
    }
  }
}
