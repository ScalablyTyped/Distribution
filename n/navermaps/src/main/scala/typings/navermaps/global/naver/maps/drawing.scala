package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.drawing.DrawingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.drawing")
@js.native
object drawing extends js.Object {
  @js.native
  class DrawingManager ()
    extends typings.navermaps.naver.maps.drawing.DrawingManager {
    def this(options: DrawingOptions) = this()
  }
  
  // Sub module: drawing
  def apply(): Unit = js.native
  @js.native
  object DrawingEvent extends js.Object {
    /* 0 */ val ADD: typings.navermaps.naver.maps.drawing.DrawingEvent.ADD with Double = js.native
    /* 3 */ val Added: typings.navermaps.naver.maps.drawing.DrawingEvent.Added with Double = js.native
    /* 1 */ val REMOVE: typings.navermaps.naver.maps.drawing.DrawingEvent.REMOVE with Double = js.native
    /* 4 */ val Removed: typings.navermaps.naver.maps.drawing.DrawingEvent.Removed with Double = js.native
    /* 2 */ val SELECT: typings.navermaps.naver.maps.drawing.DrawingEvent.SELECT with Double = js.native
    /* 5 */ val Selected: typings.navermaps.naver.maps.drawing.DrawingEvent.Selected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.drawing.DrawingEvent with Double] = js.native
  }
  
  @js.native
  object DrawingMode extends js.Object {
    /* 3 */ val ARROWLINE: typings.navermaps.naver.maps.drawing.DrawingMode.ARROWLINE with Double = js.native
    /* 1 */ val ELLIPSE: typings.navermaps.naver.maps.drawing.DrawingMode.ELLIPSE with Double = js.native
    /* 0 */ val HAND: typings.navermaps.naver.maps.drawing.DrawingMode.HAND with Double = js.native
    /* 5 */ val MARKER: typings.navermaps.naver.maps.drawing.DrawingMode.MARKER with Double = js.native
    /* 4 */ val POLYGON: typings.navermaps.naver.maps.drawing.DrawingMode.POLYGON with Double = js.native
    /* 2 */ val POLYLINE: typings.navermaps.naver.maps.drawing.DrawingMode.POLYLINE with Double = js.native
    /* 0 */ val RECTANGLE: typings.navermaps.naver.maps.drawing.DrawingMode.RECTANGLE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.drawing.DrawingMode with Double] = js.native
  }
  
  @js.native
  object DrawingStyle extends js.Object {
    /* 0 */ val HORIZONTAL: typings.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL with Double = js.native
    /* 1 */ val HORIZONTAL_2: typings.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL_2 with Double = js.native
    /* 0 */ val VERTICAL: typings.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL with Double = js.native
    /* 2 */ val VERTICAL_2: typings.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL_2 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.drawing.DrawingStyle with Double] = js.native
  }
  
}

