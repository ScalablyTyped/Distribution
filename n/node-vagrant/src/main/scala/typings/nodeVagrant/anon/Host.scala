package typings.nodeVagrant.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String | Null
  var hostname: String | Null
  var port: String | Null
  var private_key: String | Null
  var user: String | Null
}

object Host {
  @scala.inline
  def apply(
    host: String = null,
    hostname: String = null,
    port: String = null,
    private_key: String = null,
    user: String = null
  ): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

