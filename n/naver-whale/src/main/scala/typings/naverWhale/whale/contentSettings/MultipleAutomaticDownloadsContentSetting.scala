package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleAutomaticDownloadsContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.MultipleAutomaticDownloadsSetDetails): Unit = js.native
  def set(
    details: typings.chrome.chrome.contentSettings.MultipleAutomaticDownloadsSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

