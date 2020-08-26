package typings.popmotion.observerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialObserver extends _ObserverCandidate {
  var complete: js.UndefOr[Complete] = js.native
  var error: js.UndefOr[Error] = js.native
  var registerParent: js.UndefOr[js.Function] = js.native
  var update: js.UndefOr[Update] = js.native
}

object PartialObserver {
  @scala.inline
  def apply(): PartialObserver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObserver]
  }
  @scala.inline
  implicit class PartialObserverOps[Self <: PartialObserver] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => js.Any): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* err */ js.UndefOr[js.Any] => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setRegisterParent(value: js.Function): Self = this.set("registerParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterParent: Self = this.set("registerParent", js.undefined)
    @scala.inline
    def setUpdate(value: Update): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

