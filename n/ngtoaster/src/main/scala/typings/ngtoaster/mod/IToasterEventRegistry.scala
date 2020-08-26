package typings.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToasterEventRegistry extends js.Object {
  def setup(): Unit = js.native
  def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit = js.native
  def subscribeToNewToastEvent(onNewToast: IToastEventListener): Unit = js.native
  def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit = js.native
  def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): Unit = js.native
}

object IToasterEventRegistry {
  @scala.inline
  def apply(
    setup: () => Unit,
    subscribeToClearToastsEvent: IToastEventListener => Unit,
    subscribeToNewToastEvent: IToastEventListener => Unit,
    unsubscribeToClearToastsEvent: IToastEventListener => Unit,
    unsubscribeToNewToastEvent: IToastEventListener => Unit
  ): IToasterEventRegistry = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction0(setup), subscribeToClearToastsEvent = js.Any.fromFunction1(subscribeToClearToastsEvent), subscribeToNewToastEvent = js.Any.fromFunction1(subscribeToNewToastEvent), unsubscribeToClearToastsEvent = js.Any.fromFunction1(unsubscribeToClearToastsEvent), unsubscribeToNewToastEvent = js.Any.fromFunction1(unsubscribeToNewToastEvent))
    __obj.asInstanceOf[IToasterEventRegistry]
  }
  @scala.inline
  implicit class IToasterEventRegistryOps[Self <: IToasterEventRegistry] (val x: Self) extends AnyVal {
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
    def setSetup(value: () => Unit): Self = this.set("setup", js.Any.fromFunction0(value))
    @scala.inline
    def setSubscribeToClearToastsEvent(value: IToastEventListener => Unit): Self = this.set("subscribeToClearToastsEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscribeToNewToastEvent(value: IToastEventListener => Unit): Self = this.set("subscribeToNewToastEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setUnsubscribeToClearToastsEvent(value: IToastEventListener => Unit): Self = this.set("unsubscribeToClearToastsEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setUnsubscribeToNewToastEvent(value: IToastEventListener => Unit): Self = this.set("unsubscribeToNewToastEvent", js.Any.fromFunction1(value))
  }
  
}

