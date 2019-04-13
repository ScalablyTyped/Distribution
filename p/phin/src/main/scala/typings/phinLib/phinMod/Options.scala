package typings
package phinLib.phinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends DefaultOpts {
  @JSName("url")
  var url_Options: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    url: java.lang.String,
    compression: js.UndefOr[scala.Boolean] = js.undefined,
    core: nodeLib.httpMod.ClientRequestArgs = null,
    data: js.Any = null,
    followRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    form: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    hostname: java.lang.String = null,
    method: java.lang.String = null,
    parse: phinLib.phinLibStrings.none | phinLib.phinLibStrings.json = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
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

