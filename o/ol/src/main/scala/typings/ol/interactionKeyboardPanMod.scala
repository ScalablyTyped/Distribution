package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionKeyboardPanMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.noModifierKeys} and
    * {@link module:ol/events/condition.targetNotEditable}.
    * @property {number} [duration=100] Animation duration in milliseconds.
    * @property {number} [pixelDelta=128] The amount of pixels to pan on each key
    * press.
    */
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link module:ol/Map~Map}. `document` never loses focus but, for any other
    * element, focus will have to be on, and returned to, this element if the keys
    * are to function.
    * See also {@link module:ol/interaction/KeyboardZoom~KeyboardZoom}.
    * @api
    */
  @JSImport("ol/interaction/KeyboardPan", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends KeyboardPan {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.noModifierKeys} and
    * {@link module:ol/events/condition.targetNotEditable}.
    * @property {number} [duration=100] Animation duration in milliseconds.
    * @property {number} [pixelDelta=128] The amount of pixels to pan on each key
    * press.
    */
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link module:ol/Map~Map}. `document` never loses focus but, for any other
    * element, focus will have to be on, and returned to, this element if the keys
    * are to function.
    * See also {@link module:ol/interaction/KeyboardZoom~KeyboardZoom}.
    * @api
    */
  @js.native
  trait KeyboardPan
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @private
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Browser event.
      * @return {boolean} Combined condition result.
      */
    /* private */ var defaultCondition_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelDelta_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled. Default is
      * {@link module :ol/events/condition.noModifierKeys} and
      * {@link module :ol/events/condition.targetNotEditable}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of pixels to pan on each key
      * press.
      */
    var pixelDelta: js.UndefOr[Double] = js.undefined
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
      
      inline def setPixelDelta(value: Double): Self = StObject.set(x, "pixelDelta", value.asInstanceOf[js.Any])
      
      inline def setPixelDeltaUndefined: Self = StObject.set(x, "pixelDelta", js.undefined)
    }
  }
}
