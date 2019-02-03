package typings
package openjscadLib.CAGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG.Side")
@js.native
class Side protected ()
  extends openjscadLib.CxG {
  def this(vertex0: Vertex, vertex1: Vertex) = this()
  var tag: scala.Double = js.native
  var vertex0: Vertex = js.native
  var vertex1: Vertex = js.native
  def direction(): openjscadLib.CSGNs.Vector2D = js.native
  def flipped(): Side = js.native
  def getTag(): scala.Double = js.native
  def length(): scala.Double = js.native
  def lengthSquared(): scala.Double = js.native
  def toPolygon3D(z0: js.Any, z1: js.Any): openjscadLib.CSGNs.Polygon = js.native
}

/* static members */
@JSGlobal("CAG.Side")
@js.native
object Side extends js.Object {
  def _fromFakePolygon(polygon: openjscadLib.CSGNs.Polygon): openjscadLib.CAGNs.Side = js.native
}

