package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayOverrides extends js.Object {
  
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: `false` | NormalizedErrorOverlayOptions = js.native
}
object OverlayOverrides {
  
  @scala.inline
  def apply(overlay: `false` | NormalizedErrorOverlayOptions): OverlayOverrides = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOverrides]
  }
  
  @scala.inline
  implicit class OverlayOverridesOps[Self <: OverlayOverrides] (val x: Self) extends AnyVal {
    
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
    def setOverlay(value: `false` | NormalizedErrorOverlayOptions): Self = this.set("overlay", value.asInstanceOf[js.Any])
  }
}
