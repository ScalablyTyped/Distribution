package typings.ol

import typings.ol.eventsConditionMod.Condition
import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragPanMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
    * to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.noModifierKeys} and {@link module:ol/events/condition.primaryAction}.
    * @property {boolean} [onFocusOnly=false] When the map's target has a `tabindex` attribute set,
    * the interaction will only handle events when the map has the focus.
    * @property {import("../Kinetic.js").default} [kinetic] Kinetic inertia to apply to the pan.
    */
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    * @api
    */
  @JSImport("ol/interaction/DragPan", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DragPan {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
    * to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.noModifierKeys} and {@link module:ol/events/condition.primaryAction}.
    * @property {boolean} [onFocusOnly=false] When the map's target has a `tabindex` attribute set,
    * the interaction will only handle events when the map has the focus.
    * @property {import("../Kinetic.js").default} [kinetic] Kinetic inertia to apply to the pan.
    */
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    * @api
    */
  @js.native
  trait DragPan
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @private
      * @type {import("../Kinetic.js").default|undefined}
      */
    /* private */ var kinetic_ : Any = js.native
    
    /**
      * @type {import("../pixel.js").Pixel}
      */
    var lastCentroid: Pixel = js.native
    
    /**
      * @type {number}
      */
    var lastPointersCount_ : Double = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var noKinetic_ : Any = js.native
    
    /**
      * @type {boolean}
      */
    var panning_ : Boolean = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
      * to indicate whether that event should be handled.
      * Default is {@link module :ol/events/condition.noModifierKeys} and {@link module :ol/events/condition.primaryAction}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Kinetic inertia to apply to the pan.
      */
    var kinetic: js.UndefOr[typings.ol.kineticMod.default] = js.undefined
    
    /**
      * When the map's target has a `tabindex` attribute set,
      * the interaction will only handle events when the map has the focus.
      */
    var onFocusOnly: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setKinetic(value: typings.ol.kineticMod.default): Self = StObject.set(x, "kinetic", value.asInstanceOf[js.Any])
      
      inline def setKineticUndefined: Self = StObject.set(x, "kinetic", js.undefined)
      
      inline def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      inline def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
    }
  }
}
