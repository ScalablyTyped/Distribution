package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventQueue extends js.Object {
  var animState: AnimationState = js.native
  var drainDisabled: Boolean = js.native
  var objects: js.Array[_] = js.native
  def clear(): Unit = js.native
  def complete(entry: TrackEntry): Unit = js.native
  def dispose(entry: TrackEntry): Unit = js.native
  def drain(): Unit = js.native
  def end(entry: TrackEntry): Unit = js.native
  def event(entry: TrackEntry, event: Event): Unit = js.native
  def interrupt(entry: TrackEntry): Unit = js.native
  def start(entry: TrackEntry): Unit = js.native
}

object EventQueue {
  @scala.inline
  def apply(
    animState: AnimationState,
    clear: () => Unit,
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    drain: () => Unit,
    drainDisabled: Boolean,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    objects: js.Array[_],
    start: TrackEntry => Unit
  ): EventQueue = {
    val __obj = js.Dynamic.literal(animState = animState.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), drain = js.Any.fromFunction0(drain), drainDisabled = drainDisabled.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), objects = objects.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[EventQueue]
  }
  @scala.inline
  implicit class EventQueueOps[Self <: EventQueue] (val x: Self) extends AnyVal {
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
    def setAnimState(value: AnimationState): Self = this.set("animState", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setComplete(value: TrackEntry => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setDispose(value: TrackEntry => Unit): Self = this.set("dispose", js.Any.fromFunction1(value))
    @scala.inline
    def setDrain(value: () => Unit): Self = this.set("drain", js.Any.fromFunction0(value))
    @scala.inline
    def setDrainDisabled(value: Boolean): Self = this.set("drainDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: TrackEntry => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setEvent(value: (TrackEntry, Event) => Unit): Self = this.set("event", js.Any.fromFunction2(value))
    @scala.inline
    def setInterrupt(value: TrackEntry => Unit): Self = this.set("interrupt", js.Any.fromFunction1(value))
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[_]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: TrackEntry => Unit): Self = this.set("start", js.Any.fromFunction1(value))
  }
  
}

