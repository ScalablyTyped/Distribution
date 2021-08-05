package typings.navermaps.naver.maps

import typings.std.HTMLElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTileOptions extends StObject {
  
  var imageData: js.UndefOr[ImageData] = js.undefined
  
  var offset: js.UndefOr[Point] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pane: js.UndefOr[HTMLElement] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
  
  var transition: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object CanvasTileOptions {
  
  inline def apply(): CanvasTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasTileOptions]
  }
  
  extension [Self <: CanvasTileOptions](x: Self) {
    
    inline def setImageData(value: ImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
    
    inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPane(value: HTMLElement): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
