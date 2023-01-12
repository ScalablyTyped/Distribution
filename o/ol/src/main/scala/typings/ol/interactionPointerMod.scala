package typings.ol

import typings.ol.pixelMod.Pixel
import typings.std.PointerEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPointerMod {
  
  @JSImport("ol/interaction/Pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/interaction/Pointer", JSImport.Default)
  @js.native
  open class default () extends PointerInteraction {
    def this(opt_options: Options) = this()
  }
  
  inline def centroid(pointerEvents: js.Array[PointerEvent]): Pixel = ^.asInstanceOf[js.Dynamic].applyDynamic("centroid")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[Pixel]
  
  trait Options extends StObject {
    
    var handleDownEvent: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Boolean]] = js.undefined
    
    var handleDragEvent: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]] = js.undefined
    
    var handleEvent: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Boolean]] = js.undefined
    
    var handleMoveEvent: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]] = js.undefined
    
    var handleUpEvent: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Boolean]] = js.undefined
    
    var stopDown: js.UndefOr[js.Function1[/* p0 */ Boolean, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHandleDownEvent(value: /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleDownEvent", js.Any.fromFunction1(value))
      
      inline def setHandleDownEventUndefined: Self = StObject.set(x, "handleDownEvent", js.undefined)
      
      inline def setHandleDragEvent(value: /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent] => Unit): Self = StObject.set(x, "handleDragEvent", js.Any.fromFunction1(value))
      
      inline def setHandleDragEventUndefined: Self = StObject.set(x, "handleDragEvent", js.undefined)
      
      inline def setHandleEvent(value: /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      inline def setHandleEventUndefined: Self = StObject.set(x, "handleEvent", js.undefined)
      
      inline def setHandleMoveEvent(value: /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent] => Unit): Self = StObject.set(x, "handleMoveEvent", js.Any.fromFunction1(value))
      
      inline def setHandleMoveEventUndefined: Self = StObject.set(x, "handleMoveEvent", js.undefined)
      
      inline def setHandleUpEvent(value: /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleUpEvent", js.Any.fromFunction1(value))
      
      inline def setHandleUpEventUndefined: Self = StObject.set(x, "handleUpEvent", js.undefined)
      
      inline def setStopDown(value: /* p0 */ Boolean => Boolean): Self = StObject.set(x, "stopDown", js.Any.fromFunction1(value))
      
      inline def setStopDownUndefined: Self = StObject.set(x, "stopDown", js.undefined)
    }
  }
  
  @js.native
  trait PointerInteraction
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * Returns the current number of pointers involved in the interaction,
      * e.g. 2 when two fingers are used.
      */
    def getPointerCount(): Double = js.native
    
    /**
      * Handle pointer down events.
      */
    /* protected */ def handleDownEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
    
    /**
      * Handle pointer drag events.
      */
    /* protected */ def handleDragEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    /**
      * Handle pointer move events.
      */
    /* protected */ def handleMoveEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    /**
      * Handle pointer up events.
      */
    /* protected */ def handleUpEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
    
    /* protected */ var handlingDownUpSequence: Boolean = js.native
    
    /**
      * This function is used to determine if "down" events should be propagated
      * to other interactions or should be stopped.
      */
    def stopDown(handled: Boolean): Boolean = js.native
    
    /* protected */ var targetPointers: js.Array[PointerEvent] = js.native
  }
}
