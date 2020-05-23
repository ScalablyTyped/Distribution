package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wds
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.whm
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wps
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedErrorOverlayOptions extends js.Object {
  /**
    * Path to a JS file that sets up the error overlay integration.
    */
  var entry: String
  /**
    * The error overlay module to use.
    */
  var module: String
  /**
    * The socket host to use (WDS only).
    */
  var sockHost: js.UndefOr[String] = js.undefined
  /**
    * Path to a JS file that sets up the Webpack socket integration.
    */
  var sockIntegration: LiteralUnion[wds | whm | wps, String]
  /**
    * The socket path to use (WDS only).
    */
  var sockPath: js.UndefOr[String] = js.undefined
  /**
    * The socket port to use (WDS only).
    */
  var sockPort: js.UndefOr[Double] = js.undefined
}

object NormalizedErrorOverlayOptions {
  @scala.inline
  def apply(
    entry: String,
    module: String,
    sockIntegration: LiteralUnion[wds | whm | wps, String],
    sockHost: String = null,
    sockPath: String = null,
    sockPort: js.UndefOr[Double] = js.undefined
  ): NormalizedErrorOverlayOptions = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], sockIntegration = sockIntegration.asInstanceOf[js.Any])
    if (sockHost != null) __obj.updateDynamic("sockHost")(sockHost.asInstanceOf[js.Any])
    if (sockPath != null) __obj.updateDynamic("sockPath")(sockPath.asInstanceOf[js.Any])
    if (!js.isUndefined(sockPort)) __obj.updateDynamic("sockPort")(sockPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedErrorOverlayOptions]
  }
}

