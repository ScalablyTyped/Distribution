package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  forceEnable ? :boolean | undefined,   useLegacyWDSSockets ? :boolean | undefined,   include  :string | std.RegExp | std.Array<string | std.RegExp>,   exclude  :string | std.RegExp | std.Array<string | std.RegExp>}, 'include' | 'exclude' | 'forceEnable' | 'useLegacyWDSSockets'> & @pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/types.OverlayOverrides */
trait NormalizedPluginOptions extends js.Object {
  var exclude: String | RegExp | (js.Array[String | RegExp])
  var forceEnable: js.UndefOr[Boolean] = js.undefined
  var include: String | RegExp | (js.Array[String | RegExp])
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: `false` | NormalizedErrorOverlayOptions
  var useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
}

object NormalizedPluginOptions {
  @scala.inline
  def apply(
    exclude: String | RegExp | (js.Array[String | RegExp]),
    include: String | RegExp | (js.Array[String | RegExp]),
    overlay: `false` | NormalizedErrorOverlayOptions,
    forceEnable: js.UndefOr[Boolean] = js.undefined,
    useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
  ): NormalizedPluginOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEnable)) __obj.updateDynamic("forceEnable")(forceEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacyWDSSockets)) __obj.updateDynamic("useLegacyWDSSockets")(useLegacyWDSSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedPluginOptions]
  }
}

