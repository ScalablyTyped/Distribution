package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionOptions extends js.Object {
  var direct: js.UndefOr[Boolean] = js.undefined
  var onLost: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ ILostContext, Unit]] = js.undefined
}

object IConnectionOptions {
  @scala.inline
  def apply(
    direct: js.UndefOr[Boolean] = js.undefined,
    onLost: (/* err */ js.Any, /* e */ ILostContext) => Unit = null
  ): IConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(direct)) __obj.updateDynamic("direct")(direct)
    if (onLost != null) __obj.updateDynamic("onLost")(js.Any.fromFunction2(onLost))
    __obj.asInstanceOf[IConnectionOptions]
  }
}

