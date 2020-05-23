package typings.original.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var protocol: String
}

object Host {
  @scala.inline
  def apply(host: String, protocol: String): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

