package typings
package phinLib.phinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOpts extends js.Object {
  var compression: js.UndefOr[scala.Boolean] = js.undefined
  var core: js.UndefOr[nodeLib.httpMod.ClientRequestArgs] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var parse: js.UndefOr[phinLib.phinLibStrings.none | phinLib.phinLibStrings.json] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DefaultOpts {
  @scala.inline
  def apply(
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
    timeout: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): DefaultOpts = {
    val __obj = js.Dynamic.literal()
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
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DefaultOpts]
  }
}

