package typings.ol.extentMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentCornerMod.Corner
import typings.ol.extentRelationshipMod.Relationship
import typings.ol.projMod.TransformFunction
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/extent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyTransform(extent: Extent, transformFn: TransformFunction): Extent = js.native
  def applyTransform(extent: Extent, transformFn: TransformFunction, opt_extent: Extent): Extent = js.native
  def boundingExtent(coordinates: js.Array[Coordinate]): Extent = js.native
  def buffer(extent: Extent, value: Double): Extent = js.native
  def buffer(extent: Extent, value: Double, opt_extent: Extent): Extent = js.native
  def clone(extent: Extent): Extent = js.native
  def clone(extent: Extent, opt_extent: Extent): Extent = js.native
  def closestSquaredDistanceXY(extent: Extent, x: Double, y: Double): Double = js.native
  def containsCoordinate(extent: Extent, coordinate: Coordinate): Boolean = js.native
  def containsExtent(extent1: Extent, extent2: Extent): Boolean = js.native
  def containsXY(extent: Extent, x: Double, y: Double): Boolean = js.native
  def coordinateRelationship(extent: Extent, coordinate: Coordinate): Relationship = js.native
  def createEmpty(): Extent = js.native
  def createOrUpdate(minX: Double, minY: Double, maxX: Double, maxY: Double): Extent = js.native
  def createOrUpdate(minX: Double, minY: Double, maxX: Double, maxY: Double, opt_extent: Extent): Extent = js.native
  def createOrUpdateEmpty(): Extent = js.native
  def createOrUpdateEmpty(opt_extent: Extent): Extent = js.native
  def createOrUpdateFromCoordinate(coordinate: Coordinate): Extent = js.native
  def createOrUpdateFromCoordinate(coordinate: Coordinate, opt_extent: Extent): Extent = js.native
  def createOrUpdateFromCoordinates(coordinates: js.Array[Coordinate]): Extent = js.native
  def createOrUpdateFromCoordinates(coordinates: js.Array[Coordinate], opt_extent: Extent): Extent = js.native
  def createOrUpdateFromFlatCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Extent = js.native
  def createOrUpdateFromFlatCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, opt_extent: Extent): Extent = js.native
  def createOrUpdateFromRings(rings: js.Array[js.Array[Coordinate]]): Extent = js.native
  def createOrUpdateFromRings(rings: js.Array[js.Array[Coordinate]], opt_extent: Extent): Extent = js.native
  def equals(extent1: Extent, extent2: Extent): Boolean = js.native
  def extend(extent1: Extent, extent2: Extent): Extent = js.native
  def extendCoordinate(extent: Extent, coordinate: Coordinate): Unit = js.native
  def extendCoordinates(extent: Extent, coordinates: js.Array[Coordinate]): Extent = js.native
  def extendFlatCoordinates(extent: Extent, flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Extent = js.native
  def extendRings(extent: Extent, rings: js.Array[js.Array[Coordinate]]): Extent = js.native
  def extendXY(extent: Extent, x: Double, y: Double): Unit = js.native
  def forEachCorner[S, T](extent: Extent, callback: js.ThisFunction1[/* this */ T, /* p0 */ Coordinate, S]): S | Boolean = js.native
  def forEachCorner[S, T](extent: Extent, callback: js.ThisFunction1[/* this */ T, /* p0 */ Coordinate, S], opt_this: T): S | Boolean = js.native
  def getArea(extent: Extent): Double = js.native
  def getBottomLeft(extent: Extent): Coordinate = js.native
  def getBottomRight(extent: Extent): Coordinate = js.native
  def getCenter(extent: Extent): Coordinate = js.native
  def getCorner(extent: Extent, corner: Corner): Coordinate = js.native
  def getEnlargedArea(extent1: Extent, extent2: Extent): Double = js.native
  def getForViewAndSize(center: Coordinate, resolution: Double, rotation: Double, size: Size): Extent = js.native
  def getForViewAndSize(center: Coordinate, resolution: Double, rotation: Double, size: Size, opt_extent: Extent): Extent = js.native
  def getHeight(extent: Extent): Double = js.native
  def getIntersection(extent1: Extent, extent2: Extent): Extent = js.native
  def getIntersection(extent1: Extent, extent2: Extent, opt_extent: Extent): Extent = js.native
  def getIntersectionArea(extent1: Extent, extent2: Extent): Double = js.native
  def getMargin(extent: Extent): Double = js.native
  def getSize(extent: Extent): Size = js.native
  def getTopLeft(extent: Extent): Coordinate = js.native
  def getTopRight(extent: Extent): Coordinate = js.native
  def getWidth(extent: Extent): Double = js.native
  def intersects(extent1: Extent, extent2: Extent): Boolean = js.native
  def intersectsSegment(extent: Extent, start: Coordinate, end: Coordinate): Boolean = js.native
  def isEmpty(extent: Extent): Boolean = js.native
  def returnOrUpdate(extent: Extent): Extent = js.native
  def returnOrUpdate(extent: Extent, opt_extent: Extent): Extent = js.native
  def scaleFromCenter(extent: Extent, value: Double): Unit = js.native
}

