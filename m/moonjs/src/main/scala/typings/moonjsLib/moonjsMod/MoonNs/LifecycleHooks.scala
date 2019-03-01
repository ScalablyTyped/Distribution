package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleHooks extends js.Object {
  var destroyed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var mounted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var updated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object LifecycleHooks {
  @scala.inline
  def apply(
    destroyed: js.Function0[scala.Unit] = null,
    init: js.Function0[scala.Unit] = null,
    mounted: js.Function0[scala.Unit] = null,
    updated: js.Function0[scala.Unit] = null
  ): LifecycleHooks = {
    val __obj = js.Dynamic.literal()
    if (destroyed != null) __obj.updateDynamic("destroyed")(destroyed)
    if (init != null) __obj.updateDynamic("init")(init)
    if (mounted != null) __obj.updateDynamic("mounted")(mounted)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[LifecycleHooks]
  }
}

