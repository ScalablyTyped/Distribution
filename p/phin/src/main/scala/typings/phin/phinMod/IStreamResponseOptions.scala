package typings.phin.phinMod

import typings.node.httpMod.ClientRequestArgs
import typings.phin.phinNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamResponseOptions extends IOptionsBase {
  @JSName("stream")
  var stream_IStreamResponseOptions: `true`
}

object IStreamResponseOptions {
  @scala.inline
  def apply(
    stream: `true`,
    url: String,
    compression: js.UndefOr[Boolean] = js.undefined,
    core: ClientRequestArgs = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    timeout: Int | Double = null
  ): IStreamResponseOptions = {
    val __obj = js.Dynamic.literal(stream = stream, url = url)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (core != null) __obj.updateDynamic("core")(core)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamResponseOptions]
  }
}

