package typings
package nodemailerDashMailgunDashTransportLib.nodemailerDashMailgunDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth: AuthOptions
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth: AuthOptions,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    proxy: java.lang.String | scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(auth = auth)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

