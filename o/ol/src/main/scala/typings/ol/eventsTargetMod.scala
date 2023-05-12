package typings.ol

import typings.ol.eventsMod.Listener
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsTargetMod {
  
  /**
    * @typedef {EventTarget|Target} EventTargetLike
    */
  /**
    * @classdesc
    * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
    * See https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget.
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
    */
  @JSImport("ol/events/Target", JSImport.Default)
  @js.native
  /**
    * @param {*} [target] Default event target for dispatched events.
    */
  open class default () extends Target {
    def this(target: Any) = this()
  }
  
  type EventTargetLike = EventTarget | Target
  
  /**
    * @typedef {EventTarget|Target} EventTargetLike
    */
  /**
    * @classdesc
    * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
    * See https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget.
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
    */
  @js.native
  trait Target
    extends typings.ol.disposableMod.default {
    
    /**
      * @param {string} type Type.
      * @param {import("../events.js").Listener} listener Listener.
      */
    def addEventListener(`type`: String, listener: Listener): Unit = js.native
    
    def dispatchEvent(event: String): js.UndefOr[Boolean] = js.native
    /**
      * Dispatches an event and calls all listeners listening for events
      * of this type. The event parameter can either be a string or an
      * Object with a `type` property.
      *
      * @param {import("./Event.js").default|string} event Event object.
      * @return {boolean|undefined} `false` if anyone called preventDefault on the
      *     event object or if any of the listeners returned false.
      * @api
      */
    def dispatchEvent(event: typings.ol.eventsEventMod.default): js.UndefOr[Boolean] = js.native
    
    /**
      * @private
      * @type {Object<string, number>}
      */
    /* private */ var dispatching_ : Any = js.native
    
    /**
      * @private
      * @type {*}
      */
    /* private */ var eventTarget_ : Any = js.native
    
    /**
      * Get the listeners for a specified event type. Listeners are returned in the
      * order that they will be called in.
      *
      * @param {string} type Type.
      * @return {Array<import("../events.js").Listener>|undefined} Listeners.
      */
    def getListeners(`type`: String): js.UndefOr[js.Array[Listener]] = js.native
    
    /**
      * @param {string} [type] Type. If not provided,
      *     `true` will be returned if this event target has any listeners.
      * @return {boolean} Has listeners.
      */
    def hasListener(): Boolean = js.native
    def hasListener(`type`: String): Boolean = js.native
    
    /**
      * @private
      * @type {Object<string, Array<import("../events.js").Listener>>}
      */
    /* private */ var listeners_ : Any = js.native
    
    /**
      * @private
      * @type {Object<string, number>}
      */
    /* private */ var pendingRemovals_ : Any = js.native
    
    /**
      * @param {string} type Type.
      * @param {import("../events.js").Listener} listener Listener.
      */
    def removeEventListener(`type`: String, listener: Listener): Unit = js.native
  }
}
