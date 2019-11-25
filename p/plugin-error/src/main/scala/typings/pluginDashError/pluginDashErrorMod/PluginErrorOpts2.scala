package typings.pluginDashError.pluginDashErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginErrorOpts2 extends PluginErrorOpts {
  /**
    * If you pass an error object as the message the stack will be pulled from that, otherwise one will be created.
    */
  var message: js.UndefOr[String | Error] = js.undefined
}

object PluginErrorOpts2 {
  @scala.inline
  def apply(
    message: String | Error = null,
    showProperties: js.UndefOr[Boolean] = js.undefined,
    showStack: js.UndefOr[Boolean] = js.undefined
  ): PluginErrorOpts2 = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(showStack)) __obj.updateDynamic("showStack")(showStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginErrorOpts2]
  }
}

