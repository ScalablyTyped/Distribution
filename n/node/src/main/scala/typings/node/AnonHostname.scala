package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var hostname: java.lang.String
  var service: java.lang.String
}

object AnonHostname {
  @scala.inline
  def apply(hostname: java.lang.String, service: java.lang.String): AnonHostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHostname]
  }
}

