package typings
package mobxDashReactDashLiteLib.distObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverOptions extends js.Object {
  val forwardRef: js.UndefOr[scala.Boolean] = js.undefined
}

object IObserverOptions {
  @scala.inline
  def apply(forwardRef: js.UndefOr[scala.Boolean] = js.undefined): IObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef)
    __obj.asInstanceOf[IObserverOptions]
  }
}

