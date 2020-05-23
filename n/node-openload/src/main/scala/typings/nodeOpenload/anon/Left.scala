package typings.nodeOpenload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var left: Double
  var used_24h: Double
}

object Left {
  @scala.inline
  def apply(left: Double, used_24h: Double): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], used_24h = used_24h.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

