package typings.naverDashWhale.whaleNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications")
@js.native
object ^ extends js.Object {
  var onButtonClicked: typings.chrome.chromeNs.notificationsNs.NotificationButtonClickedEvent = js.native
  var onClicked: typings.chrome.chromeNs.notificationsNs.NotificationClickedEvent = js.native
  var onClosed: typings.chrome.chromeNs.notificationsNs.NotificationClosedEvent = js.native
  var onPermissionLevelChanged: typings.chrome.chromeNs.notificationsNs.NotificationPermissionLevelChangedEvent = js.native
  var onShowSettings: typings.chrome.chromeNs.notificationsNs.NotificationShowSettingsEvent = js.native
  def clear(notificationId: String): Unit = js.native
  def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def create(notificationId: String, options: typings.chrome.chromeNs.notificationsNs.NotificationOptions): Unit = js.native
  def create(
    notificationId: String,
    options: typings.chrome.chromeNs.notificationsNs.NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  def create(options: typings.chrome.chromeNs.notificationsNs.NotificationOptions): Unit = js.native
  def create(
    options: typings.chrome.chromeNs.notificationsNs.NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  def getAll(callback: js.Function1[/* notifications */ js.Object, Unit]): Unit = js.native
  def getPermissionLevel(callback: js.Function1[/* level */ String, Unit]): Unit = js.native
  def update(notificationId: String, options: typings.chrome.chromeNs.notificationsNs.NotificationOptions): Unit = js.native
  def update(
    notificationId: String,
    options: typings.chrome.chromeNs.notificationsNs.NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}

