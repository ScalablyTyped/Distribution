package typings.mosca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var port: Double
}

object AnonPort {
  @scala.inline
  def apply(port: Double): AnonPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}

