package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.geomGeometryTypeMod.GeometryType
import typings.ol.projMod.ProjectionLike
import typings.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomGeometryMod {
  
  /* note: abstract class */ @JSImport("ol/geom/Geometry", JSImport.Default)
  @js.native
  open class default () extends Geometry
  
  @js.native
  trait Geometry
    extends typings.ol.objectMod.default {
    
    /**
      * Apply a transform function to the coordinates of the geometry.
      * The geometry is modified in place.
      * If you do not want the geometry modified in place, first clone() it and
      * then use this function on the clone.
      */
    def applyTransform(transformFn: TransformFunction): Unit = js.native
    
    def closestPointXY(x: Double, y: Double, closestPoint: Coordinate, minSquaredDistance: Double): Double = js.native
    
    /* protected */ def computeExtent(extent: Extent): Extent = js.native
    
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    /**
      * Return the closest point of the geometry to the passed point as
      * {@link module:ol/coordinate~Coordinate coordinate}.
      */
    def getClosestPoint(point: Coordinate): Coordinate = js.native
    def getClosestPoint(point: Coordinate, opt_closestPoint: Coordinate): Coordinate = js.native
    
    /**
      * Get the extent of the geometry.
      */
    def getExtent(): Extent = js.native
    def getExtent(opt_extent: Extent): Extent = js.native
    
    /**
      * Create a simplified version of this geometry using the Douglas Peucker
      * algorithm.
      * See https://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm.
      */
    def getSimplifiedGeometry(squaredTolerance: Double): Geometry = js.native
    
    /**
      * Get the type of this geometry.
      */
    def getType(): GeometryType = js.native
    
    /**
      * Returns true if this geometry includes the specified coordinate. If the
      * coordinate is on the boundary of the geometry, returns false.
      */
    def intersectsCoordinate(coordinate: Coordinate): Boolean = js.native
    
    /**
      * Test if the geometry and the passed extent intersect.
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    
    /**
      * Rotate the geometry around a given coordinate. This modifies the geometry
      * coordinates in place.
      */
    def rotate(angle: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * Scale the geometry (with an optional origin).  This modifies the geometry
      * coordinates in place.
      */
    def scale(sx: Double): Unit = js.native
    def scale(sx: Double, opt_sy: Double): Unit = js.native
    def scale(sx: Double, opt_sy: Double, opt_anchor: Coordinate): Unit = js.native
    def scale(sx: Double, opt_sy: Unit, opt_anchor: Coordinate): Unit = js.native
    
    /* protected */ var simplifiedGeometryMaxMinSquaredTolerance: Double = js.native
    
    /* protected */ var simplifiedGeometryRevision: Double = js.native
    
    /**
      * Create a simplified version of this geometry.  For linestrings, this uses
      * the Douglas Peucker
      * algorithm.  For polygons, a quantization-based
      * simplification is used to preserve topology.
      */
    def simplify(tolerance: Double): Geometry = js.native
    
    /**
      * Get a transformed and simplified version of the geometry.
      */
    def simplifyTransformed(squaredTolerance: Double): Geometry = js.native
    def simplifyTransformed(squaredTolerance: Double, opt_transform: TransformFunction): Geometry = js.native
    
    /**
      * Transform each coordinate of the geometry from one coordinate reference
      * system to another. The geometry is modified in place.
      * For example, a line will be transformed to a line and a circle to a circle.
      * If you do not want the geometry modified in place, first clone() it and
      * then use this function on the clone.
      */
    def transform(source: ProjectionLike, destination: ProjectionLike): Geometry = js.native
    
    /**
      * Translate the geometry.  This modifies the geometry coordinates in place.  If
      * instead you want a new geometry, first clone() this geometry.
      */
    def translate(deltaX: Double, deltaY: Double): Unit = js.native
  }
}
