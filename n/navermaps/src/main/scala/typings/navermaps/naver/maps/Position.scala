package typings.navermaps.naver.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
  /* 10 */ @js.native
  object BOTTOM_CENTER extends TopLevel[BOTTOM_CENTER with Double]
  
  /* 9 */ @js.native
  object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
  
  /* 11 */ @js.native
  object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
  
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 5 */ @js.native
  object LEFT_BOTTOM extends TopLevel[LEFT_BOTTOM with Double]
  
  /* 3 */ @js.native
  object LEFT_CENTER extends TopLevel[LEFT_CENTER with Double]
  
  /* 4 */ @js.native
  object LEFT_TOP extends TopLevel[LEFT_TOP with Double]
  
  /* 8 */ @js.native
  object RIGHT_BOTTOM extends TopLevel[RIGHT_BOTTOM with Double]
  
  /* 7 */ @js.native
  object RIGHT_CENTER extends TopLevel[RIGHT_CENTER with Double]
  
  /* 6 */ @js.native
  object RIGHT_TOP extends TopLevel[RIGHT_TOP with Double]
  
  /* 1 */ @js.native
  object TOP_CENTER extends TopLevel[TOP_CENTER with Double]
  
  /* 0 */ @js.native
  object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
  
  /* 2 */ @js.native
  object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
  
}

