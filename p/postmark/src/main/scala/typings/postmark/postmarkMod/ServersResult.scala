package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServersResult extends PaginatedResult {
  var Servers: js.Array[Server]
}

object ServersResult {
  @scala.inline
  def apply(Servers: js.Array[Server], TotalCount: Double): ServersResult = {
    val __obj = js.Dynamic.literal(Servers = Servers, TotalCount = TotalCount)
  
    __obj.asInstanceOf[ServersResult]
  }
}

