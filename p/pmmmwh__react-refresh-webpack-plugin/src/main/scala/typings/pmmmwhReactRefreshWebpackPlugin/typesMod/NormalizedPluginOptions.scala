package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  forceEnable :boolean | undefined,   useLegacyWDSSockets :boolean | undefined,   include :string | std.RegExp | std.Array<string | std.RegExp>,   exclude :string | std.RegExp | std.Array<string | std.RegExp>}, 'include' | 'exclude' | 'forceEnable' | 'useLegacyWDSSockets'> & @pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/types.OverlayOverrides */
@js.native
trait NormalizedPluginOptions extends js.Object {
  var exclude: String | RegExp | (js.Array[String | RegExp]) = js.native
  var forceEnable: js.UndefOr[Boolean] = js.native
  var include: String | RegExp | (js.Array[String | RegExp]) = js.native
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: `false` | NormalizedErrorOverlayOptions = js.native
  var useLegacyWDSSockets: js.UndefOr[Boolean] = js.native
}

object NormalizedPluginOptions {
  @scala.inline
  def apply(
    exclude: String | RegExp | (js.Array[String | RegExp]),
    include: String | RegExp | (js.Array[String | RegExp]),
    overlay: `false` | NormalizedErrorOverlayOptions
  ): NormalizedPluginOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedPluginOptions]
  }
  @scala.inline
  implicit class NormalizedPluginOptionsOps[Self <: NormalizedPluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlay(value: `false` | NormalizedErrorOverlayOptions): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceEnable(value: Boolean): Self = this.set("forceEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceEnable: Self = this.set("forceEnable", js.undefined)
    @scala.inline
    def setUseLegacyWDSSockets(value: Boolean): Self = this.set("useLegacyWDSSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLegacyWDSSockets: Self = this.set("useLegacyWDSSockets", js.undefined)
  }
  
}

