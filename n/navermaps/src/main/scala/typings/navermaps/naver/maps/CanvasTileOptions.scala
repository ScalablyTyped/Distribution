package typings.navermaps.naver.maps

import typings.std.HTMLElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTileOptions extends StObject {
  
  var imageData: js.UndefOr[ImageData] = js.native
  
  var offset: js.UndefOr[Point] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pane: js.UndefOr[HTMLElement] = js.native
  
  var size: js.UndefOr[Size] = js.native
  
  var transition: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object CanvasTileOptions {
  
  @scala.inline
  def apply(): CanvasTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasTileOptions]
  }
  
  @scala.inline
  implicit class CanvasTileOptionsMutableBuilder[Self <: CanvasTileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageData(value: ImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
    
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
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
