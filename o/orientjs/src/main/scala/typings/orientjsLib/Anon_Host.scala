package typings
package orientjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var name: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    host: java.lang.String,
    name: java.lang.String,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    username: java.lang.String = null
  ): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, name = name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Host]
  }
}

