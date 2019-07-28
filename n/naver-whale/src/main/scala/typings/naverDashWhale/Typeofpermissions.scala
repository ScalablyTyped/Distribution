package typings.naverDashWhale

import typings.chrome.chromeNs.permissionsNs.Permissions
import typings.chrome.chromeNs.permissionsNs.PermissionsAddedEvent
import typings.chrome.chromeNs.permissionsNs.PermissionsRemovedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpermissions extends js.Object {
  var onAdded: PermissionsAddedEvent = js.native
  var onRemoved: PermissionsRemovedEvent = js.native
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
  def remove(permissions: Permissions): Unit = js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
  def request(permissions: Permissions): Unit = js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
}

