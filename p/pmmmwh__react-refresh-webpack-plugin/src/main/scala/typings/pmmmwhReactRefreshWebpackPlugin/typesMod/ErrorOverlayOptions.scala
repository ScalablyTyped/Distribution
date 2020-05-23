package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wds
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.whm
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wps
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOverlayOptions extends js.Object {
  /**
    * Path to a JS file that sets up the error overlay integration.
    */
  var entry: js.UndefOr[String] = js.undefined
  /**
    * The error overlay module to use.
    */
  var module: js.UndefOr[String] = js.undefined
  /**
    * The socket host to use (WDS only).
    */
  var sockHost: js.UndefOr[String] = js.undefined
  /**
    * Path to a JS file that sets up the Webpack socket integration.
    */
  var sockIntegration: js.UndefOr[LiteralUnion[wds | whm | wps, String]] = js.undefined
  /**
    * The socket path to use (WDS only).
    */
  var sockPath: js.UndefOr[String] = js.undefined
  /**
    * The socket port to use (WDS only).
    */
  var sockPort: js.UndefOr[Double] = js.undefined
}

object ErrorOverlayOptions {
  @scala.inline
  def apply(
    entry: String = null,
    module: String = null,
    sockHost: String = null,
    sockIntegration: LiteralUnion[wds | whm | wps, String] = null,
    sockPath: String = null,
    sockPort: js.UndefOr[Double] = js.undefined
  ): ErrorOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (sockHost != null) __obj.updateDynamic("sockHost")(sockHost.asInstanceOf[js.Any])
    if (sockIntegration != null) __obj.updateDynamic("sockIntegration")(sockIntegration.asInstanceOf[js.Any])
    if (sockPath != null) __obj.updateDynamic("sockPath")(sockPath.asInstanceOf[js.Any])
    if (!js.isUndefined(sockPort)) __obj.updateDynamic("sockPort")(sockPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOverlayOptions]
  }
}

