package typings.next.distNextDashServerServerRouterMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/router", JSImport.Default)
@js.native
class default () extends Router {
  def this(routes: js.Array[Route]) = this()
  /* CompleteClass */
  override var routes: js.Array[Route] = js.native
  /* CompleteClass */
  override def add(route: Route): Unit = js.native
  /* CompleteClass */
  override def execute(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
}

