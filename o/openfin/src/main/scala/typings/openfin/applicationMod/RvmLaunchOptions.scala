package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RvmLaunchOptions extends js.Object {
  var noUi: js.UndefOr[Boolean] = js.undefined
  var userAppConfigArgs: js.UndefOr[js.Object] = js.undefined
}

object RvmLaunchOptions {
  @scala.inline
  def apply(noUi: js.UndefOr[Boolean] = js.undefined, userAppConfigArgs: js.Object = null): RvmLaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noUi)) __obj.updateDynamic("noUi")(noUi.asInstanceOf[js.Any])
    if (userAppConfigArgs != null) __obj.updateDynamic("userAppConfigArgs")(userAppConfigArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RvmLaunchOptions]
  }
}

