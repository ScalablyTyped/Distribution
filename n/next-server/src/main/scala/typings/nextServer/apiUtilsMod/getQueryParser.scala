package typings.nextServer.apiUtilsMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/api-utils", "getQueryParser")
@js.native
object getQueryParser extends js.Object {
  def apply(hasUrl: IncomingMessage): js.Function0[NextApiRequestQuery] = js.native
}

