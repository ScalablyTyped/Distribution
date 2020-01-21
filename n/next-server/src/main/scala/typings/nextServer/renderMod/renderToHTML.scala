package typings.nextServer.renderMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/render", "renderToHTML")
@js.native
object renderToHTML extends js.Object {
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    renderOpts: RenderOpts
  ): js.Promise[String | Null] = js.native
}

