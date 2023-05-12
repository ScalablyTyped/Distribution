package typings.metro

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.metro.anon.Build
import typings.metro.anon.Errorcodestringundefined
import typings.metro.metroStrings.module
import typings.metro.metroStrings.script
import typings.metro.srcDeltaBundlerTypesMod.GraphInputOptions
import typings.metro.srcDeltaBundlerTypesMod.ReadOnlyGraph
import typings.metro.srcServerMod.default
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.Server
import typings.node.httpMod.ServerOptions
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.streamMod.Duplex
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("metro/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("metro/src", "Graph")
  @js.native
  open class Graph[T] protected ()
    extends typings.metro.srcDeltaBundlerTypesMod.Graph[T] {
    def this(options: GraphInputOptions) = this()
  }
  
  /**
    * @since v0.1.17
    */
  @JSImport("metro/src", "HttpServer")
  @js.native
  open class HttpServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[IncomingMessage]
  ] */] () extends Server[Request, Response] {
    def this(options: ServerOptions[Request, Response]) = this()
    def this(requestListener: RequestListener[Request, Response]) = this()
    def this(options: ServerOptions[Request, Response], requestListener: RequestListener[Request, Response]) = this()
  }
  
  /**
    * See `http.Server` for more information.
    * @since v0.3.4
    */
  @JSImport("metro/src", "HttpsServer")
  @js.native
  open class HttpsServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
  ] */] ()
    extends typings.node.httpsMod.Server[Request, Response] {
    def this(options: typings.node.httpsMod.ServerOptions[Request, Response]) = this()
    def this(requestListener: RequestListener[Request, Response]) = this()
    def this(
      options: typings.node.httpsMod.ServerOptions[Request, Response],
      requestListener: RequestListener[Request, Response]
    ) = this()
  }
  
  inline def attachMetroCli(yargs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Yargs */ Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachMetroCli")(yargs.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def attachMetroCli(
    yargs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Yargs */ Any,
    options: AttachMetroCLIOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachMetroCli")(yargs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def buildGraph(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
    options: BuildGraphOptions
  ): js.Promise[ReadOnlyGraph[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGraph")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadOnlyGraph[Unit]]]
  
  inline def createConnectMiddleWare(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any
  ): js.Promise[MetroMiddleWare] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnectMiddleWare")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MetroMiddleWare]]
  inline def createConnectMiddleWare(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
    options: RunMetroOptions
  ): js.Promise[MetroMiddleWare] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectMiddleWare")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MetroMiddleWare]]
  
  inline def runBuild(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
    options: RunBuildOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runBuild")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def runMetro(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputConfigT */ Any
  ): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("runMetro")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  inline def runMetro(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputConfigT */ Any,
    options: RunMetroOptions
  ): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("runMetro")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
  
  inline def runServer(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
    options: RunServerOptions
  ): js.Promise[
    (Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runServer")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ]]
  
  trait AttachMetroCLIOptions extends StObject {
    
    var build: js.UndefOr[BuildCommandOptions] = js.undefined
    
    var dependencies: js.UndefOr[Any] = js.undefined
    
    var serve: js.UndefOr[ServeCommandOptions] = js.undefined
  }
  object AttachMetroCLIOptions {
    
    inline def apply(): AttachMetroCLIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachMetroCLIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttachMetroCLIOptions] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: BuildCommandOptions): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildNull: Self = StObject.set(x, "build", null)
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setServe(value: ServeCommandOptions): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      inline def setServeNull: Self = StObject.set(x, "serve", null)
      
      inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
    }
  }
  
  type BuildCommandOptions = (Record[String, Any]) | Null
  
  trait BuildGraphOptions extends StObject {
    
    var customTransformOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any
      ] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var entries: js.Array[String]
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var onProgress: js.UndefOr[
        js.Function2[/* transformedFileCount */ Double, /* totalFileCount */ Double, Unit]
      ] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[module | script] = js.undefined
  }
  object BuildGraphOptions {
    
    inline def apply(entries: js.Array[String]): BuildGraphOptions = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildGraphOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildGraphOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomTransformOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any
      ): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformOptionsUndefined: Self = StObject.set(x, "customTransformOptions", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setOnProgress(value: (/* transformedFileCount */ Double, /* totalFileCount */ Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(value: module | script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MetroMiddleWare extends StObject {
    
    def attachHmrServer(
      httpServer: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Unit = js.native
    def attachHmrServer(
      httpServer: typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ]
    ): Unit = js.native
    
    def end(): Unit = js.native
    
    var metroServer: default = js.native
    
    var middleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Middleware */ Any = js.native
  }
  
  trait RunBuildOptions extends StObject {
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var entry: String
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var onBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onProgress: js.UndefOr[
        js.Function2[/* transformedFileCount */ Double, /* totalFileCount */ Double, Unit]
      ] = js.undefined
    
    var out: js.UndefOr[String] = js.undefined
    
    var output: js.UndefOr[Build] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var sourceMapUrl: js.UndefOr[String] = js.undefined
  }
  object RunBuildOptions {
    
    inline def apply(entry: String): RunBuildOptions = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunBuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunBuildOptions] (val x: Self) extends AnyVal {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setOnBegin(value: () => Unit): Self = StObject.set(x, "onBegin", js.Any.fromFunction0(value))
      
      inline def setOnBeginUndefined: Self = StObject.set(x, "onBegin", js.undefined)
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnProgress(value: (/* transformedFileCount */ Double, /* totalFileCount */ Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOutput(value: Build): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
    }
  }
  
  trait RunMetroOptions
    extends StObject
       with typings.metro.srcServerMod.ServerOptions {
    
    var waitForBundler: js.UndefOr[Boolean] = js.undefined
  }
  object RunMetroOptions {
    
    inline def apply(): RunMetroOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunMetroOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunMetroOptions] (val x: Self) extends AnyVal {
      
      inline def setWaitForBundler(value: Boolean): Self = StObject.set(x, "waitForBundler", value.asInstanceOf[js.Any])
      
      inline def setWaitForBundlerUndefined: Self = StObject.set(x, "waitForBundler", js.undefined)
    }
  }
  
  trait RunServerOptions extends StObject {
    
    var hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Errorcodestringundefined, Unit]] = js.undefined
    
    var onReady: js.UndefOr[
        js.Function1[
          /* server */ (Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) | (typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
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
    
    var waitForBundler: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var websocketEndpoints: js.UndefOr[StringDictionary[WebsocketServer]] = js.undefined
  }
  object RunServerOptions {
    
    inline def apply(): RunServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunServerOptions] (val x: Self) extends AnyVal {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOnError(value: /* error */ Errorcodestringundefined => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReady(
        value: /* server */ (Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typings.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
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
      
      inline def setWaitForBundler(value: Boolean): Self = StObject.set(x, "waitForBundler", value.asInstanceOf[js.Any])
      
      inline def setWaitForBundlerUndefined: Self = StObject.set(x, "waitForBundler", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWebsocketEndpoints(value: StringDictionary[WebsocketServer]): Self = StObject.set(x, "websocketEndpoints", value.asInstanceOf[js.Any])
      
      inline def setWebsocketEndpointsUndefined: Self = StObject.set(x, "websocketEndpoints", js.undefined)
    }
  }
  
  type ServeCommandOptions = (Record[String, Any]) | Null
  
  @js.native
  trait WebsocketServer extends EventEmitter {
    
    def handleUpgrade[T](
      request: IncomingMessage,
      socket: Duplex,
      upgradeHead: Buffer,
      callback: js.Function2[/* client */ T, /* request */ IncomingMessage, Unit]
    ): Unit = js.native
  }
}
