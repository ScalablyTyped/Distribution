package typings.mobxDashReactDashLite.distObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverOptions extends js.Object {
  val forwardRef: js.UndefOr[Boolean] = js.undefined
}

object IObserverOptions {
  @scala.inline
  def apply(forwardRef: js.UndefOr[Boolean] = js.undefined): IObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObserverOptions]
  }
}

