package typings.next.apiUtilsMod

import typings.next.AnonErr
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
    params: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps
  ): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    params: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    onError: js.Function1[/* hasErr */ AnonErr, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
}

