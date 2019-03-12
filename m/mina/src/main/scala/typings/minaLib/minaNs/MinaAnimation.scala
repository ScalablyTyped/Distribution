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
    duration: () => scala.Double,
    easing: () => scala.Double,
    id: java.lang.String,
    speed: () => scala.Double,
    status: () => scala.Double,
    stop: () => scala.Unit
  ): MinaAnimation = {
    val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), easing = js.Any.fromFunction0(easing), id = id, speed = js.Any.fromFunction0(speed), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[MinaAnimation]
  }
}

