package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateListener2 extends js.Object {
  def complete(entry: TrackEntry): Unit = js.native
  def dispose(entry: TrackEntry): Unit = js.native
  def end(entry: TrackEntry): Unit = js.native
  def event(entry: TrackEntry, event: Event): Unit = js.native
  def interrupt(entry: TrackEntry): Unit = js.native
  def start(entry: TrackEntry): Unit = js.native
}

object AnimationStateListener2 {
  @scala.inline
  def apply(
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    start: TrackEntry => Unit
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[AnimationStateListener2]
  }
  @scala.inline
  implicit class AnimationStateListener2Ops[Self <: AnimationStateListener2] (val x: Self) extends AnyVal {
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
    def setComplete(value: TrackEntry => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setDispose(value: TrackEntry => Unit): Self = this.set("dispose", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: TrackEntry => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setEvent(value: (TrackEntry, Event) => Unit): Self = this.set("event", js.Any.fromFunction2(value))
    @scala.inline
    def setInterrupt(value: TrackEntry => Unit): Self = this.set("interrupt", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: TrackEntry => Unit): Self = this.set("start", js.Any.fromFunction1(value))
  }
  
}

