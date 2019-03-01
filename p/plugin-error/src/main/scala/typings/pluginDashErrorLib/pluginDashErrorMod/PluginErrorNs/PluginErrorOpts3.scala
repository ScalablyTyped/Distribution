package typings
package pluginDashErrorLib.pluginDashErrorMod.PluginErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginErrorOpts3 extends PluginErrorOpts2 {
  /**
    * The name of the plugin
    */
  var plugin: js.UndefOr[java.lang.String] = js.undefined
}

object PluginErrorOpts3 {
  @scala.inline
  def apply(
    message: java.lang.String | stdLib.Error = null,
    plugin: java.lang.String = null,
    showProperties: js.UndefOr[scala.Boolean] = js.undefined,
    showStack: js.UndefOr[scala.Boolean] = js.undefined
  ): PluginErrorOpts3 = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties)
    if (!js.isUndefined(showStack)) __obj.updateDynamic("showStack")(showStack)
    __obj.asInstanceOf[PluginErrorOpts3]
  }
}

