package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPermissionDescriptor
  extends PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.push] {
  /**
    * Indicates whether you want to show a notification for every message
    * or be able to send silent push
    * notifications. The default is `false`. Not supported in Firefox.
    */
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PushPermissionDescriptor {
  @scala.inline
  def apply(
    name: navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.push,
    userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly)
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
}

