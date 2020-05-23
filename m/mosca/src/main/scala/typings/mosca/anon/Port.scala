package typings.mosca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var port: Double
}

object Port {
  @scala.inline
  def apply(port: Double): Port = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

