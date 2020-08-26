package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateListener extends js.Object {
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, Unit]] = js.native
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
}

object AnimationStateListener {
  @scala.inline
  def apply(): AnimationStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStateListener]
  }
  @scala.inline
  implicit class AnimationStateListenerOps[Self <: AnimationStateListener] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* entry */ TrackEntry => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDispose(value: /* entry */ TrackEntry => Unit): Self = this.set("dispose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    @scala.inline
    def setEnd(value: /* entry */ TrackEntry => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEvent(value: (/* entry */ TrackEntry, /* event */ Event) => Unit): Self = this.set("event", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setInterrupt(value: /* entry */ TrackEntry => Unit): Self = this.set("interrupt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInterrupt: Self = this.set("interrupt", js.undefined)
    @scala.inline
    def setStart(value: /* entry */ TrackEntry => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

