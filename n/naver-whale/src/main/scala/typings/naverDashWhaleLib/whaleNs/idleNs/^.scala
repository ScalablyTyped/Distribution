package typings
package naverDashWhaleLib.whaleNs.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.idle")
@js.native
object ^ extends js.Object {
  var onStateChanged: chromeLib.chromeNs.idleNs.IdleStateChangedEvent = js.native
  def queryState(
    detectionIntervalInSeconds: scala.Double,
    callback: js.Function1[/* newState */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setDetectionInterval(intervalInSeconds: scala.Double): scala.Unit = js.native
}

