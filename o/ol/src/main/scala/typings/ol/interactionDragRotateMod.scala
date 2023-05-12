package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragRotateMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that takes an
    * {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
    * to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.altShiftKeysOnly}.
    * @property {number} [duration=250] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    * @api
    */
  @JSImport("ol/interaction/DragRotate", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DragRotate {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that takes an
    * {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
    * to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.altShiftKeysOnly}.
    * @property {number} [duration=250] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    * @api
    */
  @js.native
  trait DragRotate
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var lastAngle_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that takes an
      * {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
      * to indicate whether that event should be handled.
      * Default is {@link module :ol/events/condition.altShiftKeysOnly}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
}
