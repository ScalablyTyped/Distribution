package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.useMergedRefsMod.MergedRef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowRef extends StObject {
  
  var arrowRef: MergedRef[HTMLElement]
  
  var overlayRef: MergedRef[HTMLElement]
  
  var triggerRef: MergedRef[HTMLElement]
}
object ArrowRef {
  
  inline def apply(
    arrowRef: MergedRef[HTMLElement],
    overlayRef: MergedRef[HTMLElement],
    triggerRef: MergedRef[HTMLElement]
  ): ArrowRef = {
    val __obj = js.Dynamic.literal(arrowRef = arrowRef.asInstanceOf[js.Any], overlayRef = overlayRef.asInstanceOf[js.Any], triggerRef = triggerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowRef]
  }
  
  extension [Self <: ArrowRef](x: Self) {
    
    inline def setArrowRef(value: MergedRef[HTMLElement]): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
    
    inline def setOverlayRef(value: MergedRef[HTMLElement]): Self = StObject.set(x, "overlayRef", value.asInstanceOf[js.Any])
    
    inline def setTriggerRef(value: MergedRef[HTMLElement]): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
  }
}
