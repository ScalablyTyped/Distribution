package typings.mina.mina

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinaAnimation extends js.Object {
  var id: String
  def duration(): Double
  def easing(): Double
  def speed(): Double
  def status(): Double
  def stop(): Unit
}

object MinaAnimation {
  @scala.inline
  def apply(
    duration: () => Double,
    easing: () => Double,
    id: String,
    speed: () => Double,
    status: () => Double,
    stop: () => Unit
  ): MinaAnimation = {
    val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), easing = js.Any.fromFunction0(easing), id = id.asInstanceOf[js.Any], speed = js.Any.fromFunction0(speed), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MinaAnimation]
  }
}

