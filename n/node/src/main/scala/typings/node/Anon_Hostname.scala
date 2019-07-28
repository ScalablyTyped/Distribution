package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: java.lang.String
  var service: java.lang.String
}

object Anon_Hostname {
  @scala.inline
  def apply(hostname: java.lang.String, service: java.lang.String): Anon_Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname, service = service)
  
    __obj.asInstanceOf[Anon_Hostname]
  }
}

