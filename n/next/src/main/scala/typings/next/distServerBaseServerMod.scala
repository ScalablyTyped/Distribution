package typings.next

import org.scalablytyped.runtime.Instantiable1
import typings.next.anon.AmpOptimizerConfig
import typings.next.anon.CatchAllMiddleware
import typings.next.anon.DevBoolean
import typings.next.anon.FallbackMode
import typings.next.anon.ForceReload
import typings.next.anon.GenerateEtags
import typings.next.anon.IsAppPath
import typings.next.anon.OriginalAppPath
import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distBuildMod.PrerenderManifest
import typings.next.distBuildWebpackPluginsFontLoaderManifestPluginMod.FontLoaderManifest
import typings.next.distBuildWebpackPluginsPagesManifestPluginMod.PagesManifest
import typings.next.distLibLoadCustomRoutesMod.CustomRoutes
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerConfigSharedMod.NextConfig
import typings.next.distServerConfigSharedMod.NextConfigComplete
import typings.next.distServerFontUtilsMod.FontManifest
import typings.next.distServerLoadComponentsMod.LoadComponentsReturnType
import typings.next.distServerRenderMod.RenderOpts
import typings.next.distServerRenderMod.RenderOptsPartial
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typings.next.distServerResponseCacheTypesMod.ResponseCacheBase
import typings.next.distServerRouterMod.DynamicRoutes
import typings.next.distSharedLibRouterUtilsMiddlewareRouteMatcherMod.MiddlewareRouteMatch
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.RouteMatch
import typings.next.nextBooleans.`false`
import typings.next.nextStrings.html
import typings.next.nextStrings.json
import typings.next.nextStrings.rsc
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Error
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBaseServerMod {
  
  /* note: abstract class */ @JSImport("next/dist/server/base-server", JSImport.Default)
  @js.native
  open class default[ServerOptions /* <: Options */] protected ()
    extends StObject
       with Server[ServerOptions] {
    def this(options: ServerOptions) = this()
  }
  
  @JSImport("next/dist/server/base-server", "NoFallbackError")
  @js.native
  open class NoFallbackError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/server/base-server", "WrappedBuildError")
  @js.native
  open class WrappedBuildError protected ()
    extends StObject
       with Error {
    def this(innerError: js.Error) = this()
    
    var innerError: js.Error = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type BaseRequestHandler = js.Function3[
    /* req */ BaseNextRequest[Any], 
    /* res */ BaseNextResponse[Any], 
    /* parsedUrl */ js.UndefOr[NextUrlWithParsedQuery], 
    js.Promise[Unit]
  ]
  
  trait FindComponentsResult extends StObject {
    
    var components: LoadComponentsReturnType
    
    var query: NextParsedUrlQuery
  }
  object FindComponentsResult {
    
    inline def apply(components: LoadComponentsReturnType, query: NextParsedUrlQuery): FindComponentsResult = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindComponentsResult]
    }
    
    extension [Self <: FindComponentsResult](x: Self) {
      
      inline def setComponents(value: LoadComponentsReturnType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiddlewareRoutingItem extends StObject {
    
    var `match`: MiddlewareRouteMatch
    
    var matchers: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
    
    var page: String
  }
  object MiddlewareRoutingItem {
    
    inline def apply(
      `match`: (/* pathname */ js.UndefOr[String | Null], /* request */ BaseNextRequest[Any], /* query */ Params) => Boolean,
      page: String
    ): MiddlewareRoutingItem = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
      __obj.asInstanceOf[MiddlewareRoutingItem]
    }
    
    extension [Self <: MiddlewareRoutingItem](x: Self) {
      
      inline def setMatch(
        value: (/* pathname */ js.UndefOr[String | Null], /* request */ BaseNextRequest[Any], /* query */ Params) => Boolean
      ): Self = StObject.set(x, "match", js.Any.fromFunction3(value))
      
      inline def setMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
      
      inline def setMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Object containing the configuration next.config.js
      */
    var conf: NextConfig
    
    /**
      * Set to false when the server was created by Next.js
      */
    var customServer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tells if Next.js is running in dev mode
      */
    var dev: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Where the Next project is located
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * The hostname the server is running behind
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * The HTTP Server that Next.js is running behind
      */
    var httpServer: js.UndefOr[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    /**
      * Tells if Next.js is running in a Serverless platform
      */
    var minimalMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The port the server is running behind
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Hide error messages containing server information
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(conf: NextConfig): Options = {
      val __obj = js.Dynamic.literal(conf = conf.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConf(value: NextConfig): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      inline def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
      
      inline def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHttpServer(
        value: typings.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "httpServer", value.asInstanceOf[js.Any])
      
      inline def setHttpServerUndefined: Self = StObject.set(x, "httpServer", js.undefined)
      
      inline def setMinimalMode(value: Boolean): Self = StObject.set(x, "minimalMode", value.asInstanceOf[js.Any])
      
      inline def setMinimalModeUndefined: Self = StObject.set(x, "minimalMode", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
  
  trait RequestContext extends StObject {
    
    var pathname: String
    
    var query: NextParsedUrlQuery
    
    var renderOpts: RenderOptsPartial
    
    var req: BaseNextRequest[Any]
    
    var res: BaseNextResponse[Any]
  }
  object RequestContext {
    
    inline def apply(
      pathname: String,
      query: NextParsedUrlQuery,
      renderOpts: RenderOptsPartial,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any]
    ): RequestContext = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], renderOpts = renderOpts.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestContext]
    }
    
    extension [Self <: RequestContext](x: Self) {
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRenderOpts(value: RenderOptsPartial): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
      
      inline def setReq(value: BaseNextRequest[Any]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: BaseNextResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponsePayload extends StObject {
    
    var body: typings.next.distServerRenderResultMod.default
    
    var revalidateOptions: js.UndefOr[Any] = js.undefined
    
    var `type`: html | json | rsc
  }
  object ResponsePayload {
    
    inline def apply(body: typings.next.distServerRenderResultMod.default, `type`: html | json | rsc): ResponsePayload = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsePayload]
    }
    
    extension [Self <: ResponsePayload](x: Self) {
      
      inline def setBody(value: typings.next.distServerRenderResultMod.default): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setRevalidateOptions(value: Any): Self = StObject.set(x, "revalidateOptions", value.asInstanceOf[js.Any])
      
      inline def setRevalidateOptionsUndefined: Self = StObject.set(x, "revalidateOptions", js.undefined)
      
      inline def setType(value: html | json | rsc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutingItem extends StObject {
    
    var `match`: RouteMatch
    
    var page: String
    
    var re: js.UndefOr[js.RegExp] = js.undefined
  }
  object RoutingItem {
    
    inline def apply(`match`: /* pathname */ js.UndefOr[String | Null] => `false` | Params, page: String): RoutingItem = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[RoutingItem]
    }
    
    extension [Self <: RoutingItem](x: Self) {
      
      inline def setMatch(value: /* pathname */ js.UndefOr[String | Null] => `false` | Params): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRe(value: js.RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
      
      inline def setReUndefined: Self = StObject.set(x, "re", js.undefined)
    }
  }
  
  @js.native
  trait Server[ServerOptions /* <: Options */] extends StObject {
    
    /* protected */ def _beforeCatchAllRender(
      _req: BaseNextRequest[Any],
      _res: BaseNextResponse[Any],
      _params: Params,
      _parsedUrl: UrlWithParsedQuery
    ): js.Promise[Boolean] = js.native
    
    /* protected */ var appPathRoutes: js.UndefOr[Record[String, js.Array[String]]] = js.native
    
    /* protected */ var appPathsManifest: js.UndefOr[PagesManifest] = js.native
    
    /* protected */ def attachRequestMeta(req: BaseNextRequest[Any], parsedUrl: NextUrlWithParsedQuery): Unit = js.native
    
    /* protected */ var buildId: String = js.native
    
    /* protected */ def close(): js.Promise[Unit] = js.native
    
    /* private */ var customErrorNo404Warn: Any = js.native
    
    /* protected */ var customRoutes: CustomRoutes = js.native
    
    /* protected */ var dir: String = js.native
    
    /* protected */ var distDir: String = js.native
    
    /* protected */ var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.native
    
    /* protected */ def findPageComponents(params: IsAppPath): js.Promise[FindComponentsResult | Null] = js.native
    
    /* protected */ var fontLoaderManifest: js.UndefOr[FontLoaderManifest] = js.native
    
    /* protected */ def generateRoutes(): CatchAllMiddleware = js.native
    
    /* protected */ def getAppPathRoutes(): Record[String, js.Array[String]] = js.native
    
    /* protected */ def getAppPathsManifest(): js.UndefOr[PagesManifest] = js.native
    
    /* protected */ def getBuildId(): String = js.native
    
    /* protected */ def getCustomRoutes(): CustomRoutes = js.native
    
    /* protected */ def getDynamicRoutes(): js.Array[RoutingItem] = js.native
    
    /* protected */ def getFallback(page: String): js.Promise[String] = js.native
    
    /* protected */ def getFallbackErrorComponents(): js.Promise[LoadComponentsReturnType | Null] = js.native
    
    /* protected */ def getFilesystemPaths(): Set[String] = js.native
    
    /* protected */ def getFontLoaderManifest(): js.UndefOr[FontLoaderManifest] = js.native
    
    /* protected */ def getFontManifest(): js.UndefOr[FontManifest] = js.native
    
    /* protected */ def getHasAppDir(dev: Boolean): Boolean = js.native
    
    /* protected */ def getHasStaticDir(): Boolean = js.native
    
    /* protected */ def getOriginalAppPaths(route: String): js.Array[String] | Null = js.native
    
    /* protected */ def getPagesManifest(): js.UndefOr[PagesManifest] = js.native
    
    /* protected */ def getPrerenderManifest(): PrerenderManifest = js.native
    
    /* protected */ def getPreviewProps(): ApiPreviewProps = js.native
    
    /* protected */ def getPublicDir(): String = js.native
    
    def getRequestHandler(): BaseRequestHandler = js.native
    
    /* protected */ def getResponseCache(options: DevBoolean): ResponseCacheBase = js.native
    
    /* protected */ def getServerCSSManifest(): Any = js.native
    
    /* protected */ def getServerComponentManifest(): Any = js.native
    
    /* private */ var getStaticHTML: Any = js.native
    
    /* protected */ def getStaticPaths(param0: OriginalAppPath): js.Promise[FallbackMode] = js.native
    
    /* protected */ def handleCompression(req: BaseNextRequest[Any], res: BaseNextResponse[Any]): Unit = js.native
    
    /* private */ var handleRequest: Any = js.native
    
    /* protected */ def handleUpgrade(_req: BaseNextRequest[Any], _socket: Any): js.Promise[Unit] = js.native
    /* protected */ def handleUpgrade(_req: BaseNextRequest[Any], _socket: Any, _head: Any): js.Promise[Unit] = js.native
    
    /* protected */ var hasAppDir: Boolean = js.native
    
    /* protected */ def hasPage(pathname: String): js.Promise[Boolean] = js.native
    
    /* protected */ var hasStaticDir: Boolean = js.native
    
    val hostname: js.UndefOr[String] = js.native
    
    /* protected */ def loadEnvConfig(params: ForceReload): Unit = js.native
    
    def logError(err: js.Error): Unit = js.native
    
    /* protected */ var minimalMode: Boolean = js.native
    
    /* protected */ var nextConfig: NextConfigComplete = js.native
    
    /* protected */ var pagesManifest: js.UndefOr[PagesManifest] = js.native
    
    /* private */ var pipe: Any = js.native
    
    val port: js.UndefOr[Double] = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    /* protected */ var publicDir: String = js.native
    
    /* protected */ var quiet: Boolean = js.native
    
    def render(req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      parsedUrl: Unit,
      internalRender: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery,
      internalRender: Boolean
    ): js.Promise[Unit] = js.native
    def render(req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String, query: NextParsedUrlQuery): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: Unit,
      internalRender: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery,
      internalRender: Boolean
    ): js.Promise[Unit] = js.native
    
    def render404(req: BaseNextRequest[Any], res: BaseNextResponse[Any]): js.Promise[Unit] = js.native
    def render404(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
    def render404(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
    def render404(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      parsedUrl: NextUrlWithParsedQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    
    def renderError(err: js.Error, req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Null, req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    
    def renderErrorToHTML(err: js.Error, req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Null, req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: Null,
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    
    /* private */ var renderErrorToResponse: Any = js.native
    
    /* protected */ def renderHTML(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      renderOpts: RenderOpts
    ): js.Promise[typings.next.distServerRenderResultMod.default | Null] = js.native
    
    /* protected */ var renderOpts: AmpOptimizerConfig = js.native
    
    /* protected */ def renderPageComponent(ctx: RequestContext, bubbleNoFallback: Boolean): js.Promise[`false` | ResponsePayload | Null] = js.native
    
    def renderToHTML(req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    
    /* private */ var renderToResponse: Any = js.native
    
    /* private */ var renderToResponseWithComponents: Any = js.native
    
    /* private */ var responseCache: Any = js.native
    
    /* protected */ var router: typings.next.distServerRouterMod.default = js.native
    
    /* protected */ def run(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    /* protected */ def runApi(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Unit,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    /* protected */ def runApi(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Params,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    
    /* protected */ def sendRenderResult(req: BaseNextRequest[Any], res: BaseNextResponse[Any], options: GenerateEtags): js.Promise[Unit] = js.native
    
    /* protected */ var serverCSSManifest: js.UndefOr[Any] = js.native
    
    /* protected */ var serverComponentManifest: js.UndefOr[Any] = js.native
    
    /* protected */ var serverOptions: ServerOptions = js.native
    
    def setAssetPrefix(): Unit = js.native
    def setAssetPrefix(prefix: String): Unit = js.native
    
    /* private */ var stripNextDataPath: Any = js.native
  }
}
