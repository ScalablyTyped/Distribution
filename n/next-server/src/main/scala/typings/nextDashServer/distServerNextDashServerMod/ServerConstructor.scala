package typings.nextDashServer.distServerNextDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConstructor extends js.Object {
  /**
    * Object what you would use in next.config.js - @default {}
    */
  var conf: js.UndefOr[NextConfig] = js.undefined
  /**
    * Where the Next project is located - @default '.'
    */
  var dir: js.UndefOr[String] = js.undefined
  /**
    * Hide error messages containing server information - @default false
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  var staticMarkup: js.UndefOr[Boolean] = js.undefined
}

object ServerConstructor {
  @scala.inline
  def apply(
    conf: NextConfig = null,
    dir: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    staticMarkup: js.UndefOr[Boolean] = js.undefined
  ): ServerConstructor = {
    val __obj = js.Dynamic.literal()
    if (conf != null) __obj.updateDynamic("conf")(conf.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (!js.isUndefined(staticMarkup)) __obj.updateDynamic("staticMarkup")(staticMarkup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConstructor]
  }
}

