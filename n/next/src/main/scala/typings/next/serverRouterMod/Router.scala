package typings.next.serverRouterMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var basePath: String = js.native
  var catchAllRoute: Route_ = js.native
  var dynamicRoutes: DynamicRoutes = js.native
  var fsRoutes: js.Array[Route_] = js.native
  var headers: js.Array[Route_] = js.native
  var pageChecker: PageChecker = js.native
  var redirects: js.Array[Route_] = js.native
  var rewrites: js.Array[Route_] = js.native
  var useFileSystemPublicRoutes: Boolean = js.native
  def addFsRoute(fsRoute: Route_): Unit = js.native
  def execute(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
  def setDynamicRoutes(): Unit = js.native
  def setDynamicRoutes(routes: DynamicRoutes): Unit = js.native
}

