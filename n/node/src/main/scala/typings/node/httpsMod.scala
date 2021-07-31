package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.HttpBase
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.node.tlsMod.CommonConnectionOptions
import typings.node.tlsMod.PSKCallbackNegotation
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.TlsOptions
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpsMod {
  
  @JSImport("https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("https", "Agent")
  @js.native
  class Agent ()
    extends typings.node.httpMod.Agent {
    def this(options: AgentOptions) = this()
    
    var options: AgentOptions = js.native
  }
  
  @JSImport("https", "Server")
  @js.native
  class Server ()
    extends typings.node.tlsMod.Server
       with HttpBase {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  @scala.inline
  def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  @scala.inline
  def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: ServerOptions, requestListener: RequestListener): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], requestListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(requestListener: RequestListener): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  @scala.inline
  def get(options: java.lang.String): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: URL_): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(url: java.lang.String, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(url: URL_, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  @JSImport("https", "globalAgent")
  @js.native
  def globalAgent: Agent = js.native
  @scala.inline
  def globalAgent_=(x: Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def request(options: java.lang.String): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: URL_): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: java.lang.String, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: URL_, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.tlsMod.ConnectionOptions because var conflicts: timeout. Inlined host, port, path, socket, checkServerIdentity, servername, session, minDHSize, lookup, pskCallback */ trait AgentOptions
    extends StObject
       with typings.node.httpMod.AgentOptions
       with SecureContextOptions
       with CommonConnectionOptions {
    
    // Establish secure connection on a given socket rather than creating a new socket
    var checkServerIdentity: js.UndefOr[
        js.Function2[/* host */ java.lang.String, /* cert */ PeerCertificate, js.UndefOr[Error]]
      ] = js.undefined
    
    var host: js.UndefOr[java.lang.String] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    var maxCachedSessions: js.UndefOr[Double] = js.undefined
    
    var minDHSize: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * When negotiating TLS-PSK (pre-shared keys), this function is called
      * with optional identity `hint` provided by the server or `null`
      * in case of TLS 1.3 where `hint` was removed.
      * It will be necessary to provide a custom `tls.checkServerIdentity()`
      * for the connection as the default one will try to check hostname/IP
      * of the server against the certificate but that's not applicable for PSK
      * because there won't be a certificate present.
      * More information can be found in the RFC 4279.
      *
      * @param hint message sent from the server to help client
      * decide which identity to use during negotiation.
      * Always `null` if TLS 1.3 is used.
      * @returns Return `null` to stop the negotiation process. `psk` must be
      * compatible with the selected cipher's digest.
      * `identity` must use UTF-8 encoding.
      */
    var pskCallback: js.UndefOr[js.Function1[/* hint */ java.lang.String | Null, PSKCallbackNegotation | Null]] = js.undefined
    
    var servername: js.UndefOr[java.lang.String] = js.undefined
    
    // SNI TLS Extension
    var session: js.UndefOr[Buffer] = js.undefined
    
    // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
    var socket: js.UndefOr[Socket] = js.undefined
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
      def setCheckServerIdentity(value: (/* host */ java.lang.String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
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
      def setMaxCachedSessions(value: Double): Self = StObject.set(x, "maxCachedSessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCachedSessionsUndefined: Self = StObject.set(x, "maxCachedSessions", js.undefined)
      
      @scala.inline
      def setMinDHSize(value: Double): Self = StObject.set(x, "minDHSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDHSizeUndefined: Self = StObject.set(x, "minDHSize", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPskCallback(value: /* hint */ java.lang.String | Null => PSKCallbackNegotation | Null): Self = StObject.set(x, "pskCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPskCallbackUndefined: Self = StObject.set(x, "pskCallback", js.undefined)
      
      @scala.inline
      def setServername(value: java.lang.String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait RequestOptions
    extends StObject
       with ClientRequestArgs
       with SecureContextOptions {
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    // Defaults to true
    var servername: js.UndefOr[java.lang.String] = js.undefined
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setServername(value: java.lang.String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  trait ServerOptions
    extends StObject
       with TlsOptions
       with typings.node.httpMod.ServerOptions
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
  }
}
