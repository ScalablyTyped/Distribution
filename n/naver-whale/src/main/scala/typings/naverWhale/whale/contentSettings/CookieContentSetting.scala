package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.CookieSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.CookieSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

