package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  var backlog: js.UndefOr[Double] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var readableAll: js.UndefOr[Boolean] = js.undefined
  var writableAll: js.UndefOr[Boolean] = js.undefined
}

object ListenOptions {
  @scala.inline
  def apply(
    backlog: js.UndefOr[Double] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    ipv6Only: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    readableAll: js.UndefOr[Boolean] = js.undefined,
    writableAll: js.UndefOr[Boolean] = js.undefined
  ): ListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backlog)) __obj.updateDynamic("backlog")(backlog.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv6Only)) __obj.updateDynamic("ipv6Only")(ipv6Only.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readableAll)) __obj.updateDynamic("readableAll")(readableAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writableAll)) __obj.updateDynamic("writableAll")(writableAll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenOptions]
  }
}

