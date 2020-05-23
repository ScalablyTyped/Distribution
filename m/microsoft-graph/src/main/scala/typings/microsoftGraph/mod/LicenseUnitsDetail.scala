package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseUnitsDetail extends js.Object {
  // The number of units that are enabled.
  var enabled: js.UndefOr[Double] = js.undefined
  // The number of units that are suspended.
  var suspended: js.UndefOr[Double] = js.undefined
  // The number of units that are in warning status.
  var warning: js.UndefOr[Double] = js.undefined
}

object LicenseUnitsDetail {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Double] = js.undefined,
    suspended: js.UndefOr[Double] = js.undefined,
    warning: js.UndefOr[Double] = js.undefined
  ): LicenseUnitsDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseUnitsDetail]
  }
}

