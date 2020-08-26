package typings.mina.mina

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinaAnimation extends js.Object {
  var id: String = js.native
  def duration(): Double = js.native
  def easing(): Double = js.native
  def speed(): Double = js.native
  def status(): Double = js.native
  def stop(): Unit = js.native
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
  @scala.inline
  implicit class MinaAnimationOps[Self <: MinaAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: () => Double): Self = this.set("duration", js.Any.fromFunction0(value))
    @scala.inline
    def setEasing(value: () => Double): Self = this.set("easing", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: () => Double): Self = this.set("speed", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: () => Double): Self = this.set("status", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

