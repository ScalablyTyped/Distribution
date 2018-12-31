package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "extent")
@js.native
object extentNs extends js.Object {
  /**
    * Apply a transform function to the extent.
    * @param extent Extent.
    * @param transformFn Transform function.  Called with
    * [minX, minY, maxX, maxY] extent coordinates.
    * @param opt_extent Destination extent.
    * @return Extent.
    * @api stable
    */
  def applyTransform(
    extent: openlayersLib.openlayersMod.Extent,
    transformFn: openlayersLib.openlayersMod.TransformFunction
  ): openlayersLib.openlayersMod.Extent = js.native
  def applyTransform(
    extent: openlayersLib.openlayersMod.Extent,
    transformFn: openlayersLib.openlayersMod.TransformFunction,
    opt_extent: openlayersLib.openlayersMod.Extent
  ): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Build an extent that includes all given coordinates.
    *
    * @param coordinates Coordinates.
    * @return Bounding extent.
    * @api stable
    */
  def boundingExtent(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Return extent increased by the provided value.
    * @param extent Extent.
    * @param value The amount by which the extent should be buffered.
    * @param opt_extent Extent.
    * @return Extent.
    * @api stable
    */
  def buffer(extent: openlayersLib.openlayersMod.Extent, value: scala.Double): openlayersLib.openlayersMod.Extent = js.native
  def buffer(
    extent: openlayersLib.openlayersMod.Extent,
    value: scala.Double,
    opt_extent: openlayersLib.openlayersMod.Extent
  ): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Check if the passed coordinate is contained or on the edge of the extent.
    *
    * @param extent Extent.
    * @param coordinate Coordinate.
    * @return The coordinate is contained in the extent.
    * @api stable
    */
  def containsCoordinate(extent: openlayersLib.openlayersMod.Extent, coordinate: openlayersLib.openlayersMod.Coordinate): scala.Boolean = js.native
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
  def containsExtent(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
  /**
    * Check if the passed coordinate is contained or on the edge of the extent.
    *
    * @param extent Extent.
    * @param x X coordinate.
    * @param y Y coordinate.
    * @return The x, y values are contained in the extent.
    * @api stable
    */
  def containsXY(extent: openlayersLib.openlayersMod.Extent, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Create an empty extent.
    * @return Empty extent.
    * @api stable
    */
  def createEmpty(): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Determine if two extents are equivalent.
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @return The two extents are equivalent.
    * @api stable
    */
  def equals(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
  /**
    * Modify an extent to include another extent.
    * @param extent1 The extent to be modified.
    * @param extent2 The extent that will be included in the first.
    * @return A reference to the first (extended) extent.
    * @api stable
    */
  def extend(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Get the bottom left coordinate of an extent.
    * @param extent Extent.
    * @return Bottom left coordinate.
    * @api stable
    */
  def getBottomLeft(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Get the bottom right coordinate of an extent.
    * @param extent Extent.
    * @return Bottom right coordinate.
    * @api stable
    */
  def getBottomRight(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Get the center coordinate of an extent.
    * @param extent Extent.
    * @return Center.
    * @api stable
    */
  def getCenter(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Get the height of an extent.
    * @param extent Extent.
    * @return Height.
    * @api stable
    */
  def getHeight(extent: openlayersLib.openlayersMod.Extent): scala.Double = js.native
  /**
    * Get the intersection of two extents.
    * @param extent1 Extent 1.
    * @param extent2 Extent 2.
    * @param opt_extent Optional extent to populate with intersection.
    * @return Intersecting extent.
    * @api stable
    */
  def getIntersection(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Extent = js.native
  def getIntersection(
    extent1: openlayersLib.openlayersMod.Extent,
    extent2: openlayersLib.openlayersMod.Extent,
    opt_extent: openlayersLib.openlayersMod.Extent
  ): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Get the size (width, height) of an extent.
    * @param extent The extent.
    * @return The extent size.
    * @api stable
    */
  def getSize(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Size = js.native
  /**
    * Get the top left coordinate of an extent.
    * @param extent Extent.
    * @return Top left coordinate.
    * @api stable
    */
  def getTopLeft(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Get the top right coordinate of an extent.
    * @param extent Extent.
    * @return Top right coordinate.
    * @api stable
    */
  def getTopRight(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Get the width of an extent.
    * @param extent Extent.
    * @return Width.
    * @api stable
    */
  def getWidth(extent: openlayersLib.openlayersMod.Extent): scala.Double = js.native
  /**
    * Determine if one extent intersects another.
    * @param extent1 Extent 1.
    * @param extent2 Extent.
    * @return The two extents intersect.
    * @api stable
    */
  def intersects(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
  /**
    * Determine if an extent is empty.
    * @param extent Extent.
    * @return Is empty.
    * @api stable
    */
  def isEmpty(extent: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
}

