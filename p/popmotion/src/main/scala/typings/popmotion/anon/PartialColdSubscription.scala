package typings.popmotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<popmotion.popmotion/lib/action/types.ColdSubscription> */
@js.native
trait PartialColdSubscription extends js.Object {
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialColdSubscription {
  @scala.inline
  def apply(): PartialColdSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColdSubscription]
  }
  @scala.inline
  implicit class PartialColdSubscriptionOps[Self <: PartialColdSubscription] (val x: Self) extends AnyVal {
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
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

