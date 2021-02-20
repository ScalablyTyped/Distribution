package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.AmpOptimizerConfig
import typings.next.anon.BasePath
import typings.next.anon.FallbackMode
import typings.next.apiUtilsMod.ApiPreviewProps
import typings.next.buildMod.PrerenderManifest
import typings.next.loadCustomRoutesMod.CustomRoutes
import typings.next.nextBooleans.`false`
import typings.next.pagesManifestPluginMod.PagesManifest
import typings.next.serverRouterMod.DynamicRoutes
import typings.next.serverRouterMod.Params
import typings.next.serverRouterMod.Route_
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Error
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextServerMod {
  
  @JSImport("next/dist/next-server/server/next-server", JSImport.Default)
  @js.native
  class default () extends Server {
    def this(hasDirQuietConfDevCustomServer: ServerConstructor) = this()
  }
  
  @js.native
  trait DynamicRouteItem extends StObject {
    
    var `match`: ReturnType[
        js.Function1[
          /* routeRegex */ ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getRouteRegex */ js.Any
          ], 
          js.Function1[
            /* pathname */ js.UndefOr[String | Null], 
            `false` | (StringDictionary[String | js.Array[String]])
          ]
        ]
      ] = js.native
    
    var page: String = js.native
  }
  object DynamicRouteItem {
    
    @scala.inline
    def apply(
      `match`: ReturnType[
          js.Function1[
            /* routeRegex */ ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getRouteRegex */ js.Any
            ], 
            js.Function1[
              /* pathname */ js.UndefOr[String | Null], 
              `false` | (StringDictionary[String | js.Array[String]])
            ]
          ]
        ],
      page: String
    ): DynamicRouteItem = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicRouteItem]
    }
    
    @scala.inline
    implicit class DynamicRouteItemMutableBuilder[Self <: DynamicRouteItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(
        value: ReturnType[
              js.Function1[
                /* routeRegex */ ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getRouteRegex */ js.Any
                ], 
                js.Function1[
                  /* pathname */ js.UndefOr[String | Null], 
                  `false` | (StringDictionary[String | js.Array[String]])
                ]
              ]
            ]
      ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  type NextConfig = js.Any
  
  @js.native
  trait Server extends StObject {
    
    /* protected */ def _beforeCatchAllRender(_req: IncomingMessage, _res: ServerResponse, _params: Params, _parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
    
    var _cachedPreviewManifest: js.Any = js.native
    
    /* protected */ def _isLikeServerless: Boolean = js.native
    
    var _validFilesystemPathSet: js.Any = js.native
    
    var buildId: String = js.native
    
    /* protected */ def close(): js.Promise[Unit] = js.native
    
    var compression: js.Any = js.native
    
    /* protected */ def currentPhase(): String = js.native
    
    var customErrorNo404Warn: js.Any = js.native
    
    var customRoutes: CustomRoutes = js.native
    
    var dir: String = js.native
    
    var distDir: String = js.native
    
    var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.native
    
    /* protected */ def ensureApiPage(_pathname: String): js.Promise[Unit] = js.native
    
    var findPageComponents: js.Any = js.native
    
    /* protected */ def generatePublicRoutes(): js.Array[Route_] = js.native
    
    /* protected */ def generateRoutes(): BasePath = js.native
    
    /* protected */ def getCustomRoutes(): CustomRoutes = js.native
    
    /* protected */ def getDynamicRoutes(): js.Array[DynamicRouteItem] = js.native
    
    var getFilesystemPaths: js.Any = js.native
    
    var getPagePath: js.Any = js.native
    
    /* protected */ def getPrerenderManifest(): PrerenderManifest = js.native
    
    /* protected */ def getPreviewProps(): ApiPreviewProps = js.native
    
    def getRequestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
        js.Promise[Unit]
      ] = js.native
    
    /* protected */ def getStaticPaths(pathname: String): js.Promise[FallbackMode] = js.native
    
    /**
      * Resolves `API` request, in development builds on demand
      * @param req http request
      * @param res http response
      * @param pathname path of request
      */
    var handleApiRequest: js.Any = js.native
    
    var handleCompression: js.Any = js.native
    
    var handleRequest: js.Any = js.native
    
    /* protected */ def hasPage(pathname: String): js.Promise[Boolean] = js.native
    
    var hasStaticDir: Boolean = js.native
    
    var incrementalCache: js.Any = js.native
    
    /* protected */ def isServeableUrl(untrustedFileUrl: String): Boolean = js.native
    
    def logError(err: Error): Unit = js.native
    
    var nextConfig: NextConfig = js.native
    
    var onErrorMiddleware: js.Any = js.native
    
    var pagesDir: js.UndefOr[String] = js.native
    
    var pagesManifest: js.UndefOr[PagesManifest] = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    var publicDir: String = js.native
    
    var quiet: Boolean = js.native
    
    /* protected */ def readBuildId(): String = js.native
    
    def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: js.UndefOr[scala.Nothing],
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: ParsedUrlQuery,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    
    def render404(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
    def render404(
      req: IncomingMessage,
      res: ServerResponse,
      parsedUrl: js.UndefOr[scala.Nothing],
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery, setHeaders: Boolean): js.Promise[Unit] = js.native
    
    def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: js.UndefOr[scala.Nothing],
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: ParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Error,
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: js.UndefOr[scala.Nothing],
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
    def renderError(
      err: Error,
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: ParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
    
    var renderOpts: AmpOptimizerConfig = js.native
    
    def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
    
    var renderToHTMLWithComponents: js.Any = js.native
    
    var router: typings.next.serverRouterMod.default = js.native
    
    /* protected */ def run(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    /* protected */ def sendHTML(req: IncomingMessage, res: ServerResponse, html: String): js.Promise[Unit] = js.native
    
    def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
    def serveStatic(req: IncomingMessage, res: ServerResponse, path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    var serverBuildDir: String = js.native
    
    def setAssetPrefix(): Unit = js.native
    def setAssetPrefix(prefix: String): Unit = js.native
    
    /* protected */ def setImmutableAssetCacheControl(res: ServerResponse): Unit = js.native
  }
  
  @js.native
  trait ServerConstructor extends StObject {
    
    /**
      * Object what you would use in next.config.js - @default {}
      */
    var conf: js.UndefOr[NextConfig] = js.native
    
    var customServer: js.UndefOr[Boolean] = js.native
    
    var dev: js.UndefOr[Boolean] = js.native
    
    /**
      * Where the Next project is located - @default '.'
      */
    var dir: js.UndefOr[String] = js.native
    
    /**
      * Hide error messages containing server information - @default false
      */
    var quiet: js.UndefOr[Boolean] = js.native
  }
  object ServerConstructor {
    
    @scala.inline
    def apply(): ServerConstructor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerConstructor]
    }
    
    @scala.inline
    implicit class ServerConstructorMutableBuilder[Self <: ServerConstructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConf(value: NextConfig): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
      
      @scala.inline
      def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
      
      @scala.inline
      def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
