package typings.postmark.distClientModelsServerServersMod

import typings.postmark.distClientModelsServerServerMod.Server
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
    val __obj = js.Dynamic.literal(Servers = Servers, TotalCount = TotalCount)
  
    __obj.asInstanceOf[Servers]
  }
}

