package typings.ngtoaster.ngtoasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterEventRegistry extends js.Object {
  def setup(): Unit
  def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit
  def subscribeToNewToastEvent(onNewToast: IToastEventListener): Unit
  def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit
  def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): Unit
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
}

