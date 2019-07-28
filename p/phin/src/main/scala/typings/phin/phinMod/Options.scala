package typings.phin.phinMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ClientRequestArgs
import typings.phin.phinStrings.json
import typings.phin.phinStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends DefaultOpts {
  @JSName("url")
  var url_Options: String
}

object Options {
  @scala.inline
  def apply(
    url: String,
    compression: js.UndefOr[Boolean] = js.undefined,
    core: ClientRequestArgs = null,
    data: js.Any = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    form: StringDictionary[String] = null,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    method: String = null,
    parse: none | json = null,
    path: String = null,
    port: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (core != null) __obj.updateDynamic("core")(core)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (form != null) __obj.updateDynamic("form")(form)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

