package typings.next.apiUtilsMod

import typings.next.utilsMod.NextApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "redirect")
@js.native
object redirect extends js.Object {
  def apply(res: NextApiResponse[_], statusOrUrl: String): NextApiResponse[_] = js.native
  def apply(res: NextApiResponse[_], statusOrUrl: String, url: String): NextApiResponse[_] = js.native
  def apply(res: NextApiResponse[_], statusOrUrl: Double): NextApiResponse[_] = js.native
  def apply(res: NextApiResponse[_], statusOrUrl: Double, url: String): NextApiResponse[_] = js.native
}

