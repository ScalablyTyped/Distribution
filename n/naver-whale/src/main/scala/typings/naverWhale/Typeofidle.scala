package typings.naverWhale

import typings.chrome.chrome.idle.IdleState
import typings.chrome.chrome.idle.IdleStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofidle extends js.Object {
  var onStateChanged: IdleStateChangedEvent
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit
  def setDetectionInterval(intervalInSeconds: Double): Unit
}

object Typeofidle {
  @scala.inline
  def apply(
    getAutoLockDelay: js.Function1[/* delay */ Double, Unit] => Unit,
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit,
    setDetectionInterval: Double => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(getAutoLockDelay = js.Any.fromFunction1(getAutoLockDelay), onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
    __obj.asInstanceOf[Typeofidle]
  }
}

