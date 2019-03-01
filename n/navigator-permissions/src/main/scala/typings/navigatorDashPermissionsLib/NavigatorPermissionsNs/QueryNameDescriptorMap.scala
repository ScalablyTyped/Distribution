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

object QueryNameDescriptorMap {
  @scala.inline
  def apply(
    accelerometer: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.accelerometer],
    `accessibility-events`: PermissionDescriptor[
      navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`accessibility-events`
    ],
    `ambient-light-sensor`: PermissionDescriptor[
      navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`ambient-light-sensor`
    ],
    `background-sync`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`background-sync`],
    camera: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.camera],
    `clipboard-read`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`clipboard-read`],
    `clipboard-write`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`clipboard-write`],
    geolocation: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.geolocation],
    gyroscope: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.gyroscope],
    magnetometer: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.magnetometer],
    microphone: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.microphone],
    midi: MidiPermissionDescriptor,
    notifications: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.notifications],
    `payment-handler`: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`payment-handler`],
    `persistent-storage`: PermissionDescriptor[
      navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`persistent-storage`
    ],
    push: PushPermissionDescriptor
  ): QueryNameDescriptorMap = {
    val __obj = js.Dynamic.literal(`accessibility-events` = `accessibility-events`, `ambient-light-sensor` = `ambient-light-sensor`, `background-sync` = `background-sync`, `clipboard-read` = `clipboard-read`, `clipboard-write` = `clipboard-write`, `payment-handler` = `payment-handler`, `persistent-storage` = `persistent-storage`)
    __obj.updateDynamic("accelerometer")(accelerometer)
    __obj.updateDynamic("camera")(camera)
    __obj.updateDynamic("geolocation")(geolocation)
    __obj.updateDynamic("gyroscope")(gyroscope)
    __obj.updateDynamic("magnetometer")(magnetometer)
    __obj.updateDynamic("microphone")(microphone)
    __obj.updateDynamic("midi")(midi)
    __obj.updateDynamic("notifications")(notifications)
    __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[QueryNameDescriptorMap]
  }
}

