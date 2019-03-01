package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServersResult extends PaginatedResult {
  var Servers: js.Array[Server]
}

object ServersResult {
  @scala.inline
  def apply(Servers: js.Array[Server], TotalCount: scala.Double): ServersResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Servers")(Servers)
    __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[ServersResult]
  }
}

