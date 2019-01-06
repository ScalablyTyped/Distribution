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

