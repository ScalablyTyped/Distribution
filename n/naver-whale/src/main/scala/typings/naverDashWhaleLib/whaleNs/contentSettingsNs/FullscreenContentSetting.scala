package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenContentSetting
  extends chromeLib.chromeNs.contentSettingsNs.ContentSetting {
  def set(details: chromeLib.chromeNs.contentSettingsNs.FullscreenSetDetails): scala.Unit = js.native
  def set(
    details: chromeLib.chromeNs.contentSettingsNs.FullscreenSetDetails,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

