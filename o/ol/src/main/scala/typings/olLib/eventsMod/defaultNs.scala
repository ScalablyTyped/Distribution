package typings
package olLib.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events", JSImport.Default)
@js.native
object defaultNs extends js.Object {
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
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.eventsNs.Event {
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
    def this(`type`: java.lang.String) = this()
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
  class EventTarget ()
    extends openlayersLib.openlayersMod.eventsNs.EventTarget
  
  @JSName("condition")
  @js.native
  object conditionNs extends js.Object {
    /**
      * Return `true` if only the alt-key is pressed, `false` otherwise (e.g. when
      * additionally the shift-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the alt key is pressed.
      * @api stable
      */
    def altKeyOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if only the alt-key and shift-key is pressed, `false` otherwise
      * (e.g. when additionally the platform-modifier-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the alt and shift keys are pressed.
      * @api stable
      */
    def altShiftKeysOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return always true.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True.
      * @api stable
      */
    def always(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the event is a `click` event, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event is a map `click` event.
      * @api stable
      */
    def click(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the event is a map `dblclick` event, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event is a map `dblclick` event.
      * @api stable
      */
    def doubleClick(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the event originates from a mouse device.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event originates from a mouse device.
      * @api stable
      */
    def mouseOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return always false.
      *
      * @param mapBrowserEvent Map browser event.
      * @return False.
      * @api stable
      */
    def never(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if no modifier key (alt-, shift- or platform-modifier-key) is
      * pressed.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True only if there no modifier keys are pressed.
      * @api stable
      */
    def noModifierKeys(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if only the platform-modifier-key (the meta-key on Mac,
      * ctrl-key otherwise) is pressed, `false` otherwise (e.g. when additionally
      * the shift-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the platform modifier key is pressed.
      * @api stable
      */
    def platformModifierKeyOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the browser event is a `pointermove` event, `false`
      * otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the browser event is a `pointermove` event.
      * @api
      */
    def pointerMove(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the event originates from a primary pointer in
      * contact with the surface or if the left mouse button is pressed.
      * @see http://www.w3.org/TR/pointerevents/#button-states
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event originates from a primary pointer.
      * @api
      */
    def primaryAction(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if only the shift-key is pressed, `false` otherwise (e.g. when
      * additionally the alt-key is pressed).
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if only the shift key is pressed.
      * @api stable
      */
    def shiftKeyOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the event is a map `singleclick` event, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True if the event is a map `singleclick` event.
      * @api stable
      */
    def singleClick(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    /**
      * Return `true` if the target element is not editable, i.e. not a `<input>`-,
      * `<select>`- or `<textarea>`-element, `false` otherwise.
      *
      * @param mapBrowserEvent Map browser event.
      * @return True only if the target element is not editable.
      * @api
      */
    def targetNotEditable(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
}

