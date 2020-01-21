package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldOptions extends js.Object {
  var broadphase: js.UndefOr[Broadphase] = js.undefined
  var gravity: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var islandSplit: js.UndefOr[Boolean] = js.undefined
  var solver: js.UndefOr[Solver] = js.undefined
}

object WorldOptions {
  @scala.inline
  def apply(
    broadphase: Broadphase = null,
    gravity: js.Tuple2[Double, Double] = null,
    islandSplit: js.UndefOr[Boolean] = js.undefined,
    solver: Solver = null
  ): WorldOptions = {
    val __obj = js.Dynamic.literal()
    if (broadphase != null) __obj.updateDynamic("broadphase")(broadphase.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(islandSplit)) __obj.updateDynamic("islandSplit")(islandSplit.asInstanceOf[js.Any])
    if (solver != null) __obj.updateDynamic("solver")(solver.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldOptions]
  }
}

