package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosMinimumOperatingSystem extends js.Object {
  // Version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.undefined
  // Version 11.0 or later.
  var v11_0: js.UndefOr[Boolean] = js.undefined
  // Version 12.0 or later.
  var v12_0: js.UndefOr[Boolean] = js.undefined
  // Version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.undefined
  // Version 9.0 or later.
  var v9_0: js.UndefOr[Boolean] = js.undefined
}

object IosMinimumOperatingSystem {
  @scala.inline
  def apply(
    v10_0: js.UndefOr[Boolean] = js.undefined,
    v11_0: js.UndefOr[Boolean] = js.undefined,
    v12_0: js.UndefOr[Boolean] = js.undefined,
    v8_0: js.UndefOr[Boolean] = js.undefined,
    v9_0: js.UndefOr[Boolean] = js.undefined
  ): IosMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(v10_0)) __obj.updateDynamic("v10_0")(v10_0)
    if (!js.isUndefined(v11_0)) __obj.updateDynamic("v11_0")(v11_0)
    if (!js.isUndefined(v12_0)) __obj.updateDynamic("v12_0")(v12_0)
    if (!js.isUndefined(v8_0)) __obj.updateDynamic("v8_0")(v8_0)
    if (!js.isUndefined(v9_0)) __obj.updateDynamic("v9_0")(v9_0)
    __obj.asInstanceOf[IosMinimumOperatingSystem]
  }
}

