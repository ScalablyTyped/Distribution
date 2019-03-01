package typings
package preactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebounceRendering extends js.Object {
  var debounceRendering: js.UndefOr[js.Function1[/* render */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  var event: js.UndefOr[js.Function1[/* event */ stdLib.Event, stdLib.Event]] = js.undefined
  var syncComponentUpdates: js.UndefOr[scala.Boolean] = js.undefined
  var vnode: js.UndefOr[js.Function1[/* vnode */ preactLib.preactMod.preactNs.VNode[_], scala.Unit]] = js.undefined
}

object Anon_DebounceRendering {
  @scala.inline
  def apply(
    debounceRendering: js.Function1[/* render */ js.Function0[scala.Unit], scala.Unit] = null,
    event: js.Function1[/* event */ stdLib.Event, stdLib.Event] = null,
    syncComponentUpdates: js.UndefOr[scala.Boolean] = js.undefined,
    vnode: js.Function1[/* vnode */ preactLib.preactMod.preactNs.VNode[_], scala.Unit] = null
  ): Anon_DebounceRendering = {
    val __obj = js.Dynamic.literal()
    if (debounceRendering != null) __obj.updateDynamic("debounceRendering")(debounceRendering)
    if (event != null) __obj.updateDynamic("event")(event)
    if (!js.isUndefined(syncComponentUpdates)) __obj.updateDynamic("syncComponentUpdates")(syncComponentUpdates)
    if (vnode != null) __obj.updateDynamic("vnode")(vnode)
    __obj.asInstanceOf[Anon_DebounceRendering]
  }
}

