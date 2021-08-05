package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTileOptions extends StObject {
  
  var imgonerror: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var imgonload: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var offset: js.UndefOr[Point] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pane: js.UndefOr[HTMLElement] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
  
  var transition: js.UndefOr[Boolean] = js.undefined
  
  var urls: js.Array[String]
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ImageTileOptions {
  
  inline def apply(urls: js.Array[String]): ImageTileOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTileOptions]
  }
  
  extension [Self <: ImageTileOptions](x: Self) {
    
    inline def setImgonerror(value: () => js.Any): Self = StObject.set(x, "imgonerror", js.Any.fromFunction0(value))
    
    inline def setImgonerrorUndefined: Self = StObject.set(x, "imgonerror", js.undefined)
    
    inline def setImgonload(value: () => js.Any): Self = StObject.set(x, "imgonload", js.Any.fromFunction0(value))
    
    inline def setImgonloadUndefined: Self = StObject.set(x, "imgonload", js.undefined)
    
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
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
