package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapSystemProjection
  */
@js.native
trait MapSystemProjection
  extends StObject
     with KVO {
  
  // See https://navermaps.github.io/maps.js.ncp/docs/tutorial-Projection.html
  def factor(zoom: Double): Double = js.native
  
  def fromCoordToOffset(coord: Coord): Point = js.native
  
  def fromCoordToPoint(coord: Coord): Point = js.native
  
  def fromOffsetToCoord(offset: Point): Coord = js.native
  
  def fromOffsetToPoint(offset: Point): Point = js.native
  
  def fromPointToCoord(point: Point): Coord = js.native
  
  def fromPointToOffset(point: Point): Point = js.native
  
  def getDestinationCoord(fromCoord: Coord, angle: Double, meter: Double): Coord = js.native
  
  def getDistance(coord1: Coord, coord2: Coord): Double = js.native
  
  def getProjectionName(): Double = js.native
  
  def scaleDown(operand: Double, zoom: Double): Double | Point | Size = js.native
  def scaleDown(operand: Point, zoom: Double): Double | Point | Size = js.native
  def scaleDown(operand: Size, zoom: Double): Double | Point | Size = js.native
  
  def scaleUp(operand: Double, zoom: Double): Double | Point | Size = js.native
  def scaleUp(operand: Point, zoom: Double): Double | Point | Size = js.native
  def scaleUp(operand: Size, zoom: Double): Double | Point | Size = js.native
}
