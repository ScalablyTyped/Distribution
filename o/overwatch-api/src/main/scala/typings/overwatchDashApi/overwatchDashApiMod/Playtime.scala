package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playtime extends js.Object {
  var competitive: String
  var quickplay: String
}

object Playtime {
  @scala.inline
  def apply(competitive: String, quickplay: String): Playtime = {
    val __obj = js.Dynamic.literal(competitive = competitive, quickplay = quickplay)
  
    __obj.asInstanceOf[Playtime]
  }
}

