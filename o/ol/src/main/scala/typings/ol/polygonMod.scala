package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  @JSImport("ol/geom/Polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/geom/Polygon", JSImport.Default)
  @js.native
  open class default protected () extends Polygon {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: Unit, opt_ends: js.Array[Double]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  inline def circular(center: Coordinate, radius: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def circular(center: Coordinate, radius: Double, opt_n: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], opt_n.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def circular(center: Coordinate, radius: Double, opt_n: Double, opt_sphereRadius: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], opt_n.asInstanceOf[js.Any], opt_sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def circular(center: Coordinate, radius: Double, opt_n: Unit, opt_sphereRadius: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], opt_n.asInstanceOf[js.Any], opt_sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def fromCircle(circle: typings.ol.circleMod.default): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def fromCircle(circle: typings.ol.circleMod.default, opt_sides: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], opt_sides.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def fromCircle(circle: typings.ol.circleMod.default, opt_sides: Double, opt_angle: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def fromCircle(circle: typings.ol.circleMod.default, opt_sides: Unit, opt_angle: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def fromExtent(extent: Extent): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  
  inline def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegular")(polygon.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, opt_angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegular")(polygon.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
}
