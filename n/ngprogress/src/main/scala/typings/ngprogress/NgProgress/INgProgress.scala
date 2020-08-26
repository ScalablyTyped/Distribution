package typings.ngprogress.NgProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgProgress extends js.Object {
  def color(color: String): Unit = js.native
  def complete(): Unit = js.native
  def height(height: String): Unit = js.native
  def reset(): Unit = js.native
  def set(value: Double): Unit = js.native
  def start(): Unit = js.native
  def status(): Double = js.native
  def stop(): Unit = js.native
}

object INgProgress {
  @scala.inline
  def apply(
    color: String => Unit,
    complete: () => Unit,
    height: String => Unit,
    reset: () => Unit,
    set: Double => Unit,
    start: () => Unit,
    status: () => Double,
    stop: () => Unit
  ): INgProgress = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color), complete = js.Any.fromFunction0(complete), height = js.Any.fromFunction1(height), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[INgProgress]
  }
  @scala.inline
  implicit class INgProgressOps[Self <: INgProgress] (val x: Self) extends AnyVal {
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
    def setColor(value: String => Unit): Self = this.set("color", js.Any.fromFunction1(value))
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: String => Unit): Self = this.set("height", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: Double => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: () => Double): Self = this.set("status", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

