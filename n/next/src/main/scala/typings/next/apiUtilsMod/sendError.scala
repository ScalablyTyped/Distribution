package typings.next.apiUtilsMod

import typings.next.utilsMod.NextApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "sendError")
@js.native
object sendError extends js.Object {
  def apply(res: NextApiResponse[_], statusCode: Double, message: String): Unit = js.native
}

