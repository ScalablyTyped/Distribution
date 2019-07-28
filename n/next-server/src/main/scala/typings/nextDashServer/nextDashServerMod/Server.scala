package typings.nextDashServer.nextDashServerMod

import typings.nextDashServer.nextDashConfigMod.NextConfig
import typings.nextDashServer.routerMod.DefaultQuery
import typings.nextDashServer.routerMod.UrlLike
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next.js server instance API.
  */
@js.native
trait Server extends js.Object {
  var buildId: String = js.native
  var dir: String = js.native
  var distDir: String = js.native
  var nextConfig: NextConfig = js.native
  var quiet: Boolean = js.native
  var renderOpts: RenderOptions = js.native
  var router: ServerRouter = js.native
  def close(): js.Promise[Unit] = js.native
  def currentPhase(): String = js.native
  def generateRoutes(): js.Array[ServerRoute[DefaultQuery]] = js.native
  def getRequestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* parsedUrl */ js.UndefOr[UrlLike], 
    js.Promise[Unit]
  ] = js.native
  def handleRequest(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
  def handleRequest(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlLike): js.Promise[Unit] = js.native
  def isServeableUrl(path: String): Boolean = js.native
  def prepare(): js.Promise[Unit] = js.native
  def readBuildId(): String = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String, query: DefaultQuery): js.Promise[Unit] = js.native
  def render(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: DefaultQuery,
    parsedUrl: UrlLike
  ): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlLike): js.Promise[Unit] = js.native
  def renderError(err: js.Any, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: js.Any, req: IncomingMessage, res: ServerResponse, pathname: String, query: DefaultQuery): js.Promise[Unit] = js.native
  def renderErrorToHTML(err: js.Any, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String] = js.native
  def renderErrorToHTML(err: js.Any, req: IncomingMessage, res: ServerResponse, pathname: String, query: DefaultQuery): js.Promise[String] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String, query: DefaultQuery): js.Promise[String] = js.native
  def run(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlLike): js.Promise[Unit] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
  def setAssetPrefix(prefix: String): Unit = js.native
  def setImmutableAssetCacheControl(res: ServerResponse): Unit = js.native
}

