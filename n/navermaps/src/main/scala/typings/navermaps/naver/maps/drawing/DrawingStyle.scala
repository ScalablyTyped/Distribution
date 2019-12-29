package typings.navermaps.naver.maps.drawing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingStyle extends js.Object

@JSGlobal("naver.maps.drawing.DrawingStyle")
@js.native
object DrawingStyle extends js.Object {
  @js.native
  sealed trait HORIZONTAL extends DrawingStyle
  
  @js.native
  sealed trait HORIZONTAL_2 extends DrawingStyle
  
  @js.native
  sealed trait VERTICAL extends DrawingStyle
  
  @js.native
  sealed trait VERTICAL_2 extends DrawingStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingStyle with Double] = js.native
  /* 0 */ @js.native
  object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
  
  /* 1 */ @js.native
  object HORIZONTAL_2 extends TopLevel[HORIZONTAL_2 with Double]
  
  /* 0 */ @js.native
  object VERTICAL extends TopLevel[VERTICAL with Double]
  
  /* 2 */ @js.native
  object VERTICAL_2 extends TopLevel[VERTICAL_2 with Double]
  
}

