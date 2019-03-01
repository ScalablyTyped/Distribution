package typings
package mockeryLib.mockeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockeryEnableArgs extends js.Object {
  var useCleanCache: js.UndefOr[scala.Boolean] = js.undefined
  var warnOnReplace: js.UndefOr[scala.Boolean] = js.undefined
  var warnOnUnregistered: js.UndefOr[scala.Boolean] = js.undefined
}

object MockeryEnableArgs {
  @scala.inline
  def apply(
    useCleanCache: js.UndefOr[scala.Boolean] = js.undefined,
    warnOnReplace: js.UndefOr[scala.Boolean] = js.undefined,
    warnOnUnregistered: js.UndefOr[scala.Boolean] = js.undefined
  ): MockeryEnableArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useCleanCache)) __obj.updateDynamic("useCleanCache")(useCleanCache)
    if (!js.isUndefined(warnOnReplace)) __obj.updateDynamic("warnOnReplace")(warnOnReplace)
    if (!js.isUndefined(warnOnUnregistered)) __obj.updateDynamic("warnOnUnregistered")(warnOnUnregistered)
    __obj.asInstanceOf[MockeryEnableArgs]
  }
}

