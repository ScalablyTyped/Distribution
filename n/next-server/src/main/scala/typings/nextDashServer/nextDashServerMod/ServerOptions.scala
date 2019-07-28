package typings.nextDashServer.nextDashServerMod

import typings.nextDashServer.nextDashConfigMod.NextConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to the Server constructor in Node.js.
  */
trait ServerOptions extends js.Object {
  var conf: js.UndefOr[NextConfig] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var staticMarkup: js.UndefOr[Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    conf: NextConfig = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    staticMarkup: js.UndefOr[Boolean] = js.undefined
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

