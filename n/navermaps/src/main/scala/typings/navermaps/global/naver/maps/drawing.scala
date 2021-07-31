package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.drawing.DrawingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  // Sub module: drawing
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.drawing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.drawing.DrawingEvent")
  @js.native
  object DrawingEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.drawing.DrawingEvent & Double] = js.native
    
    /* 0 */ val ADD: typings.navermaps.naver.maps.drawing.DrawingEvent.ADD & Double = js.native
    
    /* 3 */ val Added: typings.navermaps.naver.maps.drawing.DrawingEvent.Added & Double = js.native
    
    /* 1 */ val REMOVE: typings.navermaps.naver.maps.drawing.DrawingEvent.REMOVE & Double = js.native
    
    /* 4 */ val Removed: typings.navermaps.naver.maps.drawing.DrawingEvent.Removed & Double = js.native
    
    /* 2 */ val SELECT: typings.navermaps.naver.maps.drawing.DrawingEvent.SELECT & Double = js.native
    
    /* 5 */ val Selected: typings.navermaps.naver.maps.drawing.DrawingEvent.Selected & Double = js.native
  }
  
  @JSGlobal("naver.maps.drawing.DrawingManager")
  @js.native
  class DrawingManager ()
    extends StObject
       with typings.navermaps.naver.maps.drawing.DrawingManager {
    def this(options: DrawingOptions) = this()
  }
  
  @JSGlobal("naver.maps.drawing.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.drawing.DrawingMode & Double] = js.native
    
    /* 3 */ val ARROWLINE: typings.navermaps.naver.maps.drawing.DrawingMode.ARROWLINE & Double = js.native
    
    /* 1 */ val ELLIPSE: typings.navermaps.naver.maps.drawing.DrawingMode.ELLIPSE & Double = js.native
    
    /* 0 */ val HAND: typings.navermaps.naver.maps.drawing.DrawingMode.HAND & Double = js.native
    
    /* 5 */ val MARKER: typings.navermaps.naver.maps.drawing.DrawingMode.MARKER & Double = js.native
    
    /* 4 */ val POLYGON: typings.navermaps.naver.maps.drawing.DrawingMode.POLYGON & Double = js.native
    
    /* 2 */ val POLYLINE: typings.navermaps.naver.maps.drawing.DrawingMode.POLYLINE & Double = js.native
    
    /* 0 */ val RECTANGLE: typings.navermaps.naver.maps.drawing.DrawingMode.RECTANGLE & Double = js.native
  }
  
  @JSGlobal("naver.maps.drawing.DrawingStyle")
  @js.native
  object DrawingStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.drawing.DrawingStyle & Double] = js.native
    
    /* 0 */ val HORIZONTAL: typings.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL & Double = js.native
    
    /* 1 */ val HORIZONTAL_2: typings.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL_2 & Double = js.native
    
    /* 0 */ val VERTICAL: typings.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL & Double = js.native
    
    /* 2 */ val VERTICAL_2: typings.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL_2 & Double = js.native
  }
}
