package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("naver.maps.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait BOTTOM_CENTER extends Position
  
  @js.native
  sealed trait BOTTOM_LEFT extends Position
  
  @js.native
  sealed trait BOTTOM_RIGHT extends Position
  
  @js.native
  sealed trait CENTER extends Position
  
  @js.native
  sealed trait LEFT_BOTTOM extends Position
  
  @js.native
  sealed trait LEFT_CENTER extends Position
  
  @js.native
  sealed trait LEFT_TOP extends Position
  
  @js.native
  sealed trait RIGHT_BOTTOM extends Position
  
  @js.native
  sealed trait RIGHT_CENTER extends Position
  
  @js.native
  sealed trait RIGHT_TOP extends Position
  
  @js.native
  sealed trait TOP_CENTER extends Position
  
  @js.native
  sealed trait TOP_LEFT extends Position
  
  @js.native
  sealed trait TOP_RIGHT extends Position
  
  /* 10 */ val BOTTOM_CENTER: typings.navermaps.naver.maps.Position.BOTTOM_CENTER with Double = js.native
  /* 9 */ val BOTTOM_LEFT: typings.navermaps.naver.maps.Position.BOTTOM_LEFT with Double = js.native
  /* 11 */ val BOTTOM_RIGHT: typings.navermaps.naver.maps.Position.BOTTOM_RIGHT with Double = js.native
  /* 0 */ val CENTER: typings.navermaps.naver.maps.Position.CENTER with Double = js.native
  /* 5 */ val LEFT_BOTTOM: typings.navermaps.naver.maps.Position.LEFT_BOTTOM with Double = js.native
  /* 3 */ val LEFT_CENTER: typings.navermaps.naver.maps.Position.LEFT_CENTER with Double = js.native
  /* 4 */ val LEFT_TOP: typings.navermaps.naver.maps.Position.LEFT_TOP with Double = js.native
  /* 8 */ val RIGHT_BOTTOM: typings.navermaps.naver.maps.Position.RIGHT_BOTTOM with Double = js.native
  /* 7 */ val RIGHT_CENTER: typings.navermaps.naver.maps.Position.RIGHT_CENTER with Double = js.native
  /* 6 */ val RIGHT_TOP: typings.navermaps.naver.maps.Position.RIGHT_TOP with Double = js.native
  /* 1 */ val TOP_CENTER: typings.navermaps.naver.maps.Position.TOP_CENTER with Double = js.native
  /* 0 */ val TOP_LEFT: typings.navermaps.naver.maps.Position.TOP_LEFT with Double = js.native
  /* 2 */ val TOP_RIGHT: typings.navermaps.naver.maps.Position.TOP_RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

