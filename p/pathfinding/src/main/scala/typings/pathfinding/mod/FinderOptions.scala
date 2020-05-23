package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderOptions extends Heuristic {
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object FinderOptions {
  @scala.inline
  def apply(
    diagonalMovement: DiagonalMovement = null,
    heuristic: (/* dx */ Double, /* dy */ Double) => Double = null,
    weight: js.UndefOr[Double] = js.undefined
  ): FinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderOptions]
  }
}

