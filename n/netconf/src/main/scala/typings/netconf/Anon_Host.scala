package typings.netconf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var pkey: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var username: String
}

object Anon_Host {
  @scala.inline
  def apply(
    host: String,
    username: String,
    password: String = null,
    pkey: String = null,
    port: Int | Double = null
  ): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, username = username)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pkey != null) __obj.updateDynamic("pkey")(pkey)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Host]
  }
}

