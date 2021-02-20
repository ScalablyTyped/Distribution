package typings.openseadragon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayOptions extends StObject {
  
  var checkResize: js.UndefOr[Boolean] = js.native
  
  var element: HTMLElement = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var location: Point | Rect = js.native
  
  var onDraw: js.UndefOr[OnDrawCallback] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var rotationMode: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object OverlayOptions {
  
  @scala.inline
  def apply(element: HTMLElement, location: Point | Rect): OverlayOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsMutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckResize(value: Boolean): Self = StObject.set(x, "checkResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckResizeUndefined: Self = StObject.set(x, "checkResize", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLocation(value: Point | Rect): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDraw(value: (/* position */ Point, /* size */ Point, /* element */ HTMLElement) => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setRotationMode(value: Boolean): Self = StObject.set(x, "rotationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationModeUndefined: Self = StObject.set(x, "rotationMode", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
