package typings.mobxDashReactDashLite.distUseObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUseObserverOptions extends js.Object {
  var useForceUpdate: js.UndefOr[ForceUpdateHook] = js.undefined
}

object IUseObserverOptions {
  @scala.inline
  def apply(useForceUpdate: () => js.Function0[Unit] = null): IUseObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (useForceUpdate != null) __obj.updateDynamic("useForceUpdate")(js.Any.fromFunction0(useForceUpdate))
    __obj.asInstanceOf[IUseObserverOptions]
  }
}

