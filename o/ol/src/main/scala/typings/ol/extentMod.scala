package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.cornerMod.Corner
import typings.ol.projMod.TransformFunction
import typings.ol.projectionMod.default
import typings.ol.relationshipMod.Relationship
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extentMod {
  
  @JSImport("ol/extent", "applyTransform")
  @js.native
  def applyTransform(extent: Extent, transformFn: TransformFunction): Extent = js.native
  @JSImport("ol/extent", "applyTransform")
  @js.native
  def applyTransform(
    extent: Extent,
    transformFn: TransformFunction,
    opt_extent: js.UndefOr[scala.Nothing],
    opt_stops: Double
  ): Extent = js.native
  @JSImport("ol/extent", "applyTransform")
  @js.native
  def applyTransform(extent: Extent, transformFn: TransformFunction, opt_extent: Extent): Extent = js.native
  @JSImport("ol/extent", "applyTransform")
  @js.native
  def applyTransform(extent: Extent, transformFn: TransformFunction, opt_extent: Extent, opt_stops: Double): Extent = js.native
  
  @JSImport("ol/extent", "approximatelyEquals")
  @js.native
  def approximatelyEquals(extent1: Extent, extent2: Extent, tolerance: Double): Boolean = js.native
  
  @JSImport("ol/extent", "boundingExtent")
  @js.native
  def boundingExtent(coordinates: js.Array[Coordinate]): Extent = js.native
  
  @JSImport("ol/extent", "buffer")
  @js.native
  def buffer(extent: Extent, value: Double): Extent = js.native
  @JSImport("ol/extent", "buffer")
  @js.native
  def buffer(extent: Extent, value: Double, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "clone")
  @js.native
  def clone_(extent: Extent): Extent = js.native
  @JSImport("ol/extent", "clone")
  @js.native
  def clone_(extent: Extent, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "closestSquaredDistanceXY")
  @js.native
  def closestSquaredDistanceXY(extent: Extent, x: Double, y: Double): Double = js.native
  
  @JSImport("ol/extent", "containsCoordinate")
  @js.native
  def containsCoordinate(extent: Extent, coordinate: Coordinate): Boolean = js.native
  
  @JSImport("ol/extent", "containsExtent")
  @js.native
  def containsExtent(extent1: Extent, extent2: Extent): Boolean = js.native
  
  @JSImport("ol/extent", "containsXY")
  @js.native
  def containsXY(extent: Extent, x: Double, y: Double): Boolean = js.native
  
  @JSImport("ol/extent", "coordinateRelationship")
  @js.native
  def coordinateRelationship(extent: Extent, coordinate: Coordinate): Relationship = js.native
  
  @JSImport("ol/extent", "createEmpty")
  @js.native
  def createEmpty(): Extent = js.native
  
  @JSImport("ol/extent", "createOrUpdate")
  @js.native
  def createOrUpdate(minX: Double, minY: Double, maxX: Double, maxY: Double): Extent = js.native
  @JSImport("ol/extent", "createOrUpdate")
  @js.native
  def createOrUpdate(minX: Double, minY: Double, maxX: Double, maxY: Double, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "createOrUpdateEmpty")
  @js.native
  def createOrUpdateEmpty(): Extent = js.native
  @JSImport("ol/extent", "createOrUpdateEmpty")
  @js.native
  def createOrUpdateEmpty(opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "createOrUpdateFromCoordinate")
  @js.native
  def createOrUpdateFromCoordinate(coordinate: Coordinate): Extent = js.native
  @JSImport("ol/extent", "createOrUpdateFromCoordinate")
  @js.native
  def createOrUpdateFromCoordinate(coordinate: Coordinate, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "createOrUpdateFromCoordinates")
  @js.native
  def createOrUpdateFromCoordinates(coordinates: js.Array[Coordinate]): Extent = js.native
  @JSImport("ol/extent", "createOrUpdateFromCoordinates")
  @js.native
  def createOrUpdateFromCoordinates(coordinates: js.Array[Coordinate], opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "createOrUpdateFromFlatCoordinates")
  @js.native
  def createOrUpdateFromFlatCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Extent = js.native
  @JSImport("ol/extent", "createOrUpdateFromFlatCoordinates")
  @js.native
  def createOrUpdateFromFlatCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "createOrUpdateFromRings")
  @js.native
  def createOrUpdateFromRings(rings: js.Array[js.Array[Coordinate]]): Extent = js.native
  @JSImport("ol/extent", "createOrUpdateFromRings")
  @js.native
  def createOrUpdateFromRings(rings: js.Array[js.Array[Coordinate]], opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "equals")
  @js.native
  def equals_(extent1: Extent, extent2: Extent): Boolean = js.native
  
  @JSImport("ol/extent", "extend")
  @js.native
  def extend(extent1: Extent, extent2: Extent): Extent = js.native
  
  @JSImport("ol/extent", "extendCoordinate")
  @js.native
  def extendCoordinate(extent: Extent, coordinate: Coordinate): Unit = js.native
  
  @JSImport("ol/extent", "extendCoordinates")
  @js.native
  def extendCoordinates(extent: Extent, coordinates: js.Array[Coordinate]): Extent = js.native
  
  @JSImport("ol/extent", "extendFlatCoordinates")
  @js.native
  def extendFlatCoordinates(extent: Extent, flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Extent = js.native
  
  @JSImport("ol/extent", "extendRings")
  @js.native
  def extendRings(extent: Extent, rings: js.Array[js.Array[Coordinate]]): Extent = js.native
  
  @JSImport("ol/extent", "extendXY")
  @js.native
  def extendXY(extent: Extent, x: Double, y: Double): Unit = js.native
  
  @JSImport("ol/extent", "forEachCorner")
  @js.native
  def forEachCorner[S](extent: Extent, callback: js.Function1[/* p0 */ Coordinate, S]): S | Boolean = js.native
  
  @JSImport("ol/extent", "getArea")
  @js.native
  def getArea(extent: Extent): Double = js.native
  
  @JSImport("ol/extent", "getBottomLeft")
  @js.native
  def getBottomLeft(extent: Extent): Coordinate = js.native
  
  @JSImport("ol/extent", "getBottomRight")
  @js.native
  def getBottomRight(extent: Extent): Coordinate = js.native
  
  @JSImport("ol/extent", "getCenter")
  @js.native
  def getCenter(extent: Extent): Coordinate = js.native
  
  @JSImport("ol/extent", "getCorner")
  @js.native
  def getCorner(extent: Extent, corner: Corner): Coordinate = js.native
  
  @JSImport("ol/extent", "getEnlargedArea")
  @js.native
  def getEnlargedArea(extent1: Extent, extent2: Extent): Double = js.native
  
  @JSImport("ol/extent", "getForViewAndSize")
  @js.native
  def getForViewAndSize(center: Coordinate, resolution: Double, rotation: Double, size: Size): Extent = js.native
  @JSImport("ol/extent", "getForViewAndSize")
  @js.native
  def getForViewAndSize(center: Coordinate, resolution: Double, rotation: Double, size: Size, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "getHeight")
  @js.native
  def getHeight(extent: Extent): Double = js.native
  
  @JSImport("ol/extent", "getIntersection")
  @js.native
  def getIntersection(extent1: Extent, extent2: Extent): Extent = js.native
  @JSImport("ol/extent", "getIntersection")
  @js.native
  def getIntersection(extent1: Extent, extent2: Extent, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "getIntersectionArea")
  @js.native
  def getIntersectionArea(extent1: Extent, extent2: Extent): Double = js.native
  
  @JSImport("ol/extent", "getMargin")
  @js.native
  def getMargin(extent: Extent): Double = js.native
  
  @JSImport("ol/extent", "getSize")
  @js.native
  def getSize(extent: Extent): Size = js.native
  
  @JSImport("ol/extent", "getTopLeft")
  @js.native
  def getTopLeft(extent: Extent): Coordinate = js.native
  
  @JSImport("ol/extent", "getTopRight")
  @js.native
  def getTopRight(extent: Extent): Coordinate = js.native
  
  @JSImport("ol/extent", "getWidth")
  @js.native
  def getWidth(extent: Extent): Double = js.native
  
  @JSImport("ol/extent", "intersects")
  @js.native
  def intersects(extent1: Extent, extent2: Extent): Boolean = js.native
  
  @JSImport("ol/extent", "intersectsSegment")
  @js.native
  def intersectsSegment(extent: Extent, start: Coordinate, end: Coordinate): Boolean = js.native
  
  @JSImport("ol/extent", "isEmpty")
  @js.native
  def isEmpty(extent: Extent): Boolean = js.native
  
  @JSImport("ol/extent", "returnOrUpdate")
  @js.native
  def returnOrUpdate(extent: Extent): Extent = js.native
  @JSImport("ol/extent", "returnOrUpdate")
  @js.native
  def returnOrUpdate(extent: Extent, opt_extent: Extent): Extent = js.native
  
  @JSImport("ol/extent", "scaleFromCenter")
  @js.native
  def scaleFromCenter(extent: Extent, value: Double): Unit = js.native
  
  @JSImport("ol/extent", "wrapX")
  @js.native
  def wrapX(extent: Extent, projection: default): Extent = js.native
  
  type Extent = js.Tuple4[Double, Double, Double, Double]
}
