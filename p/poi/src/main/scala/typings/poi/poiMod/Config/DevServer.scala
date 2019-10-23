package typings.poi.poiMod.Config

import org.scalablytyped.runtime.StringDictionary
import typings.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackMod.Options
import typings.express.expressMod.Application
import typings.node.httpsMod.ServerOptions
import typings.webpack.webpackMod.Compiler
import typings.webpackDashDevDashServer.webpackDashDevDashServerMod.ProxyConfigArray
import typings.webpackDashDevDashServer.webpackDashDevDashServerMod.ProxyConfigMap
import typings.webpackDashDevDashServer.webpackDashDevDashServerMod.WebpackDevServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevServer extends js.Object {
  var after: js.UndefOr[
    js.Function3[/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler, Unit]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function3[/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler, Unit]
  ] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hot: js.UndefOr[Boolean] = js.undefined
  var hotEntries: js.UndefOr[js.Array[String]] = js.undefined
  var hotOnly: js.UndefOr[Boolean] = js.undefined
  var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[String | Double] = js.undefined
  var proxy: js.UndefOr[String | ProxyConfigMap | ProxyConfigArray] = js.undefined
}

object DevServer {
  @scala.inline
  def apply(
    after: (/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler) => Unit = null,
    before: (/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler) => Unit = null,
    headers: StringDictionary[String] = null,
    historyApiFallback: Boolean | Options = null,
    host: String = null,
    hot: js.UndefOr[Boolean] = js.undefined,
    hotEntries: js.Array[String] = null,
    hotOnly: js.UndefOr[Boolean] = js.undefined,
    https: Boolean | ServerOptions = null,
    open: js.UndefOr[Boolean] = js.undefined,
    port: String | Double = null,
    proxy: String | ProxyConfigMap | ProxyConfigArray = null
  ): DevServer = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3(before))
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

