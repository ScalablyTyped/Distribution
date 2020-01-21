package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VppLicensingType extends js.Object {
  // Whether the program supports the device licensing type.
  var supportsDeviceLicensing: js.UndefOr[Boolean] = js.undefined
  // Whether the program supports the user licensing type.
  var supportsUserLicensing: js.UndefOr[Boolean] = js.undefined
}

object VppLicensingType {
  @scala.inline
  def apply(
    supportsDeviceLicensing: js.UndefOr[Boolean] = js.undefined,
    supportsUserLicensing: js.UndefOr[Boolean] = js.undefined
  ): VppLicensingType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supportsDeviceLicensing)) __obj.updateDynamic("supportsDeviceLicensing")(supportsDeviceLicensing.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsUserLicensing)) __obj.updateDynamic("supportsUserLicensing")(supportsUserLicensing.asInstanceOf[js.Any])
    __obj.asInstanceOf[VppLicensingType]
  }
}

