package typings.next.apiUtilsMod

import typings.next.anon.Err
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "apiResolver")
@js.native
object apiResolver extends js.Object {
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    query: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    propagateError: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    query: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    propagateError: Boolean,
    onError: js.Function1[/* hasErr */ Err, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
}

