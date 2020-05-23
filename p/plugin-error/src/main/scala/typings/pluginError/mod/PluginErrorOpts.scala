package typings.pluginError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginErrorOpts extends js.Object {
  /**
    * Error properties will be included in err.toString(), but may be omitted by including {showProperties: false} in the options
    */
  var showProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * By default the stack will not be shown. Set options.showStack to true if you think the stack is important for your error.
    */
  var showStack: js.UndefOr[Boolean] = js.undefined
}

object PluginErrorOpts {
  @scala.inline
  def apply(showProperties: js.UndefOr[Boolean] = js.undefined, showStack: js.UndefOr[Boolean] = js.undefined): PluginErrorOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showStack)) __obj.updateDynamic("showStack")(showStack.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginErrorOpts]
  }
}

