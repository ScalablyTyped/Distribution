package typings.node.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOptions extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var fd: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object BindOptions {
  @scala.inline
  def apply(
    address: String = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    fd: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined
  ): BindOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fd)) __obj.updateDynamic("fd")(fd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindOptions]
  }
}

