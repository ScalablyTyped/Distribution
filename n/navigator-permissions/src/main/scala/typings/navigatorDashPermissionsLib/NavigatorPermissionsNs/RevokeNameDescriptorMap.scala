package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeNameDescriptorMap extends js.Object {
  var geolocation: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.geolocation]
  var midi: MidiPermissionDescriptor
  var notifications: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.notifications]
  var push: PushPermissionDescriptor
}

object RevokeNameDescriptorMap {
  @scala.inline
  def apply(
    geolocation: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.geolocation],
    midi: MidiPermissionDescriptor,
    notifications: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.notifications],
    push: PushPermissionDescriptor
  ): RevokeNameDescriptorMap = {
    val __obj = js.Dynamic.literal(geolocation = geolocation, midi = midi, notifications = notifications, push = push)
  
    __obj.asInstanceOf[RevokeNameDescriptorMap]
  }
}

