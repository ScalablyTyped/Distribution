package typings.openseadragon.mod

import typings.openseadragon.openseadragonStrings.blur
import typings.openseadragon.openseadragonStrings.click
import typings.openseadragon.openseadragonStrings.contextmenu
import typings.openseadragon.openseadragonStrings.dblclick
import typings.openseadragon.openseadragonStrings.focus
import typings.openseadragon.openseadragonStrings.gotpointercapture
import typings.openseadragon.openseadragonStrings.keydown
import typings.openseadragon.openseadragonStrings.keypress
import typings.openseadragon.openseadragonStrings.keyup
import typings.openseadragon.openseadragonStrings.lostpointercapture
import typings.openseadragon.openseadragonStrings.pointercancel
import typings.openseadragon.openseadragonStrings.pointerdown
import typings.openseadragon.openseadragonStrings.pointerenter
import typings.openseadragon.openseadragonStrings.pointerleave
import typings.openseadragon.openseadragonStrings.pointermove
import typings.openseadragon.openseadragonStrings.pointerout
import typings.openseadragon.openseadragonStrings.pointerover
import typings.openseadragon.openseadragonStrings.pointerup
import typings.openseadragon.openseadragonStrings.wheel
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventProcessInfo extends StObject {
  
  var defaultPrevented: Boolean
  
  var eventPhase: EventPhase
  
  var eventSource: MouseTracker
  
  var eventType: keydown | keyup | keypress | focus | blur | contextmenu | gotpointercapture | lostpointercapture | pointerenter | pointerleave | pointerover | pointerout | pointerdown | pointerup | pointermove | pointercancel | wheel | click | dblclick
  
  var isCancelable: Boolean
  
  var isEmulated: Boolean
  
  var isStoppable: Boolean
  
  var originalEvent: Event
  
  var originalTarget: Element
  
  var pointerType: String
  
  var preventDefault: Boolean
  
  var preventGesture: Boolean
  
  var shouldCapture: Boolean
  
  var shouldReleaseCapture: Boolean
  
  var stopPropagation: Boolean
  
  var userData: Any
}
object EventProcessInfo {
  
  inline def apply(
    defaultPrevented: Boolean,
    eventPhase: EventPhase,
    eventSource: MouseTracker,
    eventType: keydown | keyup | keypress | focus | blur | contextmenu | gotpointercapture | lostpointercapture | pointerenter | pointerleave | pointerover | pointerout | pointerdown | pointerup | pointermove | pointercancel | wheel | click | dblclick,
    isCancelable: Boolean,
    isEmulated: Boolean,
    isStoppable: Boolean,
    originalEvent: Event,
    originalTarget: Element,
    pointerType: String,
    preventDefault: Boolean,
    preventGesture: Boolean,
    shouldCapture: Boolean,
    shouldReleaseCapture: Boolean,
    stopPropagation: Boolean,
    userData: Any
  ): EventProcessInfo = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], isEmulated = isEmulated.asInstanceOf[js.Any], isStoppable = isStoppable.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], originalTarget = originalTarget.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], preventGesture = preventGesture.asInstanceOf[js.Any], shouldCapture = shouldCapture.asInstanceOf[js.Any], shouldReleaseCapture = shouldReleaseCapture.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventProcessInfo]
  }
  
  extension [Self <: EventProcessInfo](x: Self) {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: EventPhase): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setEventSource(value: MouseTracker): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventType(
      value: keydown | keyup | keypress | focus | blur | contextmenu | gotpointercapture | lostpointercapture | pointerenter | pointerleave | pointerover | pointerout | pointerdown | pointerup | pointermove | pointercancel | wheel | click | dblclick
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    inline def setIsEmulated(value: Boolean): Self = StObject.set(x, "isEmulated", value.asInstanceOf[js.Any])
    
    inline def setIsStoppable(value: Boolean): Self = StObject.set(x, "isStoppable", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalTarget(value: Element): Self = StObject.set(x, "originalTarget", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventGesture(value: Boolean): Self = StObject.set(x, "preventGesture", value.asInstanceOf[js.Any])
    
    inline def setShouldCapture(value: Boolean): Self = StObject.set(x, "shouldCapture", value.asInstanceOf[js.Any])
    
    inline def setShouldReleaseCapture(value: Boolean): Self = StObject.set(x, "shouldReleaseCapture", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
  }
}
