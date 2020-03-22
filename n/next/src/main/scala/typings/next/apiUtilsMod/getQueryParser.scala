package typings.next.apiUtilsMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "getQueryParser")
@js.native
object getQueryParser extends js.Object {
  def apply(hasUrl: IncomingMessage): js.Function0[NextApiRequestQuery] = js.native
}

