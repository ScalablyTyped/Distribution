package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentCornerMod.Corner
import typings.ol.extentRelationshipMod.Relationship
import typings.ol.projMod.TransformFunction
import typings.ol.projProjectionMod.default
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extentMod {
  
  @JSImport("ol/extent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyTransform(extent: Extent, transformFn: TransformFunction): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(extent.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def applyTransform(extent: Extent, transformFn: TransformFunction, opt_extent: Unit, opt_stops: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(extent.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any], opt_stops.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def applyTransform(extent: Extent, transformFn: TransformFunction, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(extent.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def applyTransform(extent: Extent, transformFn: TransformFunction, opt_extent: Extent, opt_stops: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(extent.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any], opt_stops.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def approximatelyEquals(extent1: Extent, extent2: Extent, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approximatelyEquals")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundingExtent(coordinates: js.Array[Coordinate]): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("boundingExtent")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Extent]
  
  inline def buffer(extent: Extent, value: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(extent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def buffer(extent: Extent, value: Double, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(extent.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def clone_(extent: Extent): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(extent.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def clone_(extent: Extent, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(extent.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def closestSquaredDistanceXY(extent: Extent, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("closestSquaredDistanceXY")(extent.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def containsCoordinate(extent: Extent, coordinate: Coordinate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsCoordinate")(extent.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsExtent(extent1: Extent, extent2: Extent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsExtent")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsXY(extent: Extent, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsXY")(extent.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def coordinateRelationship(extent: Extent, coordinate: Coordinate): Relationship = (^.asInstanceOf[js.Dynamic].applyDynamic("coordinateRelationship")(extent.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Relationship]
  
  inline def createEmpty(): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[Extent]
  
  inline def createOrUpdate(minX: Double, minY: Double, maxX: Double, maxY: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def createOrUpdate(minX: Double, minY: Double, maxX: Double, maxY: Double, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def createOrUpdateEmpty(): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateEmpty")().asInstanceOf[Extent]
  inline def createOrUpdateEmpty(opt_extent: Extent): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateEmpty")(opt_extent.asInstanceOf[js.Any]).asInstanceOf[Extent]
  
  inline def createOrUpdateFromCoordinate(coordinate: Coordinate): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromCoordinate")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def createOrUpdateFromCoordinate(coordinate: Coordinate, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromCoordinate")(coordinate.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def createOrUpdateFromCoordinates(coordinates: js.Array[Coordinate]): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromCoordinates")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def createOrUpdateFromCoordinates(coordinates: js.Array[Coordinate], opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromCoordinates")(coordinates.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def createOrUpdateFromFlatCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromFlatCoordinates")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def createOrUpdateFromFlatCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromFlatCoordinates")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def createOrUpdateFromRings(rings: js.Array[js.Array[Coordinate]]): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromRings")(rings.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def createOrUpdateFromRings(rings: js.Array[js.Array[Coordinate]], opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFromRings")(rings.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def equals_(extent1: Extent, extent2: Extent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extend(extent1: Extent, extent2: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def extendCoordinate(extent: Extent, coordinate: Coordinate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendCoordinate")(extent.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extendCoordinates(extent: Extent, coordinates: js.Array[Coordinate]): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("extendCoordinates")(extent.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def extendFlatCoordinates(extent: Extent, flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("extendFlatCoordinates")(extent.asInstanceOf[js.Any], flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def extendRings(extent: Extent, rings: js.Array[js.Array[Coordinate]]): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("extendRings")(extent.asInstanceOf[js.Any], rings.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def extendXY(extent: Extent, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendXY")(extent.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachCorner[S](extent: Extent, callback: js.Function1[/* p0 */ Coordinate, S]): S | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachCorner")(extent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[S | Boolean]
  
  inline def getArea(extent: Extent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(extent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBottomLeft(extent: Extent): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomLeft")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  
  inline def getBottomRight(extent: Extent): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomRight")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  
  inline def getCenter(extent: Extent): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  
  inline def getCorner(extent: Extent, corner: Corner): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("getCorner")(extent.asInstanceOf[js.Any], corner.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def getEnlargedArea(extent1: Extent, extent2: Extent): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnlargedArea")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getForViewAndSize(center: Coordinate, resolution: Double, rotation: Double, size: Size): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("getForViewAndSize")(center.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def getForViewAndSize(center: Coordinate, resolution: Double, rotation: Double, size: Size, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("getForViewAndSize")(center.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], size.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def getHeight(extent: Extent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")(extent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getIntersection(extent1: Extent, extent2: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def getIntersection(extent1: Extent, extent2: Extent, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def getIntersectionArea(extent1: Extent, extent2: Extent): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionArea")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getMargin(extent: Extent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMargin")(extent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSize(extent: Extent): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(extent.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def getTopLeft(extent: Extent): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopLeft")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  
  inline def getTopRight(extent: Extent): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopRight")(extent.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  
  inline def getWidth(extent: Extent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(extent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def intersects(extent1: Extent, extent2: Extent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(extent1.asInstanceOf[js.Any], extent2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsSegment(extent: Extent, start: Coordinate, end: Coordinate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsSegment")(extent.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmpty(extent: Extent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(extent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def returnOrUpdate(extent: Extent): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("returnOrUpdate")(extent.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def returnOrUpdate(extent: Extent, opt_extent: Extent): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("returnOrUpdate")(extent.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def scaleFromCenter(extent: Extent, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleFromCenter")(extent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wrapX(extent: Extent, projection: default): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapX")(extent.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  type Extent = js.Tuple4[Double, Double, Double, Double]
}
