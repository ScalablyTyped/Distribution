package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/utils", JSImport.Namespace)
@js.native
object distServerUtilsMod extends js.Object {
  def cleanAmpPath(pathname: String): String = js.native
  def isBlockedPage(pathname: String): Boolean = js.native
  def isInternalUrl(url: String): Boolean = js.native
}

