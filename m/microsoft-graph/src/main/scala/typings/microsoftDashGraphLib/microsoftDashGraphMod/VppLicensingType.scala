package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VppLicensingType extends js.Object {
  /** Whether the program supports the device licensing type. */
  var supportsDeviceLicensing: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the program supports the user licensing type. */
  var supportsUserLicensing: js.UndefOr[scala.Boolean] = js.undefined
}

object VppLicensingType {
  @scala.inline
  def apply(
    supportsDeviceLicensing: js.UndefOr[scala.Boolean] = js.undefined,
    supportsUserLicensing: js.UndefOr[scala.Boolean] = js.undefined
  ): VppLicensingType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supportsDeviceLicensing)) __obj.updateDynamic("supportsDeviceLicensing")(supportsDeviceLicensing)
    if (!js.isUndefined(supportsUserLicensing)) __obj.updateDynamic("supportsUserLicensing")(supportsUserLicensing)
    __obj.asInstanceOf[VppLicensingType]
  }
}

