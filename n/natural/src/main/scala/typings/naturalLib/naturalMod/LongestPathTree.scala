package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "LongestPathTree")
@js.native
class LongestPathTree protected () extends js.Object {
  def this(diagraph: EdgeWeightedDigraph, startVertex: scala.Double) = this()
  def getDistTo(vertex: scala.Double): scala.Double = js.native
  def hasDistTo(vertex: scala.Double): scala.Boolean = js.native
  def pathTo(vertex: scala.Double): js.Array[scala.Double] = js.native
}

