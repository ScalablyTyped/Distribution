package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.PointBoundsLiteral
import typings.navermaps.naver.maps.PointLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PointBounds
  */
@JSGlobal("naver.maps.PointBounds")
@js.native
open class PointBounds protected ()
  extends StObject
     with typings.navermaps.naver.maps.PointBounds {
  def this(literal: PointBoundsLiteral) = this()
  def this(minPoint: typings.navermaps.naver.maps.Point, maxPoint: typings.navermaps.naver.maps.Point) = this()
}
object PointBounds {
  
  @JSGlobal("naver.maps.PointBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def bounds(point: Coord, pointN: Coord): typings.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.PointBounds]
  inline def bounds(point: Coord, pointN: PointLiteral): typings.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.PointBounds]
  inline def bounds(point: PointLiteral, pointN: Coord): typings.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.PointBounds]
  inline def bounds(point: PointLiteral, pointN: PointLiteral): typings.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.PointBounds]
}
