package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseUnitsDetail extends js.Object {
  /** The number of units that are enabled. */
  var enabled: js.UndefOr[scala.Double] = js.undefined
  /** The number of units that are suspended. */
  var suspended: js.UndefOr[scala.Double] = js.undefined
  /** The number of units that are in warning status. */
  var warning: js.UndefOr[scala.Double] = js.undefined
}

object LicenseUnitsDetail {
  @scala.inline
  def apply(
    enabled: scala.Int | scala.Double = null,
    suspended: scala.Int | scala.Double = null,
    warning: scala.Int | scala.Double = null
  ): LicenseUnitsDetail = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (suspended != null) __obj.updateDynamic("suspended")(suspended.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseUnitsDetail]
  }
}

