package typings.popmotion.scrubberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrubberSubscription extends js.Object {
  def seek(progress: Double): js.Any = js.native
}

object ScrubberSubscription {
  @scala.inline
  def apply(seek: Double => js.Any): ScrubberSubscription = {
    val __obj = js.Dynamic.literal(seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[ScrubberSubscription]
  }
  @scala.inline
  implicit class ScrubberSubscriptionOps[Self <: ScrubberSubscription] (val x: Self) extends AnyVal {
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
    def setSeek(value: Double => js.Any): Self = this.set("seek", js.Any.fromFunction1(value))
  }
  
}

