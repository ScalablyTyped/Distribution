package typings.naverDashWhale.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsContentSetting
  extends typings.chrome.chromeNs.contentSettingsNs.ContentSetting {
  def set(details: typings.chrome.chromeNs.contentSettingsNs.NotificationsSetDetails): Unit = js.native
  def set(
    details: typings.chrome.chromeNs.contentSettingsNs.NotificationsSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

