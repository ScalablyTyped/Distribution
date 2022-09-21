package typings.pageFlip

import typings.pageFlip.basicTypesMod.Point
import typings.pageFlip.pageFlipMod.PageFlip
import typings.pageFlip.renderMod.Orientation
import typings.pageFlip.settingsMod.FlipSetting
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uIMod {
  
  @JSImport("page-flip/dist/UI/UI", "UI")
  @js.native
  abstract class UI protected () extends StObject {
    /* protected */ def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting) = this()
    
    /* protected */ val app: PageFlip = js.native
    
    /* private */ var checkTarget: Any = js.native
    
    /**
      * Destructor. Remove all HTML elements and all event handlers
      */
    def destroy(): Unit = js.native
    
    /* protected */ var distElement: HTMLElement = js.native
    
    /**
      * Get parent element for book
      */
    def getDistElement(): HTMLElement = js.native
    
    /**
      * Convert global coordinates to relative book coordinates
      */
    /* private */ var getMousePos: Any = js.native
    
    /**
      * Get wrapper element
      */
    def getWrapper(): HTMLElement = js.native
    
    /* private */ var onMouseDown: Any = js.native
    
    /* private */ var onMouseMove: Any = js.native
    
    /* private */ var onMouseUp: Any = js.native
    
    /* private */ var onResize: Any = js.native
    
    /* private */ var onTouchEnd: Any = js.native
    
    /* private */ var onTouchMove: Any = js.native
    
    /* private */ var onTouchStart: Any = js.native
    
    /* protected */ def removeHandlers(): Unit = js.native
    
    /* protected */ def setHandlers(): Unit = js.native
    
    /**
      * Updates styles and sizes based on book orientation
      */
    def setOrientationStyle(orientation: Orientation): Unit = js.native
    
    /* private */ val swipeDistance: Any = js.native
    
    /* private */ val swipeTimeout: Any = js.native
    
    /* private */ var touchPoint: Any = js.native
    
    /**
      * Updating child components when resizing
      */
    def update(): Unit = js.native
    
    /* protected */ val wrapper: HTMLElement = js.native
  }
  
  trait SwipeData extends StObject {
    
    var point: Point
    
    var time: Double
  }
  object SwipeData {
    
    inline def apply(point: Point, time: Double): SwipeData = {
      val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeData]
    }
    
    extension [Self <: SwipeData](x: Self) {
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
