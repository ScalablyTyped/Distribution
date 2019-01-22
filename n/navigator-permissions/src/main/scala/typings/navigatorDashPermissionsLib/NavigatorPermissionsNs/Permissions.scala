package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Permissions` interface of the Permissions API provides the core
  * Permission API functionality, such as methods for querying and
  * revoking permissions.
  *
  * This is an experimental technology.
  *
  * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/Permissions}
  */
@js.native
trait Permissions extends js.Object {
  /**
    * The `Permissions.query()` method of the `Permissions` interface returns
    * the state of a user permission on the global scope.
    * @param permissionDescriptor object that sets
    * options for the query operation consisting of a comma-separated list
    * of name-value pairs.
    * (Is comma-separated list really supported? It is mentioned in the docs, but does not work).
    * @returns the user permission status for a given API.
    * @throws `TypeError` Retrieving the `PermissionDescriptor` information
    * failed in some way, or the permission doesn't exist or is currently
    * unsupported (e.g. `midi`, or `push` with `userVisibleOnly`).
    * @see  {@link https://developer.mozilla.org/en-US/docs/Web/API/Permissions/query}
    */
  def query(
    permissionDescriptor: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.accelerometer] | (PermissionDescriptor[
      navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`accessibility-events`
    ]) | (PermissionDescriptor[
      navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`ambient-light-sensor`
    ]) | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`background-sync`] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.camera] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`clipboard-read`] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`clipboard-write`] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.geolocation] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.gyroscope] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.magnetometer] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.microphone] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.notifications] | PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`payment-handler`] | (PermissionDescriptor[
      navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.`persistent-storage`
    ]) | MidiPermissionDescriptor | PushPermissionDescriptor
  ): js.Promise[PermissionStatus] = js.native
  def revoke(permissionDescriptor: MidiPermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def revoke(permissionDescriptor: PushPermissionDescriptor): js.Promise[PermissionStatus] = js.native
  /**
    * The `Permissions.revoke()` method of the `Permissions` interface reverts a
    * currently set permission back to its default state, which is usually `prompt`.
    *
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/Permissions/revoke}
    */
  @JSName("revoke")
  def revoke_geolocation(
    permissionDescriptor: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.geolocation]
  ): js.Promise[PermissionStatus] = js.native
  @JSName("revoke")
  def revoke_notifications(
    permissionDescriptor: PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.notifications]
  ): js.Promise[PermissionStatus] = js.native
}

