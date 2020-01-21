package typings.maxmind

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Double
}

object AnonMax {
  @scala.inline
  def apply(max: Double): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMax]
  }
}

