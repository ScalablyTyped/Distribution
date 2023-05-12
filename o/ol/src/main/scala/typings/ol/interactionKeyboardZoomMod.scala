package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionKeyboardZoomMod {
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=100] Animation duration in milliseconds.
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.targetNotEditable}.
    * @property {number} [delta=1] The zoom level delta on each key press.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link module:ol/Map~Map}. `document` never loses focus but, for any other
    * element, focus will have to be on, and returned to, this element if the keys
    * are to function.
    * See also {@link module:ol/interaction/KeyboardPan~KeyboardPan}.
    * @api
    */
  @JSImport("ol/interaction/KeyboardZoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends KeyboardZoom {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=100] Animation duration in milliseconds.
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.targetNotEditable}.
    * @property {number} [delta=1] The zoom level delta on each key press.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link module:ol/Map~Map}. `document` never loses focus but, for any other
    * element, focus will have to be on, and returned to, this element if the keys
    * are to function.
    * See also {@link module:ol/interaction/KeyboardPan~KeyboardPan}.
    * @api
    */
  @js.native
  trait KeyboardZoom
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var delta_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled. Default is
      * {@link module :ol/events/condition.targetNotEditable}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * The zoom level delta on each key press.
      */
    var delta: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
}
