package typings
package olLib.sphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/sphere", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getArea(geometry: olLib.geomGeometryMod.default): scala.Double = js.native
  def getArea(geometry: olLib.geomGeometryMod.default, opt_options: SphereMetricOptions): scala.Double = js.native
  def getDistance(c1: js.Array[_], c2: js.Array[_]): scala.Double = js.native
  def getDistance(c1: js.Array[_], c2: js.Array[_], opt_radius: scala.Double): scala.Double = js.native
  def getLength(geometry: olLib.geomGeometryMod.default): scala.Double = js.native
  def getLength(geometry: olLib.geomGeometryMod.default, opt_options: SphereMetricOptions): scala.Double = js.native
  def offset(c1: olLib.coordinateMod.Coordinate, distance: scala.Double, bearing: scala.Double): olLib.coordinateMod.Coordinate = js.native
  def offset(
    c1: olLib.coordinateMod.Coordinate,
    distance: scala.Double,
    bearing: scala.Double,
    opt_radius: scala.Double
  ): olLib.coordinateMod.Coordinate = js.native
}

