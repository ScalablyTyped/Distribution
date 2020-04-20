package typings.postmark.serversMod

import typings.postmark.serverMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Servers extends js.Object {
  var Servers: js.Array[Server]
  var TotalCount: Double
}

object Servers {
  @scala.inline
  def apply(Servers: js.Array[Server], TotalCount: Double): Servers = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Servers]
  }
}

