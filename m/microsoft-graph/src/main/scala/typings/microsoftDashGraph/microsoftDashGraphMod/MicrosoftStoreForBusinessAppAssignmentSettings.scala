package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrosoftStoreForBusinessAppAssignmentSettings extends MobileAppAssignmentSettings {
  // Whether or not to use device execution context for Microsoft Store for Business mobile app.
  var useDeviceContext: js.UndefOr[Boolean] = js.undefined
}

object MicrosoftStoreForBusinessAppAssignmentSettings {
  @scala.inline
  def apply(useDeviceContext: js.UndefOr[Boolean] = js.undefined): MicrosoftStoreForBusinessAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDeviceContext)) __obj.updateDynamic("useDeviceContext")(useDeviceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrosoftStoreForBusinessAppAssignmentSettings]
  }
}

