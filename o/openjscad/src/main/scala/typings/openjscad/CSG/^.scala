package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG")
@js.native
object ^ extends js.Object {
  var defaultResolution2D: Double = js.native
  var defaultResolution3D: Double = js.native
  var staticTag: Double = js.native
  def fromCompactBinary(bin: js.Any): typings.openjscad.CSG = js.native
  def fromObject(obj: js.Any): typings.openjscad.CSG = js.native
  def fromPolygons(polygons: js.Array[Polygon]): typings.openjscad.CSG = js.native
  def fromSlices(options: js.Any): typings.openjscad.CSG = js.native
}

