package typings.mockery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockeryEnableArgs extends js.Object {
  var useCleanCache: js.UndefOr[Boolean] = js.undefined
  var warnOnReplace: js.UndefOr[Boolean] = js.undefined
  var warnOnUnregistered: js.UndefOr[Boolean] = js.undefined
}

object MockeryEnableArgs {
  @scala.inline
  def apply(
    useCleanCache: js.UndefOr[Boolean] = js.undefined,
    warnOnReplace: js.UndefOr[Boolean] = js.undefined,
    warnOnUnregistered: js.UndefOr[Boolean] = js.undefined
  ): MockeryEnableArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useCleanCache)) __obj.updateDynamic("useCleanCache")(useCleanCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnOnReplace)) __obj.updateDynamic("warnOnReplace")(warnOnReplace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnOnUnregistered)) __obj.updateDynamic("warnOnUnregistered")(warnOnUnregistered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockeryEnableArgs]
  }
}

