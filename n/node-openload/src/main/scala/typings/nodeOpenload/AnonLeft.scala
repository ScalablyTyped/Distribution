package typings.nodeOpenload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: Double
  var used_24h: Double
}

object AnonLeft {
  @scala.inline
  def apply(left: Double, used_24h: Double): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], used_24h = used_24h.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

