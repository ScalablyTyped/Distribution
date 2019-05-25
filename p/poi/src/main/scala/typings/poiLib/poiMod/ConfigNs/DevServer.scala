package typings
package poiLib.poiMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevServer extends js.Object {
  var after: js.UndefOr[
    js.Function2[
      /* app */ expressLib.expressMod.Application, 
      /* server */ webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServer, 
      scala.Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* app */ expressLib.expressMod.Application, 
      /* server */ webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServer, 
      scala.Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var historyApiFallback: js.UndefOr[
    scala.Boolean | connectDashHistoryDashApiDashFallbackLib.connectDashHistoryDashApiDashFallbackMod.Options
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hot: js.UndefOr[scala.Boolean] = js.undefined
  var hotEntries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hotOnly: js.UndefOr[scala.Boolean] = js.undefined
  var https: js.UndefOr[scala.Boolean | nodeLib.httpsMod.ServerOptions] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var proxy: js.UndefOr[
    java.lang.String | (js.UndefOr[
      webpackDashDevDashServerLib.webpackDashDevDashServerMod.ProxyConfigMap | webpackDashDevDashServerLib.webpackDashDevDashServerMod.ProxyConfigArray
    ])
  ] = js.undefined
}

object DevServer {
  @scala.inline
  def apply(
    after: (/* app */ expressLib.expressMod.Application, /* server */ webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServer) => scala.Unit = null,
    before: (/* app */ expressLib.expressMod.Application, /* server */ webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServer) => scala.Unit = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    historyApiFallback: scala.Boolean | connectDashHistoryDashApiDashFallbackLib.connectDashHistoryDashApiDashFallbackMod.Options = null,
    host: java.lang.String = null,
    hot: js.UndefOr[scala.Boolean] = js.undefined,
    hotEntries: js.Array[java.lang.String] = null,
    hotOnly: js.UndefOr[scala.Boolean] = js.undefined,
    https: scala.Boolean | nodeLib.httpsMod.ServerOptions = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    port: java.lang.String | scala.Double = null,
    proxy: java.lang.String | (js.UndefOr[
      webpackDashDevDashServerLib.webpackDashDevDashServerMod.ProxyConfigMap | webpackDashDevDashServerLib.webpackDashDevDashServerMod.ProxyConfigArray
    ]) = null
  ): DevServer = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction2(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (historyApiFallback != null) __obj.updateDynamic("historyApiFallback")(historyApiFallback.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot)
    if (hotEntries != null) __obj.updateDynamic("hotEntries")(hotEntries)
    if (!js.isUndefined(hotOnly)) __obj.updateDynamic("hotOnly")(hotOnly)
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevServer]
  }
}

