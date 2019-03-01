package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDAStarFinderOptions extends FinderOptions {
  var timeLimit: js.UndefOr[scala.Double] = js.undefined
  var trackRecursion: js.UndefOr[scala.Boolean] = js.undefined
}

object IDAStarFinderOptions {
  @scala.inline
  def apply(
    diagonalMovement: DiagonalMovement = null,
    heuristic: js.Function2[/* dx */ scala.Double, /* dy */ scala.Double, scala.Double] = null,
    timeLimit: scala.Int | scala.Double = null,
    trackRecursion: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement)
    if (heuristic != null) __obj.updateDynamic("heuristic")(heuristic)
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(trackRecursion)) __obj.updateDynamic("trackRecursion")(trackRecursion)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
}

