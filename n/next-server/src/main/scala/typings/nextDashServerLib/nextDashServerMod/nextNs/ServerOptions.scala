package typings
package nextDashServerLib.nextDashServerMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to the Server constructor in Node.js.
  */
trait ServerOptions extends js.Object {
  var conf: js.UndefOr[nextDashServerLib.nextDashConfigMod.NextConfig] = js.undefined
  var dev: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var staticMarkup: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    conf: nextDashServerLib.nextDashConfigMod.NextConfig = null,
    dev: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    staticMarkup: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (conf != null) __obj.updateDynamic("conf")(conf)
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (!js.isUndefined(staticMarkup)) __obj.updateDynamic("staticMarkup")(staticMarkup)
    __obj.asInstanceOf[ServerOptions]
  }
}

