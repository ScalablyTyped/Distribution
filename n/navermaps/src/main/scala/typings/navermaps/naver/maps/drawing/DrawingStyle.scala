package typings.navermaps.naver.maps.drawing

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
  
  /* 0 */ val HORIZONTAL: typings.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL with Double = js.native
  /* 1 */ val HORIZONTAL_2: typings.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL_2 with Double = js.native
  /* 0 */ val VERTICAL: typings.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL with Double = js.native
  /* 2 */ val VERTICAL_2: typings.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL_2 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingStyle with Double] = js.native
}

