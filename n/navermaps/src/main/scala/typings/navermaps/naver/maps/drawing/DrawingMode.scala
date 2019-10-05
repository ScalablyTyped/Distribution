package typings.navermaps.naver.maps.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingMode extends js.Object

@JSGlobal("naver.maps.drawing.DrawingMode")
@js.native
object DrawingMode extends js.Object {
  @js.native
  sealed trait ARROWLINE extends DrawingMode
  
  @js.native
  sealed trait ELLIPSE extends DrawingMode
  
  @js.native
  sealed trait HAND extends DrawingMode
  
  @js.native
  sealed trait MARKER extends DrawingMode
  
  @js.native
  sealed trait POLYGON extends DrawingMode
  
  @js.native
  sealed trait POLYLINE extends DrawingMode
  
  @js.native
  sealed trait RECTANGLE extends DrawingMode
  
  /* 3 */ val ARROWLINE: typings.navermaps.naver.maps.drawing.DrawingMode.ARROWLINE with Double = js.native
  /* 1 */ val ELLIPSE: typings.navermaps.naver.maps.drawing.DrawingMode.ELLIPSE with Double = js.native
  /* 0 */ val HAND: typings.navermaps.naver.maps.drawing.DrawingMode.HAND with Double = js.native
  /* 5 */ val MARKER: typings.navermaps.naver.maps.drawing.DrawingMode.MARKER with Double = js.native
  /* 4 */ val POLYGON: typings.navermaps.naver.maps.drawing.DrawingMode.POLYGON with Double = js.native
  /* 2 */ val POLYLINE: typings.navermaps.naver.maps.drawing.DrawingMode.POLYLINE with Double = js.native
  /* 0 */ val RECTANGLE: typings.navermaps.naver.maps.drawing.DrawingMode.RECTANGLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingMode with Double] = js.native
}

