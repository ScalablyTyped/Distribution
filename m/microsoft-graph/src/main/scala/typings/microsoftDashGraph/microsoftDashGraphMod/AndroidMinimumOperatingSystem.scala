package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidMinimumOperatingSystem extends js.Object {
  // Version 4.0 or later.
  var v4_0: js.UndefOr[Boolean] = js.undefined
  // Version 4.0.3 or later.
  var v4_0_3: js.UndefOr[Boolean] = js.undefined
  // Version 4.1 or later.
  var v4_1: js.UndefOr[Boolean] = js.undefined
  // Version 4.2 or later.
  var v4_2: js.UndefOr[Boolean] = js.undefined
  // Version 4.3 or later.
  var v4_3: js.UndefOr[Boolean] = js.undefined
  // Version 4.4 or later.
  var v4_4: js.UndefOr[Boolean] = js.undefined
  // Version 5.0 or later.
  var v5_0: js.UndefOr[Boolean] = js.undefined
  // Version 5.1 or later.
  var v5_1: js.UndefOr[Boolean] = js.undefined
}

object AndroidMinimumOperatingSystem {
  @scala.inline
  def apply(
    v4_0: js.UndefOr[Boolean] = js.undefined,
    v4_0_3: js.UndefOr[Boolean] = js.undefined,
    v4_1: js.UndefOr[Boolean] = js.undefined,
    v4_2: js.UndefOr[Boolean] = js.undefined,
    v4_3: js.UndefOr[Boolean] = js.undefined,
    v4_4: js.UndefOr[Boolean] = js.undefined,
    v5_0: js.UndefOr[Boolean] = js.undefined,
    v5_1: js.UndefOr[Boolean] = js.undefined
  ): AndroidMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(v4_0)) __obj.updateDynamic("v4_0")(v4_0.asInstanceOf[js.Any])
    if (!js.isUndefined(v4_0_3)) __obj.updateDynamic("v4_0_3")(v4_0_3.asInstanceOf[js.Any])
    if (!js.isUndefined(v4_1)) __obj.updateDynamic("v4_1")(v4_1.asInstanceOf[js.Any])
    if (!js.isUndefined(v4_2)) __obj.updateDynamic("v4_2")(v4_2.asInstanceOf[js.Any])
    if (!js.isUndefined(v4_3)) __obj.updateDynamic("v4_3")(v4_3.asInstanceOf[js.Any])
    if (!js.isUndefined(v4_4)) __obj.updateDynamic("v4_4")(v4_4.asInstanceOf[js.Any])
    if (!js.isUndefined(v5_0)) __obj.updateDynamic("v5_0")(v5_0.asInstanceOf[js.Any])
    if (!js.isUndefined(v5_1)) __obj.updateDynamic("v5_1")(v5_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidMinimumOperatingSystem]
  }
}

