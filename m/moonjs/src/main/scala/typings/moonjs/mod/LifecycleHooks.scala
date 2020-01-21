package typings.moonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleHooks extends js.Object {
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object LifecycleHooks {
  @scala.inline
  def apply(
    destroyed: () => Unit = null,
    init: () => Unit = null,
    mounted: () => Unit = null,
    updated: () => Unit = null
  ): LifecycleHooks = {
    val __obj = js.Dynamic.literal()
    if (destroyed != null) __obj.updateDynamic("destroyed")(js.Any.fromFunction0(destroyed))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (mounted != null) __obj.updateDynamic("mounted")(js.Any.fromFunction0(mounted))
    if (updated != null) __obj.updateDynamic("updated")(js.Any.fromFunction0(updated))
    __obj.asInstanceOf[LifecycleHooks]
  }
}

