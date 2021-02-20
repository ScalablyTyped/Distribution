package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extent {
  
  /**
    * Apply a transform function to the extent.
    * @param extent Extent.
    * @param transformFn Transform function.  Called with
    * [minX, minY, maxX, maxY] extent coordinates.
    * @param opt_extent Destination extent.
    * @return Extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.applyTransform")
  @js.native
  def applyTransform(extent: Extent_, transformFn: TransformFunction): Extent_ = js.native
  @JSImport("openlayers", "extent.applyTransform")
  @js.native
  def applyTransform(extent: Extent_, transformFn: TransformFunction, opt_extent: Extent_): Extent_ = js.native
  
  /**
    * Build an extent that includes all given coordinates.
    *
    * @param coordinates Coordinates.
    * @return Bounding extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.boundingExtent")
  @js.native
  def boundingExtent(coordinates: js.Array[Coordinate_]): Extent_ = js.native
  
  /**
    * Return extent increased by the provided value.
    * @param extent Extent.
    * @param value The amount by which the extent should be buffered.
    * @param opt_extent Extent.
    * @return Extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.buffer")
  @js.native
  def buffer(extent: Extent_, value: Double): Extent_ = js.native
  @JSImport("openlayers", "extent.buffer")
  @js.native
  def buffer(extent: Extent_, value: Double, opt_extent: Extent_): Extent_ = js.native
  
  /**
    * Check if the passed coordinate is contained or on the edge of the extent.
    *
    * @param extent Extent.
    * @param coordinate Coordinate.
    * @return The coordinate is contained in the extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.containsCoordinate")
  @js.native
  def containsCoordinate(extent: Extent_, coordinate: Coordinate_): Boolean = js.native
  
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
  @JSImport("openlayers", "extent.containsExtent")
  @js.native
  def containsExtent(extent1: Extent_, extent2: Extent_): Boolean = js.native
  
  /**
    * Check if the passed coordinate is contained or on the edge of the extent.
    *
    * @param extent Extent.
    * @param x X coordinate.
    * @param y Y coordinate.
    * @return The x, y values are contained in the extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.containsXY")
  @js.native
  def containsXY(extent: Extent_, x: Double, y: Double): Boolean = js.native
  
  /**
    * Create an empty extent.
    * @return Empty extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.createEmpty")
  @js.native
  def createEmpty(): Extent_ = js.native
  
  /**
    * Determine if two extents are equivalent.
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @return The two extents are equivalent.
    * @api stable
    */
  @JSImport("openlayers", "extent.equals")
  @js.native
  def equals_(extent1: Extent_, extent2: Extent_): Boolean = js.native
  
  /**
    * Modify an extent to include another extent.
    * @param extent1 The extent to be modified.
    * @param extent2 The extent that will be included in the first.
    * @return A reference to the first (extended) extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.extend")
  @js.native
  def extend(extent1: Extent_, extent2: Extent_): Extent_ = js.native
  
  /**
    * Get the bottom left coordinate of an extent.
    * @param extent Extent.
    * @return Bottom left coordinate.
    * @api stable
    */
  @JSImport("openlayers", "extent.getBottomLeft")
  @js.native
  def getBottomLeft(extent: Extent_): Coordinate_ = js.native
  
  /**
    * Get the bottom right coordinate of an extent.
    * @param extent Extent.
    * @return Bottom right coordinate.
    * @api stable
    */
  @JSImport("openlayers", "extent.getBottomRight")
  @js.native
  def getBottomRight(extent: Extent_): Coordinate_ = js.native
  
  /**
    * Get the center coordinate of an extent.
    * @param extent Extent.
    * @return Center.
    * @api stable
    */
  @JSImport("openlayers", "extent.getCenter")
  @js.native
  def getCenter(extent: Extent_): Coordinate_ = js.native
  
  /**
    * Get the height of an extent.
    * @param extent Extent.
    * @return Height.
    * @api stable
    */
  @JSImport("openlayers", "extent.getHeight")
  @js.native
  def getHeight(extent: Extent_): Double = js.native
  
  /**
    * Get the intersection of two extents.
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @param opt_extent Optional extent to populate with intersection.
    * @return Intersecting extent.
    * @api stable
    */
  @JSImport("openlayers", "extent.getIntersection")
  @js.native
  def getIntersection(extent1: Extent_, extent2: Extent_): Extent_ = js.native
  @JSImport("openlayers", "extent.getIntersection")
  @js.native
  def getIntersection(extent1: Extent_, extent2: Extent_, opt_extent: Extent_): Extent_ = js.native
  
  /**
    * Get the size (width, height) of an extent.
    * @param extent The extent.
    * @return The extent size.
    * @api stable
    */
  @JSImport("openlayers", "extent.getSize")
  @js.native
  def getSize(extent: Extent_): Size = js.native
  
  /**
    * Get the top left coordinate of an extent.
    * @param extent Extent.
    * @return Top left coordinate.
    * @api stable
    */
  @JSImport("openlayers", "extent.getTopLeft")
  @js.native
  def getTopLeft(extent: Extent_): Coordinate_ = js.native
  
  /**
    * Get the top right coordinate of an extent.
    * @param extent Extent.
    * @return Top right coordinate.
    * @api stable
    */
  @JSImport("openlayers", "extent.getTopRight")
  @js.native
  def getTopRight(extent: Extent_): Coordinate_ = js.native
  
  /**
    * Get the width of an extent.
    * @param extent Extent.
    * @return Width.
    * @api stable
    */
  @JSImport("openlayers", "extent.getWidth")
  @js.native
  def getWidth(extent: Extent_): Double = js.native
  
  /**
    * Determine if one extent intersects another.
    * @param extent1 Extent 1.
    * @param extent2 Extent.
    * @return The two extents intersect.
    * @api stable
    */
  @JSImport("openlayers", "extent.intersects")
  @js.native
  def intersects(extent1: Extent_, extent2: Extent_): Boolean = js.native
  
  /**
    * Determine if an extent is empty.
    * @param extent Extent.
    * @return Is empty.
    * @api stable
    */
  @JSImport("openlayers", "extent.isEmpty")
  @js.native
  def isEmpty(extent: Extent_): Boolean = js.native
}
