package typings.next.apiUtilsMod

import typings.next.nextBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "tryGetPreviewData")
@js.native
object tryGetPreviewData extends js.Object {
  def apply(req: IncomingMessage, res: ServerResponse, options: ApiPreviewProps): js.Object | String | `false` = js.native
}

