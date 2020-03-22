package typings.next.apiUtilsMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "getCookieParser")
@js.native
object getCookieParser extends js.Object {
  def apply(req: IncomingMessage): js.Function0[NextApiRequestCookies] = js.native
}

