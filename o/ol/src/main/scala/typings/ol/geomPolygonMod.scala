package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object geomPolygonMod extends js.Object {
  @js.native
  trait Polygon
    extends typings.ol.geomSimpleGeometryMod.default {
    def appendLinearRing(linearRing: typings.ol.geomLinearRingMod.default): Unit = js.native
    def getArea(): Double = js.native
    def getEnds(): js.Array[Double] = js.native
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    def getInteriorPoint(): typings.ol.geomPointMod.default = js.native
    def getLinearRing(index: Double): typings.ol.geomLinearRingMod.default = js.native
    def getLinearRingCount(): Double = js.native
    def getLinearRings(): js.Array[typings.ol.geomLinearRingMod.default] = js.native
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  }
  
  @js.native
  class default protected () extends Polygon {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
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

