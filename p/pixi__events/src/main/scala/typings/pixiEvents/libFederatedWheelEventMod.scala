package typings.pixiEvents

import typings.pixiEvents.libEventBoundaryMod.EventBoundary
import typings.pixiEvents.libFederatedMouseEventMod.FederatedMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFederatedWheelEventMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Event because Already inherited
  - typings.std.UIEvent because Already inherited
  - typings.std.MouseEvent because Already inherited
  - typings.std.WheelEvent because var conflicts: altKey, button, buttons, cancelBubble, clientX, clientY, ctrlKey, detail, metaKey, movementX, movementY, offsetX, offsetY, relatedTarget, returnValue, screenX, screenY, shiftKey, x, y. Inlined DOM_DELTA_PIXEL, DOM_DELTA_PAGE, deltaZ, deltaX, deltaMode, DOM_DELTA_LINE, deltaY */ @JSImport("@pixi/events/lib/FederatedWheelEvent", "FederatedWheelEvent")
  @js.native
  open class FederatedWheelEvent protected () extends FederatedMouseEvent {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: EventBoundary) = this()
    
    /** Units specified in lines. */
    var DOM_DELTA_LINE: Double = js.native
    
    /** Units specified in pages. */
    var DOM_DELTA_PAGE: Double = js.native
    
    /** Units specified in pixels. */
    var DOM_DELTA_PIXEL: Double = js.native
    
    /**
      * The units of `deltaX`, `deltaY`, and `deltaZ`. This is one of `DOM_DELTA_LINE`,
      * `DOM_DELTA_PAGE`, `DOM_DELTA_PIXEL`.
      */
    var deltaMode: Double = js.native
    
    /** Horizontal scroll amount */
    var deltaX: Double = js.native
    
    /** Vertical scroll amount */
    var deltaY: Double = js.native
    
    /** z-axis scroll amount. */
    var deltaZ: Double = js.native
  }
}
