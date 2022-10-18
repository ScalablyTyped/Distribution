package typings.next

import typings.next.anon.AppPathsPage
import typings.next.anon.Assets
import typings.next.anon.Buffer
import typings.next.anon.Fallback
import typings.next.anon.FinishedBoolean
import typings.next.anon.GenerateEtags
import typings.next.anon.Middleware
import typings.next.anon.OnWarning
import typings.next.anon.Query
import typings.next.anon.Res
import typings.next.anon.RestrictedRedirectPaths
import typings.next.distBuildWebpackPluginsMiddlewarePluginMod.MiddlewareManifest
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerBaseHttpNodeMod.NodeNextRequest
import typings.next.distServerBaseHttpNodeMod.NodeNextResponse
import typings.next.distServerBaseServerMod.FindComponentsResult
import typings.next.distServerBaseServerMod.MiddlewareRoutingItem
import typings.next.distServerBaseServerMod.Options
import typings.next.distServerBaseServerMod.RoutingItem
import typings.next.distServerImageOptimizerMod.ImageParamsResult
import typings.next.distServerRenderMod.RenderOpts
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typings.next.distServerRouterMod.Route
import typings.next.distServerWebTypesMod.FetchEventResult
import typings.next.distSharedLibRouterUtilsParseUrlMod.ParsedUrl
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
import typings.next.distSharedLibUtilsMod.CacheFs
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerNextServerMod {
  
  @JSImport("next/dist/server/next-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/next-server", JSImport.Default)
  @js.native
  open class default protected () extends NextNodeServer {
    def this(options: Options) = this()
  }
  
  @JSImport("next/dist/server/next-server", "NoFallbackError")
  @js.native
  open class NoFallbackError ()
    extends typings.next.distServerBaseServerMod.NoFallbackError
  
  @JSImport("next/dist/server/next-server", "WrappedBuildError")
  @js.native
  open class WrappedBuildError protected ()
    extends typings.next.distServerBaseServerMod.WrappedBuildError {
    def this(innerError: js.Error) = this()
  }
  
  inline def prepareServerlessUrl(
    req: BaseNextRequest[Any],
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareServerlessUrl")(req.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait NextNodeServer
    extends typings.next.distServerBaseServerMod.default[Options] {
    
    /* private */ var _cachedPreviewManifest: Any = js.native
    
    /* protected */ def _isLikeServerless: Boolean = js.native
    
    /* private */ var _validFilesystemPathSet: Any = js.native
    
    /* private */ var compression: Any = js.native
    
    /* protected */ def ensureApiPage(_pathname: String): js.Promise[Unit] = js.native
    
    /* protected */ def ensureEdgeFunction(_params: AppPathsPage): js.Promise[Unit] = js.native
    
    /**
      * A placeholder for a function to be defined in the development server.
      * It will make sure that the root middleware or an edge function has been compiled
      * so that we can run it.
      */
    /* protected */ def ensureMiddleware(): js.Promise[Unit] = js.native
    
    /* protected */ def findPageComponents(hasPathnameQueryParamsIsAppPath: Query): js.Promise[FindComponentsResult | Null] = js.native
    
    /* protected */ def generateCatchAllMiddlewareRoute(): js.Array[Route] = js.native
    /* protected */ def generateCatchAllMiddlewareRoute(devReady: Boolean): js.Array[Route] = js.native
    
    /* protected */ def generateFsStaticRoutes(): js.Array[Route] = js.native
    
    /* protected */ def generateImageRoutes(): js.Array[Route] = js.native
    
    /* protected */ def generatePublicRoutes(): js.Array[Route] = js.native
    
    /* protected */ def generateRewrites(hasRestrictedRedirectPaths: RestrictedRedirectPaths): Fallback = js.native
    
    /* protected */ def generateStaticRoutes(): js.Array[Route] = js.native
    
    /* protected */ def getCacheFilesystem(): CacheFs = js.native
    
    /**
      * Get information for the edge function located in the provided page
      * folder. If the edge function info can't be found it will throw
      * an error.
      */
    /* protected */ def getEdgeFunctionInfo(params: Middleware): Assets | Null = js.native
    
    /* protected */ def getEdgeFunctions(): js.Array[RoutingItem] = js.native
    
    /** Returns the middleware routing item if there is one. */
    /* protected */ def getMiddleware(): js.UndefOr[MiddlewareRoutingItem] = js.native
    
    /* protected */ def getMiddlewareManifest(): MiddlewareManifest | Null = js.native
    
    /* protected */ def getPagePath(pathname: String): String = js.native
    /* protected */ def getPagePath(pathname: String, locales: js.Array[String]): String = js.native
    
    /* protected */ def getRoutesManifest(): Any = js.native
    
    /* protected */ def getStaticRoutes(): js.Array[Route] = js.native
    
    /**
      * Resolves `API` request, in development builds on demand
      * @param req http request
      * @param res http response
      * @param pathname path of request
      */
    /* protected */ def handleApiRequest(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[Boolean] = js.native
    
    /* protected */ def handleCompression(req: NodeNextRequest, res: NodeNextResponse): Unit = js.native
    
    /* protected */ def handleUpgrade(req: NodeNextRequest, socket: Any, head: Any): js.Promise[Unit] = js.native
    
    /**
      * Checks if a middleware exists. This method is useful for the development
      * server where we need to check the filesystem. Here we just check the
      * middleware manifest.
      */
    /* protected */ def hasMiddleware(pathname: String): js.Promise[Boolean] = js.native
    
    /* protected */ def imageOptimizer(req: NodeNextRequest, res: NodeNextResponse, paramsResult: ImageParamsResult): js.Promise[Buffer] = js.native
    
    /* private */ var imageResponseCache: Any = js.native
    
    /* protected */ def isServeableUrl(untrustedFileUrl: String): Boolean = js.native
    
    /* private */ var normalizeReq: Any = js.native
    
    /* private */ var normalizeRes: Any = js.native
    
    /* protected */ def proxyRequest(req: NodeNextRequest, res: NodeNextResponse, parsedUrl: ParsedUrl): js.Promise[FinishedBoolean] = js.native
    /* protected */ def proxyRequest(req: NodeNextRequest, res: NodeNextResponse, parsedUrl: ParsedUrl, upgradeHead: Any): js.Promise[FinishedBoolean] = js.native
    
    def render(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: Unit,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: Unit,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      parsedUrl: Unit,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(req: IncomingMessage, res: BaseNextResponse[Any], pathname: String, query: NextParsedUrlQuery): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: Unit,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: Unit,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: NextUrlWithParsedQuery,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: Unit,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      parsedUrl: NextUrlWithParsedQuery,
      internal: Boolean
    ): js.Promise[Unit] = js.native
    
    def render404(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
    def render404(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      parsedUrl: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def render404(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
    def render404(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      parsedUrl: NextUrlWithParsedQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: BaseNextResponse[Any]): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: BaseNextResponse[Any], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
    def render404(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      parsedUrl: NextUrlWithParsedQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
    def render404(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      parsedUrl: NextUrlWithParsedQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    
    def renderError(err: js.Error, req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: js.Error, req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: js.Error, req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Null, req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Null, req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(err: Null, req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery
    ): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: NextParsedUrlQuery,
      setHeaders: Boolean
    ): js.Promise[Unit] = js.native
    
    def renderErrorToHTML(err: js.Error, req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: js.Error,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: js.Error, req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: js.Error,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: js.Error, req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: js.Error,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Null, req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: Null,
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: Null,
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderErrorToHTML(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    
    /* protected */ def renderHTML(
      req: NodeNextRequest,
      res: NodeNextResponse,
      pathname: String,
      query: NextParsedUrlQuery,
      renderOpts: RenderOpts
    ): js.Promise[typings.next.distServerRenderResultMod.default | Null] = js.native
    
    def renderToHTML(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderToHTML(req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: BaseNextResponse[Any],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderToHTML(req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    
    /* protected */ def runApi(
      req: BaseNextRequest[Any],
      res: NodeNextResponse,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Unit,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    /* protected */ def runApi(
      req: BaseNextRequest[Any],
      res: NodeNextResponse,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Params,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    /* protected */ def runApi(
      req: NodeNextRequest,
      res: BaseNextResponse[Any],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Unit,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    /* protected */ def runApi(
      req: NodeNextRequest,
      res: BaseNextResponse[Any],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Params,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    /* protected */ def runApi(
      req: NodeNextRequest,
      res: NodeNextResponse,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Unit,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    /* protected */ def runApi(
      req: NodeNextRequest,
      res: NodeNextResponse,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      params: Params,
      page: String,
      builtPagePath: String
    ): js.Promise[Boolean] = js.native
    
    /* protected */ def runEdgeFunction(params: Res): js.Promise[FetchEventResult | Null] = js.native
    
    /**
      * This method gets all middleware matchers and execute them when the request
      * matches. It will make sure that each middleware exists and is compiled and
      * ready to be invoked. The development server will decorate it to add warns
      * and errors with rich traces.
      */
    /* protected */ def runMiddleware(params: OnWarning): js.Promise[FetchEventResult | FinishedBoolean] = js.native
    
    /* protected */ def sendRenderResult(req: NodeNextRequest, res: NodeNextResponse, options: GenerateEtags): js.Promise[Unit] = js.native
    
    /* protected */ def sendStatic(req: NodeNextRequest, res: NodeNextResponse, path: String): js.Promise[Unit] = js.native
    
    def serveStatic(req: BaseNextRequest[Any], res: BaseNextResponse[Any], path: String): js.Promise[Unit] = js.native
    def serveStatic(req: BaseNextRequest[Any], res: BaseNextResponse[Any], path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    def serveStatic(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], path: String): js.Promise[Unit] = js.native
    def serveStatic(
      req: BaseNextRequest[Any],
      res: ServerResponse[IncomingMessage],
      path: String,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def serveStatic(req: IncomingMessage, res: BaseNextResponse[Any], path: String): js.Promise[Unit] = js.native
    def serveStatic(req: IncomingMessage, res: BaseNextResponse[Any], path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    def serveStatic(req: IncomingMessage, res: ServerResponse[IncomingMessage], path: String): js.Promise[Unit] = js.native
    def serveStatic(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      path: String,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    
    /* protected */ def serverDistDir: String = js.native
    
    /* protected */ def setImmutableAssetCacheControl(res: BaseNextResponse[Any]): Unit = js.native
    
    /* protected */ def streamResponseChunk(res: NodeNextResponse, chunk: Any): Unit = js.native
  }
  
  type NodeRequestHandler = js.Function3[
    /* req */ IncomingMessage | BaseNextRequest[Any], 
    /* res */ ServerResponse[IncomingMessage] | BaseNextResponse[Any], 
    /* parsedUrl */ js.UndefOr[NextUrlWithParsedQuery], 
    js.Promise[Unit]
  ]
}
