package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hostname extends js.Object {
  var hostname: String
  var service: String
}

object Hostname {
  @scala.inline
  def apply(hostname: String, service: String): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
}

