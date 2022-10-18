package typings.next

import org.scalablytyped.runtime.Instantiable1
import typings.next.anon.FnCallErrReqResPathnameQuery
import typings.next.anon.FnCallErrReqResPathnameQuerySetHeaders
import typings.next.anon.FnCallReqResParsedUrlSetHeaders
import typings.next.anon.FnCallReqResPathnameQuery
import typings.next.anon.FnCallReqResPathnameQueryParsedUrlInternal
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerConfigSharedMod.NextConfig
import typings.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerNextMod {
  
  @JSImport("next/dist/server/next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: NextServerOptions): NextServer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[NextServer]
  
  @JSImport("next/dist/server/next", "NextServer")
  @js.native
  open class NextServer protected () extends StObject {
    def this(options: NextServerOptions) = this()
    
    def close(): js.Promise[Any] = js.native
    
    /* private */ var createServer: Any = js.native
    
    def getRequestHandler(): RequestHandler = js.native
    
    /* private */ var getServer: Any = js.native
    
    /* private */ var getServerRequestHandler: Any = js.native
    
    def getUpgradeHandler(): js.Function3[/* req */ IncomingMessage, /* socket */ Any, /* head */ Any, js.Promise[Unit]] = js.native
    
    def hostname: js.UndefOr[String] = js.native
    
    /* private */ var loadConfig: Any = js.native
    
    def logError(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['logError']> is not an array type */ args: Parameters[js.Function1[/* err */ js.Error, Unit]]
    ): Unit = js.native
    
    var options: NextServerOptions = js.native
    
    def port: js.UndefOr[Double] = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    /* private */ var preparedAssetPrefix: Any = js.native
    
    def render(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['render']> is not an array type */ args: Parameters[FnCallReqResPathnameQueryParsedUrlInternal]
    ): js.Promise[Unit] = js.native
    
    def render404(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['render404']> is not an array type */ args: Parameters[FnCallReqResParsedUrlSetHeaders]
    ): js.Promise[Unit] = js.native
    
    def renderError(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['renderError']> is not an array type */ args: Parameters[FnCallErrReqResPathnameQuerySetHeaders]
    ): js.Promise[Unit] = js.native
    
    def renderErrorToHTML(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['renderErrorToHTML']> is not an array type */ args: Parameters[FnCallErrReqResPathnameQuery]
    ): js.Promise[String | Null] = js.native
    
    def renderToHTML(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['renderToHTML']> is not an array type */ args: Parameters[FnCallReqResPathnameQuery]
    ): js.Promise[String | Null] = js.native
    
    /* private */ var reqHandlerPromise: Any = js.native
    
    def serveStatic(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Server['serveStatic']> is not an array type */ args: Parameters[
          js.Function4[
            /* req */ BaseNextRequest[Any] | IncomingMessage, 
            /* res */ BaseNextResponse[Any] | ServerResponse[IncomingMessage], 
            /* path */ String, 
            /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
            js.Promise[Unit]
          ]
        ]
    ): js.Promise[Unit] = js.native
    
    /* private */ var server: Any = js.native
    
    /* private */ var serverPromise: Any = js.native
    
    def setAssetPrefix(assetPrefix: String): Unit = js.native
  }
  
  /* Inlined std.Partial<next.next/dist/server/dev/next-dev-server.Options> */
  trait NextServerOptions extends StObject {
    
    var conf: js.UndefOr[NextConfig] = js.undefined
    
    var customServer: js.UndefOr[Boolean] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var httpServer: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var isNextDevCommand: js.UndefOr[Boolean] = js.undefined
    
    var minimalMode: js.UndefOr[Boolean] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object NextServerOptions {
    
    inline def apply(): NextServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextServerOptions]
    }
    
    extension [Self <: NextServerOptions](x: Self) {
      
      inline def setConf(value: NextConfig): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      inline def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
      
      inline def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
      
      inline def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHttpServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "httpServer", value.asInstanceOf[js.Any])
      
      inline def setHttpServerUndefined: Self = StObject.set(x, "httpServer", js.undefined)
      
      inline def setIsNextDevCommand(value: Boolean): Self = StObject.set(x, "isNextDevCommand", value.asInstanceOf[js.Any])
      
      inline def setIsNextDevCommandUndefined: Self = StObject.set(x, "isNextDevCommand", js.undefined)
      
      inline def setMinimalMode(value: Boolean): Self = StObject.set(x, "minimalMode", value.asInstanceOf[js.Any])
      
      inline def setMinimalModeUndefined: Self = StObject.set(x, "minimalMode", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
  
  type RequestHandler = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* parsedUrl */ js.UndefOr[NextUrlWithParsedQuery], 
    js.Promise[Unit]
  ]
}
