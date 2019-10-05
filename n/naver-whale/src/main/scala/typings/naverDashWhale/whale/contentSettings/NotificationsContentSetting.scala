package typings.naverDashWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.NotificationsSetDetails): Unit = js.native
  def set(
    details: typings.chrome.chrome.contentSettings.NotificationsSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

