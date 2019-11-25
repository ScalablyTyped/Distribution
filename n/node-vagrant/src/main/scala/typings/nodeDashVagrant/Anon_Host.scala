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
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (private_key != null) __obj.updateDynamic("private_key")(private_key.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Host]
  }
}

