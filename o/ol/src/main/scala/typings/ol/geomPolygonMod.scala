package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomPolygonMod {
  
  @JSImport("ol/geom/Polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Polygon geometry.
    *
    * @api
    */
  @JSImport("ol/geom/Polygon", JSImport.Default)
  @js.native
  open class default protected () extends Polygon {
    /**
      * @param {!Array<Array<import("../coordinate.js").Coordinate>>|!Array<number>} coordinates
      *     Array of linear rings that define the polygon. The first linear ring of the
      *     array defines the outer-boundary or surface of the polygon. Each subsequent
      *     linear ring defines a hole in the surface of the polygon. A linear ring is
      *     an array of vertices' coordinates where the first coordinate and the last are
      *     equivalent. (For internal use, flat coordinates in combination with
      *     `layout` and `ends` are also accepted.)
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @param {Array<number>} [ends] Ends (for internal use with flat coordinates).
      */
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], layout: GeometryLayout) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], layout: Unit, ends: js.Array[Double]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      layout: GeometryLayout,
      ends: js.Array[Double]
    ) = this()
  }
  
  inline def circular(center: Coordinate, radius: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def circular(center: Coordinate, radius: Double, n: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def circular(center: Coordinate, radius: Double, n: Double, sphereRadius: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], n.asInstanceOf[js.Any], sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def circular(center: Coordinate, radius: Double, n: Unit, sphereRadius: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], n.asInstanceOf[js.Any], sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def fromCircle(circle: typings.ol.geomCircleMod.default): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def fromCircle(circle: typings.ol.geomCircleMod.default, sides: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], sides.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def fromCircle(circle: typings.ol.geomCircleMod.default, sides: Double, angle: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], sides.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def fromCircle(circle: typings.ol.geomCircleMod.default, sides: Unit, angle: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], sides.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def fromExtent(extent: Extent): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  
  inline def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegular")(polygon.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegular")(polygon.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @classdesc
    * Polygon geometry.
    *
    * @api
    */
  @js.native
  trait Polygon
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Append the passed linear ring to this polygon.
      * @param {LinearRing} linearRing Linear ring.
      * @api
      */
    def appendLinearRing(linearRing: typings.ol.geomLinearRingMod.default): Unit = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var ends_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var flatInteriorPointRevision_ : Any = js.native
    
    /**
      * @private
      * @type {import("../coordinate.js").Coordinate}
      */
    /* private */ var flatInteriorPoint_ : Any = js.native
    
    /**
      * Return the area of the polygon on projected plane.
      * @return {number} Area (on projected plane).
      * @api
      */
    def getArea(): Double = js.native
    
    def getCoordinates(right: Boolean): js.Array[js.Array[Coordinate]] = js.native
    
    /**
      * @return {Array<number>} Ends.
      */
    def getEnds(): js.Array[Double] = js.native
    
    /**
      * @return {Array<number>} Interior point.
      */
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    
    /**
      * Return an interior point of the polygon.
      * @return {Point} Interior point as XYM coordinate, where M is the
      * length of the horizontal intersection that the point belongs to.
      * @api
      */
    def getInteriorPoint(): typings.ol.geomPointMod.default = js.native
    
    /**
      * Return the Nth linear ring of the polygon geometry. Return `null` if the
      * given index is out of range.
      * The exterior linear ring is available at index `0` and the interior rings
      * at index `1` and beyond.
      *
      * @param {number} index Index.
      * @return {LinearRing|null} Linear ring.
      * @api
      */
    def getLinearRing(index: Double): typings.ol.geomLinearRingMod.default | Null = js.native
    
    /**
      * Return the number of rings of the polygon,  this includes the exterior
      * ring and any interior rings.
      *
      * @return {number} Number of rings.
      * @api
      */
    def getLinearRingCount(): Double = js.native
    
    /**
      * Return the linear rings of the polygon.
      * @return {Array<LinearRing>} Linear rings.
      * @api
      */
    def getLinearRings(): js.Array[typings.ol.geomLinearRingMod.default] = js.native
    
    /**
      * @return {Array<number>} Oriented flat coordinates.
      */
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDeltaRevision_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDelta_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var orientedFlatCoordinates_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var orientedRevision_ : Any = js.native
  }
}
