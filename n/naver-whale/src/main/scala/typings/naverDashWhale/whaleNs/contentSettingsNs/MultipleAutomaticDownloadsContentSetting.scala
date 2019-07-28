package typings.naverDashWhale.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleAutomaticDownloadsContentSetting
  extends typings.chrome.chromeNs.contentSettingsNs.ContentSetting {
  def set(details: typings.chrome.chromeNs.contentSettingsNs.MultipleAutomaticDownloadsSetDetails): Unit = js.native
  def set(
    details: typings.chrome.chromeNs.contentSettingsNs.MultipleAutomaticDownloadsSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

