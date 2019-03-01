package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldOptions extends js.Object {
  var broadphase: js.UndefOr[Broadphase] = js.undefined
  var gravity: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var islandSplit: js.UndefOr[scala.Boolean] = js.undefined
  var solver: js.UndefOr[Solver] = js.undefined
}

object WorldOptions {
  @scala.inline
  def apply(
    broadphase: Broadphase = null,
    gravity: js.Tuple2[scala.Double, scala.Double] = null,
    islandSplit: js.UndefOr[scala.Boolean] = js.undefined,
    solver: Solver = null
  ): WorldOptions = {
    val __obj = js.Dynamic.literal()
    if (broadphase != null) __obj.updateDynamic("broadphase")(broadphase)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (!js.isUndefined(islandSplit)) __obj.updateDynamic("islandSplit")(islandSplit)
    if (solver != null) __obj.updateDynamic("solver")(solver)
    __obj.asInstanceOf[WorldOptions]
  }
}

