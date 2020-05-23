package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OServerConfig extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object OServerConfig {
  @scala.inline
  def apply(host: String = null, port: js.UndefOr[Double] = js.undefined): OServerConfig = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OServerConfig]
  }
}

