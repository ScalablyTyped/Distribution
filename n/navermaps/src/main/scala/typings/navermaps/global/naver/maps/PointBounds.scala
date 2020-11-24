package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.PointLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.PointBounds")
@js.native
class PointBounds protected ()
  extends typings.navermaps.naver.maps.PointBounds {
  def this(minPoint: typings.navermaps.naver.maps.Point, maxPoint: typings.navermaps.naver.maps.Point) = this()
}
/* static members */
@JSGlobal("naver.maps.PointBounds")
@js.native
object PointBounds extends js.Object {
  
  def bounds(point: Coord, pointN: Coord): typings.navermaps.naver.maps.PointBounds = js.native
  def bounds(point: Coord, pointN: PointLiteral): typings.navermaps.naver.maps.PointBounds = js.native
  def bounds(point: PointLiteral, pointN: Coord): typings.navermaps.naver.maps.PointBounds = js.native
  def bounds(point: PointLiteral, pointN: PointLiteral): typings.navermaps.naver.maps.PointBounds = js.native
}
