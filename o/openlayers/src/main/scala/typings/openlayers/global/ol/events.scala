package typings.openlayers.global.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  /**
    * @classdesc
    * Stripped down implementation of the W3C DOM Level 2 Event interface.
    * @see {@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface}
    *
    * This implementation only provides `type` and `target` properties, and
    * `stopPropagation` and `preventDefault` methods. It is meant as base class
    * for higher level events defined in the library, and works with
    * {@link ol.events.EventTarget}.
    *
    * @param type Type.
    */
  @JSGlobal("ol.events.Event")
  @js.native
  open class Event protected ()
    extends typings.openlayers.mod.events.Event {
    /**
      * @classdesc
      * Stripped down implementation of the W3C DOM Level 2 Event interface.
      * @see {@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface}
      *
      * This implementation only provides `type` and `target` properties, and
      * `stopPropagation` and `preventDefault` methods. It is meant as base class
      * for higher level events defined in the library, and works with
      * {@link ol.events.EventTarget}.
      *
      * @param type Type.
      */
    def this(`type`: String) = this()
  }
  
  /**
    * @classdesc
    * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
    * @see {@link https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget}
    *
    * There are two important simplifications compared to the specification:
    *
    * 1. The handling of `useCapture` in `addEventListener` and
    *    `removeEventListener`. There is no real capture model.
    * 2. The handling of `stopPropagation` and `preventDefault` on `dispatchEvent`.
    *    There is no event target hierarchy. When a listener calls
    *    `stopPropagation` or `preventDefault` on an event object, it means that no
    *    more listeners after this one will be called. Same as when the listener
    *    returns false.
    *
    */
  @JSGlobal("ol.events.EventTarget")
  @js.native
  /**
    * @classdesc
    * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
    * @see {@link https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget}
    *
    * There are two important simplifications compared to the specification:
    *
    * 1. The handling of `useCapture` in `addEventListener` and
    *    `removeEventListener`. There is no real capture model.
    * 2. The handling of `stopPropagation` and `preventDefault` on `dispatchEvent`.
    *    There is no event target hierarchy. When a listener calls
    *    `stopPropagation` or `preventDefault` on an event object, it means that no
    *    more listeners after this one will be called. Same as when the listener
    *    returns false.
    *
    */
  open class EventTarget ()
    extends typings.openlayers.mod.events.EventTarget
  
  object condition {
    
    @JSGlobal("ol.events.condition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return `true` if only the alt-key is pressed, `false` otherwise (e.g. when
      * additionally the shift-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the alt key is pressed.
      * @api stable
      */
    inline def altKeyOnly(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("altKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if only the alt-key and shift-key is pressed, `false` otherwise
      * (e.g. when additionally the platform-modifier-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the alt and shift keys are pressed.
      * @api stable
      */
    inline def altShiftKeysOnly(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("altShiftKeysOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return always true.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True.
      * @api stable
      */
    inline def always(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("always")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the event is a `click` event, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event is a map `click` event.
      * @api stable
      */
    inline def click(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the event is a map `dblclick` event, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event is a map `dblclick` event.
      * @api stable
      */
    inline def doubleClick(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleClick")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the event originates from a mouse device.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event originates from a mouse device.
      * @api stable
      */
    inline def mouseOnly(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return always false.
      *
      * @param mapBrowserEvent Map browser event.
      * @return False.
      * @api stable
      */
    inline def never(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("never")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if no modifier key (alt-, shift- or platform-modifier-key) is
      * pressed.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True only if there no modifier keys are pressed.
      * @api stable
      */
    inline def noModifierKeys(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noModifierKeys")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if only the platform-modifier-key (the meta-key on Mac,
      * ctrl-key otherwise) is pressed, `false` otherwise (e.g. when additionally
      * the shift-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the platform modifier key is pressed.
      * @api stable
      */
    inline def platformModifierKeyOnly(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("platformModifierKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the browser event is a `pointermove` event, `false`
      * otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the browser event is a `pointermove` event.
      * @api
      */
    inline def pointerMove(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerMove")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the event originates from a primary pointer in
      * contact with the surface or if the left mouse button is pressed.
      * @see http://www.w3.org/TR/pointerevents/#button-states
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event originates from a primary pointer.
      * @api
      */
    inline def primaryAction(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAction")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if only the shift-key is pressed, `false` otherwise (e.g. when
      * additionally the alt-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the shift key is pressed.
      * @api stable
      */
    inline def shiftKeyOnly(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the event is a map `singleclick` event, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event is a map `singleclick` event.
      * @api stable
      */
    inline def singleClick(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("singleClick")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return `true` if the target element is not editable, i.e. not a `<input>`-,
      * `<select>`- or `<textarea>`-element, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True only if the target element is not editable.
      * @api
      */
    inline def targetNotEditable(mapBrowserEvent: typings.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("targetNotEditable")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
