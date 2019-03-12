package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterEventRegistry extends js.Object {
  def setup(): scala.Unit
  def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): scala.Unit
  def subscribeToNewToastEvent(onNewToast: IToastEventListener): scala.Unit
  def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): scala.Unit
  def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): scala.Unit
}

object IToasterEventRegistry {
  @scala.inline
  def apply(
    setup: () => scala.Unit,
    subscribeToClearToastsEvent: IToastEventListener => scala.Unit,
    subscribeToNewToastEvent: IToastEventListener => scala.Unit,
    unsubscribeToClearToastsEvent: IToastEventListener => scala.Unit,
    unsubscribeToNewToastEvent: IToastEventListener => scala.Unit
  ): IToasterEventRegistry = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction0(setup), subscribeToClearToastsEvent = js.Any.fromFunction1(subscribeToClearToastsEvent), subscribeToNewToastEvent = js.Any.fromFunction1(subscribeToNewToastEvent), unsubscribeToClearToastsEvent = js.Any.fromFunction1(unsubscribeToClearToastsEvent), unsubscribeToNewToastEvent = js.Any.fromFunction1(unsubscribeToNewToastEvent))
  
    __obj.asInstanceOf[IToasterEventRegistry]
  }
}

