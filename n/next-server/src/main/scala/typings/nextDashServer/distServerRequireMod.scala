package typings.nextDashServer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/require", JSImport.Namespace)
@js.native
object distServerRequireMod extends js.Object {
  def getPagePath(page: String, distDir: String, serverless: Boolean): String = js.native
  def getPagePath(page: String, distDir: String, serverless: Boolean, dev: Boolean): String = js.native
  def pageNotFoundError(page: String): Error = js.native
  def requirePage(page: String, distDir: String, serverless: Boolean): js.Any = js.native
}

