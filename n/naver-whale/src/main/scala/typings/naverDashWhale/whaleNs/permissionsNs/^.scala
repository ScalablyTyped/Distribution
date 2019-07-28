package typings.naverDashWhale.whaleNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions")
@js.native
object ^ extends js.Object {
  var onAdded: typings.chrome.chromeNs.permissionsNs.PermissionsAddedEvent = js.native
  var onRemoved: typings.chrome.chromeNs.permissionsNs.PermissionsRemovedEvent = js.native
  def contains(
    permissions: typings.chrome.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def getAll(callback: js.Function1[/* permissions */ typings.chrome.chromeNs.permissionsNs.Permissions, Unit]): Unit = js.native
  def remove(permissions: typings.chrome.chromeNs.permissionsNs.Permissions): Unit = js.native
  def remove(
    permissions: typings.chrome.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* removed */ Boolean, Unit]
  ): Unit = js.native
  def request(permissions: typings.chrome.chromeNs.permissionsNs.Permissions): Unit = js.native
  def request(
    permissions: typings.chrome.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* granted */ Boolean, Unit]
  ): Unit = js.native
}

