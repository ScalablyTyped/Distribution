package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// DesktopCapture
////////////////////
/**
  * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
  * Availability: Since Chrome 34.
  * Permissions:  "desktopCapture"
  */
@JSGlobal("chrome.desktopCapture")
@js.native
object desktopCaptureNs extends js.Object {
  def cancelChooseDesktopMedia(desktopMediaRequestId: scala.Double): scala.Unit = js.native
  def chooseDesktopMedia(
    sources: js.Array[java.lang.String],
    callback: js.Function1[/* streamId */ java.lang.String, scala.Unit]
  ): scala.Double = js.native
  def chooseDesktopMedia(
    sources: js.Array[java.lang.String],
    targetTab: chromeLib.chromeNs.tabsNs.Tab,
    callback: js.Function1[/* streamId */ java.lang.String, scala.Unit]
  ): scala.Double = js.native
}

