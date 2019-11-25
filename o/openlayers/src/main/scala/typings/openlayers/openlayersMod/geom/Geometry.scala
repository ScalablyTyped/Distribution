package typings.openlayers.openlayersMod.geom

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Object
import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for vector geometries.
  *
  * To get notified of changes to the geometry, register a listener for the
  * generic `change` event on your geometry instance.
  *
  * @api stable
  */
@JSImport("openlayers", "geom.Geometry")
@js.native
/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for vector geometries.
  *
  * To get notified of changes to the geometry, register a listener for the
  * generic `change` event on your geometry instance.
  *
  * @api stable
  */
class Geometry () extends Object {
  /**
    * Return the closest point of the geometry to the passed point as
    * {@link ol.Coordinate coordinate}.
    * @param point Point.
    * @param opt_closestPoint Closest point.
    * @return Closest point.
    * @api stable
    */
  def getClosestPoint(point: Coordinate): Coordinate = js.native
  def getClosestPoint(point: Coordinate, opt_closestPoint: Coordinate): Coordinate = js.native
  /**
    * Get the extent of the geometry.
    * @param opt_extent Extent.
    * @return extent Extent.
    * @api stable
    */
  def getExtent(): Extent = js.native
  def getExtent(opt_extent: Extent): Extent = js.native
  /**
    * Get the type of this geometry.
    * @return Geometry type.
    */
  def getType(): GeometryType = js.native
  /**
    * Returns true if this geometry includes the specified coordinate. If the
    * coordinate is on the boundary of the geometry, returns false.
    * @param coordinate Coordinate.
    * @return Contains coordinate.
    * @api
    */
  def intersectsCoordinate(coordinate: Coordinate): Boolean = js.native
  /**
    * Rotate the geometry around a given coordinate. This modifies the geometry
    * coordinates in place.
    * @param angle Rotation angle in radians.
    * @param anchor The rotation center.
    * @api
    */
  def rotate(angle: Double, anchor: Coordinate): Unit = js.native
  /**
    * Scale the geometry (with an optional origin).  This modifies the geometry
    * coordinates in place.
    * @param sx The scaling factor in the x-direction.
    * @param opt_sy The scaling factor in the y-direction (defaults to
    *     sx).
    * @param opt_anchor The scale origin (defaults to the center
    *     of the geometry extent).
    * @api
    */
  def scale(sx: Double): Unit = js.native
  def scale(sx: Double, opt_sy: Double): Unit = js.native
  def scale(sx: Double, opt_sy: Double, opt_anchor: Coordinate): Unit = js.native
  /**
    * Create a simplified version of this geometry.  For linestrings, this uses
    * the the {@link
    * https://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm
    * Douglas Peucker} algorithm.  For polygons, a quantization-based
    * simplification is used to preserve topology.
    * @param tolerance The tolerance distance for simplification.
    * @return A new, simplified version of the original
    *     geometry.
    * @api
    */
  def simplify(tolerance: Double): Geometry = js.native
  /**
    * Transform each coordinate of the geometry from one coordinate reference
    * system to another. The geometry is modified in place.
    * For example, a line will be transformed to a line and a circle to a circle.
    * If you do not want the geometry modified in place, first `clone()` it and
    * then use this function on the clone.
    *
    * @param source The current projection.  Can be a
    *     string identifier or a {@link ol.proj.Projection} object.
    * @param destination The desired projection.  Can be a
    *     string identifier or a {@link ol.proj.Projection} object.
    * @return This geometry.  Note that original geometry is
    *     modified in place.
    * @api stable
    */
  def transform(source: ProjectionLike, destination: ProjectionLike): Geometry = js.native
}

