package typings.phin.phinMod

import typings.node.httpMod.ClientRequestArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsBase extends js.Object {
  var compression: js.UndefOr[Boolean] = js.undefined
  var core: js.UndefOr[ClientRequestArgs] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
}

object IOptionsBase {
  @scala.inline
  def apply(
    url: String,
    compression: js.UndefOr[Boolean] = js.undefined,
    core: ClientRequestArgs = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): IOptionsBase = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (core != null) __obj.updateDynamic("core")(core)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsBase]
  }
}

