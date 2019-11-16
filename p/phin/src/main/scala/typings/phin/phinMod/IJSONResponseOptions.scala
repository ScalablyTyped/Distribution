package typings.phin.phinMod

import typings.node.httpMod.ClientRequestArgs
import typings.phin.phinStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJSONResponseOptions extends IOptionsBase {
  var parse: json
}

object IJSONResponseOptions {
  @scala.inline
  def apply(
    parse: json,
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
  ): IJSONResponseOptions = {
    val __obj = js.Dynamic.literal(parse = parse, url = url)
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
    __obj.asInstanceOf[IJSONResponseOptions]
  }
}

