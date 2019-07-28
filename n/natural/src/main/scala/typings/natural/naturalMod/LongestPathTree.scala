package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "LongestPathTree")
@js.native
class LongestPathTree protected () extends js.Object {
  def this(diagraph: EdgeWeightedDigraph, startVertex: Double) = this()
  def getDistTo(vertex: Double): Double = js.native
  def hasDistTo(vertex: Double): Boolean = js.native
  def pathTo(vertex: Double): js.Array[Double] = js.native
}

