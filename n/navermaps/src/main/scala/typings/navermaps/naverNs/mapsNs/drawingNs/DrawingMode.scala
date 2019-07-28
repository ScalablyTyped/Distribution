package typings.navermaps.naverNs.mapsNs.drawingNs

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
  
  /* 3 */ val ARROWLINE: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.ARROWLINE with Double = js.native
  /* 1 */ val ELLIPSE: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.ELLIPSE with Double = js.native
  /* 0 */ val HAND: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.HAND with Double = js.native
  /* 5 */ val MARKER: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.MARKER with Double = js.native
  /* 4 */ val POLYGON: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.POLYGON with Double = js.native
  /* 2 */ val POLYLINE: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.POLYLINE with Double = js.native
  /* 0 */ val RECTANGLE: typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode.RECTANGLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingMode with Double] = js.native
}

