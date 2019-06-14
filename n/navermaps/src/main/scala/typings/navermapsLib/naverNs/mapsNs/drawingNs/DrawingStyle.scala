package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingStyle extends js.Object

@JSGlobal("naver.maps.drawing.DrawingStyle")
@js.native
object DrawingStyle extends js.Object {
  @js.native
  sealed trait HORIZONTAL
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingStyle
  
  @js.native
  sealed trait HORIZONTAL_2
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingStyle
  
  @js.native
  sealed trait VERTICAL
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingStyle
  
  @js.native
  sealed trait VERTICAL_2
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingStyle
  
  /* 0 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 1 */ val HORIZONTAL_2: HORIZONTAL_2 with scala.Double = js.native
  /* 0 */ val VERTICAL: VERTICAL with scala.Double = js.native
  /* 2 */ val VERTICAL_2: VERTICAL_2 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.drawingNs.DrawingStyle with scala.Double] = js.native
}

