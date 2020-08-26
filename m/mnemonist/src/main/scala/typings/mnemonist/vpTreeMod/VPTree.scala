package typings.mnemonist.vpTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPTree[T] extends js.Object {
  // Members
  @JSName("distance")
  var distance_Original: DistanceFunction[T] = js.native
  var size: Double = js.native
  // Members
  def distance(a: T, b: T): Double = js.native
  // Methods
  def nearestNeighbors(k: Double, query: T): js.Array[QueryMatch[T]] = js.native
  def neighbors(radius: Double, query: T): js.Array[QueryMatch[T]] = js.native
}

