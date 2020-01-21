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
    timeLimit: Int | Double = null,
    trackRecursion: js.UndefOr[Boolean] = js.undefined,
    weight: Int | Double = null
  ): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(trackRecursion)) __obj.updateDynamic("trackRecursion")(trackRecursion.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
}

