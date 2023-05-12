package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import typings.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomGeometryMod {
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for vector geometries.
    *
    * To get notified of changes to the geometry, register a listener for the
    * generic `change` event on your geometry instance.
    *
    * @abstract
    * @api
    */
  @JSImport("ol/geom/Geometry", JSImport.Default)
  @js.native
  open class default () extends Geometry
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for vector geometries.
    *
    * To get notified of changes to the geometry, register a listener for the
    * generic `change` event on your geometry instance.
    *
    * @abstract
    * @api
    */
  @js.native
  trait Geometry
    extends typings.ol.objectMod.default {
    
    /**
      * Apply a transform function to the coordinates of the geometry.
      * The geometry is modified in place.
      * If you do not want the geometry modified in place, first `clone()` it and
      * then use this function on the clone.
      * @abstract
      * @param {import("../proj.js").TransformFunction} transformFn Transform function.
      * Called with a flat array of geometry coordinates.
      */
    def applyTransform(transformFn: TransformFunction): Unit = js.native
    
    /**
      * @abstract
      * @param {number} x X.
      * @param {number} y Y.
      * @param {import("../coordinate.js").Coordinate} closestPoint Closest point.
      * @param {number} minSquaredDistance Minimum squared distance.
      * @return {number} Minimum squared distance.
      */
    def closestPointXY(x: Double, y: Double, closestPoint: Coordinate, minSquaredDistance: Double): Double = js.native
    
    /**
      * @abstract
      * @param {import("../extent.js").Extent} extent Extent.
      * @protected
      * @return {import("../extent.js").Extent} extent Extent.
      */
    /* protected */ def computeExtent(extent: Extent): Extent = js.native
    
    /**
      * @param {number} x X.
      * @param {number} y Y.
      * @return {boolean} Contains (x, y).
      */
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var extentRevision_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var extent_ : Any = js.native
    
    /**
      * Return the closest point of the geometry to the passed point as
      * {@link module:ol/coordinate~Coordinate coordinate}.
      * @param {import("../coordinate.js").Coordinate} point Point.
      * @param {import("../coordinate.js").Coordinate} [closestPoint] Closest point.
      * @return {import("../coordinate.js").Coordinate} Closest point.
      * @api
      */
    def getClosestPoint(point: Coordinate): Coordinate = js.native
    def getClosestPoint(point: Coordinate, closestPoint: Coordinate): Coordinate = js.native
    
    /**
      * Get the extent of the geometry.
      * @param {import("../extent.js").Extent} [extent] Extent.
      * @return {import("../extent.js").Extent} extent Extent.
      * @api
      */
    def getExtent(): Extent = js.native
    def getExtent(extent: Extent): Extent = js.native
    
    /**
      * Create a simplified version of this geometry using the Douglas Peucker
      * algorithm.
      * See https://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm.
      * @abstract
      * @param {number} squaredTolerance Squared tolerance.
      * @return {Geometry} Simplified geometry.
      */
    def getSimplifiedGeometry(squaredTolerance: Double): Geometry = js.native
    
    /**
      * Get the type of this geometry.
      * @abstract
      * @return {Type} Geometry type.
      */
    def getType(): Type = js.native
    
    /**
      * Returns true if this geometry includes the specified coordinate. If the
      * coordinate is on the boundary of the geometry, returns false.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @return {boolean} Contains coordinate.
      * @api
      */
    def intersectsCoordinate(coordinate: Coordinate): Boolean = js.native
    
    /**
      * Test if the geometry and the passed extent intersect.
      * @abstract
      * @param {import("../extent.js").Extent} extent Extent.
      * @return {boolean} `true` if the geometry and the extent intersect.
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    
    /**
      * Rotate the geometry around a given coordinate. This modifies the geometry
      * coordinates in place.
      * @abstract
      * @param {number} angle Rotation angle in radians.
      * @param {import("../coordinate.js").Coordinate} anchor The rotation center.
      * @api
      */
    def rotate(angle: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * Scale the geometry (with an optional origin).  This modifies the geometry
      * coordinates in place.
      * @abstract
      * @param {number} sx The scaling factor in the x-direction.
      * @param {number} [sy] The scaling factor in the y-direction (defaults to sx).
      * @param {import("../coordinate.js").Coordinate} [anchor] The scale origin (defaults to the center
      *     of the geometry extent).
      * @api
      */
    def scale(sx: Double): Unit = js.native
    def scale(sx: Double, sy: Double): Unit = js.native
    def scale(sx: Double, sy: Double, anchor: Coordinate): Unit = js.native
    def scale(sx: Double, sy: Unit, anchor: Coordinate): Unit = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var simplifiedGeometryMaxMinSquaredTolerance: Double = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var simplifiedGeometryRevision: Double = js.native
    
    /**
      * Create a simplified version of this geometry.  For linestrings, this uses
      * the [Douglas Peucker](https://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm)
      * algorithm.  For polygons, a quantization-based
      * simplification is used to preserve topology.
      * @param {number} tolerance The tolerance distance for simplification.
      * @return {Geometry} A new, simplified version of the original geometry.
      * @api
      */
    def simplify(tolerance: Double): Geometry = js.native
    
    /**
      * Get a transformed and simplified version of the geometry.
      * @abstract
      * @param {number} squaredTolerance Squared tolerance.
      * @param {import("../proj.js").TransformFunction} [transform] Optional transform function.
      * @return {Geometry} Simplified geometry.
      */
    def simplifyTransformed(squaredTolerance: Double): Geometry = js.native
    def simplifyTransformed(squaredTolerance: Double, transform: TransformFunction): Geometry = js.native
    
    /**
      * Get a transformed and simplified version of the geometry.
      * @abstract
      * @param {number} revision The geometry revision.
      * @param {number} squaredTolerance Squared tolerance.
      * @param {import("../proj.js").TransformFunction} [transform] Optional transform function.
      * @return {Geometry} Simplified geometry.
      */
    def simplifyTransformedInternal(arg0: Any*): Any = js.native
    
    /**
      * Transform each coordinate of the geometry from one coordinate reference
      * system to another. The geometry is modified in place.
      * For example, a line will be transformed to a line and a circle to a circle.
      * If you do not want the geometry modified in place, first `clone()` it and
      * then use this function on the clone.
      *
      * @param {import("../proj.js").ProjectionLike} source The current projection.  Can be a
      *     string identifier or a {@link module:ol/proj/Projection~Projection} object.
      * @param {import("../proj.js").ProjectionLike} destination The desired projection.  Can be a
      *     string identifier or a {@link module:ol/proj/Projection~Projection} object.
      * @return {Geometry} This geometry.  Note that original geometry is
      *     modified in place.
      * @api
      */
    def transform(source: ProjectionLike, destination: ProjectionLike): Geometry = js.native
    
    /**
      * Translate the geometry.  This modifies the geometry coordinates in place.  If
      * instead you want a new geometry, first `clone()` this geometry.
      * @abstract
      * @param {number} deltaX Delta X.
      * @param {number} deltaY Delta Y.
      * @api
      */
    def translate(deltaX: Double, deltaY: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.XY
    - typings.ol.olStrings.XYZ
    - typings.ol.olStrings.XYM
    - typings.ol.olStrings.XYZM
  */
  trait GeometryLayout extends StObject
  object GeometryLayout {
    
    inline def XY: typings.ol.olStrings.XY = "XY".asInstanceOf[typings.ol.olStrings.XY]
    
    inline def XYM: typings.ol.olStrings.XYM = "XYM".asInstanceOf[typings.ol.olStrings.XYM]
    
    inline def XYZ: typings.ol.olStrings.XYZ = "XYZ".asInstanceOf[typings.ol.olStrings.XYZ]
    
    inline def XYZM: typings.ol.olStrings.XYZM = "XYZM".asInstanceOf[typings.ol.olStrings.XYZM]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.Point
    - typings.ol.olStrings.LineString
    - typings.ol.olStrings.LinearRing
    - typings.ol.olStrings.Polygon
    - typings.ol.olStrings.MultiPoint
    - typings.ol.olStrings.MultiLineString
    - typings.ol.olStrings.MultiPolygon
    - typings.ol.olStrings.GeometryCollection
    - typings.ol.olStrings.Circle
  */
  trait Type extends StObject
  object Type {
    
    inline def Circle: typings.ol.olStrings.Circle = "Circle".asInstanceOf[typings.ol.olStrings.Circle]
    
    inline def GeometryCollection: typings.ol.olStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typings.ol.olStrings.GeometryCollection]
    
    inline def LineString: typings.ol.olStrings.LineString = "LineString".asInstanceOf[typings.ol.olStrings.LineString]
    
    inline def LinearRing: typings.ol.olStrings.LinearRing = "LinearRing".asInstanceOf[typings.ol.olStrings.LinearRing]
    
    inline def MultiLineString: typings.ol.olStrings.MultiLineString = "MultiLineString".asInstanceOf[typings.ol.olStrings.MultiLineString]
    
    inline def MultiPoint: typings.ol.olStrings.MultiPoint = "MultiPoint".asInstanceOf[typings.ol.olStrings.MultiPoint]
    
    inline def MultiPolygon: typings.ol.olStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typings.ol.olStrings.MultiPolygon]
    
    inline def Point: typings.ol.olStrings.Point = "Point".asInstanceOf[typings.ol.olStrings.Point]
    
    inline def Polygon: typings.ol.olStrings.Polygon = "Polygon".asInstanceOf[typings.ol.olStrings.Polygon]
  }
}
