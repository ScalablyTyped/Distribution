package typings.naverDashWhale.whaleNs.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.idle")
@js.native
object ^ extends js.Object {
  var onStateChanged: typings.chrome.chromeNs.idleNs.IdleStateChangedEvent = js.native
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ String, Unit]): Unit = js.native
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}

