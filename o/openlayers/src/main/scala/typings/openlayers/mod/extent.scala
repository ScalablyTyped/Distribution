package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extent {
  
  @JSImport("openlayers", "extent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Apply a transform function to the extent.
    * @param extent Extent.
    * @param transformFn Transform function.  Called with
    * [minX, minY, maxX, maxY] extent coordinates.
    * @param opt_extent Destination extent.
    * @return Extent.
    * @api stable
    */
  @scala.inline
  def applyTransform(extent: Extent_, transformFn: TransformFunction): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(extent.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  @scala.inline
  def applyTransform(extent: Extent_, transformFn: TransformFunction, opt_extent: Extent_): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(extent.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  
  /**
    * Build an extent that includes all given coordinates.
    *
    * @param coordinates Coordinates.
    * @return Bounding extent.
    * @api stable
    */
  @scala.inline
  def boundingExtent(coordinates: js.Array[Coordinate_]): Extent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("boundingExtent")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Extent_]
  
  /**
    * Return extent increased by the provided value.
    * @param extent Extent.
    * @param value The amount by which the extent should be buffered.
    * @param opt_extent Extent.
    * @return Extent.
    * @api stable
    */
  @scala.inline
  def buffer(extent: Extent_, value: Double): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(extent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  @scala.inline
  def buffer(extent: Extent_, value: Double, opt_extent: Extent_): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(extent.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  
  /**
    * Check if the passed coordinate is contained or on the edge of the extent.
    *
    * @param extent Extent.
    * @param coordinate Coordinate.
    * @return The coordinate is contained in the extent.
    * @api stable
    */
  @scala.inline
  def containsCoordinate(extent: Extent_, coordinate: Coordinate_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsCoordinate")(extent.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if one extent contains another.
    *
    * An extent is deemed contained if it lies completely within the other extent,
    * including if they share one or more edges.
    *
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @return The second extent is contained by or on the edge of the
    *     first.
    * @api stable
    */
  @scala.inline
  def containsExtent(extent1: Extent_, extent2: Extent_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsExtent")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if the passed coordinate is contained or on the edge of the extent.
    *
    * @param extent Extent.
    * @param x X coordinate.
    * @param y Y coordinate.
    * @return The x, y values are contained in the extent.
    * @api stable
    */
  @scala.inline
  def containsXY(extent: Extent_, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsXY")(extent.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Create an empty extent.
    * @return Empty extent.
    * @api stable
    */
  @scala.inline
  def createEmpty(): Extent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[Extent_]
  
  /**
    * Determine if two extents are equivalent.
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @return The two extents are equivalent.
    * @api stable
    */
  @scala.inline
  def equals_(extent1: Extent_, extent2: Extent_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Modify an extent to include another extent.
    * @param extent1 The extent to be modified.
    * @param extent2 The extent that will be included in the first.
    * @return A reference to the first (extended) extent.
    * @api stable
    */
  @scala.inline
  def extend(extent1: Extent_, extent2: Extent_): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  
  /**
    * Get the bottom left coordinate of an extent.
    * @param extent Extent.
    * @return Bottom left coordinate.
    * @api stable
    */
  @scala.inline
  def getBottomLeft(extent: Extent_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomLeft")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  
  /**
    * Get the bottom right coordinate of an extent.
    * @param extent Extent.
    * @return Bottom right coordinate.
    * @api stable
    */
  @scala.inline
  def getBottomRight(extent: Extent_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomRight")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  
  /**
    * Get the center coordinate of an extent.
    * @param extent Extent.
    * @return Center.
    * @api stable
    */
  @scala.inline
  def getCenter(extent: Extent_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  
  /**
    * Get the height of an extent.
    * @param extent Extent.
    * @return Height.
    * @api stable
    */
  @scala.inline
  def getHeight(extent: Extent_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")(extent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Get the intersection of two extents.
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @param opt_extent Optional extent to populate with intersection.
    * @return Intersecting extent.
    * @api stable
    */
  @scala.inline
  def getIntersection(extent1: Extent_, extent2: Extent_): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  @scala.inline
  def getIntersection(extent1: Extent_, extent2: Extent_, opt_extent: Extent_): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  
  /**
    * Get the size (width, height) of an extent.
    * @param extent The extent.
    * @return The extent size.
    * @api stable
    */
  @scala.inline
  def getSize(extent: Extent_): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(extent.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  /**
    * Get the top left coordinate of an extent.
    * @param extent Extent.
    * @return Top left coordinate.
    * @api stable
    */
  @scala.inline
  def getTopLeft(extent: Extent_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopLeft")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  
  /**
    * Get the top right coordinate of an extent.
    * @param extent Extent.
    * @return Top right coordinate.
    * @api stable
    */
  @scala.inline
  def getTopRight(extent: Extent_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopRight")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  
  /**
    * Get the width of an extent.
    * @param extent Extent.
    * @return Width.
    * @api stable
    */
  @scala.inline
  def getWidth(extent: Extent_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(extent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Determine if one extent intersects another.
    * @param extent1 Extent 1.
    * @param extent2 Extent.
    * @return The two extents intersect.
    * @api stable
    */
  @scala.inline
  def intersects(extent1: Extent_, extent2: Extent_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Determine if an extent is empty.
    * @param extent Extent.
    * @return Is empty.
    * @api stable
    */
  @scala.inline
  def isEmpty(extent: Extent_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(extent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
