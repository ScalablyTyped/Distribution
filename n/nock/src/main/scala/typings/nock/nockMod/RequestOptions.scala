package typings.nock.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var _https_ : js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var proto: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    _https_ : js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    proto: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_https_)) __obj.updateDynamic("_https_")(_https_)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto)
    __obj.asInstanceOf[RequestOptions]
  }
}

