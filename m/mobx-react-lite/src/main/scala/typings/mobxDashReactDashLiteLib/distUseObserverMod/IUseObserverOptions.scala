package typings
package mobxDashReactDashLiteLib.distUseObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUseObserverOptions extends js.Object {
  var useForceUpdate: js.UndefOr[ForceUpdateHook] = js.undefined
}

object IUseObserverOptions {
  @scala.inline
  def apply(useForceUpdate: ForceUpdateHook = null): IUseObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (useForceUpdate != null) __obj.updateDynamic("useForceUpdate")(useForceUpdate)
    __obj.asInstanceOf[IUseObserverOptions]
  }
}

