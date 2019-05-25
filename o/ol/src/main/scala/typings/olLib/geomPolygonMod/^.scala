package typings
package olLib.geomPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def circular(center: olLib.coordinateMod.Coordinate, radius: scala.Double): Polygon = js.native
  def circular(center: olLib.coordinateMod.Coordinate, radius: scala.Double, opt_n: scala.Double): Polygon = js.native
  def circular(
    center: olLib.coordinateMod.Coordinate,
    radius: scala.Double,
    opt_n: scala.Double,
    opt_sphereRadius: scala.Double
  ): Polygon = js.native
  def fromCircle(circle: olLib.geomCircleMod.default): Polygon = js.native
  def fromCircle(circle: olLib.geomCircleMod.default, opt_sides: scala.Double): Polygon = js.native
  def fromCircle(circle: olLib.geomCircleMod.default, opt_sides: scala.Double, opt_angle: scala.Double): Polygon = js.native
  def fromExtent(extent: olLib.extentMod.Extent): Polygon = js.native
  def makeRegular(polygon: Polygon, center: olLib.coordinateMod.Coordinate, radius: scala.Double): scala.Unit = js.native
  def makeRegular(
    polygon: Polygon,
    center: olLib.coordinateMod.Coordinate,
    radius: scala.Double,
    opt_angle: scala.Double
  ): scala.Unit = js.native
}

