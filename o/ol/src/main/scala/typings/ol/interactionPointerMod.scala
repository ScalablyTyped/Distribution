package typings.ol

import typings.ol.anon.ClientX
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPointerMod {
  
  @JSImport("ol/interaction/Pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleDownEvent]
    * Function handling "down" events. If the function returns `true` then a drag
    * sequence is started.
    * @property {function(import("../MapBrowserEvent.js").default):void} [handleDragEvent]
    * Function handling "drag" events. This function is called on "move" events
    * during a drag sequence.
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleEvent]
    * Method called by the map to notify the interaction that a browser event was
    * dispatched to the map. The function may return `false` to prevent the
    * propagation of the event to other interactions in the map's interactions
    * chain.
    * @property {function(import("../MapBrowserEvent.js").default):void} [handleMoveEvent]
    * Function handling "move" events. This function is called on "move" events.
    * This functions is also called during a drag sequence, so during a drag
    * sequence both the `handleDragEvent` function and this function are called.
    * If `handleDownEvent` is defined and it returns true this function will not
    * be called during a drag sequence.
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleUpEvent]
    *  Function handling "up" events. If the function returns `false` then the
    * current drag sequence is stopped.
    * @property {function(boolean):boolean} [stopDown]
    * Should the down event be propagated to other interactions, or should be
    * stopped?
    */
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    * @api
    */
  @JSImport("ol/interaction/Pointer", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends PointerInteraction {
    def this(options: Options) = this()
  }
  
  inline def centroid(pointerEvents: js.Array[PointerEvent]): ClientX = ^.asInstanceOf[js.Dynamic].applyDynamic("centroid")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[ClientX]
  
  trait Options extends StObject {
    
    /**
      * Function handling "down" events. If the function returns `true` then a drag
      * sequence is started.
      */
    var handleDownEvent: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapBrowserEventMod.default[Any], Boolean]] = js.undefined
    
    /**
      * Function handling "drag" events. This function is called on "move" events
      * during a drag sequence.
      */
    var handleDragEvent: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapBrowserEventMod.default[Any], Unit]] = js.undefined
    
    /**
      * Method called by the map to notify the interaction that a browser event was
      * dispatched to the map. The function may return `false` to prevent the
      * propagation of the event to other interactions in the map's interactions
      * chain.
      */
    var handleEvent: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapBrowserEventMod.default[Any], Boolean]] = js.undefined
    
    /**
      * Function handling "move" events. This function is called on "move" events.
      * This functions is also called during a drag sequence, so during a drag
      * sequence both the `handleDragEvent` function and this function are called.
      * If `handleDownEvent` is defined and it returns true this function will not
      * be called during a drag sequence.
      */
    var handleMoveEvent: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapBrowserEventMod.default[Any], Unit]] = js.undefined
    
    /**
      * Function handling "up" events. If the function returns `false` then the
      * current drag sequence is stopped.
      */
    var handleUpEvent: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapBrowserEventMod.default[Any], Boolean]] = js.undefined
    
    /**
      * Should the down event be propagated to other interactions, or should be
      * stopped?
      */
    var stopDown: js.UndefOr[js.Function1[/* arg0 */ Boolean, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHandleDownEvent(value: /* arg0 */ typings.ol.mapBrowserEventMod.default[Any] => Boolean): Self = StObject.set(x, "handleDownEvent", js.Any.fromFunction1(value))
      
      inline def setHandleDownEventUndefined: Self = StObject.set(x, "handleDownEvent", js.undefined)
      
      inline def setHandleDragEvent(value: /* arg0 */ typings.ol.mapBrowserEventMod.default[Any] => Unit): Self = StObject.set(x, "handleDragEvent", js.Any.fromFunction1(value))
      
      inline def setHandleDragEventUndefined: Self = StObject.set(x, "handleDragEvent", js.undefined)
      
      inline def setHandleEvent(value: /* arg0 */ typings.ol.mapBrowserEventMod.default[Any] => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      inline def setHandleEventUndefined: Self = StObject.set(x, "handleEvent", js.undefined)
      
      inline def setHandleMoveEvent(value: /* arg0 */ typings.ol.mapBrowserEventMod.default[Any] => Unit): Self = StObject.set(x, "handleMoveEvent", js.Any.fromFunction1(value))
      
      inline def setHandleMoveEventUndefined: Self = StObject.set(x, "handleMoveEvent", js.undefined)
      
      inline def setHandleUpEvent(value: /* arg0 */ typings.ol.mapBrowserEventMod.default[Any] => Boolean): Self = StObject.set(x, "handleUpEvent", js.Any.fromFunction1(value))
      
      inline def setHandleUpEventUndefined: Self = StObject.set(x, "handleUpEvent", js.undefined)
      
      inline def setStopDown(value: /* arg0 */ Boolean => Boolean): Self = StObject.set(x, "stopDown", js.Any.fromFunction1(value))
      
      inline def setStopDownUndefined: Self = StObject.set(x, "stopDown", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleDownEvent]
    * Function handling "down" events. If the function returns `true` then a drag
    * sequence is started.
    * @property {function(import("../MapBrowserEvent.js").default):void} [handleDragEvent]
    * Function handling "drag" events. This function is called on "move" events
    * during a drag sequence.
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleEvent]
    * Method called by the map to notify the interaction that a browser event was
    * dispatched to the map. The function may return `false` to prevent the
    * propagation of the event to other interactions in the map's interactions
    * chain.
    * @property {function(import("../MapBrowserEvent.js").default):void} [handleMoveEvent]
    * Function handling "move" events. This function is called on "move" events.
    * This functions is also called during a drag sequence, so during a drag
    * sequence both the `handleDragEvent` function and this function are called.
    * If `handleDownEvent` is defined and it returns true this function will not
    * be called during a drag sequence.
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleUpEvent]
    *  Function handling "up" events. If the function returns `false` then the
    * current drag sequence is stopped.
    * @property {function(boolean):boolean} [stopDown]
    * Should the down event be propagated to other interactions, or should be
    * stopped?
    */
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    * @api
    */
  @js.native
  trait PointerInteraction
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * Returns the current number of pointers involved in the interaction,
      * e.g. `2` when two fingers are used.
      * @return {number} The number of pointers.
      * @api
      */
    def getPointerCount(): Double = js.native
    
    /**
      * Handle pointer down events.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Event.
      * @return {boolean} If the event was consumed.
      * @protected
      */
    /* protected */ def handleDownEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]): Boolean = js.native
    
    /**
      * Handle pointer drag events.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Event.
      * @protected
      */
    /* protected */ def handleDragEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]): Unit = js.native
    
    /**
      * Handle pointer move events.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Event.
      * @protected
      */
    /* protected */ def handleMoveEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]): Unit = js.native
    
    /**
      * Handle pointer up events.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Event.
      * @return {boolean} If the event was consumed.
      * @protected
      */
    /* protected */ def handleUpEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]): Boolean = js.native
    
    /**
      * @type {boolean}
      * @protected
      */
    /* protected */ var handlingDownUpSequence: Boolean = js.native
    
    /**
      * This function is used to determine if "down" events should be propagated
      * to other interactions or should be stopped.
      * @param {boolean} handled Was the event handled by the interaction?
      * @return {boolean} Should the `down` event be stopped?
      */
    def stopDown(handled: Boolean): Boolean = js.native
    
    /**
      * @type {Array<PointerEvent>}
      * @protected
      */
    /* protected */ var targetPointers: js.Array[PointerEvent] = js.native
    
    /**
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Event.
      * @private
      */
    /* private */ var updateTrackedPointers_ : Any = js.native
  }
}
