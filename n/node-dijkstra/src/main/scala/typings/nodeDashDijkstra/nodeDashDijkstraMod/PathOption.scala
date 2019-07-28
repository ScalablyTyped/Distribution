package typings.nodeDashDijkstra.nodeDashDijkstraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOption extends js.Object {
  var avoid: js.UndefOr[js.Array[_]] = js.undefined
  var cost: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object PathOption {
  @scala.inline
  def apply(
    avoid: js.Array[_] = null,
    cost: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): PathOption = {
    val __obj = js.Dynamic.literal()
    if (avoid != null) __obj.updateDynamic("avoid")(avoid)
    if (!js.isUndefined(cost)) __obj.updateDynamic("cost")(cost)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[PathOption]
  }
}

