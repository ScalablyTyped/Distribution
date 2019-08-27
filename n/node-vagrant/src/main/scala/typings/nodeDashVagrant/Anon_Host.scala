package typings.nodeDashVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String | Null
  var hostname: String | Null
  var port: String | Null
  var private_key: String | Null
  var user: String | Null
}

object Anon_Host {
  @scala.inline
  def apply(
    host: String = null,
    hostname: String = null,
    port: String = null,
    private_key: String = null,
    user: String = null
  ): Anon_Host = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (port != null) __obj.updateDynamic("port")(port)
    if (private_key != null) __obj.updateDynamic("private_key")(private_key)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Host]
  }
}

