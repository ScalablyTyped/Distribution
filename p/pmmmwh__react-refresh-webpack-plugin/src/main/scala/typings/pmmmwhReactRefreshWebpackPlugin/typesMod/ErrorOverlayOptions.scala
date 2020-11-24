package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.anon._empty
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wds
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.whm
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorOverlayOptions extends js.Object {
  
  /**
    * Path to a JS file that sets up the error overlay integration.
    */
  var entry: js.UndefOr[String | `false`] = js.native
  
  /**
    * The error overlay module to use.
    */
  var module: js.UndefOr[String | `false`] = js.native
  
  /**
    * The socket host to use (WDS only).
    */
  var sockHost: js.UndefOr[String] = js.native
  
  /**
    * Path to a JS file that sets up the Webpack socket integration.
    */
  var sockIntegration: js.UndefOr[`false` | (String with _empty) | wds | whm | wps] = js.native
  
  /**
    * The socket path to use (WDS only).
    */
  var sockPath: js.UndefOr[String] = js.native
  
  /**
    * The socket port to use (WDS only).
    */
  var sockPort: js.UndefOr[Double] = js.native
  
  /**
    * Uses a custom SocketJS implementation for older versions of webpack-dev-server.
    */
  var useLegacyWDSSockets: js.UndefOr[Boolean] = js.native
}
object ErrorOverlayOptions {
  
  @scala.inline
  def apply(): ErrorOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOverlayOptions]
  }
  
  @scala.inline
  implicit class ErrorOverlayOptionsOps[Self <: ErrorOverlayOptions] (val x: Self) extends AnyVal {
    
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
    def setEntry(value: String | `false`): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setModule(value: String | `false`): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setSockHost(value: String): Self = this.set("sockHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockHost: Self = this.set("sockHost", js.undefined)
    
    @scala.inline
    def setSockIntegration(value: `false` | (String with _empty) | wds | whm | wps): Self = this.set("sockIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockIntegration: Self = this.set("sockIntegration", js.undefined)
    
    @scala.inline
    def setSockPath(value: String): Self = this.set("sockPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockPath: Self = this.set("sockPath", js.undefined)
    
    @scala.inline
    def setSockPort(value: Double): Self = this.set("sockPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockPort: Self = this.set("sockPort", js.undefined)
    
    @scala.inline
    def setUseLegacyWDSSockets(value: Boolean): Self = this.set("useLegacyWDSSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLegacyWDSSockets: Self = this.set("useLegacyWDSSockets", js.undefined)
  }
}
