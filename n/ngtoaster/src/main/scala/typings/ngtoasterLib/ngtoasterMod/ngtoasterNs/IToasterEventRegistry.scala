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
    setup: js.Function0[scala.Unit],
    subscribeToClearToastsEvent: js.Function1[IToastEventListener, scala.Unit],
    subscribeToNewToastEvent: js.Function1[IToastEventListener, scala.Unit],
    unsubscribeToClearToastsEvent: js.Function1[IToastEventListener, scala.Unit],
    unsubscribeToNewToastEvent: js.Function1[IToastEventListener, scala.Unit]
  ): IToasterEventRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setup")(setup)
    __obj.updateDynamic("subscribeToClearToastsEvent")(subscribeToClearToastsEvent)
    __obj.updateDynamic("subscribeToNewToastEvent")(subscribeToNewToastEvent)
    __obj.updateDynamic("unsubscribeToClearToastsEvent")(unsubscribeToClearToastsEvent)
    __obj.updateDynamic("unsubscribeToNewToastEvent")(unsubscribeToNewToastEvent)
    __obj.asInstanceOf[IToasterEventRegistry]
  }
}

