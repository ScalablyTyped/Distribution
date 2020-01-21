package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouselockContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.MouselockSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.MouselockSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

