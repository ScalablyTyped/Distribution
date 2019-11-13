package typings.nextDashServer.distServerNextDashServerMod

import typings.nextDashServer.Anon_AmpBindInitData
import typings.nextDashServer.Anon_Amphtml
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  val _isLikeServerless: js.Any = js.native
  var buildId: String = js.native
  var close: js.Any = js.native
  var compression: js.UndefOr[js.Any] = js.native
  var currentPhase: js.Any = js.native
  var dir: String = js.native
  var distDir: String = js.native
  var dynamicRoutes: js.UndefOr[js.Any] = js.native
  var findPageComponents: js.Any = js.native
  var generatePublicRoutes: js.Any = js.native
  var generateRoutes: js.Any = js.native
  var getDynamicRoutes: js.Any = js.native
  /**
    * Resolves `API` request, in development builds on demand
    * @param req http request
    * @param res http response
    * @param pathname path of request
    */
  var handleApiRequest: js.Any = js.native
  var handleCompression: js.Any = js.native
  var handleRequest: js.Any = js.native
  var isServeableUrl: js.Any = js.native
  var logError: js.Any = js.native
  var nextConfig: NextConfig = js.native
  var pagesManifest: String = js.native
  var publicDir: String = js.native
  var quiet: Boolean = js.native
  var readBuildId: js.Any = js.native
  var renderOpts: Anon_AmpBindInitData = js.native
  var renderToHTMLWithComponents: js.Any = js.native
  /**
    * Resolves path to resolver function
    * @param pathname path of request
    */
  var resolveApiRequest: js.Any = js.native
  var router: typings.nextDashServer.distServerRouterMod.default = js.native
  var run: js.Any = js.native
  var sendHTML: js.Any = js.native
  var setImmutableAssetCacheControl: js.Any = js.native
  def getRequestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
    js.Promise[Unit]
  ] = js.native
  def prepare(): js.Promise[Unit] = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def render(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    parsedUrl: UrlWithParsedQuery
  ): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[_] = js.native
  def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[_] = js.native
  def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[_] = js.native
  def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[_] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String | Null] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  def renderToHTML(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    hasAmphtmlDataOnlyHasAmp: Anon_Amphtml
  ): js.Promise[String | Null] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  def setAssetPrefix(): Unit = js.native
  def setAssetPrefix(prefix: String): Unit = js.native
}

