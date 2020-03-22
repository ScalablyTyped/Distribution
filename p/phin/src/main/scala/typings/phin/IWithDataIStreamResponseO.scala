package typings.phin

import typings.node.httpMod.ClientRequestArgs
import typings.phin.phinBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phin.phin.IWithData<phin.phin.IStreamResponseOptions> */
trait IWithDataIStreamResponseO extends js.Object {
  var compression: js.UndefOr[Boolean] = js.undefined
  var core: js.UndefOr[ClientRequestArgs] = js.undefined
  var data: AnonToString
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var stream: `true`
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
}

object IWithDataIStreamResponseO {
  @scala.inline
  def apply(
    data: AnonToString,
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
  ): IWithDataIStreamResponseO = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (core != null) __obj.updateDynamic("core")(core.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWithDataIStreamResponseO]
  }
}

