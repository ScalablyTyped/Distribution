package typings.node.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOptions extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var fd: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object BindOptions {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    fd: Int | Double = null,
    port: Int | Double = null
  ): BindOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindOptions]
  }
}

