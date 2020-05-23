package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortCutConfig extends js.Object {
  var desktop: js.UndefOr[Boolean] = js.undefined
  var startMenu: js.UndefOr[Boolean] = js.undefined
  var systemStartup: js.UndefOr[Boolean] = js.undefined
}

object ShortCutConfig {
  @scala.inline
  def apply(
    desktop: js.UndefOr[Boolean] = js.undefined,
    startMenu: js.UndefOr[Boolean] = js.undefined,
    systemStartup: js.UndefOr[Boolean] = js.undefined
  ): ShortCutConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenu)) __obj.updateDynamic("startMenu")(startMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(systemStartup)) __obj.updateDynamic("systemStartup")(systemStartup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortCutConfig]
  }
}

