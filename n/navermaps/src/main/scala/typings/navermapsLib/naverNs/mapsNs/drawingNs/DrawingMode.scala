package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingMode extends js.Object

@JSGlobal("naver.maps.drawing.DrawingMode")
@js.native
object DrawingMode extends js.Object {
  @js.native
  sealed trait ARROWLINE
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  @js.native
  sealed trait ELLIPSE
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  @js.native
  sealed trait HAND
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  @js.native
  sealed trait MARKER
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  @js.native
  sealed trait POLYGON
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  @js.native
  sealed trait POLYLINE
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  @js.native
  sealed trait RECTANGLE
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  
  val ARROWLINE: ARROWLINE with scala.Double = js.native
  val ELLIPSE: ELLIPSE with scala.Double = js.native
  /* 0 */ val HAND: HAND with scala.Double = js.native
  val MARKER: MARKER with scala.Double = js.native
  val POLYGON: POLYGON with scala.Double = js.native
  val POLYLINE: POLYLINE with scala.Double = js.native
  val RECTANGLE: RECTANGLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode with scala.Double] = js.native
}

