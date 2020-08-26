package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var onEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onPause: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onResume: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onStop: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var pitch: js.UndefOr[Double] = js.native
  var startTime: js.UndefOr[Double] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object Duration {
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setOnEnd(value: /* repeated */ js.Any => _): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnPause(value: /* repeated */ js.Any => _): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: /* repeated */ js.Any => _): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnResume(value: /* repeated */ js.Any => _): Self = this.set("onResume", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResume: Self = this.set("onResume", js.undefined)
    @scala.inline
    def setOnStop(value: /* repeated */ js.Any => _): Self = this.set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

