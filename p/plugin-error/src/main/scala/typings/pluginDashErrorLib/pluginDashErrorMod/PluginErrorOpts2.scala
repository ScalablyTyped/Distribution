package typings
package pluginDashErrorLib.pluginDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginErrorOpts2 extends PluginErrorOpts {
  /**
    * If you pass an error object as the message the stack will be pulled from that, otherwise one will be created.
    */
  var message: js.UndefOr[java.lang.String | stdLib.Error] = js.undefined
}

object PluginErrorOpts2 {
  @scala.inline
  def apply(
    message: java.lang.String | stdLib.Error = null,
    showProperties: js.UndefOr[scala.Boolean] = js.undefined,
    showStack: js.UndefOr[scala.Boolean] = js.undefined
  ): PluginErrorOpts2 = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties)
    if (!js.isUndefined(showStack)) __obj.updateDynamic("showStack")(showStack)
    __obj.asInstanceOf[PluginErrorOpts2]
  }
}

