package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesContentSetting
  extends chromeLib.chromeNs.contentSettingsNs.ContentSetting {
  def set(details: chromeLib.chromeNs.contentSettingsNs.ImagesSetDetails): scala.Unit = js.native
  def set(details: chromeLib.chromeNs.contentSettingsNs.ImagesSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

