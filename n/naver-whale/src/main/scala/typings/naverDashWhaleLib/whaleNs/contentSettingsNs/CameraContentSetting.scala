package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContentSetting
  extends chromeLib.chromeNs.contentSettingsNs.ContentSetting {
  def set(details: chromeLib.chromeNs.contentSettingsNs.CameraSetDetails): scala.Unit = js.native
  def set(details: chromeLib.chromeNs.contentSettingsNs.CameraSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

