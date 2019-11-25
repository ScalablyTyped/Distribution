package typings.original

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var protocol: String
}

object Anon_Host {
  @scala.inline
  def apply(host: String, protocol: String): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Host]
  }
}

