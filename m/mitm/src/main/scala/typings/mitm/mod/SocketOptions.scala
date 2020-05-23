package typings.mitm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var localPort: js.UndefOr[String] = js.undefined
  var port: Double
}

object SocketOptions {
  @scala.inline
  def apply(
    port: Double,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    family: js.UndefOr[Double] = js.undefined,
    host: String = null,
    localAddress: String = null,
    localPort: String = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

