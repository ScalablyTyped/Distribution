package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrosoftStoreForBusinessAppAssignmentSettings extends MobileAppAssignmentSettings {
  // Whether or not to use device execution context for Microsoft Store for Business mobile app.
  var useDeviceContext: js.UndefOr[scala.Boolean] = js.undefined
}

object MicrosoftStoreForBusinessAppAssignmentSettings {
  @scala.inline
  def apply(useDeviceContext: js.UndefOr[scala.Boolean] = js.undefined): MicrosoftStoreForBusinessAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDeviceContext)) __obj.updateDynamic("useDeviceContext")(useDeviceContext)
    __obj.asInstanceOf[MicrosoftStoreForBusinessAppAssignmentSettings]
  }
}

