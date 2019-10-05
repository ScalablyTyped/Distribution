package typings.naverDashWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.LocationSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.LocationSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

