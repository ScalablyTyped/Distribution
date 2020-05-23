package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDAStarFinderOptions extends FinderOptions {
  var timeLimit: js.UndefOr[Double] = js.undefined
  var trackRecursion: js.UndefOr[Boolean] = js.undefined
}

object IDAStarFinderOptions {
  @scala.inline
  def apply(
    diagonalMovement: DiagonalMovement = null,
    heuristic: (/* dx */ Double, /* dy */ Double) => Double = null,
    timeLimit: js.UndefOr[Double] = js.undefined,
    trackRecursion: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    if (!js.isUndefined(timeLimit)) __obj.updateDynamic("timeLimit")(timeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackRecursion)) __obj.updateDynamic("trackRecursion")(trackRecursion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
}

