package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionOptions[C /* <: IClient */] extends js.Object {
  var direct: js.UndefOr[Boolean] = js.undefined
  var onLost: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ ILostContext[C], Unit]] = js.undefined
}

object IConnectionOptions {
  @scala.inline
  def apply[C /* <: IClient */](
    direct: js.UndefOr[Boolean] = js.undefined,
    onLost: (/* err */ js.Any, /* e */ ILostContext[C]) => Unit = null
  ): IConnectionOptions[C] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(direct)) __obj.updateDynamic("direct")(direct)
    if (onLost != null) __obj.updateDynamic("onLost")(js.Any.fromFunction2(onLost))
    __obj.asInstanceOf[IConnectionOptions[C]]
  }
}

