package typings.pmmmwhReactRefreshWebpackPlugin.typesMod

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOverrides extends js.Object {
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: `false` | NormalizedErrorOverlayOptions
}

object OverlayOverrides {
  @scala.inline
  def apply(overlay: `false` | NormalizedErrorOverlayOptions): OverlayOverrides = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOverrides]
  }
}

