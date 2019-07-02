package typings
package olLib.extentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/extent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyTransform(extent: Extent, transformFn: olLib.projMod.TransformFunction): Extent = js.native
  def applyTransform(extent: Extent, transformFn: olLib.projMod.TransformFunction, opt_extent: Extent): Extent = js.native
  def boundingExtent(coordinates: js.Array[olLib.coordinateMod.Coordinate]): Extent = js.native
  def buffer(extent: Extent, value: scala.Double): Extent = js.native
  def buffer(extent: Extent, value: scala.Double, opt_extent: Extent): Extent = js.native
  def clone(extent: Extent): Extent = js.native
  def clone(extent: Extent, opt_extent: Extent): Extent = js.native
  def closestSquaredDistanceXY(extent: Extent, x: scala.Double, y: scala.Double): scala.Double = js.native
  def containsCoordinate(extent: Extent, coordinate: olLib.coordinateMod.Coordinate): scala.Boolean = js.native
  def containsExtent(extent1: Extent, extent2: Extent): scala.Boolean = js.native
  def containsXY(extent: Extent, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def coordinateRelationship(extent: Extent, coordinate: olLib.coordinateMod.Coordinate): olLib.extentRelationshipMod.Relationship = js.native
  def createEmpty(): Extent = js.native
  def createOrUpdate(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): Extent = js.native
  def createOrUpdate(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double, opt_extent: Extent): Extent = js.native
  def createOrUpdateEmpty(): Extent = js.native
  def createOrUpdateEmpty(opt_extent: Extent): Extent = js.native
  def createOrUpdateFromCoordinate(coordinate: olLib.coordinateMod.Coordinate): Extent = js.native
  def createOrUpdateFromCoordinate(coordinate: olLib.coordinateMod.Coordinate, opt_extent: Extent): Extent = js.native
  def createOrUpdateFromCoordinates(coordinates: js.Array[olLib.coordinateMod.Coordinate]): Extent = js.native
  def createOrUpdateFromCoordinates(coordinates: js.Array[olLib.coordinateMod.Coordinate], opt_extent: Extent): Extent = js.native
  def createOrUpdateFromFlatCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): Extent = js.native
  def createOrUpdateFromFlatCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    opt_extent: Extent
  ): Extent = js.native
  def createOrUpdateFromRings(rings: js.Array[js.Array[olLib.coordinateMod.Coordinate]]): Extent = js.native
  def createOrUpdateFromRings(rings: js.Array[js.Array[olLib.coordinateMod.Coordinate]], opt_extent: Extent): Extent = js.native
  def equals(extent1: Extent, extent2: Extent): scala.Boolean = js.native
  def extend(extent1: Extent, extent2: Extent): Extent = js.native
  def extendCoordinate(extent: Extent, coordinate: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def extendCoordinates(extent: Extent, coordinates: js.Array[olLib.coordinateMod.Coordinate]): Extent = js.native
  def extendFlatCoordinates(
    extent: Extent,
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): Extent = js.native
  def extendRings(extent: Extent, rings: js.Array[js.Array[olLib.coordinateMod.Coordinate]]): Extent = js.native
  def extendXY(extent: Extent, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def forEachCorner[S, T](
    extent: Extent,
    callback: js.ThisFunction1[/* this */ T, /* p0 */ olLib.coordinateMod.Coordinate, S]
  ): S | scala.Boolean = js.native
  def forEachCorner[S, T](
    extent: Extent,
    callback: js.ThisFunction1[/* this */ T, /* p0 */ olLib.coordinateMod.Coordinate, S],
    opt_this: T
  ): S | scala.Boolean = js.native
  def getArea(extent: Extent): scala.Double = js.native
  def getBottomLeft(extent: Extent): olLib.coordinateMod.Coordinate = js.native
  def getBottomRight(extent: Extent): olLib.coordinateMod.Coordinate = js.native
  def getCenter(extent: Extent): olLib.coordinateMod.Coordinate = js.native
  def getCorner(extent: Extent, corner: olLib.extentCornerMod.Corner): olLib.coordinateMod.Coordinate = js.native
  def getEnlargedArea(extent1: Extent, extent2: Extent): scala.Double = js.native
  def getForViewAndSize(
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size
  ): Extent = js.native
  def getForViewAndSize(
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size,
    opt_extent: Extent
  ): Extent = js.native
  def getHeight(extent: Extent): scala.Double = js.native
  def getIntersection(extent1: Extent, extent2: Extent): Extent = js.native
  def getIntersection(extent1: Extent, extent2: Extent, opt_extent: Extent): Extent = js.native
  def getIntersectionArea(extent1: Extent, extent2: Extent): scala.Double = js.native
  def getMargin(extent: Extent): scala.Double = js.native
  def getSize(extent: Extent): olLib.sizeMod.Size = js.native
  def getTopLeft(extent: Extent): olLib.coordinateMod.Coordinate = js.native
  def getTopRight(extent: Extent): olLib.coordinateMod.Coordinate = js.native
  def getWidth(extent: Extent): scala.Double = js.native
  def intersects(extent1: Extent, extent2: Extent): scala.Boolean = js.native
  def intersectsSegment(extent: Extent, start: olLib.coordinateMod.Coordinate, end: olLib.coordinateMod.Coordinate): scala.Boolean = js.native
  def isEmpty(extent: Extent): scala.Boolean = js.native
  def returnOrUpdate(extent: Extent): Extent = js.native
  def returnOrUpdate(extent: Extent, opt_extent: Extent): Extent = js.native
  def scaleFromCenter(extent: Extent, value: scala.Double): scala.Unit = js.native
}

