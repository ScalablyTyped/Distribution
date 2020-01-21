package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heuristic extends js.Object {
  var heuristic: js.UndefOr[js.Function2[/* dx */ Double, /* dy */ Double, Double]] = js.undefined
}

@JSImport("pathfinding", "Heuristic")
@js.native
object Heuristic extends js.Object {
  def chebyshev(dx: Double, dy: Double): Double = js.native
  def euclidean(dx: Double, dy: Double): Double = js.native
  def manhattan(dx: Double, dy: Double): Double = js.native
  def octile(dx: Double, dy: Double): Double = js.native
}

