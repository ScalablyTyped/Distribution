package typings
package pluginDashErrorLib.pluginDashErrorMod.PluginErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PluginErrorOpts extends js.Object {
  /**
           * Error properties will be included in err.toString(), but may be omitted by including {showProperties: false} in the options
           */
  var showProperties: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * By default the stack will not be shown. Set options.showStack to true if you think the stack is important for your error.
           */
  var showStack: js.UndefOr[scala.Boolean] = js.undefined
}

