package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var _https_ : js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var proto: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    _https_ : js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    proto: java.lang.String = null
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

