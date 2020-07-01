package typings.phoenixLiveView.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewHookInterface extends js.Object {
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var el: HTMLElement
  // callbacks
  var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var viewName: String
  def pushEvent(event: String, payload: js.Object): Unit
  def pushEventTo(phxTarget: js.Any, event: String, payload: js.Object): Unit
}

object ViewHookInterface {
  @scala.inline
  def apply(
    el: HTMLElement,
    pushEvent: (String, js.Object) => Unit,
    pushEventTo: (js.Any, String, js.Object) => Unit,
    viewName: String,
    beforeDestroy: () => Unit = null,
    beforeUpdate: () => Unit = null,
    connected: () => Unit = null,
    destroyed: () => Unit = null,
    disconnected: () => Unit = null,
    mounted: () => Unit = null,
    updated: () => Unit = null
  ): ViewHookInterface = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], pushEvent = js.Any.fromFunction2(pushEvent), pushEventTo = js.Any.fromFunction3(pushEventTo), viewName = viewName.asInstanceOf[js.Any])
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction0(beforeDestroy))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction0(beforeUpdate))
    if (connected != null) __obj.updateDynamic("connected")(js.Any.fromFunction0(connected))
    if (destroyed != null) __obj.updateDynamic("destroyed")(js.Any.fromFunction0(destroyed))
    if (disconnected != null) __obj.updateDynamic("disconnected")(js.Any.fromFunction0(disconnected))
    if (mounted != null) __obj.updateDynamic("mounted")(js.Any.fromFunction0(mounted))
    if (updated != null) __obj.updateDynamic("updated")(js.Any.fromFunction0(updated))
    __obj.asInstanceOf[ViewHookInterface]
  }
}

