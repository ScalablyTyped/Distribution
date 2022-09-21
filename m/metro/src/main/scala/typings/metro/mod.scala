package typings.metro

import org.scalablytyped.runtime.Instantiable1
import typings.metro.anon.Errorcodestringundefined
import typings.metro.serverMod.DefaultBundleOptions
import typings.metro.serverMod.DefaultGraphOptions
import typings.metroConfig.configTypesMod.ConfigT
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.ServerOptions
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @since v0.1.17
    */
  @JSImport("metro", "HttpServer")
  @js.native
  open class HttpServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[IncomingMessage]
  ] */] ()
    extends typings.node.httpMod.Server[Request, Response] {
    def this(options: ServerOptions[Request, Response]) = this()
    def this(requestListener: RequestListener[Request, Response]) = this()
    def this(options: ServerOptions[Request, Response], requestListener: RequestListener[Request, Response]) = this()
  }
  
  /**
    * See `http.Server` for more information.
    * @since v0.3.4
    */
  @JSImport("metro", "HttpsServer")
  @js.native
  open class HttpsServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
  ] */] ()
    extends typings.node.httpsMod.Server[Request, Response] {
    def this(options: typings.node.httpsMod.ServerOptions[Request, Response]) = this()
    def this(requestListener: RequestListener[Request, Response]) = this()
    def this(
      options: typings.node.httpsMod.ServerOptions[Request, Response],
      requestListener: RequestListener[Request, Response]
    ) = this()
  }
  
  @JSImport("metro", "Server")
  @js.native
  open class Server protected ()
    extends typings.metro.metroMod.Server {
    def this(config: ConfigT) = this()
    def this(config: ConfigT, options: typings.metro.serverMod.ServerOptions) = this()
  }
  /* static members */
  object Server {
    
    @JSImport("metro", "Server")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("metro", "Server.DEFAULT_BUNDLE_OPTIONS")
    @js.native
    def DEFAULT_BUNDLE_OPTIONS: DefaultBundleOptions = js.native
    inline def DEFAULT_BUNDLE_OPTIONS_=(x: DefaultBundleOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BUNDLE_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("metro", "Server.DEFAULT_GRAPH_OPTIONS")
    @js.native
    def DEFAULT_GRAPH_OPTIONS: DefaultGraphOptions = js.native
    inline def DEFAULT_GRAPH_OPTIONS_=(x: DefaultGraphOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GRAPH_OPTIONS")(x.asInstanceOf[js.Any])
  }
  
  inline def runServer(config: ConfigT, options: RunServerOptions): js.Promise[
    (typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runServer")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ]]
  
  trait RunServerOptions extends StObject {
    
    var hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Errorcodestringundefined, Unit]] = js.undefined
    
    var onReady: js.UndefOr[
        js.Function1[
          /* server */ (typings.node.httpMod.Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) | (typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
            ]
          ]), 
          Unit
        ]
      ] = js.undefined
    
    var runInspectorProxy: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated since version 0.61 */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated since version 0.61 */
    var secureCert: js.UndefOr[String] = js.undefined
    
    /** @deprecated since version 0.61 */
    var secureKey: js.UndefOr[String] = js.undefined
    
    var secureServerOptions: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object RunServerOptions {
    
    inline def apply(): RunServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunServerOptions]
    }
    
    extension [Self <: RunServerOptions](x: Self) {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOnError(value: /* error */ Errorcodestringundefined => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReady(
        value: /* server */ (typings.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typings.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
              ]
            ]) => Unit
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
      
      inline def setRunInspectorProxyUndefined: Self = StObject.set(x, "runInspectorProxy", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureCert(value: String): Self = StObject.set(x, "secureCert", value.asInstanceOf[js.Any])
      
      inline def setSecureCertUndefined: Self = StObject.set(x, "secureCert", js.undefined)
      
      inline def setSecureKey(value: String): Self = StObject.set(x, "secureKey", value.asInstanceOf[js.Any])
      
      inline def setSecureKeyUndefined: Self = StObject.set(x, "secureKey", js.undefined)
      
      inline def setSecureServerOptions(value: Record[String, Any]): Self = StObject.set(x, "secureServerOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureServerOptionsUndefined: Self = StObject.set(x, "secureServerOptions", js.undefined)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
}
