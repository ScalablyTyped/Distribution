package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiBreadthFirstFinderOptions extends js.Object {
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
}

object BiBreadthFirstFinderOptions {
  @scala.inline
  def apply(diagonalMovement: DiagonalMovement = null): BiBreadthFirstFinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement)
    __obj.asInstanceOf[BiBreadthFirstFinderOptions]
  }
}

