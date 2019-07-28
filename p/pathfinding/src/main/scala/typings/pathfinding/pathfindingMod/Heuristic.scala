package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heuristic extends js.Object {
  var heuristic: js.UndefOr[js.Function2[/* dx */ Double, /* dy */ Double, Double]] = js.undefined
}

object Heuristic {
  @scala.inline
  def apply(heuristic: (/* dx */ Double, /* dy */ Double) => Double = null): Heuristic = {
    val __obj = js.Dynamic.literal()
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    __obj.asInstanceOf[Heuristic]
  }
}

