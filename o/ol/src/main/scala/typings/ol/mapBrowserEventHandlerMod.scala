package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventHandlerMod {
  
  @JSImport("ol/MapBrowserEventHandler", JSImport.Default)
  @js.native
  open class default protected () extends MapBrowserEventHandler {
    /**
      * @param {import("./Map.js").default} map The map with the viewport to listen to events on.
      * @param {number} [moveTolerance] The minimal distance the pointer must travel to trigger a move.
      */
    def this(map: typings.ol.rendererMapMod.default) = this()
    def this(map: typings.ol.rendererMapMod.default, moveTolerance: Double) = this()
  }
  
  @js.native
  trait MapBrowserEventHandler
    extends typings.ol.eventsTargetMod.default {
    
    /**
      * @type {Array<PointerEvent>}
      * @private
      */
    /* private */ var activePointers_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var boundHandleTouchMove_ : Any = js.native
    
    /**
      * @type {any}
      * @private
      */
    /* private */ var clickTimeoutId_ : Any = js.native
    
    /**
      * The most recent "down" type event (or null if none have occurred).
      * Set on pointerdown.
      * @type {PointerEvent|null}
      * @private
      */
    /* private */ var down_ : Any = js.native
    
    /**
      * @type {!Array<import("./events.js").EventsKey>}
      * @private
      */
    /* private */ var dragListenerKeys_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var dragging_ : Any = js.native
    
    var element_ : HTMLElement = js.native
    
    /**
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @private
      */
    /* private */ var emulateClick_ : Any = js.native
    
    /**
      * Emulate dblclick and singleclick. Will be true when only one pointer is active.
      * @type {boolean}
      */
    var emulateClicks_ : Boolean = js.native
    
    /**
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @private
      */
    /* private */ var handlePointerDown_ : Any = js.native
    
    /**
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @private
      */
    /* private */ var handlePointerMove_ : Any = js.native
    
    /**
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @private
      */
    /* private */ var handlePointerUp_ : Any = js.native
    
    /**
      * Flexible handling of a `touch-action: none` css equivalent: because calling
      * `preventDefault()` on a `pointermove` event does not stop native page scrolling
      * and zooming, we also listen for `touchmove` and call `preventDefault()` on it
      * when an interaction (currently `DragPan` handles the event.
      * @param {TouchEvent} event Event.
      * @private
      */
    /* private */ var handleTouchMove_ : Any = js.native
    
    /**
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @return {boolean} If the left mouse button was pressed.
      * @private
      */
    /* private */ var isMouseActionButton_ : Any = js.native
    
    /**
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @return {boolean} Is moving.
      * @private
      */
    /* private */ var isMoving_ : Any = js.native
    
    /**
      * This is the element that we will listen to the real events on.
      * @type {import("./Map.js").default}
      * @private
      */
    /* private */ var map_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var moveTolerance_ : Any = js.native
    
    /**
      * @type {PointerEvent}
      * @private
      */
    /* private */ var originalPointerMoveEvent_ : Any = js.native
    
    /**
      * @type {?import("./events.js").EventsKey}
      * @private
      */
    /* private */ var pointerdownListenerKey_ : Any = js.native
    
    /**
      * Wrap and relay a pointermove event.
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @private
      */
    /* private */ var relayMoveEvent_ : Any = js.native
    
    /**
      * @type {?import("./events.js").EventsKey}
      * @private
      */
    /* private */ var relayedListenerKey_ : Any = js.native
    
    /**
      * @type {!Object<number, Event>}
      * @private
      */
    /* private */ var trackedTouches_ : Any = js.native
    
    /**
      * Keeps track on how many pointers are currently active.
      *
      * @param {PointerEvent} pointerEvent Pointer
      * event.
      * @private
      */
    /* private */ var updateActivePointers_ : Any = js.native
  }
}
