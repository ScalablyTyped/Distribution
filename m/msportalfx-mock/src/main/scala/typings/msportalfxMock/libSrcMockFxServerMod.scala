package typings.msportalfxMock

import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.Application_
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Request
import typings.msportalfxMock.libSrcMockFxSystemMod.SSLCertificate
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-original-host`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-run-id`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-source`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-target`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-test-id`
import typings.node.bufferMod.global.Buffer
import typings.node.httpsMod.Server
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.tlsMod.TlsOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxServerMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHTTPSServer(app: Application_, serverOptions: ServerOptions, port: Double): js.Promise[
    Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHTTPSServer")(app.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ]]
  
  inline def createProxy(
    host: String,
    serverOptions: ServerOptions,
    responseCb: js.Function2[
      /* request */ typings.node.httpMod.IncomingMessage, 
      /* mockRequest */ Request, 
      js.Promise[Unit]
    ]
  ): MockProxy = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(host.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], responseCb.asInstanceOf[js.Any])).asInstanceOf[MockProxy]
  inline def createProxy(
    host: String,
    serverOptions: ServerOptions,
    responseCb: js.Function2[
      /* request */ typings.node.httpMod.IncomingMessage, 
      /* mockRequest */ Request, 
      js.Promise[Unit]
    ],
    getMetadata: js.Function2[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* res */ typings.node.httpMod.IncomingMessage, 
      js.Promise[Record[String, Any]]
    ]
  ): MockProxy = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(host.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], responseCb.asInstanceOf[js.Any], getMetadata.asInstanceOf[js.Any])).asInstanceOf[MockProxy]
  inline def createProxy(
    host: String,
    serverOptions: ServerOptions,
    responseCb: js.Function2[
      /* request */ typings.node.httpMod.IncomingMessage, 
      /* mockRequest */ Request, 
      js.Promise[Unit]
    ],
    getMetadata: js.Function2[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* res */ typings.node.httpMod.IncomingMessage, 
      js.Promise[Record[String, Any]]
    ],
    parseResponse: js.Function2[
      /* res */ typings.node.httpMod.IncomingMessage, 
      /* resBody */ Buffer, 
      js.Promise[Any]
    ]
  ): MockProxy = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(host.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], responseCb.asInstanceOf[js.Any], getMetadata.asInstanceOf[js.Any], parseResponse.asInstanceOf[js.Any])).asInstanceOf[MockProxy]
  inline def createProxy(
    host: String,
    serverOptions: ServerOptions,
    responseCb: js.Function2[
      /* request */ typings.node.httpMod.IncomingMessage, 
      /* mockRequest */ Request, 
      js.Promise[Unit]
    ],
    getMetadata: Unit,
    parseResponse: js.Function2[
      /* res */ typings.node.httpMod.IncomingMessage, 
      /* resBody */ Buffer, 
      js.Promise[Any]
    ]
  ): MockProxy = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(host.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], responseCb.asInstanceOf[js.Any], getMetadata.asInstanceOf[js.Any], parseResponse.asInstanceOf[js.Any])).asInstanceOf[MockProxy]
  
  inline def getServerOptions(certificate: SSLCertificate): ServerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerOptions")(certificate.asInstanceOf[js.Any]).asInstanceOf[ServerOptions]
  
  inline def parseRawHeaders(rawHeaders: js.Array[String]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRawHeaders")(rawHeaders.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def request(url: String): js.Promise[LoopbackResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: String): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: String, headers: Unit, data: Buffer): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: String, headers: Record[String, String]): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: String, headers: Record[String, String], data: Buffer): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: Unit, headers: Unit, data: Buffer): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: Unit, headers: Record[String, String]): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  inline def request(url: String, method: Unit, headers: Record[String, String], data: Buffer): js.Promise[LoopbackResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoopbackResponse]]
  
  inline def stopServer(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopServer")(server.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait LoopbackResponse extends StObject {
    
    var body: js.UndefOr[Buffer] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var statusCode: Double
  }
  object LoopbackResponse {
    
    inline def apply(statusCode: Double): LoopbackResponse = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoopbackResponse]
    }
    
    extension [Self <: LoopbackResponse](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-source`
    - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-original-host`
    - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-run-id`
    - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-target`
    - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-test-id`
  */
  trait MockHeaders extends StObject
  object MockHeaders {
    
    inline def ORIGINAL_HOST: `x-mockfx-original-host` = "x-mockfx-original-host".asInstanceOf[`x-mockfx-original-host`]
    
    inline def RUN_ID: `x-mockfx-run-id` = "x-mockfx-run-id".asInstanceOf[`x-mockfx-run-id`]
    
    inline def SOURCE: `x-mockfx-source` = "x-mockfx-source".asInstanceOf[`x-mockfx-source`]
    
    inline def TARGET: `x-mockfx-target` = "x-mockfx-target".asInstanceOf[`x-mockfx-target`]
    
    inline def TEST_ID: `x-mockfx-test-id` = "x-mockfx-test-id".asInstanceOf[`x-mockfx-test-id`]
  }
  
  @js.native
  trait MockProxy extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    def send(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.httpMod.ServerOptions because var conflicts: keepAlive, keepAliveInitialDelay, noDelay. Inlined IncomingMessage, ServerResponse, maxHeaderSize, insecureHTTPParser */ trait ServerOptions
    extends StObject
       with TlsOptions {
    
    var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]] = js.undefined
    
    var ServerResponse: js.UndefOr[
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
        ]
      ] = js.undefined
    
    /**
      * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
      * Using the insecure parser should be avoided.
      * See --insecure-http-parser for more information.
      * @default false
      */
    var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optionally overrides the value of
      * `--max-http-header-size` for requests received by this server, i.e.
      * the maximum length of request headers in bytes.
      * @default 8192
      */
    var maxHeaderSize: js.UndefOr[Double] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setIncomingMessage(value: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
      
      inline def setIncomingMessageUndefined: Self = StObject.set(x, "IncomingMessage", js.undefined)
      
      inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
      
      inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setServerResponse(
        value: Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
            ]
      ): Self = StObject.set(x, "ServerResponse", value.asInstanceOf[js.Any])
      
      inline def setServerResponseUndefined: Self = StObject.set(x, "ServerResponse", js.undefined)
    }
  }
}
