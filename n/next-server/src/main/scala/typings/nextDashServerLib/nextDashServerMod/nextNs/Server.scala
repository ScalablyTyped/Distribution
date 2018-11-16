package typings
package nextDashServerLib.nextDashServerMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Next.js server instance API.
     */
@js.native
trait Server extends js.Object {
  var buildId: java.lang.String = js.native
  var dir: java.lang.String = js.native
  var distDir: java.lang.String = js.native
  var nextConfig: nextDashServerLib.nextDashConfigMod.NextConfig = js.native
  var quiet: scala.Boolean = js.native
  var renderOpts: RenderOptions = js.native
  var router: ServerRouter = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def currentPhase(): java.lang.String = js.native
  def generateRoutes(): js.Array[ServerRoute[nextDashServerLib.routerMod.DefaultQuery]] = js.native
  def getRequestHandler(): js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* parsedUrl */ js.UndefOr[nextDashServerLib.routerMod.UrlLike], 
    stdLib.Promise[scala.Unit]
  ] = js.native
  def handleRequest(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): stdLib.Promise[scala.Unit] = js.native
  def handleRequest(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    parsedUrl: nextDashServerLib.routerMod.UrlLike
  ): stdLib.Promise[scala.Unit] = js.native
  def isServeableUrl(path: java.lang.String): scala.Boolean = js.native
  def prepare(): stdLib.Promise[scala.Unit] = js.native
  def readBuildId(): java.lang.String = js.native
  def render(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def render(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String,
    query: nextDashServerLib.routerMod.DefaultQuery
  ): stdLib.Promise[scala.Unit] = js.native
  def render(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String,
    query: nextDashServerLib.routerMod.DefaultQuery,
    parsedUrl: nextDashServerLib.routerMod.UrlLike
  ): stdLib.Promise[scala.Unit] = js.native
  def render404(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): stdLib.Promise[scala.Unit] = js.native
  def render404(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    parsedUrl: nextDashServerLib.routerMod.UrlLike
  ): stdLib.Promise[scala.Unit] = js.native
  def renderError(
    err: js.Any,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def renderError(
    err: js.Any,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String,
    query: nextDashServerLib.routerMod.DefaultQuery
  ): stdLib.Promise[scala.Unit] = js.native
  def renderErrorToHTML(
    err: js.Any,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def renderErrorToHTML(
    err: js.Any,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String,
    query: nextDashServerLib.routerMod.DefaultQuery
  ): stdLib.Promise[java.lang.String] = js.native
  def renderToHTML(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def renderToHTML(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    pathname: java.lang.String,
    query: nextDashServerLib.routerMod.DefaultQuery
  ): stdLib.Promise[java.lang.String] = js.native
  def run(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    parsedUrl: nextDashServerLib.routerMod.UrlLike
  ): stdLib.Promise[scala.Unit] = js.native
  def serveStatic(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse, path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def setAssetPrefix(prefix: java.lang.String): scala.Unit = js.native
  def setImmutableAssetCacheControl(res: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
}

