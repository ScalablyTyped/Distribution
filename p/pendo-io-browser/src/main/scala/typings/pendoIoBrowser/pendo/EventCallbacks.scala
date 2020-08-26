package typings.pendoIoBrowser.pendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCallbacks extends js.Object {
  var guidesFailed: js.UndefOr[js.Function0[Unit]] = js.native
  var guidesLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object EventCallbacks {
  @scala.inline
  def apply(): EventCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCallbacks]
  }
  @scala.inline
  implicit class EventCallbacksOps[Self <: EventCallbacks] (val x: Self) extends AnyVal {
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
    def setGuidesFailed(value: () => Unit): Self = this.set("guidesFailed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGuidesFailed: Self = this.set("guidesFailed", js.undefined)
    @scala.inline
    def setGuidesLoaded(value: () => Unit): Self = this.set("guidesLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGuidesLoaded: Self = this.set("guidesLoaded", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

