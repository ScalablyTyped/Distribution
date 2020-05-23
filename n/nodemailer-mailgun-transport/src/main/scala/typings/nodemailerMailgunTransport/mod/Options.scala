package typings.nodemailerMailgunTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth: AuthOptions
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth: AuthOptions,
    host: String = null,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    proxy: String | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

