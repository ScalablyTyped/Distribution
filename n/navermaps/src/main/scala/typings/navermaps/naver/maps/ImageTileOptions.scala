package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTileOptions extends StObject {
  
  var imgonerror: js.UndefOr[js.Function0[_]] = js.native
  
  var imgonload: js.UndefOr[js.Function0[_]] = js.native
  
  var offset: js.UndefOr[Point] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pane: js.UndefOr[HTMLElement] = js.native
  
  var size: js.UndefOr[Size] = js.native
  
  var transition: js.UndefOr[Boolean] = js.native
  
  var urls: js.Array[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ImageTileOptions {
  
  @scala.inline
  def apply(urls: js.Array[String]): ImageTileOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTileOptions]
  }
  
  @scala.inline
  implicit class ImageTileOptionsMutableBuilder[Self <: ImageTileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImgonerror(value: () => _): Self = StObject.set(x, "imgonerror", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImgonerrorUndefined: Self = StObject.set(x, "imgonerror", js.undefined)
    
    @scala.inline
    def setImgonload(value: () => _): Self = StObject.set(x, "imgonload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImgonloadUndefined: Self = StObject.set(x, "imgonload", js.undefined)
    
    @scala.inline
    def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPane(value: HTMLElement): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
