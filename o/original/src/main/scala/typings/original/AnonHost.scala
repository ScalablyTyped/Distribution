package typings.original

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var protocol: String
}

object AnonHost {
  @scala.inline
  def apply(host: String, protocol: String): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

