package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpPointFinderBaseOptions extends Heuristic {
  var trackJumpRecursion: js.UndefOr[Boolean] = js.undefined
}

object JumpPointFinderBaseOptions {
  @scala.inline
  def apply(
    heuristic: (/* dx */ Double, /* dy */ Double) => Double = null,
    trackJumpRecursion: js.UndefOr[Boolean] = js.undefined
  ): JumpPointFinderBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    if (!js.isUndefined(trackJumpRecursion)) __obj.updateDynamic("trackJumpRecursion")(trackJumpRecursion)
    __obj.asInstanceOf[JumpPointFinderBaseOptions]
  }
}

