package typings.openseadragon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayOptions extends StObject {
  
  var checkResize: js.UndefOr[Boolean] = js.undefined
  
  var element: HTMLElement
  
  var height: js.UndefOr[Double] = js.undefined
  
  var location: Point | Rect
  
  var onDraw: js.UndefOr[OnDrawCallback] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var rotationMode: js.UndefOr[OverlayRotationMode] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object OverlayOptions {
  
  inline def apply(element: HTMLElement, location: Point | Rect): OverlayOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
  
  extension [Self <: OverlayOptions](x: Self) {
    
    inline def setCheckResize(value: Boolean): Self = StObject.set(x, "checkResize", value.asInstanceOf[js.Any])
    
    inline def setCheckResizeUndefined: Self = StObject.set(x, "checkResize", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLocation(value: Point | Rect): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setOnDraw(value: (/* position */ Point, /* size */ Point, /* element */ HTMLElement) => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction3(value))
    
    inline def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRotationMode(value: OverlayRotationMode): Self = StObject.set(x, "rotationMode", value.asInstanceOf[js.Any])
    
    inline def setRotationModeUndefined: Self = StObject.set(x, "rotationMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
