package typings.naverWhale.whale.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.idle.queryState")
@js.native
object queryState extends js.Object {
  def apply(
    detectionIntervalInSeconds: Double,
    callback: js.Function1[/* newState */ typings.chrome.chrome.idle.IdleState, Unit]
  ): Unit = js.native
}

