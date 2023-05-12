package typings.ol

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsEventMod {
  
  @JSImport("ol/events/Event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @module ol/events/Event
    */
  /**
    * @classdesc
    * Stripped down implementation of the W3C DOM Level 2 Event interface.
    * See https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface.
    *
    * This implementation only provides `type` and `target` properties, and
    * `stopPropagation` and `preventDefault` methods. It is meant as base class
    * for higher level events defined in the library, and works with
    * {@link module:ol/events/Target~Target}.
    */
  @JSImport("ol/events/Event", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BaseEvent {
    /**
      * @param {string} type Type.
      */
    def this(`type`: String) = this()
    
    /**
      * @type {boolean}
      */
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /**
      * Prevent default. This means that no emulated `click`, `singleclick` or `doubleclick` events
      * will be fired.
      * @api
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * @type {boolean}
      */
    /* CompleteClass */
    var propagationStopped: Boolean = js.native
    
    /**
      * Stop event propagation.
      * @api
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * The event target.
      * @type {Object}
      * @api
      */
    /* CompleteClass */
    var target: Any = js.native
    
    /**
      * The event type.
      * @type {string}
      * @api
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  inline def preventDefault(evt: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def preventDefault(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stopPropagation(evt: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stopPropagation(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @module ol/events/Event
    */
  /**
    * @classdesc
    * Stripped down implementation of the W3C DOM Level 2 Event interface.
    * See https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface.
    *
    * This implementation only provides `type` and `target` properties, and
    * `stopPropagation` and `preventDefault` methods. It is meant as base class
    * for higher level events defined in the library, and works with
    * {@link module:ol/events/Target~Target}.
    */
  trait BaseEvent extends StObject {
    
    /**
      * @type {boolean}
      */
    var defaultPrevented: Boolean
    
    /**
      * Prevent default. This means that no emulated `click`, `singleclick` or `doubleclick` events
      * will be fired.
      * @api
      */
    def preventDefault(): Unit
    
    /**
      * @type {boolean}
      */
    var propagationStopped: Boolean
    
    /**
      * Stop event propagation.
      * @api
      */
    def stopPropagation(): Unit
    
    /**
      * The event target.
      * @type {Object}
      * @api
      */
    var target: Any
    
    /**
      * The event type.
      * @type {string}
      * @api
      */
    var `type`: String
  }
  object BaseEvent {
    
    inline def apply(
      defaultPrevented: Boolean,
      preventDefault: () => Unit,
      propagationStopped: Boolean,
      stopPropagation: () => Unit,
      target: Any,
      `type`: String
    ): BaseEvent = {
      val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), propagationStopped = propagationStopped.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseEvent] (val x: Self) extends AnyVal {
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPropagationStopped(value: Boolean): Self = StObject.set(x, "propagationStopped", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
