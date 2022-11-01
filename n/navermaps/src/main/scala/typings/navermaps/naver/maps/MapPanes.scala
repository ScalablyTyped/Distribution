package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapPanes
  */
trait MapPanes extends StObject {
  
  var floatPane: HTMLElement
  
  var overlayImage: HTMLElement
  
  var overlayLayer: HTMLElement
}
object MapPanes {
  
  inline def apply(floatPane: HTMLElement, overlayImage: HTMLElement, overlayLayer: HTMLElement): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], overlayImage = overlayImage.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
  
  extension [Self <: MapPanes](x: Self) {
    
    inline def setFloatPane(value: HTMLElement): Self = StObject.set(x, "floatPane", value.asInstanceOf[js.Any])
    
    inline def setOverlayImage(value: HTMLElement): Self = StObject.set(x, "overlayImage", value.asInstanceOf[js.Any])
    
    inline def setOverlayLayer(value: HTMLElement): Self = StObject.set(x, "overlayLayer", value.asInstanceOf[js.Any])
  }
}
