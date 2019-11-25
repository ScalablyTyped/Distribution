package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosDeviceType extends js.Object {
  // Whether the app should run on iPads.
  var iPad: js.UndefOr[Boolean] = js.undefined
  // Whether the app should run on iPhones and iPods.
  var iPhoneAndIPod: js.UndefOr[Boolean] = js.undefined
}

object IosDeviceType {
  @scala.inline
  def apply(iPad: js.UndefOr[Boolean] = js.undefined, iPhoneAndIPod: js.UndefOr[Boolean] = js.undefined): IosDeviceType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iPad)) __obj.updateDynamic("iPad")(iPad.asInstanceOf[js.Any])
    if (!js.isUndefined(iPhoneAndIPod)) __obj.updateDynamic("iPhoneAndIPod")(iPhoneAndIPod.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosDeviceType]
  }
}

