package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map permission names to correctly typed descriptors.
trait QueryNameDescriptorMap extends js.Object {
  // ??? Question ???:
  // Is there a better way to handle this case and remove repeated code,
  // something like
  // <N extends PermissionName, D extends PermissionDescriptor<N>> {
  //   [n in N]: D; // this line to cover all basic cases
  //   // and the custom permission descriptors for midi and push
  // }
  var accelerometer: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.accelerometer]
  var `accessibility-events`: PermissionDescriptor[
    navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`accessibility-events`
  ]
  var `ambient-light-sensor`: PermissionDescriptor[
    navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`ambient-light-sensor`
  ]
  var `background-sync`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`background-sync`]
  var camera: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.camera]
  var `clipboard-read`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`clipboard-read`]
  var `clipboard-write`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`clipboard-write`]
  var geolocation: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.geolocation]
  var gyroscope: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.gyroscope]
  var magnetometer: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.magnetometer]
  var microphone: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.microphone]
  // These permission descriptors support extra properties
  var midi: MidiPermissionDescriptor
  var notifications: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.notifications]
  var `payment-handler`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`payment-handler`]
  var `persistent-storage`: PermissionDescriptor[
    navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`persistent-storage`
  ]
  var push: PushPermissionDescriptor
}

