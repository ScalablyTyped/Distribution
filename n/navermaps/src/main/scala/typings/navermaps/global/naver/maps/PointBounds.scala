package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.PointLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.PointBounds")
@js.native
class PointBounds protected ()
  extends typings.navermaps.naver.maps.PointBounds {
  def this(minPoint: typings.navermaps.naver.maps.Point, maxPoint: typings.navermaps.naver.maps.Point) = this()
}
object PointBounds {
  
  /* static member */
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: Coord, pointN: Coord): typings.navermaps.naver.maps.PointBounds = js.native
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: Coord, pointN: PointLiteral): typings.navermaps.naver.maps.PointBounds = js.native
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: PointLiteral, pointN: Coord): typings.navermaps.naver.maps.PointBounds = js.native
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: PointLiteral, pointN: PointLiteral): typings.navermaps.naver.maps.PointBounds = js.native
}
