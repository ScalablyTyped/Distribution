package typings.next.apiUtilsMod

import typings.next.libUtilsMod.NextApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/next-server/server/api-utils", "redirect")
@js.native
object redirect extends js.Object {
  
  def apply(res: NextApiResponse[_], statusOrUrl: String): NextApiResponse[_] = js.native
  def apply(res: NextApiResponse[_], statusOrUrl: String, url: String): NextApiResponse[_] = js.native
  def apply(res: NextApiResponse[_], statusOrUrl: Double): NextApiResponse[_] = js.native
  def apply(res: NextApiResponse[_], statusOrUrl: Double, url: String): NextApiResponse[_] = js.native
}
