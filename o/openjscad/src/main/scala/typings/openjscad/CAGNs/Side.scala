package typings.openjscad.CAGNs

import typings.openjscad.CSGNs.Polygon
import typings.openjscad.CSGNs.Vector2D
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG.Side")
@js.native
class Side protected () extends CxG {
  def this(vertex0: Vertex, vertex1: Vertex) = this()
  var tag: Double = js.native
  var vertex0: Vertex = js.native
  var vertex1: Vertex = js.native
  def direction(): Vector2D = js.native
  def flipped(): Side = js.native
  def getTag(): Double = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def toPolygon3D(z0: js.Any, z1: js.Any): Polygon = js.native
}

/* static members */
@JSGlobal("CAG.Side")
@js.native
object Side extends js.Object {
  def _fromFakePolygon(polygon: Polygon): Side = js.native
}

