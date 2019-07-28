package typings.ol.geomPolygonMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def circular(center: Coordinate, radius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double, opt_sphereRadius: Double): Polygon = js.native
  def fromCircle(circle: typings.ol.geomCircleMod.default): Polygon = js.native
  def fromCircle(circle: typings.ol.geomCircleMod.default, opt_sides: Double): Polygon = js.native
  def fromCircle(circle: typings.ol.geomCircleMod.default, opt_sides: Double, opt_angle: Double): Polygon = js.native
  def fromExtent(extent: Extent): Polygon = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, opt_angle: Double): Unit = js.native
}

