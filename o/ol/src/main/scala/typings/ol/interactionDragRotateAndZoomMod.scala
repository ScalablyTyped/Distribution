package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragRotateAndZoomMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.shiftKeyOnly}.
    * @property {number} [duration=400] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    * @api
    */
  @JSImport("ol/interaction/DragRotateAndZoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DragRotateAndZoom {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.shiftKeyOnly}.
    * @property {number} [duration=400] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    * @api
    */
  @js.native
  trait DragRotateAndZoom
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
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var lastMagnitude_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var lastScaleDelta_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * Default is {@link module :ol/events/condition.shiftKeyOnly}.
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
