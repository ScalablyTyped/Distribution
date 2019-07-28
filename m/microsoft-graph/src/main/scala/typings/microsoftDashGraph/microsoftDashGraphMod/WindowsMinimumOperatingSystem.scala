package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsMinimumOperatingSystem extends js.Object {
  // Windows version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.undefined
  // Windows version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.undefined
  // Windows version 8.1 or later.
  var v8_1: js.UndefOr[Boolean] = js.undefined
}

object WindowsMinimumOperatingSystem {
  @scala.inline
  def apply(
    v10_0: js.UndefOr[Boolean] = js.undefined,
    v8_0: js.UndefOr[Boolean] = js.undefined,
    v8_1: js.UndefOr[Boolean] = js.undefined
  ): WindowsMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(v10_0)) __obj.updateDynamic("v10_0")(v10_0)
    if (!js.isUndefined(v8_0)) __obj.updateDynamic("v8_0")(v8_0)
    if (!js.isUndefined(v8_1)) __obj.updateDynamic("v8_1")(v8_1)
    __obj.asInstanceOf[WindowsMinimumOperatingSystem]
  }
}

