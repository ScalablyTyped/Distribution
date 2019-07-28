package typings.naverDashWhale.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrophoneContentSetting
  extends typings.chrome.chromeNs.contentSettingsNs.ContentSetting {
  def set(details: typings.chrome.chromeNs.contentSettingsNs.MicrophoneSetDetails): Unit = js.native
  def set(
    details: typings.chrome.chromeNs.contentSettingsNs.MicrophoneSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

