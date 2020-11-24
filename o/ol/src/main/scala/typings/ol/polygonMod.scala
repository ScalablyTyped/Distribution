package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object polygonMod extends js.Object {
  
  def circular(center: Coordinate, radius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: js.UndefOr[scala.Nothing], opt_sphereRadius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double, opt_sphereRadius: Double): Polygon = js.native
  
  def fromCircle(circle: typings.ol.circleMod.default): Polygon = js.native
  def fromCircle(circle: typings.ol.circleMod.default, opt_sides: js.UndefOr[scala.Nothing], opt_angle: Double): Polygon = js.native
  def fromCircle(circle: typings.ol.circleMod.default, opt_sides: Double): Polygon = js.native
  def fromCircle(circle: typings.ol.circleMod.default, opt_sides: Double, opt_angle: Double): Polygon = js.native
  
  def fromExtent(extent: Extent): Polygon = js.native
  
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, opt_angle: Double): Unit = js.native
  
  @js.native
  trait Polygon
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Append the passed linear ring to this polygon.
      */
    def appendLinearRing(linearRing: typings.ol.linearRingMod.default): Unit = js.native
    
    /**
      * Return the area of the polygon on projected plane.
      */
    def getArea(): Double = js.native
    
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[Coordinate]] = js.native
    
    def getEnds(): js.Array[Double] = js.native
    
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    
    /**
      * Return an interior point of the polygon.
      */
    def getInteriorPoint(): typings.ol.pointMod.default = js.native
    
    /**
      * Return the Nth linear ring of the polygon geometry. Return null if the
      * given index is out of range.
      * The exterior linear ring is available at index 0 and the interior rings
      * at index 1 and beyond.
      */
    def getLinearRing(index: Double): typings.ol.linearRingMod.default = js.native
    
    /**
      * Return the number of rings of the polygon,  this includes the exterior
      * ring and any interior rings.
      */
    def getLinearRingCount(): Double = js.native
    
    /**
      * Return the linear rings of the polygon.
      */
    def getLinearRings(): js.Array[typings.ol.linearRingMod.default] = js.native
    
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  }
  
  @js.native
  class default protected () extends Polygon {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
}
