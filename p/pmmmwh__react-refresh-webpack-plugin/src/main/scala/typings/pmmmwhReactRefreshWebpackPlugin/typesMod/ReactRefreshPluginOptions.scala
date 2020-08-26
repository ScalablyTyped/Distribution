package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactRefreshPluginOptions extends js.Object {
  /**
    * Disables detection of react-refresh's Babel plugin (Deprecated since v0.3.0).
    */
  var disableRefreshCheck: js.UndefOr[Boolean] = js.native
  /**
    * Files to explicitly exclude from processing.
    */
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
    * Enables the plugin forcefully.
    */
  var forceEnable: js.UndefOr[Boolean] = js.native
  /**
    * Files to explicitly include for processing.
    */
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: js.UndefOr[Boolean | ErrorOverlayOptions] = js.native
  /**
    * Uses a custom SocketJS implementation for older versions of webpack-dev-server.
    */
  var useLegacyWDSSockets: js.UndefOr[Boolean] = js.native
}

object ReactRefreshPluginOptions {
  @scala.inline
  def apply(): ReactRefreshPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactRefreshPluginOptions]
  }
  @scala.inline
  implicit class ReactRefreshPluginOptionsOps[Self <: ReactRefreshPluginOptions] (val x: Self) extends AnyVal {
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
    def setDisableRefreshCheck(value: Boolean): Self = this.set("disableRefreshCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRefreshCheck: Self = this.set("disableRefreshCheck", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setForceEnable(value: Boolean): Self = this.set("forceEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceEnable: Self = this.set("forceEnable", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setOverlay(value: Boolean | ErrorOverlayOptions): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setUseLegacyWDSSockets(value: Boolean): Self = this.set("useLegacyWDSSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLegacyWDSSockets: Self = this.set("useLegacyWDSSockets", js.undefined)
  }
  
}

