package typings
package minaLib.minaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinaAnimation extends js.Object {
  var id: java.lang.String
  def duration(): scala.Double
  def easing(): scala.Double
  def speed(): scala.Double
  def status(): scala.Double
  def stop(): scala.Unit
}

object MinaAnimation {
  @scala.inline
  def apply(
    duration: js.Function0[scala.Double],
    easing: js.Function0[scala.Double],
    id: java.lang.String,
    speed: js.Function0[scala.Double],
    status: js.Function0[scala.Double],
    stop: js.Function0[scala.Unit]
  ): MinaAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("easing")(easing)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[MinaAnimation]
  }
}

